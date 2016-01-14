package de.egga.wecide.eggs.controller;

import de.egga.wecide.eggs.Egg;
import org.modelmapper.ModelMapper;

public class EggViewMapper {

    EggView modelToView(Egg model) {
        ModelMapper modelMapper = new ModelMapper();
        EggView view = modelMapper.map(model, EggView.class);
        return view;
    }
}
