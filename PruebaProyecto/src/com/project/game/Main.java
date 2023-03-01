package com.project.game;
import com.project.characters.Character;

/**
 * @author Jay & Billy
 */

public class Main {
    public static void main(String[] args) {

        CharacterCreation hero = new CharacterCreation();
        hero.createCharacter();
        Character character = new Character();
        character.setCharacter();

    }
}