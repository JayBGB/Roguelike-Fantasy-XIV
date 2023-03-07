package com.project.game;

import com.project.characters.CharData;
import com.project.enemies.Enemy;
import com.project.ui.UI;

/**
 * @author Jay & Billy
 */

public class Main {
    public static CharData data = new CharData();
    public static Enemy enemy = new Enemy();

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        // CHARACTER CREATION
        /*
        CharacterCreation hero = new CharacterCreation();
        hero.createCharacter();
        hero.selectClass();
        hero.pointAllocation(5);
        hero.calculateHP();
        hero.calculateMana();
        hero.calculateDefense();
         */
        new UI();  //Por alguna razon no se ve bien si no amplias la pestaña
    }
}