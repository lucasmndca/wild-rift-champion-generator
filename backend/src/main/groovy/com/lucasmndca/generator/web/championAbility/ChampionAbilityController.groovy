package com.lucasmndca.generator.web.championAbility

import com.lucasmndca.generator.data.ability.Ability
import com.lucasmndca.generator.data.championAbility.ChampionAbility
import com.lucasmndca.generator.service.ability.AbilityService
import com.lucasmndca.generator.service.championAbility.ChampionAbilityService
import com.lucasmndca.generator.web.championAbility.request.ChampionAbilityRequest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

import java.util.logging.Logger

@RestController
class ChampionAbilityController {

    @Autowired
    ChampionAbilityService service

    Logger logger = Logger.getLogger(ChampionAbilityController.class.name)

    @PostMapping("ability/assign")
    Ability assignAbility(@RequestBody ChampionAbilityRequest request) {
        try {
            return service.assignAbility(request.ability, request.champion)
        } catch(Exception e) {
            logger.severe("Error on assigning ability.")
            throw e
        }
    }

    @PostMapping("ability/unassign")
    Ability unassignAbility(@RequestBody ChampionAbilityRequest request) {
        try {
            return service.unassignAbility(request.ability, request.champion)
        } catch(Exception e) {
            logger.severe("Error on assigning ability.")
            throw e
        }
    }

    //TODO: implement get for a single champion

    @GetMapping("championAbility")
    Ability getAll() {
        try {
            return service.getAll()
        } catch(Exception e) {
            logger.severe("Error on getting all abilities.")
            throw e
        }
    }
}
