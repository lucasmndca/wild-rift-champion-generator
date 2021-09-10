package com.lucasmndca.generator.service.championAbility

import com.lucasmndca.generator.data.ability.Ability
import com.lucasmndca.generator.data.champion.Champion
import com.lucasmndca.generator.data.championAbility.ChampionAbility
import com.lucasmndca.generator.repository.championAbility.ChampionAbilityRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ChampionAbilityService {

    @Autowired
    ChampionAbilityRepository repository

    Boolean assignAbility(Ability ability, Champion champion) {
        return repository.assignAbility(ability.id, champion.id)
    }

    Boolean unassignAbility(Ability ability, Champion champion) {
        return repository.unassignAbility(ability.id, champion.id)
    }

    List<ChampionAbility> getAll() {
        return repository.findAll()
    }

    ChampionAbility getChampionAbility(Long id) {
        return repository.findById(id)
    }
}
