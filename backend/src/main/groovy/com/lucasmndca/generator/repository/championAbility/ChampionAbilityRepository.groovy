package com.lucasmndca.generator.repository.championAbility

import com.lucasmndca.generator.data.championAbility.ChampionAbility
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface ChampionAbilityRepository extends CrudRepository<ChampionAbility, Long>{
    //TODO: implement queries
    @Query(value = "")
    Boolean assignAbility(@Param Long abilityId, @Param Long championId)

    @Query(value = "")
    Boolean unassignAbility(@Param Long abilityId, @Param Long championId)

}