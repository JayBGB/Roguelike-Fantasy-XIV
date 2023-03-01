package com.project.characters;

/**
 * @author Jay & Billy
 */

public class CharData {

    // VARIABLES
    private String name;
    private String surname;
    private int gender;
    private int race;
    private int attStrength;
    private int attDexterity;
    private int attConstitution;
    private int attWisdom;
    private int attIntelligence;
    private int attCharisma;



    public CharData(){}

    /**
     *
     * @param name Hero's name.
     * @param surname Hero's surname.
     * @param gender Hero's gender.
     * @param race Hero's race.
     * @param attStrength Hero's base STR attribute.
     * @param attDexterity Hero's base DEX attribute.
     * @param attConstitution Hero's base CON attribute.
     * @param attWisdom Hero's base WIS attribute.
     * @param attIntelligence Hero's base INT attribute.
     * @param attCharisma Hero's base CHA attribute.
     */
    public CharData(String name, String surname, int gender, int race, int attStrength, int attDexterity, int attConstitution, int attWisdom, int attIntelligence, int attCharisma) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.race = race;
        this.attStrength = attStrength;
        this.attDexterity = attDexterity;
        this.attConstitution = attConstitution;
        this.attWisdom = attWisdom;
        this.attIntelligence = attIntelligence;
        this.attCharisma = attCharisma;
    }
    // GETTERS & SETTERS


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getRace() {
        return race;
    }

    public void setRace(int race) {
        this.race = race;
    }

    public int getAttStrength() {
        return attStrength;
    }

    public void setAttStrength(int attStrength) {
        this.attStrength = attStrength;
    }

    public int getAttDexterity() {
        return attDexterity;
    }

    public void setAttDexterity(int attDexterity) {
        this.attDexterity = attDexterity;
    }

    public int getAttConstitution() {
        return attConstitution;
    }

    public void setAttConstitution(int attConstitution) {
        this.attConstitution = attConstitution;
    }

    public int getAttWisdom() {
        return attWisdom;
    }

    public void setAttWisdom(int attWisdom) {
        this.attWisdom = attWisdom;
    }

    public int getAttIntelligence() {
        return attIntelligence;
    }

    public void setAttIntelligence(int attIntelligence) {
        this.attIntelligence = attIntelligence;
    }

    public int getAttCharisma() {
        return attCharisma;
    }

    public void setAttCharisma(int attCharisma) {
        this.attCharisma = attCharisma;
    }

    public int getGender() {
        return gender;
    }
    // OTHER METHODS

    public void selectClass(){}

}


