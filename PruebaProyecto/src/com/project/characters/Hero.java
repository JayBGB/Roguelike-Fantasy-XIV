package com.project.characters;

/**
 * @author JayBGB
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
     * @return Return STR attribute.
     */
    public int getAttStrength(){
        return AttStrength;
    }

    /**
     *
     * @return Return DEX attribute.
     */
    public int getAttDexterity(){
        return AttDexterity;
    }

    /**
     *
     * @return Return CON attribute.
     */
    public int getAttConsitution(){
        return AttConsitution;
    }

    /**
     *
     * @return Return WIS attribute.
     */
    public int getAttWisdom(){
        return AttWisdom;
    }

    /**
     *
     * @return Return INT attribute.
     */
    public int getAttIntelligence(){
        return AttIntelligence;
    }

    /**
     *
     * @return Return CHA attribute.
     */
    public int getAttCharisma(){
        return AttCharisma;
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

    // OTHER METHODS

    public void selectClass(){}

}


