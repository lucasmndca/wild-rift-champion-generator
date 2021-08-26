package com.lucasmndca.generator.web.ability

import com.lucasmndca.generator.data.ability.Ability
import com.lucasmndca.generator.service.ability.AbilityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

import java.util.logging.Logger

@RestController
class AbilityController {

    @Autowired
    AbilityService service

    Logger logger = Logger.getLogger(AbilityController.class.name)

    @PostMapping("ability")
    Ability createAbility(@RequestBody Ability ability) {
        try {
            return service.createEntity(ability)
        } catch(Exception e) {
            logger.severe("Error on creating ability.")
            throw e
        }
    }

    @PostMapping("ability/{id}")
    Boolean deleteAbility(@RequestBody Ability ability) {
        try {
            return service.deleteEntity(ability)
        } catch(Exception e) {
            logger.severe("Error on deleting ability.")
            throw e
        }
    }

    @GetMapping("ability/{id}")
    Ability getAbility(@RequestBody Long id) {
        try {
            return service.getEntity(id)
        } catch(Exception e) {
            logger.severe("Error on getting ability.")
            throw e
        }
    }

    @GetMapping("ability")
    Ability getAll() {
        try {
            return service.getAll()
        } catch(Exception e) {
            logger.severe("Error on getting all abilities.")
            throw e
        }
    }
}
