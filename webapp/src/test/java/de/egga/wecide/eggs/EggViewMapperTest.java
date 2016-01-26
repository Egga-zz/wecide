package de.egga.wecide.eggs;

import de.egga.wecide.TestBase;
import org.junit.Test;

import java.util.List;

import static de.egga.wecide.eggs.EggFactory.defaultEgg;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class EggViewMapperTest extends TestBase {

    EggViewMapper mapper = new EggViewMapper();

    Egg model = defaultEgg();

    @Test
    public void it_should_map_all_fields_from_model_to_view() {
        EggView view = mapper.modelToView(model);
        softly.assertThat(view.getName()).as("name").isEqualTo(model.getName());
        softly.assertThat(view.getState()).as("state").isEqualTo(model.getState());
    }

    @Test
    public void it_should_map_list_of_models_to_view() {
        de.egga.wecide.eggs.EggListView view = mapper.modelToView(asList(model, model, model));
        List<EggView> items = view.getItems();
        assertThat(items).extracting("name").containsExactly(model.getName(), model.getName(), model.getName());
    }
}