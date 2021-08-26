package com.lucasmndca.generator.repository.champion

import com.lucasmndca.generator.data.champion.Champion
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ChampionRepository extends CrudRepository<Champion, Long>{

}