package com.project.characters;

/**
 * @author JayBGB
 */

public abstract class Hero {

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
     * @param name Constructor in abstract class.
     * @param surname Constructor in abstract class.
     * @param gender Constructor in abstract class.
     * @param race Constructor in abstract class.
     */
    public Hero (String name, String surname, int gender, String race){

        this.name=name;
        this.surname=surname;
        this.gender=gender;
        this.race=race;
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
    public int isGender(){
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

    // OTHER METHODS

    public void selectClass(){}

}


