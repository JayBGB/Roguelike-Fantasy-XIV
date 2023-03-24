package com.project.combat;

import com.project.game.Main;

public class Ability {

    String name;
    String spellInfo;
    float manaCost;
    float spellDmg;
    float spellHealing;

    public Ability(String name, String spellInfo, float manaCost,float spellDmg, float spellHealing) {
        this.name = name;
        this.spellInfo = spellInfo;
        this.manaCost = manaCost;
        this.spellDmg = spellDmg;
        this.spellHealing = spellHealing;
    }
}


