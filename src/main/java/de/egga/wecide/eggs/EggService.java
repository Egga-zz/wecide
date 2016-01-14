package de.egga.wecide.eggs;

import de.egga.wecide.configuration.EggRepository;
import de.egga.wecide.eggs.repository.EggEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class EggService {

    // TODO hollywood principle: service cannot depend on repo
    @Autowired
    EggRepository repository;

    public Page<EggEntity> findAll() {
        Page<EggEntity> all = repository.findAll(new PageRequest(1, 1));

        return all;
    }
}
