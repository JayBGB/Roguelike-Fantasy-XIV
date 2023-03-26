package com.project.combat;

/**
 * @author Jay & Billy
 * @version 1.0
 */

public class Ability {

    //VARIABLES
    String name;
    String spellInfo;
    float manaCost;
    float spellDmg;
    float spellHealing;

    /**
     *
     * @param name Spell name.
     * @param spellInfo Spell info.
     * @param manaCost Spell's mana cost.
     * @param spellDmg Spell's damage.
     * @param spellHealing Spell's healing.
     */
    public Ability(String name, String spellInfo, float manaCost,float spellDmg, float spellHealing) {
        this.name = name;
        this.spellInfo = spellInfo;
        this.manaCost = manaCost;
        this.spellDmg = spellDmg;
        this.spellHealing = spellHealing;
    }

    /**
     *
     * @return Returns spell info.
     */
    public String getSpellInfo() {
        return spellInfo;
    }

    /**
     *
     * @return Returns spells mana cost.
     */
    public float getManaCost() {
        return manaCost;
    }

}


