package com.project.jobs;

import com.project.game.CharacterCreation;
import com.project.game.Main;

public class Warrior {

    private int str, dex, con, itl;

    public void warStats(){
        con=3;
        itl=-1;
        dex=-2;
        Main.data.setAttConstitution(Main.data.getAttConstitution()+con);
        Main.data.setAttIntelligence(Main.data.getAttIntelligence()+itl);
        Main.data.setAttDexterity(Main.data.getAttDexterity()+dex);
    }

    public void warDamage(){

        Main.data.setDamage(10f+Main.data.getAttStrength()*0.7f);
    }

    public void warInnerRelease(){

            Main.data.setDefense((float) (Main.data.getDefense() - (Main.data.getDefense() * 0.2f)));
            Main.data.setDamage((float) (Main.data.getDamage() + (Main.data.getDamage() * 0.2)));
    }

    public void warFellCleave(){
        float fcDamage = 15f + Main.data.getDamage();
        Main.enemy.seteHp((Main.enemy.geteHp()-fcDamage));
        // COOLDOWN WIP
    }

    public void warNascentFlash(){

        float nfDamage = 7.5f + Main.data.getDamage();
        Main.enemy.seteHp(Main.enemy.geteHp()-nfDamage);
        Main.data.setHp((Main.data.getHp()+(nfDamage*0.15f)));

    }

    public void warHolmgang(){

        Main.data.setAttConstitution(Main.data.getAttConstitution()*2);
        CharacterCreation war = new CharacterCreation();
        war.calculateDefense();
    }


}
