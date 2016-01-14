package de.egga.wecide.eggs;

import de.egga.wecide.configuration.EggRepository;
import de.egga.wecide.eggs.repository.EggEntity;
import de.egga.wecide.eggs.repository.EggEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EggService {

    // TODO hollywood principle: service cannot depend on repo
    @Autowired
    EggRepository repository;

    @Autowired
    EggEntityMapper mapper;

    public List<Egg> list() {
        Page<EggEntity> entities = repository.findAll(new PageRequest(1, 1));
        // TODO move mapping to DAO
        List<Egg> model = mapper.entityToModel(entities);
        return model;
    }
}
