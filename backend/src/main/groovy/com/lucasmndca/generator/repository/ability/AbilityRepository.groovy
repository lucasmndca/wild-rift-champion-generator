package com.lucasmndca.generator.repository.ability

import com.lucasmndca.generator.data.ability.Ability
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface AbilityRepository extends CrudRepository<Ability, Long>{

}