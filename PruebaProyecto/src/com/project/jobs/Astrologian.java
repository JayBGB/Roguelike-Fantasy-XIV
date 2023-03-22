package com.project.jobs;

import com.project.game.Main;

public class Astrologian {
// PLEASE DO THE GOD DAMNED MANA CONSUMPTION THING
    
    private int con,itl,dex;

    public void astStats(){
        con=3;
        itl=-1;
        dex=-2;
        Main.data.setAttConstitution(Main.data.getAttConstitution()+con);
        Main.data.setAttIntelligence(Main.data.getAttIntelligence()+itl);
        Main.data.setAttDexterity(Main.data.getAttDexterity()+dex);
}
    public void astDamage(){

        Main.data.setDamage(10f+Main.data.getAttIntelligence()*0.4f);
    }


    public void astMicrocosmos(){

        Main.data.setMana(Main.data.getMana()-25);
        Main.data.setHp(Main.data.getHp()+(Main.data.getAttCharisma()/2)*3);
    }

    public void astMacrocosmos(){

        Main.data.setMana(Main.data.getMana()-20);
        float mcDamage = 10f + Main.data.getAttCharisma()*0.8f;
        Main.enemy.seteHp(Main.enemy.geteHp()-mcDamage);
    }

    public void astDivination(){

        Main.data.setMana(Main.data.getMana()-25);
        Main.data.setDamage((float) (Main.data.getDamage() + (Main.data.getDamage() * 0.2)));
    }

    public void astExaltation(){

        Main.data.setMana(Main.data.getMana()-15);
        Main.data.setDefensePercentage(Main.data.getDefensePercentage()*2);
    }


}
