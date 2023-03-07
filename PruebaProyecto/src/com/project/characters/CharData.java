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
    private int attStrength=10;
    private int attDexterity=10;
    private int attConstitution=10;
    private int attWisdom=10;
    private int attIntelligence=10;
    private int attCharisma=10;

    private float maxHp;
    private float hp;
    private float maxMana;
    private float mana;
    private float defense;
    private float defensePercentage;

    private float damage;



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
     * @param hp Hero's HP.
     * @param maxMana Hero's mana.
     * @param defense Hero's defense.
     * @param defensePercentage Hero's defense(Percentage).
     */
    public CharData(String name, String surname, int gender, int race, int attStrength, int attDexterity, int attConstitution, int attWisdom, int attIntelligence, int attCharisma, float hp, float maxMana, float defense, float defensePercentage, float damage) {
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
        this.maxHp = hp;
        this.maxMana = maxMana;
        this.defense = defense;
        this.defensePercentage = defensePercentage;
        this.damage = damage;
    }

    // GETTERS & SETTERS

    /**
     *
     * @return Returns the PC's name.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name PC's name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return Returns the PC's surname.
     */
    public String getSurname() {
        return surname;
    }

    /**
     *
     * @param surname PC's surname.
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     *
     * @param gender PC's gender.
     */
    public void setGender(int gender) {
        this.gender = gender;
    }

    /**
     *
     * @return Returns the PC's race.
     */
    public int getRace() {
        return race;
    }

    /**
     *
     * @param race PC's race.
     */
    public void setRace(int race) {
        this.race = race;
    }

    /**
     *
     * @return Returns the PC's STR attribute.
     */
    public int getAttStrength() {
        return attStrength;
    }

    /**
     *
     * @param attStrength PC's STR attribute.
     */
    public void setAttStrength(int attStrength) {
        this.attStrength = attStrength;
    }

    /**
     *
     * @return Returns the PC's DEX attribute.
     */
    public int getAttDexterity() {
        return attDexterity;
    }

    /**
     *
     * @param attDexterity PC's DEX attribute.
     */
    public void setAttDexterity(int attDexterity) {
        this.attDexterity = attDexterity;
    }

    /**
     *
     * @return Returns the PC's CON attribute.
     */
    public int getAttConstitution() {
        return attConstitution;
    }

    /**
     *
     * @param attConstitution PC's CON attribute.
     */
    public void setAttConstitution(int attConstitution) {
        this.attConstitution = attConstitution;
    }

    /**
     *
     * @return Returns the PC's WIS attribute.
     */
    public int getAttWisdom() {
        return attWisdom;
    }

    /**
     *
     * @param attWisdom PC's WIS attribute.
     */
    public void setAttWisdom(int attWisdom) {
        this.attWisdom = attWisdom;
    }

    /**
     *
     * @return Returns the PC's INT attribute.
     */
    public int getAttIntelligence() {
        return attIntelligence;
    }

    /**
     *
     * @param attIntelligence PC's INT attribute.
     */
    public void setAttIntelligence(int attIntelligence) {
        this.attIntelligence = attIntelligence;
    }

    /**
     *
     * @return Returns the PC's CHA attribute.
     */
    public int getAttCharisma() {
        return attCharisma;
    }

    /**
     *
     * @param attCharisma PC's CHA attribute.
     */
    public void setAttCharisma(int attCharisma) {
        this.attCharisma = attCharisma;
    }

    /**
     *
     * @return Returns the PC's gender.
     */
    public int getGender() {
        return gender;
    }

    /**
     *
     * @return Returns PC's HP.
     */
    public float getMaxHp() {
        return maxHp;
    }

    /**
     *
     * @param maxHp PC's HP.
     */
    public void setMaxHp(float maxHp) {
        this.maxHp = maxHp;
    }

    /**
     *
     * @return Returns PC's mana.
     */
    public float getMaxMana() {
        return maxMana;
    }

    /**
     *
     * @param maxMana PC's mana.
     */
    public void setMaxMana(float maxMana) {
        this.maxMana = maxMana;
    }

    /**
     *
     * @return Returns PC's defense.
     */
    public float getDefense() {
        return defense;
    }

    /**
     *
     * @param defense PC's defense.
     */
    public void setDefense(float defense) {
        this.defense = defense;
    }

    /**
     *
     * @return Returns PC's defense percentage.
     */
    public float getDefensePercentage() {
        return defensePercentage;
    }

    /**
     *
     * @param defensePercentage PC's defense percentage.
     */
    public void setDefensePercentage(float defensePercentage) {
        this.defensePercentage = defensePercentage;
    }

    /**
     *
     * @return Returns PC's damage.
     */

    public float getDamage() {
        return damage;
    }

    /**
     *
     * @param damage PC's damage.
     */
    public void setDamage(float damage) {
        this.damage = damage;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public float getMana() {
        return mana;
    }

    public void setMana(float mana) {
        this.mana = mana;
    }
}





