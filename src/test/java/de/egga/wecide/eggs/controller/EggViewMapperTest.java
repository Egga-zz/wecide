package de.egga.wecide.eggs.controller;

import de.egga.wecide.eggs.Egg;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import java.util.List;

import static de.egga.wecide.eggs.EggFactory.defaultEgg;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class EggViewMapperTest {

    EggViewMapper mapper = new EggViewMapper();
    Egg model = defaultEgg();

    @Test
    public void it_should_map_all_fields_from_model_to_view() {
        EggView view = mapper.modelToView(model);
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(view.getName()).as("name").isEqualTo(model.getName());
        softly.assertThat(view.getState()).as("state").isEqualTo(model.getState());
        softly.assertAll();
    }

    @Test
    public void it_should_map_list_of_models_to_view() {
        EggListView view = mapper.modelToView(asList(model, model, model));
        List<EggView> items = view.getItems();
        assertThat(items).extracting("name").containsExactly(model.getName(), model.getName(), model.getName());
    }
}