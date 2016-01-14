package de.egga.wecide.eggs.controller;

import de.egga.wecide.eggs.Egg;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import static de.egga.wecide.eggs.EggFactory.defaultEgg;

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
}