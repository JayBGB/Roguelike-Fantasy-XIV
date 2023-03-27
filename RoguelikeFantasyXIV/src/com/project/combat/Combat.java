package com.project.combat;

import com.project.game.Main;
import com.projectLibrary.mathematics.math;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jay & Billy
 * @version 1.0
 */

public class Combat {

    //VARIABLES
    boolean heroIsAlive = true;
    boolean enemyIsAlive = true;
    public static List<Ability> spellArray = new ArrayList<>();

    /**
     * Method that creates the spells for each job.
     */
    public void addToSpellArrayList () {
        int job = Main.data.getJob();
        spellArray.clear();
        switch (job) {
            case 0: // Warrior
                spellArray.add(new Ability("Inner Release", "Unleash your rage and crush your enemy!\nDamage: "+ math.floatFormat.format((float) (Main.data.getDamage() + (Main.data.getDamage() * 0.2)))+"\nMana cost: 15\nHealing: None\nMana recovery: None", 15,  0+(float) (Main.data.getDamage() + (Main.data.getDamage() * 0.2)), 0));
                spellArray.add(new Ability("Fell Cleave", "Perform a deadly swing with your greataxe!\nDamage: "+math.floatFormat.format(15f + Main.data.getDamage())+"\nMana cost: 20\nHealing: None\nMana recovery: None", 20, 15f + Main.data.getDamage(), 0));
                spellArray.add(new Ability("Nascent Flash", "Drain your foe's life force to reinvigorate yourself!\nDamage: "+math.floatFormat.format(7.5f + Main.data.getDamage()) + "\nMana cost: 25\nHealing: " + math.floatFormat.format((float) ((Main.data.getDamage()*0.3)) + (float) (Main.data.getAttWisdom()*0.4))+"\nMana recovery: None" , 25, 7.5f + Main.data.getDamage(), (float)((Main.data.getDamage())*0.15f)+(float)(Main.data.getAttWisdom()*0.4)));
                spellArray.add(new Ability("Holmgang", "Use your inner force to heal your wounds!\nDamage: None\nMana cost: 60\nHealing: " + math.floatFormat.format((float) (Main.data.getAttConstitution()*2f))+"\nMana recovery: None", 35, 0, (float)(Main.data.getAttConstitution()*2.5f)));
            break;
            case 1: // Bard
                spellArray.add(new Ability("Apex Arrow", "Pierce your foe with one of your sharpest arrows!\nDamage: "+math.floatFormat.format(10f+Main.data.getDamage())+"\nMana cost: 20\nHealing: None\nMana recovery: None", 20, 10f+Main.data.getDamage(), 0));
                spellArray.add(new Ability("Refulgent Arrow", "Set one arrow on fire to burn your enemy!\nDamage: "+math.floatFormat.format(15f+Main.data.getDamage())+"\nMana cost: 30\nHealing: None\nMana recovery: None", 30, 15f+Main.data.getDamage(), 0));
                spellArray.add(new Ability("Nature's Minne","Commune with the forces of nature to heal your wounds!\nDamage: None\nMana cost: 25\nHealing: "+math.floatFormat.format(5+Main.data.getAttCharisma()/2)+"\nMana recovery: None", 25, 0, 5+Main.data.getAttCharisma()/2));
                spellArray.add(new Ability("Radiant Finale", "Make your arrow explode with the force of your magick!\nDamage: " + math.floatFormat.format(40 + Main.data.getDamage()) + "\nMana cost: 100\nHealing: None\nMana recovery: None", 100, 40+Main.data.getDamage(), 0));
            break;
            case 2: // Black Mage
                spellArray.add(new Ability("Xenoglossy", "A powerful blast that will make your foes explode from within!\nDamage: "+math.floatFormat.format(30f+Main.data.getDamage()) +"\nMana cost: 50\nHealing: None\nMana recovery: None", 50, 30f+Main.data.getDamage(), 0));
                spellArray.add(new Ability("Fire", "Channel the energy of fire to burn your enemy!\nDamage: "+math.floatFormat.format(10f+Main.data.getDamage())+"\nMana cost: 20\nHealing: None\nMana recovery: None", 20, 10f+Main.data.getDamage(), 0));
                spellArray.add(new Ability("Ice", "Channel the forces of ice to recover your mana!\nDamage: "+math.floatFormat.format(Main.data.getDamage()-10f)+"\nMana cost: 5\nHealing: None\nMana recovery: "+math.floatFormat.format(Main.data.getAttIntelligence()*0.65f), 5f-(float)(Main.data.getAttIntelligence()*0.65f), Main.data.getDamage()-10f, 0));
                spellArray.add(new Ability("Manaward", "Channel your inner energy to heal your wounds!\nDamage: None\nMana cost: 35\nHealing: "+math.floatFormat.format(Main.data.getMaxMana()*0.25f)+"\nMana recovery: None", 35, 0, Main.data.getMaxMana()*0.25f));
            break;
            case 3: // Astrologian
                spellArray.add(new Ability("Microcosmos", "Channel the power of the stars to heal your wounds!\nDamage: None\nMana cost: 25\nHealing: "+math.floatFormat.format(Main.data.getMaxHp()/3.75f+(Main.data.getAttCharisma()/2)*2)+"\nMana recovery: None", 20, 0, Main.data.getMaxHp()/3.75f+(Main.data.getAttCharisma()/2)*2));
                spellArray.add(new Ability("Macrocosmos", "Channel the energy of the cosmos to crush your foes!\nDamage: "+math.floatFormat.format(10f + Main.data.getAttCharisma()*0.8f)+"\nMana cost: 20\nHealing: None\nMana recovery: None", 20, 10f + Main.data.getAttCharisma()*0.8f, 0));
                spellArray.add(new Ability("Divination", "Read the stars to learn how to crush your enemy!\nDamage: "+math.floatFormat.format(Main.data.getDamage() + (float)(Main.data.getDamage() * 0.3))+"\nMana cost: 25\nHealing: None\nMana recovery: None", 25, Main.data.getDamage() + (float)(Main.data.getDamage() * 0.3), 0));
                spellArray.add(new Ability("Exaltation", "Reinvigorate yourself with the essence of your enemy's soul!\nDamage: "+math.floatFormat.format(10f + (float)(Main.data.getAttCharisma()*0.3))+"\nMana cost: 10\nHealing: "+math.floatFormat.format(Main.data.getAttCharisma()*0.3)+"\nMana recovery: "+ (float)(Main.data.getAttIntelligence()*0.55f), 10f-(float)(Main.data.getAttIntelligence()*0.55f), 10f + (float)(Main.data.getAttCharisma()*0.3), 0+(float)(Main.data.getAttCharisma()*0.3)));
            break;
        }
    }

    /**
     *
     * @return Returns the spell name list.
     */
    public String[] createSpellNameList(){
        String[] spellNameList = new String[spellArray.size()];
        int i = 0;
        for(Ability spell : spellArray){
            spellNameList[i] = spell.name;
            i ++;
        }
        return spellNameList;
    }

    /**
     * Method that takes an enemy turn.
     */
    public void enemyTurn(){
        if (Main.data.getHp() - (Main.enemyData.geteDmg() - Main.enemyData.geteDmg() * Main.data.getDefensePercentage()) <= 0){
            Main.data.setHp(0);
            setHeroIsAlive(false);
        }else
        Main.data.setHp(Main.data.getHp() - (Main.enemyData.geteDmg() - Main.enemyData.geteDmg() * Main.data.getDefensePercentage()));
    }

    /**
     * Method to use a spell.
     * @param spellNumber Spell slot.
     * @param spellList Spell list.
     * @return Returns true.
     */
    public boolean useSpell(int spellNumber,List<Ability> spellList){
        Ability useSpell = spellList.get(spellNumber);
        if (useSpell.getManaCost() > Main.data.getMana()) {
            return false;
        }else{
            doDamage(useSpell.spellDmg);
            doMana(useSpell.manaCost);
            doHeal(useSpell.spellHealing);
            return true;
        }
    }

    /**
     * Method to do damage.
     * @param dmg Damage ammount.
     */
    public void doDamage(float dmg){
        if (Main.enemyData.geteHp() - dmg <= 0) {
            Main.enemyData.seteHp(0);
            Main.combat.setEnemyIsAlive(false);
        }else {
            Main.enemyData.seteHp(Main.enemyData.geteHp() - dmg);
        }
    }

    /**
     * Method to get healing.
     * @param heal Healing ammount.
     */
    public void doHeal(float heal){
        Main.data.setHp(Math.min(Main.data.getHp() + heal, Main.data.getMaxHp()));
    }

    /**
     * Method to take mana away.
     * @param mana Reduced mana ammount.
     */
    public void doMana(float mana){
        if (Main.data.getMana() - mana < 0){
            Main.data.setMana(0);
        }else if(Main.data.getMana() - mana > Main.data.getMaxMana()){
            Main.data.setMana(Main.data.getMaxMana());
        }else
            Main.data.setMana(Main.data.getMana() - mana);

    }

    /**
     * Method to check if the PC is alive.
     * @param heroIsAlive Are you truly alive?
     */
    public void setHeroIsAlive(boolean heroIsAlive) {
        this.heroIsAlive = heroIsAlive;
    }

    /**
     * Method to check if the enemy is alive.
     * @param enemyIsAlive I sure hope they're not alive.
     */
    public void setEnemyIsAlive(boolean enemyIsAlive) {
        this.enemyIsAlive = enemyIsAlive;
    }

    /**
     * Method that checks if the combatants are still alive.
     * @return Returns who's still alive.
     */
    public int checkStateCombat(){
        if (!heroIsAlive){
            return 1;
        }else if (!enemyIsAlive){
            return 2;
        }return 3;
    }

    /**
     * Method that takes the damage reduced by the PC's defense percentage.
     * @param enemydmg Enemy damage.
     * @param defensePercentage PC's defense percentage.
     */
    public void defense(float enemydmg, float defensePercentage){
        float tempeDmg =(enemydmg - (enemydmg * (defensePercentage * 2)));
        if (Main.enemyData.geteHp() - tempeDmg <= 0) {
            Main.enemyData.seteHp(0);
            Main.combat.setHeroIsAlive(false);
        }else
            Main.data.setHp(Main.data.getHp() - tempeDmg);
    }
}
