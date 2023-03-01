/**
 * @author Jay & Billy
 */
package com.project.characters;

import com.project.game.Main;

public class Race  {



    private int str;
    private int dex;
    private int con;
    private int wis;
    private int itl;
    private int cha;

    public void hyur (){
        str=1;
        dex=1;
        con=1;
        wis=1;
        itl=1;
        cha=1;


        Main.obj.setAttStrength(Main.obj.getAttStrength() + str);
        Main.obj.setAttDexterity(Main.obj.getAttDexterity() + dex);
        Main.obj.setAttConstitution(Main.obj.getAttConstitution() + con);
        Main.obj.setAttWisdom(Main.obj.getAttWisdom() + wis);
        Main.obj.setAttIntelligence(Main.obj.getAttIntelligence() + itl);
        Main.obj.setAttCharisma(Main.obj.getAttCharisma() + cha);
    }

    public void elezen (){
        cha=2;
        dex=2;
        itl=2;

        Main.obj.setAttCharisma(Main.obj.getAttCharisma() + cha);
        Main.obj.setAttDexterity(Main.obj.getAttDexterity() + dex);
        Main.obj.setAttIntelligence(Main.obj.getAttIntelligence() + itl);
    }

    public void lalafell (){
        cha=3;
        dex=3;
        Main.obj.setAttCharisma(Main.obj.getAttCharisma() + cha);
        Main.obj.setAttDexterity(Main.obj.getAttDexterity() + dex);
    }

    public void miqote(){
        wis=2;
        dex=2;
        cha=1;
        str=1;
        Main.obj.setAttWisdom(Main.obj.getAttWisdom() + wis);
        Main.obj.setAttDexterity(Main.obj.getAttDexterity() + dex);
        Main.obj.setAttCharisma(Main.obj.getAttCharisma() + cha);
        Main.obj.setAttStrength(Main.obj.getAttStrength() + str);
    }

    public void roegadyn(){
        str=3;
        con=3;
        Main.obj.setAttStrength(Main.obj.getAttStrength() + str);
        Main.obj.setAttConstitution(Main.obj.getAttConstitution() + con);
    }

    public void aura(){
        str=2;
        con=2;
        dex=2;
        Main.obj.setAttStrength(Main.obj.getAttStrength() + str);
        Main.obj.setAttConstitution(Main.obj.getAttConstitution() + con);
        Main.obj.setAttDexterity(Main.obj.getAttDexterity() + dex);
    }

    public void hrothgar(){
        wis=3;
        str=2;
        con=1;
        Main.obj.setAttWisdom(Main.obj.getAttWisdom() + wis);
        Main.obj.setAttStrength(Main.obj.getAttStrength() + str);
        Main.obj.setAttConstitution(Main.obj.getAttConstitution() + con);
    }

    public void viera(){
        dex=2;
        itl=2;
        wis=2;
        Main.obj.setAttDexterity(Main.obj.getAttDexterity() + dex);
        Main.obj.setAttIntelligence(Main.obj.getAttIntelligence() + itl);
        Main.obj.setAttWisdom(Main.obj.getAttWisdom() + wis);
    }

}
