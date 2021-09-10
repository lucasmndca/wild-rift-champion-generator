package com.lucasmndca.generator.service.champion

import com.lucasmndca.generator.data.champion.Champion
import com.lucasmndca.generator.repository.champion.ChampionRepository
import com.lucasmndca.generator.service.AbstractService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ChampionService extends AbstractService<Champion> {

    @Autowired
    ChampionRepository repository

    @Override
    Champion createEntity(Champion champion) {
        return repository.save(champion)
    }

    @Override
    Champion updateEntity(Champion champion) {
        return repository.save(champion)
    }

    @Override
    Boolean deleteEntity(Champion champion) {
        return repository.delete(champion)
    }

    @Override
    Champion getEntity(Long id) {
        return repository.findById(id)
    }

    @Override
    List getAll() {
        return repository.findAll()
    }
}
