/**
 * @author Jay & Billy
 */

package com.project.game;

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
    private final int PLD= 1;
    private final int DRK = 2;
    private final int GNB = 3;
    private final int BRD = 4;
    private final int DNC= 5;
    private final int MCH = 6;
    private final int DRG = 7;
    private final int MNK = 8;
    private final int NIN = 9;
    private final int SAM = 10;
    private final int RPR = 11;
    private final int BLM = 12;
    private final int SMN = 13;
    private final int RDM = 14;
    private final int WHM = 15;
    private final int SGE = 16;
    private final int SCH = 17;
    private final int AST = 18;

    // Attributes
    private final int STRENGTH=0;
    private final int DEXTERITY=1;
    private final int CONSTITUTION=2;
    private final int INTELLIGENCE=3;
    private final int WISDOM=4;
    private final int CHARISMA=5;




    public void createCharacter() {

        String inputName = JOptionPane.showInputDialog(null, "Welcome to the character creation.\nWhat is your hero's name:\n", "Character's Name", JOptionPane.PLAIN_MESSAGE);
        Main.data.setName(inputName);

        String inputSurname = JOptionPane.showInputDialog(null, "What is your hero's surname?", "Character's Surname", JOptionPane.PLAIN_MESSAGE);
        Main.data.setSurname(inputSurname);

        String[] gender = new String[]{"Male", "Female"};
        int inputGender = JOptionPane.showOptionDialog(null, "What is your hero's gender?", "Character's Gender", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, gender, gender[0]);
        Main.data.setGender(inputGender);

        Race races = new Race();
        try {
            do {
                String[] raceArray = new String[]{"Hyur", "Elezen", "Miqo'te", "Roegadyn", "Lalafell", "Au Ra", "Viera", "Hrothgar"};
                int inputRace = JOptionPane.showOptionDialog(null, "What is your hero's race?", "Character's Race", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, raceArray, raceArray[0]);

                switch (inputRace) {
                    case 0:
                        Main.data.setRace(HYUR);
                        races.hyur();
                        break;
                    case 1:
                        Main.data.setRace(ELEZEN);
                        races.elezen();
                        break;
                    case 2:
                        Main.data.setRace(MIQOTE);
                        races.miqote();
                        break;
                    case 3:
                        Main.data.setRace(ROEGADYN);
                        races.roegadyn();
                        break;
                    case 4:
                        Main.data.setRace(LALAFELL);
                        races.lalafell();
                        break;
                    case 5:
                        Main.data.setRace(AURA);
                        races.aura();
                        break;
                    case 6:
                        Main.data.setRace(VIERA);
                        races.viera();
                        break;
                    case 7:
                        Main.data.setRace(HROTHGAR);
                        races.hrothgar();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "ERROR: RACE SELECTION");
                        break;
                }
            } while (Main.data.getRace() < 0 && Main.data.getRace() > 7);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public void selectClass(){
        try {
            String[] jobArray = new String[]{"Warrior","Paladin","Dark Knight","Gunbreaker","Bard","Dancer","Machinist","Dragoon","Monk","Ninja","Samurai","Reaper","Black Mage","Summoner","Red Mage","White Mage","Scholar","Sage","Astrologian"};
            int inputJob = JOptionPane.showOptionDialog(null, "What is your hero's job?", "Character's job", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, jobArray, jobArray[0]);

            switch (inputJob){
                case WAR:
                    break;
                case PLD:
                    break;
                case DRK:
                    break;
                case GNB:
                    break;
                case BRD:
                    break;
                case DNC:
                    break;
                case MCH:
                    break;
                case DRG:
                    break;
                case MNK:
                    break;
                case SAM:
                    break;
                case NIN:
                    break;
                case RPR:
                    break;
                case BLM:
                    break;
                case SMN:
                    break;
                case RDM:
                    break;
                case WHM:
                    break;
                case SGE:
                    break;
                case SCH:
                    break;
                case AST:
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
        float hp = Main.data.getAttConstitution() * 5;
        System.out.println("Player's HP: "+hp); // HAY QUE QUITARLO A POSTERIORI, SOLO PARA TESTING
    }

    public void calculateMana(){
        float mana = Main.data.getAttIntelligence() * 5;
        System.out.println("Player's Mana: "+mana); // HAY QUE QUITARLO A POSTERIORI, SOLO PARA TESTING

    }

    public void calculateDefense(){

        float defense = 10f+Main.data.getAttConstitution()+Main.data.getAttDexterity();
        float defensePercentage= (defense/2)/100;
        System.out.println("Player's Defense: "+defense+"\nDefense Percentage: "+defensePercentage); // HAY QUE QUITARLO A POSTERIORI, SOLO PARA TESTING
    }


}


