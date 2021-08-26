package com.lucasmndca.generator.data.championAbility

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class ChampionAbility {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id

    @Column(name = "id_champion")
    Long championId

    @Column(name = "id_ability")
    Long abilityId
}
