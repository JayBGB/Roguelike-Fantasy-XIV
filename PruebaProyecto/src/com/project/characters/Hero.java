package com.project.characters;

/**
 * @author Jay & Billy
 */

public class Hero {

    // VARIABLES
    private String name;
    private String surname;
    private int gender;
    private String race;
    private int AttStrength = 10;
    private int AttDexterity = 10;
    private int AttConsitution = 10;
    private  int AttWisdom = 10;
    private int AttIntelligence = 10;
    private int AttCharisma = 10;



    public Hero (){}

    /**
     *
     * @param name Hero's name.
     * @param surname Hero's surname.
     * @param gender Hero's gender.
     * @param race Hero's race.
     * @param AttStrength Hero's base STR attribute.
     * @param AttDexterity Hero's base DEX attribute.
     * @param AttConstitution Hero's base CON attribute.
     * @param AttWisdom Hero's base WIS attribute.
     * @param AttIntelligence Hero's base INT attribute.
     * @param AttCharisma Hero's base CHA attribute.
     */
    public Hero (String name, String surname, int gender, String race, int AttStrength, int AttDexterity, int AttConstitution, int AttWisdom, int AttIntelligence, int AttCharisma){

        this.name=name;
        this.surname=surname;
        this.gender=gender;
        this.race=race;
        this.AttStrength=AttStrength;
        this.AttDexterity=AttDexterity;
        this.AttConsitution=AttConstitution;
        this.AttWisdom=AttWisdom;
        this.AttIntelligence=AttIntelligence;
        this.AttCharisma=AttCharisma;
    }

    // GETTERS & SETTERS

    /**
     * @return Returns the hero's charisma.
     */
    public int getAttCharisma() {
        return AttCharisma;
    }
    /**
     * @param attCharisma Hero's Charisma setter.
     */
    public void setAttCharisma(int attCharisma) {
        AttCharisma = attCharisma;
    }
    /**
     * @return Returns the hero's intelligence.
     */
    public int getAttIntelligence() {
        return AttIntelligence;
    }
    /**
     * @param attIntelligence Hero's Intelligence setter.
     */
    public void setAttIntelligence(int attIntelligence) {
        AttIntelligence = attIntelligence;
    }
    /**
     * @return Returns the hero's wisdom.
     */
    public int getAttWisdom() {
        return AttWisdom;
    }
    /**
     * @param attWisdom Hero's Wisdom setter.
     */
    public void setAttWisdom(int attWisdom) {
        AttWisdom = attWisdom;
    }
    /**
     * @return Returns the hero's constitution.
     */
    public int getAttConsitution() {
        return AttConsitution;
    }
    /**
     * @param attConsitution Hero's Constitution setter.
     */
    public void setAttConsitution(int attConsitution) {
        AttConsitution = attConsitution;
    }
    /**
     * @return Returns the hero's dexterity.
     */
    public int getAttDexterity() {
        return AttDexterity;
    }
    /**
     * @param attDexterity Hero's Dexterity setter.
     */
    public void setAttDexterity(int attDexterity) {
        AttDexterity = attDexterity;
    }
    /**
     * @return Returns the hero's strength.
     */
    public int getAttStrength() {
        return AttStrength;
    }
    /**
     * @param attStrength Hero's Strength setter.
     */
    public void setAttStrength(int attStrength) {
        AttStrength = attStrength;
    }

    /**
     * @return Returns the hero's name.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return Returns the hero's surname.
     */
    public String getSurname(){
        return surname;
    }

    /**
     *
     * @return Return's the hero's gender.
     */
    public int getGender(){
        return gender;
    }

    /**
     *
     * @return Returns the hero's race.
     */
    public String getRace(){
        return race;
    }

    /**
     *
     * @param name Hero's name setter.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param surname Hero's surname setter.
     */
    public void setSurname(String surname){
        this.surname = surname;
    }

    /**
     *
     * @param gender Hero's gender setter.
     */
    public void setGender(int gender){
        this.gender = gender;
    }

    /**
     *
     * @param race Hero's race setter.
     */
    public void setRace(String race){
        this.race = race;
    }
    /**
     * @return Returns the hero's gender.
     */
    public int getGender() {
        return gender;
    }
    // OTHER METHODS

    public void selectClass(){}

}


