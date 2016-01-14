package de.egga.wecide.eggs.controller;

import de.egga.wecide.eggs.Egg;
import de.egga.wecide.eggs.EggService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EggController {

    @Autowired
    EggService service;

    @Autowired
    EggViewMapper mapper = new EggViewMapper();

    @RequestMapping("/eggs")
    public EggListView list() {
        List<Egg> all = service.list();
        EggListView view = mapper.modelToView(all);
        return view;
    }
}
