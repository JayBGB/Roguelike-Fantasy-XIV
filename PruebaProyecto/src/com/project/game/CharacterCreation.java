/**
 * @author Jay & Billy
 */

package com.project.game;

import com.project.characters.CharData;
import com.project.characters.Race;

import javax.swing.*;

public class CharacterCreation extends CharData {

    private final int HYUR = 0;
    private final int ELEZEN = 1;
    private final int MIQOTE = 2;
    private final int ROEGADYN = 3;
    private final int LALAFELL = 4;
    private final int AURA = 5;
    private final int VIERA = 6;
    private final int HROTHGAR = 7;

    public void createCharacter(){

       String inputName=JOptionPane.showInputDialog(null, "Welcome to the character creation.\nWhat is your hero's name:\n", "Character's Name", JOptionPane.PLAIN_MESSAGE);
       setName(inputName);

       String inputSurname=JOptionPane.showInputDialog(null, "What is your hero's surname?", "Character's Surname", JOptionPane.PLAIN_MESSAGE );
       setSurname(inputSurname);

       String [] gender = new String[] {"Male", "Female"};
       int inputGender = JOptionPane.showOptionDialog(null, "What is your hero's gender?", "Character's Gender", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
               null, gender, gender[0]);
       setGender(inputGender);

        Race races = new Race();
    try {
        do {
            String[] race = new String[]{"Hyur", "Elezen", "Miqo'te", "Roegadyn", "Lalafell", "Au Ra", "Viera", "Hrothgar"};
            int inputRace = JOptionPane.showOptionDialog(null, "What is your hero's race?", "Character's Race", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, race, race[0]);

            switch(inputRace){
                case 0:
                setRace(HYUR);
                races.hyur();
                break;
                case 1:
                setRace(ELEZEN);
                races.elezen();
                break;
                case 2:
                setRace(MIQOTE);
                races.miqote();
                break;
                case 3:
                setRace(ROEGADYN);
                races.roegadyn();
                break;
                case 4:
                setRace(LALAFELL);
                races.lalafell();
                break;
                case 5:
                setRace(AURA);
                races.aura();
                break;
                case 6:
                setRace(VIERA);
                races.viera();
                break;
                case 7:
                setRace(HROTHGAR);
                races.hrothgar();
                break;
                default:
                JOptionPane.showMessageDialog(null, "ERROR: RACE SELECTION");
                break;
            }
        } while (getRace() < 0 && getRace() > 7);
    }catch (Exception e){
        System.out.println(e.getMessage());
    }

    }

    }


