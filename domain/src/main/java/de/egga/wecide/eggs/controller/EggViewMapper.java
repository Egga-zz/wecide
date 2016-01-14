package de.egga.wecide.eggs.controller;

import de.egga.wecide.eggs.Egg;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EggViewMapper {

    EggView modelToView(Egg model) {
        ModelMapper modelMapper = new ModelMapper();
        EggView view = modelMapper.map(model, EggView.class);
        return view;
    }

    EggListView modelToView(List<Egg> models) {
        EggListView view = new EggListView();
        for (Egg model : models) {
            view.addItem(modelToView(model));
        }
        return view;
    }
}
