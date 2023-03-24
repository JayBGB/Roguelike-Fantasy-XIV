package com.project.combat;

import com.project.game.Main;

import java.util.ArrayList;
import java.util.List;

public class Combat {

    boolean heroIsAlive;
    boolean enemyIsAlive;
    public static List<Ability> spellArray = new ArrayList<>();

    public void addToSpellArrayList () {
        int job = Main.data.getJob();
        switch (job) {
            case 1: // Warrior
                spellArray.add(new Ability("Inner Release", "info", 25, (float) (Main.data.getDamage() + (Main.data.getDamage() * 0.2)), 0));
                spellArray.add(new Ability("Fell Cleave", "info", 35, 15f + Main.data.getDamage(), 0));
                spellArray.add(new Ability("Nascent Flash", "info", 50, 7.5f + Main.data.getDamage(), (7.5f + Main.data.getDamage())*0.15f));
                spellArray.add(new Ability("Holmgang", "info", 60, 0, (float)(Main.data.getAttConstitution()*2f)));
            break;
            case 2: // Bard
                spellArray.add(new Ability("Apex Arrow", "info", 50, 10, 0));
                spellArray.add(new Ability("Refulgent Arrow", "info", 50, 10, 0));
                spellArray.add(new Ability("Nature's Minne", "info", 50, 10, 0));
                spellArray.add(new Ability("Radiant Finale", "info", 50, 10, 0));
            break;
            case 3: // Black Mage
                spellArray.add(new Ability("Xenoglossy", "info", 50, 25f+Main.data.getDamage(), 0));
                spellArray.add(new Ability("Fire", "info", 20, 10f+Main.data.getDamage(), 0));
                spellArray.add(new Ability("Ice", "info", 5f-(float)(Main.data.getAttIntelligence()*0.8f), Main.data.getDamage()-15f, 0));
                spellArray.add(new Ability("Manaward", "info", 15, 0, Main.data.getMaxMana()*0.3f));
            break;
            case 4: // Astrologian
                spellArray.add(new Ability("Microcosmos", "info", 25, 0, Main.data.getHp()+(Main.data.getAttCharisma()/2)*3));
                spellArray.add(new Ability("Macrocosmos", "info", 20, 10f + Main.data.getAttCharisma()*0.8f, 0));
                spellArray.add(new Ability("Divination", "info", 25, Main.data.getDamage() + (float)(Main.data.getDamage() * 0.2), 0));
                spellArray.add(new Ability("Exaltation", "info", 15, 10f + (float)(Main.data.getAttCharisma()*0.3), (float)(Main.data.getAttCharisma()*0.3)));
            break;
        }
    }

    public String[] createSpellNameList(){
        String[] spellNameList = new String[spellArray.size()];
        int i = 0;
        for(Ability spell : spellArray){
            spellNameList[i] = spell.name;
            i ++;
        }
        return spellNameList;
    }

    public void useSpell(int spellNumber,List<Ability> spellList){
        Ability useSpell = spellList.get(spellNumber);
        doDamage(useSpell.spellDmg);
        doMana(useSpell.manaCost);
        doHeal(useSpell.spellHealing);
    }

    public void doDamage(float dmg){
        if (Main.enemyData.geteHp() - dmg < 0) {
            Main.combat.setEnemyIsAlive(false);
        }else
        Main.enemyData.seteHp(Main.enemyData.geteHp() - dmg);
    }

    public void doHeal(float heal){
        if (Main.data.getHp() + heal > Main.data.getMaxHp()){
            Main.data.setHp(Main.data.getMaxHp());
        }else
            Main.data.setHp(Main.data.getHp() + heal);
    }

    public void doMana(float mana){
        if (Main.data.getMana() - mana < 0){
            Main.data.setMana(0);
        }else if(Main.data.getMana() - mana > Main.data.getMaxMana()){
            Main.data.setMana(Main.data.getMaxMana());
        }else
            Main.data.setMana(Main.data.getMana() - mana);

    }
    public boolean isHeroIsAlive() {
        return heroIsAlive;
    }

    public void setHeroIsAlive(boolean heroIsAlive) {
        this.heroIsAlive = heroIsAlive;
    }

    public boolean isEnemyIsAlive() {
        return enemyIsAlive;
    }

    public void setEnemyIsAlive(boolean enemyIsAlive) {
        this.enemyIsAlive = enemyIsAlive;
    }

    public void  heroWins(){

    }

    public float attack(float enemyHp){
        float hpleft = enemyHp - Main.data.getDamage();
        if(hpleft <= 0){
            return 0;
        }else {
            return hpleft;
        }
    }

    public float defense(float hp, float enemydmg, float defensePercentage){
        float tempHp;
        tempHp = hp - (enemydmg - defensePercentage * 2);
        return tempHp;
    }
}
