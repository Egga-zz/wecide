package de.egga.wecide.eggs;

import de.egga.wecide.configuration.EggRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class EggService {

    // TODO hollywood principle: service cannot depend on repo
    @Autowired
    EggRepository repository;

    public Page<Egg> findAll() {
        Page<Egg> all = repository.findAll(new PageRequest(1, 1));

        return all;
    }
}
