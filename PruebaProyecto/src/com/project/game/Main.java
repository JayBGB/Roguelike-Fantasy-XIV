package com.project.game;

import com.project.characters.CharData;
import com.project.combat.Ability;
import com.project.combat.Combat;
import com.project.characters.EnemyData;
import com.project.inventory.Gold;
import com.project.inventory.Potions;
import com.project.ui.UI;
import com.project.ui.UIpointAllocation;

/**
 * @author Jay & Billy
 */

public class Main {
    public static CharData data = new CharData();
    public static EnemyData enemyData = new EnemyData();
    public static Combat combat = new Combat();
    public static Gold gold = new Gold();
    public static Potions manaPotions = new Potions(5,-50);
    public static Potions hpPotions = new Potions(5,50);
    public static UI combatui;
    public static UIpointAllocation paUI;

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
        enemyData.createEnemy();
        combat.addToSpellArrayList();
        paUI = new UIpointAllocation();
        paUI.setVisible(true);
        combatui = new UI();
        combatui.setVisible(true);
    }
}
