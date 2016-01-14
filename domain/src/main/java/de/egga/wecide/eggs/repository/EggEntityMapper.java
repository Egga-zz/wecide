package de.egga.wecide.eggs.repository;

import de.egga.wecide.eggs.Egg;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EggEntityMapper {

    Egg entityToModel(EggEntity entity) {
        ModelMapper modelMapper = new ModelMapper();
        Egg model = modelMapper.map(entity, Egg.class);
        return model;
    }

    public List<Egg> entityToModel(Page<EggEntity> entities) {
        ArrayList<Egg> model = new ArrayList<>();
        for (EggEntity entity : entities) {
            model.add(entityToModel(entity));
        }
        return model;
    }
}
