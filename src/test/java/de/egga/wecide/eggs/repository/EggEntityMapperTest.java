package de.egga.wecide.eggs.repository;

import de.egga.wecide.eggs.Egg;
import org.junit.Test;

import static de.egga.wecide.eggs.EggFactory.defaultEgg;
import static de.egga.wecide.eggs.repository.EggEntityFactory.defaultEggEntity;
import static org.assertj.core.api.Assertions.assertThat;


public class EggEntityMapperTest {

    @Test
    public void it_should_map_all_fields_from_entity_to_model() {
        EggEntityMapper mapper = new EggEntityMapper();
        EggEntity entity = defaultEggEntity();
        Egg model = mapper.entityToModel(entity);
        assertThat(model).isEqualToComparingFieldByField(defaultEgg());
    }
}