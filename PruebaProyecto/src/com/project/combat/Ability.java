package com.project.combat;

import com.project.game.Main;

public class Ability {

    String name;
    int manaCost;

    public void calculateDamage(){
        switch (Main.data.getJob()){
            //WARRIOR
            case 1:
                Main.data.setDamage(10f+Main.data.getAttStrength()*0.7f);
            //PALADIN
            case 2:
                Main.data.setDamage(10f);
            //DARK KNIGHT
            case 3:
                Main.data.setDamage(10f);
            //GUNBREAKER
            case 4:
                Main.data.setDamage(10f);
            //BARD
            case 5:
                Main.data.setDamage(10f);
            //DANCER
            case 6:
                Main.data.setDamage(10f);
            //MACHINIST
            case 7:
                Main.data.setDamage(10f);
            //DRAGOON
            case 8:
                Main.data.setDamage(10f);
            //MONK
            case 9:
                Main.data.setDamage(10f);
            //NINJA
            case 10:
                Main.data.setDamage(10f);
            //SAMURAI
            case 11:
                Main.data.setDamage(10f);
            //REAPER
            case 12:
                Main.data.setDamage(10f);
            //BLACK MAGE
            case 13:
                Main.data.setDamage(10f);
            //SUMMONER
            case 14:
                Main.data.setDamage(10f);
            //RED MAGE
            case 15:
                Main.data.setDamage(10f);
            //WHITE MAGE
            case 16:
                Main.data.setDamage(10f);
            //SCHOLAR
            case 17:
                Main.data.setDamage(10f);
            //SAGE
            case 18:
                Main.data.setDamage(10f);
            //ASTROLOGIAN
            case 19:
                Main.data.setDamage(10f);
        }
    }

}
