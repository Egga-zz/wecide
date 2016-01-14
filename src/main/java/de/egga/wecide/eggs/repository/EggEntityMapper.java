package de.egga.wecide.eggs.repository;

import de.egga.wecide.eggs.Egg;
import org.modelmapper.ModelMapper;

public class EggEntityMapper {

    Egg entityToModel(EggEntity entity) {
        ModelMapper modelMapper = new ModelMapper();
        Egg model = modelMapper.map(entity, Egg.class);
        return model;
    }
}
