package com.lucasmndca.generator.data.champion

import com.lucasmndca.generator.data.ability.Ability
import com.lucasmndca.generator.data.region.RegionEnum

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table
import javax.persistence.Transient

@Entity
@Table(name="champion")
class Champion {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id

    String name

    String description

    @Transient
    List<String> lanes

    RegionEnum region

    int height

    int weight

    String gender

    String color

    Date createdAt

    Date updatedAt

    Champion(Long id, String name, String description, List<String> lanes, List<Ability> abilities, RegionEnum region,
             int height, int weight, String gender, String color) {
        this.id = id
        this.name = name
        this.description = description
        this.lanes = lanes
        this.abilities = abilities
        this.region = region
        this.height = height
        this.weight = weight
        this.gender = gender
        this.color = color
    }

    Champion() {
    }
}
