package com.lucasmndca.generator.web.championAbility.request

import com.lucasmndca.generator.data.ability.Ability
import com.lucasmndca.generator.data.champion.Champion
import org.springframework.stereotype.Component

@Component
class ChampionAbilityRequest {
    Champion champion
    Ability ability
}
