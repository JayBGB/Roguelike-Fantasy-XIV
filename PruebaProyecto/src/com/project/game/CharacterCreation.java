package com.project.game; /**
 * @author Jay & Billy
 */

import com.project.characters.Race;
import javax.swing.*;

public class CharacterCreation{

    // Races
    private final int HYUR = 0;
    private final int ELEZEN = 1;
    private final int MIQOTE = 2;
    private final int ROEGADYN = 3;
    private final int LALAFELL = 4;
    private final int AURA = 5;
    private final int VIERA = 6;
    private final int HROTHGAR = 7;

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


    /**
     * Method that sets the player's selected race.
     */
    public void setRace() {
        Race races = new Race();
        try {
            switch (Main.data.getRace()) {
                case 0:
                    races.hyur();
                    raceUrl = "PruebaProyecto/src/com/project/images/Hyur/";
                    raceName = "Hyur";
                    raceDescription = "The hyur have a fairly average physique both in height and in their figure. They are recognized for their peculiarly short and rounded ears.\n+1 to all Attributes";
                    break;
                case 1:
                    races.elezen();
                    raceUrl = "PruebaProyecto/src/com/project/images/Elezen/";
                    raceName = "Elezen";
                    raceDescription = "Recognized for their tall stature, long limbs, and slender bodies. In addition, they enjoy a generally longer lifespan than that of the Hyur.\nCHA +2\nINT +2\nDEX + 2";
                    break;
                case 2:
                    races.miqote();
                    raceUrl = "PruebaProyecto/src/com/project/images/Miqote/";
                    raceName = "Miqote";
                    raceDescription = "Easily distinguished by their large ears and twitching, feline tails. Instinctive territoriality causes many among them to live solitary lives.\nWIS +2\nDEX +2\nCHA +1\nSTR +1";
                    break;
                case 3:
                    races.roegadyn();
                    raceUrl = "PruebaProyecto/src/com/project/images/Roegadyn/";
                    raceName = "Roegadyn";
                    raceDescription = "Easily identified by their massive, muscular figures. They are also known for their compassion and unwavering loyalty.\nSTR +3\nCON +3";
                    break;
                case 4:
                    races.lalafell();
                    raceUrl = "PruebaProyecto/src/com/project/images/Lalafell/";
                    raceName = "Lalafell";
                    raceDescription = "People who are tiny compared to other races and have a childlike appearance, making it difficult to guess the exact age of a Lalafell individual.\nCHA +3\nDEX +3";
                    break;
                case 5:
                    races.aura();
                    raceUrl = "PruebaProyecto/src/com/project/images/Aura/";
                    raceName = "Au Ra";
                    raceDescription = "People with dragon-like ancestry who still bear horns and scales on their skin. They usually live in nomadic tribes.\nSTR +2\nDEX +2\nCON +2";
                    break;
                case 6:
                    races.viera();
                    raceUrl = "PruebaProyecto/src/com/project/images/Viera/";
                    raceName = "Viera";
                    raceDescription = "People with rabbit-like features who live secluded in the depths of the jungle. They do not know their gender until they reach adulthood.\nDEX +2\nINT +2\nWIS +2";
                    break;
                case 7:
                    races.hrothgar();
                    raceUrl = "PruebaProyecto/src/com/project/images/Hrothgar/";
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
                    heroImgUrl = heroImgUrl + "war" + raceName;
                    break;
                case BRD:
                    Main.data.setJobName("Bard");
                    heroImgUrl = heroImgUrl + "brd" + raceName;
                    break;
                case BLM:
                    Main.data.setJobName("Black Mage");
                    heroImgUrl = heroImgUrl + "blm" + raceName;
                    break;
                case AST:
                    Main.data.setJobName("Astrologian");
                    heroImgUrl = heroImgUrl + "ast" + raceName;
                    break;
            }
        } catch (Exception e) {
            System.out.println("Job selection error: " + e.getMessage());
        }
    }
    public void pointAllocation(int levels){

        try{

            int limit;
            int inputYesNo;
            int tempStr = Main.data.getAttStrength();
            int tempDex = Main.data.getAttDexterity();
            int tempCon = Main.data.getAttConstitution();
            int tempInt= Main.data.getAttIntelligence();
            int tempWis= Main.data.getAttWisdom();
            int tempCha= Main.data.getAttCharisma();

            do {
                limit = 0;
                do {
                    limit++;
                    String[] attArray = new String[]{"Strength", "Dexterity", "Constitution", "Intelligence", "Wisdom", "Charisma"};
                    int inputPoints = JOptionPane.showOptionDialog(null, "Choose which attributes you wish to put points into.\n" + Main.data.getName() + " " + Main.data.getSurname() + "'s attributes\nStrength: " + Main.data.getAttStrength() + "\nDexterity: " + Main.data.getAttDexterity() + "\nConstitution: " + Main.data.getAttConstitution() + "\nIntelligence: " + Main.data.getAttIntelligence() + "\nWisdom: " + Main.data.getAttWisdom() + "\nCharisma: " + Main.data.getAttCharisma(), "Character's Attributes", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, attArray, attArray[0]);

                    switch (inputPoints) {
                        case STRENGTH:
                            Main.data.setAttStrength(Main.data.getAttStrength() + 1);
                            break;

                        case DEXTERITY:
                            Main.data.setAttDexterity(Main.data.getAttDexterity() + 1);
                            break;

                        case CONSTITUTION:
                            Main.data.setAttConstitution(Main.data.getAttConstitution() + 1);
                            break;

                        case INTELLIGENCE:
                            Main.data.setAttIntelligence(Main.data.getAttIntelligence() + 1);
                            break;

                        case WISDOM:
                            Main.data.setAttWisdom(Main.data.getAttIntelligence() + 1);
                            break;

                        case CHARISMA:
                            Main.data.setAttCharisma(Main.data.getAttCharisma() + 1);
                            break;
                    }
                } while (limit < levels);

                String[] ysArray = new String[]{"Yes","No"};
                inputYesNo = JOptionPane.showOptionDialog(null, "Are you sure you want to continue with these attributes?\n" + Main.data.getName() + " " + Main.data.getSurname() + "'s attributes\nStrength: " + Main.data.getAttStrength() + "\nDexterity: " + Main.data.getAttDexterity() + "\nConstitution: " + Main.data.getAttConstitution() + "\nIntelligence: " + Main.data.getAttIntelligence() + "\nWisdom: " + Main.data.getAttWisdom() + "\nCharisma: " + Main.data.getAttCharisma(), "Character's Attributes", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, ysArray, ysArray[0]);
                if(inputYesNo == 1){
                    Main.data.setAttStrength(tempStr);
                    Main.data.setAttDexterity(tempDex);
                    Main.data.setAttConstitution(tempCon);
                    Main.data.setAttIntelligence(tempInt);
                    Main.data.setAttWisdom(tempWis);
                    Main.data.setAttCharisma(tempCha);
                    }
                }while(inputYesNo == 1);

        }catch(Exception pointException){
            System.out.println("Point allocation error: "+pointException.getMessage());
        }
    }

    public void calculateHP() {
        float hp = Main.data.getAttConstitution() * 10;
        Main.data.setMaxHp(hp);
        Main.data.setHp(hp);
        System.out.println("Player's HP: "+hp); // HAY QUE QUITARLO A POSTERIORI, SOLO PARA TESTING
    }

    public void calculateMana(){
        float mana = Main.data.getAttIntelligence() * 10;
        Main.data.setMaxMana(mana);
        Main.data.setMana(mana);
        System.out.println("Player's Mana: "+mana); // HAY QUE QUITARLO A POSTERIORI, SOLO PARA TESTING

    }

    public void calculateDefense(){

        float defense = 10f+Main.data.getAttConstitution()+Main.data.getAttDexterity();
        Main.data.setDefense(defense);
        float defensePercentage= (defense/2)/100;
        Main.data.setDefensePercentage(defensePercentage);
        System.out.println("Player's Defense: "+defense+"\nDefense Percentage: "+defensePercentage); // HAY QUE QUITARLO A POSTERIORI, SOLO PARA TESTING
    }

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


