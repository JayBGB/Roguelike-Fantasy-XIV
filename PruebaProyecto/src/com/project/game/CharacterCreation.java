package com.project.game;

import com.project.characters.Hero;

import javax.swing.*;

public class CharacterCreation extends Hero{

    public void createCharacter(){
       String inputName=JOptionPane.showInputDialog(null, "Welcome to the character creation.\nWhat is your hero's name:\n", "Name", JOptionPane.PLAIN_MESSAGE);
       setName(inputName);

       String inputSurname=JOptionPane.showInputDialog("What is your hero's surname?");
       setSurname(inputSurname);

       String [] gender = new String[] {"Male", "Female"};
       int inputGender = JOptionPane.showOptionDialog(null, "What is your hero's gender?", "Choose your hero's gender", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
               null, gender, gender[0]);
       setGender(inputGender);

    }
}
