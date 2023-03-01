package com.project.game;

import com.project.characters.CharData;

/**
 * @author Jay & Billy
 */

public class Main {

    public static CharData obj = new CharData();

    public static void main(String[] args) {


        CharacterCreation hero = new CharacterCreation();
        hero.createCharacter();
        System.out.println(obj.getAttConstitution());
        hero.calculateHP();

    }
}