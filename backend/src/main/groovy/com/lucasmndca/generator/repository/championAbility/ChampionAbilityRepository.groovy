package com.lucasmndca.generator.repository.championAbility

import com.lucasmndca.generator.data.championAbility.ChampionAbility
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface ChampionAbilityRepository extends CrudRepository<ChampionAbility, Long>{

    @Query("insert into champion_v_ability (id_champion, id_ability) values (:abilityId, :championId)")
    Boolean assignAbility(@Param Long abilityId, @Param Long championId)

    @Query("delete from champion_v_ability where id_champion = :championId and id_ability = :abilityId")
    Boolean unassignAbility(@Param Long abilityId, @Param Long championId)

}