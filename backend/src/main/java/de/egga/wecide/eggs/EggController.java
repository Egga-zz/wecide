package de.egga.wecide.eggs;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class EggController {

    private static final String COLLECTION_URL = "/eggs";
    private static final String ITEM_URL = COLLECTION_URL + "/{id}";

    @RequestMapping(value = ITEM_URL, method = GET, produces = APPLICATION_JSON_VALUE)
    EggView get(@PathVariable String id) {
        EggView egg = new EggView();
        egg.setName("Whops");
        egg.setState("Mops");
        return egg;
    }
}
