package com.project.game;

import com.project.characters.CharData;
import com.project.combat.Combat;
import com.project.characters.EnemyData;
import com.project.inventory.Inventory;
import com.project.inventory.Item;
import com.project.inventory.Potions;
import com.project.ui.CharacterCreationUI;
import com.project.ui.UI;
import com.project.ui.UIMenu;
import com.project.ui.UIpointAllocation;

import java.io.File;

/**
 * @author Jay & Billy
 */

public class Main {
    public static CharData data = new CharData();
    public static EnemyData enemyData = new EnemyData();
    public static Combat combat = new Combat();
    static File inventory = new File("PruebaProyecto/inventory.txt");
    public static Inventory inv = new Inventory(inventory,Inventory.GOLD);
    public static Potions manaPotion = new Potions(5,"Mana Potion");
    public static Potions hpPotion = new Potions(5,"HP Potion");
    public static Item gold = new Item("gold",0);
    public static CharacterCreation charCreation = new CharacterCreation();
    public static CharacterCreationUI charCreationUI;
    public static UI combatui;
    public static UIpointAllocation paUI;
    public static UIMenu menuUI;

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        // CHARACTER CREATION
        charCreationUI = new CharacterCreationUI();
        charCreationUI.setVisible(true);
    }
}