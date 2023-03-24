package com.project.game;

import com.project.characters.CharData;
import com.project.combat.Ability;
import com.project.combat.Combat;
import com.project.characters.EnemyData;
import com.project.ui.UI;

/**
 * @author Jay & Billy
 */

public class Main {
    public static CharData data = new CharData();
    public static EnemyData enemyData = new EnemyData();
    public static Combat combat = new Combat();
    public static UI combatui;

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        // CHARACTER CREATION

        CharacterCreation hero = new CharacterCreation();
        hero.createCharacter();
        hero.selectClass();
        hero.pointAllocation(5);
        hero.calculateHP();
        hero.calculateMana();
        hero.calculateDefense();
        hero.calculateDamage();
        combat.addToSpellArrayList();
        combatui = new UI();
        combatui.setVisible(true);


    }
}
