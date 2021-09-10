package com.lucasmndca.generator.service.ability

import com.lucasmndca.generator.data.ability.Ability
import com.lucasmndca.generator.repository.ability.AbilityRepository
import com.lucasmndca.generator.service.AbstractService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AbilityService extends AbstractService<Ability> {

    @Autowired
    AbilityRepository repository

    @Override
    Ability createEntity(Ability entity) {
        return repository.save(entity)
    }

    @Override
    Ability updateEntity(Ability entity) {
        return repository.save(entity)
    }

    @Override
    Boolean deleteEntity(Ability entity) {
        return repository.delete(entity)
    }

    @Override
    Ability getEntity(Long id) {
        return repository.findById(id)
    }

    @Override
    List getAll() {
        return repository.findAll()
    }
}
