/**
 * @author Jay & Billy
 */
package com.project.characters;

import com.project.game.Main;

/**
 * @author Jay & Billy
 * @version 1.0
 */

public class Race  {

//VARIABLES

    private int str;
    private int dex;
    private int con;
    private int wis;
    private int itl;
    private int cha;

    CharData defaultAtt = new CharData();

    /**
     * Method that creates the Hyur race.
     */
    public void hyur (){
        defaultAtt.setDefaultAttributes();
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

    /**
     * Method that creates the Elezen race.
     */
    public void elezen (){
        defaultAtt.setDefaultAttributes();
        cha=2;
        dex=2;
        itl=2;

        Main.data.setAttCharisma(Main.data.getAttCharisma() + cha);
        Main.data.setAttDexterity(Main.data.getAttDexterity() + dex);
        Main.data.setAttIntelligence(Main.data.getAttIntelligence() + itl);
    }

    /**
     * Method that creates the Lalafell race.
     */
    public void lalafell (){
        defaultAtt.setDefaultAttributes();
        cha=3;
        dex=3;
        Main.data.setAttCharisma(Main.data.getAttCharisma() + cha);
        Main.data.setAttDexterity(Main.data.getAttDexterity() + dex);
    }

    /**
     * Method that creates the Miqo'te race.
     */
    public void miqote(){
        defaultAtt.setDefaultAttributes();
        wis=2;
        dex=2;
        cha=1;
        str=1;
        Main.data.setAttWisdom(Main.data.getAttWisdom() + wis);
        Main.data.setAttDexterity(Main.data.getAttDexterity() + dex);
        Main.data.setAttCharisma(Main.data.getAttCharisma() + cha);
        Main.data.setAttStrength(Main.data.getAttStrength() + str);
    }

    /**
     * Method that creates the Roegadyn race.
     */
    public void roegadyn(){
        defaultAtt.setDefaultAttributes();
        str=3;
        con=3;
        Main.data.setAttStrength(Main.data.getAttStrength() + str);
        Main.data.setAttConstitution(Main.data.getAttConstitution() + con);
    }

    /**
     * Method that creates the Au Ra race.
     */
    public void aura(){
        defaultAtt.setDefaultAttributes();
        str=2;
        con=2;
        dex=2;
        Main.data.setAttStrength(Main.data.getAttStrength() + str);
        Main.data.setAttConstitution(Main.data.getAttConstitution() + con);
        Main.data.setAttDexterity(Main.data.getAttDexterity() + dex);
    }

    /**
     * Method that creates the Hrothgar race.
     */
    public void hrothgar(){
        defaultAtt.setDefaultAttributes();
        wis=3;
        str=2;
        con=1;
        Main.data.setAttWisdom(Main.data.getAttWisdom() + wis);
        Main.data.setAttStrength(Main.data.getAttStrength() + str);
        Main.data.setAttConstitution(Main.data.getAttConstitution() + con);
    }

    /**
     * Method that creates the Viera race.
     */
    public void viera(){
        defaultAtt.setDefaultAttributes();
        dex=2;
        itl=2;
        wis=2;
        Main.data.setAttDexterity(Main.data.getAttDexterity() + dex);
        Main.data.setAttIntelligence(Main.data.getAttIntelligence() + itl);
        Main.data.setAttWisdom(Main.data.getAttWisdom() + wis);
    }

}
