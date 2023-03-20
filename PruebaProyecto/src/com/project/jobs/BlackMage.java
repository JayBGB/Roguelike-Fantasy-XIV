package com.project.jobs;

import com.project.game.CharacterCreation;
import com.project.game.Main;

public class BlackMage {

    public void blmDamage (){

        Main.data.setDamage(10f+Main.data.getAttIntelligence()*0.8f);
    }

    public void blmXenoglossy(){

        Main.data.setMana(Main.data.getMana()-50);
        float xenoDamage = 25f+Main.data.getDamage();
        Main.enemy.seteHp(Main.enemy.geteHp()-xenoDamage);
    }

    public void blmFire (){

        Main.data.setMana(Main.data.getMana()-20);
        float fireDamage = 10f+Main.data.getDamage();
        Main.enemy.seteHp(Main.enemy.geteHp()-fireDamage);
    }

    public void blmIce(){

        Main.data.setMana(Main.data.getMana()-5);
        float iceDamage = Main.data.getDamage()-15;
        Main.enemy.seteHp(Main.enemy.geteHp()-iceDamage);
        Main.data.setMana(Main.data.getMana()+Main.data.getAttIntelligence()*0.8f);
    }

    public void blmManaward(){
        Main.data.setMana(Main.data.getMana()-15);
        Main.data.setDefense(Main.data.getDefense()+Main.data.getMaxMana()*0.2f);
        CharacterCreation blm = new CharacterCreation();
        blm.calculateDefense();
    }


}
