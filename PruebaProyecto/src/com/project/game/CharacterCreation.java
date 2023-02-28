/**
 * @author Jay & Billy
 */

package com.project.game;

import com.project.characters.CharData;

import javax.swing.*;

public class CharacterCreation extends CharData {

    public void createCharacter(){

       String inputName=JOptionPane.showInputDialog(null, "Welcome to the character creation.\nWhat is your hero's name:\n", "Name", JOptionPane.PLAIN_MESSAGE);
       setName(inputName);

       String inputSurname=JOptionPane.showInputDialog("What is your hero's surname?");
       setSurname(inputSurname);

       String [] gender = new String[] {"Male", "Female"};
       int inputGender = JOptionPane.showOptionDialog(null, "What is your hero's gender?", "Choose your hero's gender", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
               null, gender, gender[0]);
       setGender(inputGender);

       do{
            String[] race = new String[]{"Hyur", "Elezen", "Miqo'te", "Roegadyn", "Lalafell", "Au Ra", "Viera", "Hrothgar"};
            String inputRace = JOptionPane.showInputDialog(null, "What is your hero's race?");
            setRace(inputRace);
            if (getRace().contentEquals("Hyur")) {
                setRace("Hyur");
            } else if (getRace().contentEquals("Elezen")) {
                setRace("Elezen");
            } else if (getRace().contentEquals("Miqo'te")) {
                setRace("Miqo'te");
            } else if (getRace().contentEquals("Roegadyn")) {
                setRace("Roegadyn");
            } else if (getRace().contentEquals("Lalafell")) {
                setRace("Lalafell");
            } else if (getRace().contentEquals("Au Ra")) {
                setRace("Au Ra");
            } else if (getRace().contentEquals("Viera")) {
                setRace("Viera");
            } else if (getRace().contentEquals("Hrothgar")) {
                setRace("Hrothgar");
            } else {
                JOptionPane.showMessageDialog(null, "ERROR");
            }
        }while(getRace() != null);
    }
}
