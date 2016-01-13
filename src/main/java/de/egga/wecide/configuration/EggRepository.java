package de.egga.wecide.configuration;

import de.egga.wecide.eggs.Egg;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

public interface EggRepository extends Repository<Egg, Integer> {
    // TODO move this interface to entity class

    Page<Egg> findAll(Pageable pageable);
}
