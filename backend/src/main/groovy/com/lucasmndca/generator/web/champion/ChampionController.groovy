package com.lucasmndca.generator.web.champion

import com.lucasmndca.generator.data.champion.Champion
import com.lucasmndca.generator.service.champion.ChampionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

import java.util.logging.Logger

@RestController
class ChampionController {

    @Autowired
    ChampionService service

    Logger logger = Logger.getLogger(ChampionController.class.name)

    @PostMapping("champion")
    Champion createChampion(@RequestBody Champion champion) {
        try {
            return service.createEntity(champion)
        } catch(Exception e) {
            logger.severe("Error on creating champion.")
            throw e
        }
    }

    @PutMapping("champion/{id}")
    Champion editChampion(@RequestBody Champion champion) {
        try {
            return service.updateEntity(champion)
        } catch(Exception e) {
            logger.severe("Error on updating champion.")
            throw e
        }
    }

    @PostMapping("champion/{id}")
    Boolean deleteChampion(@RequestBody Champion champion) {
        try {
            return service.deleteEntity(champion)
        } catch(Exception e) {
            logger.severe("Error on deleting champion.")
            throw e
        }
    }

    @GetMapping("champion/{id}")
    Champion getChampion(@RequestBody Long id) {
        try {
            return service.getEntity(id)
        } catch(Exception e) {
            logger.severe("Error on getting champion.")
            throw e
        }
    }

    @GetMapping("champion")
    Champion getAll() {
        try {
            return service.getAll()
        } catch(Exception e) {
            logger.severe("Error on getting all champions.")
            throw e
        }
    }
}
