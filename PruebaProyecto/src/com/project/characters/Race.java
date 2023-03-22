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

    public Race() {
    }

    public void hyur (){
        str=1;
        dex=1;
        con=1;
        wis=1;
        itl=1;
        cha=1;


        Main.data.setAttStrength(Main.data.getAttStrength() + str);
        Main.data.setAttDexterity(Main.data.getAttDexterity() + dex);
        Main.data.setAttConstitution(Main.data.getAttConstitution() + con);
        Main.data.setAttWisdom(Main.data.getAttWisdom() + wis);
        Main.data.setAttIntelligence(Main.data.getAttIntelligence() + itl);
        Main.data.setAttCharisma(Main.data.getAttCharisma() + cha);
    }

    public void elezen (){
        cha=2;
        dex=2;
        itl=2;

        Main.data.setAttCharisma(Main.data.getAttCharisma() + cha);
        Main.data.setAttDexterity(Main.data.getAttDexterity() + dex);
        Main.data.setAttIntelligence(Main.data.getAttIntelligence() + itl);
    }

    public void lalafell (){
        cha=3;
        dex=3;
        Main.data.setAttCharisma(Main.data.getAttCharisma() + cha);
        Main.data.setAttDexterity(Main.data.getAttDexterity() + dex);
    }

    public void miqote(){
        wis=2;
        dex=2;
        cha=1;
        str=1;
        Main.data.setAttWisdom(Main.data.getAttWisdom() + wis);
        Main.data.setAttDexterity(Main.data.getAttDexterity() + dex);
        Main.data.setAttCharisma(Main.data.getAttCharisma() + cha);
        Main.data.setAttStrength(Main.data.getAttStrength() + str);
    }

    public void roegadyn(){
        str=3;
        con=3;
        Main.data.setAttStrength(Main.data.getAttStrength() + str);
        Main.data.setAttConstitution(Main.data.getAttConstitution() + con);
    }

    public void aura(){
        str=2;
        con=2;
        dex=2;
        Main.data.setAttStrength(Main.data.getAttStrength() + str);
        Main.data.setAttConstitution(Main.data.getAttConstitution() + con);
        Main.data.setAttDexterity(Main.data.getAttDexterity() + dex);
    }

    public void hrothgar(){
        wis=3;
        str=2;
        con=1;
        Main.data.setAttWisdom(Main.data.getAttWisdom() + wis);
        Main.data.setAttStrength(Main.data.getAttStrength() + str);
        Main.data.setAttConstitution(Main.data.getAttConstitution() + con);
    }

    public void viera(){
        dex=2;
        itl=2;
        wis=2;
        Main.data.setAttDexterity(Main.data.getAttDexterity() + dex);
        Main.data.setAttIntelligence(Main.data.getAttIntelligence() + itl);
        Main.data.setAttWisdom(Main.data.getAttWisdom() + wis);
    }

}
