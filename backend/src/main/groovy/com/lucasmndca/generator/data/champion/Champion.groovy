package com.lucasmndca.generator.data.champion

import com.lucasmndca.generator.data.ability.Ability
import com.lucasmndca.generator.data.region.RegionEnum

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="champion")
class Champion {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name;

    private List<String> lanes;

    private List<Ability> abilities;

    private RegionEnum region;

    private int height;

    private int weight;

    private String gender;

    private String color;

    Champion(Long id, String name, List<String> lanes, List<Ability> abilities, RegionEnum region, int height, int weight, String gender, String color) {
        this.id = id
        this.name = name
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

    Long getId() {
        return id
    }

    void setId(Long id) {
        this.id = id
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    List<String> getLanes() {
        return lanes
    }

    void setLanes(List<String> lanes) {
        this.lanes = lanes
    }

    List<Ability> getAbilities() {
        return abilities
    }

    void setAbilities(List<Ability> abilities) {
        this.abilities = abilities
    }

    RegionEnum getRegion() {
        return region
    }

    void setRegion(RegionEnum region) {
        this.region = region
    }

    int getHeight() {
        return height
    }

    void setHeight(int height) {
        this.height = height
    }

    int getWeight() {
        return weight
    }

    void setWeight(int weight) {
        this.weight = weight
    }

    String getGender() {
        return gender
    }

    void setGender(String gender) {
        this.gender = gender
    }

    String getColor() {
        return color
    }

    void setColor(String color) {
        this.color = color
    }
}
