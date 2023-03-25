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
    private final int STRENGTH=0;
    private final int DEXTERITY=1;
    private final int CONSTITUTION=2;
    private final int INTELLIGENCE=3;
    private final int WISDOM=4;
    private final int CHARISMA=5;

    public static String heroImgUrl;
    public static String raceName;


    public void createCharacter() {

        String inputName = JOptionPane.showInputDialog(null, "Welcome to the character creation.\nWhat is your hero's name:\n", "Character's Name", JOptionPane.PLAIN_MESSAGE);
        Main.data.setName(inputName);

        String inputSurname = JOptionPane.showInputDialog(null, "What is your hero's surname?", "Character's Surname", JOptionPane.PLAIN_MESSAGE);
        Main.data.setSurname(inputSurname);

        Race races = new Race();
        try {
            do {
                String[] raceArray = new String[]{"Hyur", "Elezen", "Miqo'te", "Roegadyn", "Lalafell", "Au Ra", "Viera", "Hrothgar"};
                int inputRace = JOptionPane.showOptionDialog(null, "What is your hero's race?", "Character's Race", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, raceArray, raceArray[0]);

                switch (inputRace) {
                    case 0:
                        Main.data.setRace(HYUR);
                        races.hyur();
                        heroImgUrl = "PruebaProyecto/src/com/project/images/Hyur/";
                        raceName = "Hyur";
                        break;
                    case 1:
                        Main.data.setRace(ELEZEN);
                        races.elezen();
                        heroImgUrl = "PruebaProyecto/src/com/project/images/Elezen/";
                        raceName = "Elezen";
                        break;
                    case 2:
                        Main.data.setRace(MIQOTE);
                        races.miqote();
                        heroImgUrl = "PruebaProyecto/src/com/project/images/Miqote/";
                        raceName = "Miqote";
                        break;
                    case 3:
                        Main.data.setRace(ROEGADYN);
                        races.roegadyn();
                        heroImgUrl = "PruebaProyecto/src/com/project/images/Roegadyn/";
                        raceName = "Roegadyn";
                        break;
                    case 4:
                        Main.data.setRace(LALAFELL);
                        races.lalafell();
                        heroImgUrl = "PruebaProyecto/src/com/project/images/Lalafell/";
                        raceName = "Lalafell";
                        break;
                    case 5:
                        Main.data.setRace(AURA);
                        races.aura();
                        heroImgUrl = "PruebaProyecto/src/com/project/images/Aura/";
                        raceName = "Aura";
                        break;
                    case 6:
                        Main.data.setRace(VIERA);
                        races.viera();
                        heroImgUrl = "PruebaProyecto/src/com/project/images/Viera/";
                        raceName = "Viera";
                        break;
                    case 7:
                        Main.data.setRace(HROTHGAR);
                        races.hrothgar();
                        heroImgUrl = "PruebaProyecto/src/com/project/images/Hrothgar/";
                        raceName = "Hrothgar";
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
            String[] jobArray = new String[]{"Warrior","Bard","Black Mage","Astrologian"};
            int inputJob = JOptionPane.showOptionDialog(null, "What is your hero's job?", "Character's job", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, jobArray, jobArray[0]);

            switch (inputJob){
                case WAR:
                    Main.data.setJob(1);
                    Main.data.setJobName("Warrior");
                    heroImgUrl = heroImgUrl + "war" + raceName;
                    break;
                case BRD:
                    Main.data.setJob(2);
                    Main.data.setJobName("Bard");
                    heroImgUrl = heroImgUrl + "brd" + raceName;
                    break;
                case BLM:
                    Main.data.setJob(3);
                    Main.data.setJobName("Black Mage");
                    heroImgUrl = heroImgUrl + "blm" + raceName;
                    break;
                case AST:
                    Main.data.setJob(4);
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


