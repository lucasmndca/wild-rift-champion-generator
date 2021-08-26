package com.lucasmndca.generator.data.ability

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="ability")
class Ability {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    long id

    String name

    int duration

    String description

    int cooldown

    Date createdAt

    Date updatedAt

    Ability(long id, String name, int duration, String description, int cooldown) {
        this.id = id
        this.name = name
        this.duration = duration
        this.description = description
        this.cooldown = cooldown
    }

    Ability() {}
}
