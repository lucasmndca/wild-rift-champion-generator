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
    private long id;

    private String name;

    private int duration;

    private String description;

    private int cooldown;

    Ability(long id, String name, int duration, String description, int cooldown) {
        this.id = id
        this.name = name
        this.duration = duration
        this.description = description
        this.cooldown = cooldown
    }

    long getId() {
        return id
    }

    String getName() {
        return name
    }

    int getDuration() {
        return duration
    }

    String getDescription() {
        return description
    }

    int getCooldown() {
        return cooldown
    }
}
