package de.egga.wecide.eggs.repository;

import de.egga.wecide.TestBase;
import de.egga.wecide.eggs.Egg;
import org.junit.Test;

import static de.egga.wecide.eggs.repository.EggEntityFactory.defaultEggEntity;


public class EggEntityMapperTest extends TestBase {

    EggEntityMapper mapper = new EggEntityMapper();

    @Test
    public void it_should_map_all_fields_from_entity_to_model() {
        EggEntity entity = defaultEggEntity();
        Egg model = mapper.entityToModel(entity);
        softly.assertThat(model.getName()).isEqualTo(entity.getName());
        softly.assertThat(model.getState()).isEqualTo(entity.getState());
    }
}