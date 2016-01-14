package de.egga.wecide.eggs.repository;

import de.egga.wecide.eggs.Egg;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.List;

public class EggEntityMapper {

    Egg entityToModel(EggEntity entity) {
        ModelMapper modelMapper = new ModelMapper();
        Egg model = modelMapper.map(entity, Egg.class);
        return model;
    }

    List<Egg> entityToModel(Page<EggEntity> entities) {
        ArrayList<Egg> model = new ArrayList<>();
        for (EggEntity entity : entities) {
            model.add(entityToModel(entity));
        }

        return model;
    }
}
