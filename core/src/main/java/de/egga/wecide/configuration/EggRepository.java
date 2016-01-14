package de.egga.wecide.configuration;

import de.egga.wecide.eggs.repository.EggEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

public interface EggRepository extends Repository<EggEntity, Integer> {
    // TODO move this interface to entity class

    // TODO evaluate if Page is a good choice
    Page<EggEntity> findAll(Pageable pageable);
}
