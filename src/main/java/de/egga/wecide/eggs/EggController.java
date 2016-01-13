package de.egga.wecide.eggs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EggController {

    @Autowired
    EggService service;

    @RequestMapping("/eggs")
    public Page<Egg> asd () {
        // TODO map model to view
        Page<Egg> all = service.findAll();
        return all;
    }
}
