package com.project.game;

import com.project.characters.Race;

/**
 * @author Jay & Billy
 * @version 1.0
 */

public class CharacterCreation{

    // Jobs
    private final int WAR = 0;
    private final int BRD = 1;
    private final int BLM = 2;
    private final int AST = 3;

    // Attributes
    public static int tempStr;
    public static int tempDex;
    public static int tempCon;
    public static int tempItl;
    public static int tempWis;
    public static int tempCha;

    public static String heroImgUrl;
    public static String raceUrl;
    public static String raceName;
    public static String raceDescription;
    public static String jobDescription;


    /**
     * Method that sets the player's selected race.
     */
    public void setRace() {
        Race races = new Race();
        try {
            switch (Main.data.getRace()) {
                case 0:
                    races.hyur();
                    raceUrl = "RoguelikeFantasyXIV/src/com/project/images/Hyur/";
                    raceName = "Hyur";
                    raceDescription = "The hyur have a fairly average physique both in height and in their figure. They are recognized for their peculiarly short and rounded ears.\n+1 to all Attributes";
                    break;
                case 1:
                    races.elezen();
                    raceUrl = "RoguelikeFantasyXIV/src/com/project/images/Elezen/";
                    raceName = "Elezen";
                    raceDescription = "Recognized for their tall stature, long limbs, and slender bodies. In addition, they enjoy a generally longer lifespan than that of the Hyur.\nCHA +2\nINT +2\nDEX + 2";
                    break;
                case 2:
                    races.miqote();
                    raceUrl = "RoguelikeFantasyXIV/src/com/project/images/Miqote/";
                    raceName = "Miqote";
                    raceDescription = "Easily distinguished by their large ears and twitching, feline tails. Instinctive territoriality causes many among them to live solitary lives.\nWIS +2\nDEX +2\nCHA +1\nSTR +1";
                    break;
                case 3:
                    races.roegadyn();
                    raceUrl = "RoguelikeFantasyXIV/src/com/project/images/Roegadyn/";
                    raceName = "Roegadyn";
                    raceDescription = "Easily identified by their massive, muscular figures. They are also known for their compassion and unwavering loyalty.\nSTR +3\nCON +3";
                    break;
                case 4:
                    races.lalafell();
                    raceUrl = "RoguelikeFantasyXIV/src/com/project/images/Lalafell/";
                    raceName = "Lalafell";
                    raceDescription = "People who are tiny compared to other races and have a childlike appearance, making it difficult to guess the exact age of a Lalafell individual.\nCHA +3\nDEX +3";
                    break;
                case 5:
                    races.aura();
                    raceUrl = "RoguelikeFantasyXIV/src/com/project/images/Aura/";
                    raceName = "Au Ra";
                    raceDescription = "People with dragon-like ancestry who still bear horns and scales on their skin. They usually live in nomadic tribes.\nSTR +2\nDEX +2\nCON +2";
                    break;
                case 6:
                    races.viera();
                    raceUrl = "RoguelikeFantasyXIV/src/com/project/images/Viera/";
                    raceName = "Viera";
                    raceDescription = "People with rabbit-like features who live secluded in the depths of the jungle. They do not know their gender until they reach adulthood.\nDEX +2\nINT +2\nWIS +2";
                    break;
                case 7:
                    races.hrothgar();
                    raceUrl = "RoguelikeFantasyXIV/src/com/project/images/Hrothgar/";
                    raceName = "Hrothgar";
                    raceDescription = "People with feline features that look much more like beasts than the Miqo'te. Despite this, they are calm and wise people.\nWIS +3\nSTR +2\nCON +1";
                    break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Method that sets the player's selected class.
     */
    public void setClass(){
        try {
            tempStr = 0;
            tempDex = 0;
            tempCon = 0;
            tempItl = 0;
            tempWis = 0;
            tempCha = 0;
            switch (Main.data.getJob()){
                case WAR:
                    Main.data.setJobName("Warrior");
                    heroImgUrl = raceUrl + "war" + raceName;
                    jobDescription="Wielding greataxes and heavy armors, warriors learn to harness their inner-beasts and translate that power to unbridled savagery on the battlefield.\nSTR +2\nDEX -1\nCON +1\nCHA -2";
                    tempCon = 1;
                    tempStr = 2;
                    tempCha = -2;
                    tempDex = -1;
                    break;
                case BRD:
                    Main.data.setJobName("Bard");
                    heroImgUrl = raceUrl + "brd" + raceName;
                    jobDescription="Bards trace their origins back to the bowmen of eld, who sang in the heat of battle to fortify the spirits of their companions.\nSTR -1\nDEX +2\nCON -2\nCHA +1";
                    tempCha = 1;
                    tempDex = 2;
                    tempCon = -2;
                    tempStr = -1;
                    break;
                case BLM:
                    Main.data.setJobName("Black Mage");
                    heroImgUrl = raceUrl + "blm" + raceName;
                    jobDescription="In days long past, there existed an occult and arcane art known as black magic. Those who learned to wield it came to be called black mages.\nCON -3\nINT +3";
                    tempItl = 3;
                    tempCon = -3;
                    break;
                case AST:
                    Main.data.setJobName("Astrologian");
                    heroImgUrl = raceUrl + "ast" + raceName;
                    jobDescription="By attuning their aetherial energies to that of constellations, Astrologians learned to wield magicks which grants its users power over fate.\nSTR -2\nCON -1\nINT +1\nCHA +2";
                    tempItl = 1;
                    tempCha = 2;
                    tempCon = -1;
                    tempStr = -2;
                    break;
            }
        } catch (Exception e) {
            System.out.println("Job selection error: " + e.getMessage());
        }
    }

    /**
     * Method that calculates maximum HP.
     */
    public void calculateHP() {
        float hp = Main.data.getAttConstitution() * 10;
        Main.data.setMaxHp(hp);
        Main.data.setHp(hp);
    }

    /**
     * Method that calculates maximum mana.
     */
    public void calculateMana(){
        float mana = Main.data.getAttIntelligence() * 10;
        Main.data.setMaxMana(mana);
        Main.data.setMana(mana);
    }

    /**
     * Method that calculates base defense.
     */
    public void calculateDefense(){

        float defense = 10f+Main.data.getAttConstitution()+Main.data.getAttDexterity();
        Main.data.setDefense(defense);
        float defensePercentage= (defense/2)/100;
        Main.data.setDefensePercentage(defensePercentage);
    }

    /**
     * Method that calculates base damage.
     */
    public void calculateDamage(){
        int job = Main.data.getJob();
        switch (job) {
                //WARRIOR
            case 1:
                Main.data.setDamage(10f + (Main.data.getAttStrength() * 0.6f));
                break;
                //BARD
            case 2:
                Main.data.setDamage(10f + (Main.data.getAttDexterity() * 0.7f));
                break;
                //BLACK MAGE
            case 3:
                Main.data.setDamage(10f + (Main.data.getAttIntelligence() * 0.8f));
                break;
                //ASTROLOGIAN
            case 4:
                Main.data.setDamage(10f + (Main.data.getAttIntelligence() * 0.5f));
                break;
        }
    }

}


