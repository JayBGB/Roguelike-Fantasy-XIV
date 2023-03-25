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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpellInfo() {
        return spellInfo;
    }

    public void setSpellInfo(String spellInfo) {
        this.spellInfo = spellInfo;
    }

    public float getManaCost() {
        return manaCost;
    }

    public void setManaCost(float manaCost) {
        this.manaCost = manaCost;
    }

    public float getSpellDmg() {
        return spellDmg;
    }

    public void setSpellDmg(float spellDmg) {
        this.spellDmg = spellDmg;
    }

    public float getSpellHealing() {
        return spellHealing;
    }

    public void setSpellHealing(float spellHealing) {
        this.spellHealing = spellHealing;
    }
}


