package de.egga.wecide.configuration;

import de.egga.wecide.eggs.repository.EggEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

public interface EggRepository extends Repository<EggEntity, Integer> {
    // TODO move this interface to entity class

    Page<EggEntity> findAll(Pageable pageable);
}
