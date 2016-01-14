package de.egga.wecide.eggs.controller;

import de.egga.wecide.eggs.repository.EggEntity;
import de.egga.wecide.eggs.EggService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EggController {

    @Autowired
    EggService service;

    @RequestMapping("/eggs")
    public Page<EggEntity> asd () {
        // TODO map model to view
        Page<EggEntity> all = service.findAll();
        return all;
    }
}
