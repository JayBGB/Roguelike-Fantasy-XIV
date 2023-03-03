package com.project.jobs;

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

    public void warInnerRelease(){

            Main.data.setDefense((float) (Main.data.getDefense() - (Main.data.getDefense() * 0.2f)));
            Main.data.setDamage((float) (Main.data.getDamage() + (Main.data.getDamage() * 0.2)));
    }

    public void warFellCleave(){


    }
}
