package de.egga.wecide.eggs.repository;

import de.egga.wecide.TestBase;
import de.egga.wecide.eggs.Egg;
import org.junit.Test;
import org.springframework.data.domain.PageImpl;

import java.util.List;

import static de.egga.wecide.eggs.repository.EggEntityFactory.defaultEggEntity;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;


public class EggEntityMapperTest extends TestBase {

    EggEntityMapper mapper = new EggEntityMapper();

    EggEntity entity = defaultEggEntity();

    @Test
    public void it_should_map_all_fields_from_entity_to_model() {
        Egg model = mapper.entityToModel(entity);
        softly.assertThat(model.getName()).isEqualTo(entity.getName());
        softly.assertThat(model.getState()).isEqualTo(entity.getState());
    }

    @Test
    public void it_should_map_list_of_entities_to_model() {
        PageImpl<EggEntity> entities = new PageImpl<>(asList(entity, entity, entity));
        List<Egg> model = mapper.entityToModel(entities);
        assertThat(model).extracting("name").containsExactly(entity.getName(), entity.getName(), entity.getName());
    }

}