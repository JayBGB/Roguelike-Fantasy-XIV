/**
 * @author Jay & Billy
 */
package com.project.characters;

public class Race extends CharData {

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
        super.setAttStrength(getAttStrength() + str);
        super.setAttDexterity(getAttDexterity() + dex);
        super.setAttConsitution(getAttConsitution() + con);
        super.setAttWisdom(getAttWisdom() + wis);
        super.setAttIntelligence(getAttIntelligence() + itl);
        super.setAttCharisma(getAttCharisma() + cha);
    }

    public void elezen (){
        cha=2;
        dex=2;
        itl=2;
        super.setAttCharisma(getAttCharisma() + cha);
        super.setAttDexterity(getAttDexterity() + dex);
        super.setAttIntelligence(getAttIntelligence() + itl);
    }

    public void lalafell (){
        cha=3;
        dex=3;
        super.setAttCharisma(getAttCharisma() + cha);
        super.setAttDexterity(getAttDexterity() + dex);
    }

    public void miqote(){
        wis=2;
        dex=2;
        cha=1;
        str=1;
        super.setAttWisdom(getAttWisdom() + wis);
        super.setAttDexterity(getAttDexterity() + dex);
        super.setAttCharisma(getAttCharisma() + cha);
        super.setAttStrength(getAttStrength() + str);
    }

    public void roegadyn(){
        str=3;
        con=3;
        super.setAttStrength(getAttStrength() + str);
        super.setAttConsitution(getAttConsitution() + con);
    }

    public void aura(){
        str=2;
        con=2;
        dex=2;
        super.setAttStrength(getAttStrength() + str);
        super.setAttConsitution(getAttConsitution() + con);
        super.setAttDexterity(getAttDexterity() + dex);
    }

    public void hrothgar(){
        wis=3;
        str=2;
        con=1;
        super.setAttWisdom(getAttWisdom() + wis);
        super.setAttStrength(getAttStrength() + str);
        super.setAttConsitution(getAttConsitution() + con);
    }

    public void viera(){
        dex=2;
        itl=2;
        wis=2;
        super.setAttDexterity(getAttDexterity() + dex);
        super.setAttIntelligence(getAttIntelligence() + itl);
        super.setAttWisdom(getAttWisdom() + wis);
    }
}
