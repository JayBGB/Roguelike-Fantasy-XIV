package com.project.characters;

import com.project.game.Main;

/**
 * @author Jay & Billy
 */

public class CharData{

    // VARIABLES
    private String name;
    private String surname;
    private int job;
    private String jobName;
    private int race;
    private int attStrength=10;
    private int attDexterity=10;
    private int attConstitution=10;
    private int attWisdom=10;
    private int attIntelligence=10;
    private int attCharisma=10;
    private float maxMana;
    private float mana;
    private float maxHp;
    private float hp;
    private float defense;
    private float defensePercentage;
    private float damage;




    public CharData(){}

    /**
     *
     /**
     *
     * @param surname Hero's surname.
     * @param race Hero's race.
     * @param attStrength Hero's base STR attribute.
     * @param attDexterity Hero's base DEX attribute.
     * @param attConstitution Hero's base CON attribute.
     * @param attWisdom Hero's base WIS attribute.
     * @param attIntelligence Hero's base INT attribute.
     * @param attCharisma Hero's base CHA attribute.
     * @param maxMana Hero's mana.
     * @param name
     * @param maxHp
     * @param hp
     * @param defense
     * @param defensePercentage
     * @param damage
     */
    public CharData(String surname, int race, int attStrength, int attDexterity, int attConstitution, int attWisdom, int attIntelligence, int attCharisma, float maxMana, String name, float maxHp, float hp, float defense, float defensePercentage, float damage) {
        this.surname = surname;
        this.race = race;
        this.attStrength = attStrength;
        this.attDexterity = attDexterity;
        this.attConstitution = attConstitution;
        this.attWisdom = attWisdom;
        this.attIntelligence = attIntelligence;
        this.attCharisma = attCharisma;
        this.maxMana = maxMana;
        this.name = name;
        this.maxHp = maxHp;
        this.hp = hp;
        this.defense = defense;
        this.defensePercentage = defensePercentage;
        this.damage = damage;
    }

    // GETTERS & SETTERS

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
     * @return Creature's name.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name Creature's name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return Creature's maximum HP.
     */
    public float getMaxHp() {
        return maxHp;
    }

    /**
     *
     * @param maxHp Creature's maximum HP.
     */
    public void setMaxHp(float maxHp) {
        this.maxHp = maxHp;
    }

    /**
     *
     * @return Creature's HP.
     */
    public float getHp() {
        return hp;
    }

    /**
     *
     * @param hp Creature's HP.
     */
    public void setHp(float hp) {
        this.hp = hp;
    }

    /**
     *
     * @return Creature's defense.
     */
    public float getDefense() {
        return defense;
    }

    /**
     *
     * @param defense Creature's defense.
     */
    public void setDefense(float defense) {
        this.defense = defense;
    }

    /**
     *
     * @return Creature's defense percentage.
     */
    public float getDefensePercentage() {
        return defensePercentage;
    }

    /**
     *
     * @param defensePercentage Creature's defense percentage.
     */
    public void setDefensePercentage(float defensePercentage) {
        this.defensePercentage = defensePercentage;
    }

    /**
     *
     * @return Creature's damage.
     */
    public float getDamage() {
        return damage;
    }

    /**
     *
     * @param damage Creature's damage.
     */
    public void setDamage(float damage) {
        this.damage = damage;
    }

    /**
     *
     * @return Returns PC's maximum mana.
     */
    public float getMaxMana() {
        return maxMana;
    }

    /**
     *
     * @param maxMana PC's maximum mana.
     */
    public void setMaxMana(float maxMana) {
        this.maxMana = maxMana;
    }

    /**
     *
     * @return PC's mana.
     */
    public float getMana() {
        return mana;
    }

    /**
     *
     * @param mana PC's mana.
     */

    public void setMana(float mana) {
        this.mana = mana;
    }

    /**
     *
     * @return PC's job.
     */

    public int getJob() {
        return job;
    }

    /**
     *
     * @param job PC's job.
     */
    public void setJob(int job) {
        this.job = job;
    }

    /**
     *
     * @return PC's job
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
}





