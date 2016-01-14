package de.egga.wecide.eggs.controller;

import de.egga.wecide.eggs.Egg;
import de.egga.wecide.eggs.EggService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
public class EggController {

    private static final String COLLECTION_URL = "/eggs";
    private static final String ITEM_URL = COLLECTION_URL + "/{id}";

    @Autowired
    EggService service;

    @Autowired
    EggViewMapper mapper = new EggViewMapper();

    @RequestMapping(value = COLLECTION_URL, method = GET, produces = APPLICATION_JSON_VALUE)
    EggListView list() {
        // TODO add integration test
        List<Egg> all = service.list();
        EggListView view = mapper.modelToView(all);
        return view;
    }

    @RequestMapping(value = ITEM_URL, method = GET, produces = APPLICATION_JSON_VALUE)
    EggView get(@PathVariable String id) {
        // TODO add tests
        // TODO replace dummy implementation
        EggView egg = new EggView();
        egg.setName("Whops");
        egg.setState("Mops");
        return egg;
    }

    @RequestMapping(value = ITEM_URL, method = PUT, consumes = APPLICATION_JSON_VALUE)
    @ResponseStatus(NO_CONTENT)
    void add(@PathVariable String id, @RequestBody EggView egg) {
        // TODO add tests
        // TODO replace dummy implementation
    }

    @RequestMapping(value = ITEM_URL, method = DELETE)
    @ResponseStatus(NO_CONTENT)
    void delete(@PathVariable String id) {
        // TODO add tests
        // TODO replace dummy implementation
    }
}
