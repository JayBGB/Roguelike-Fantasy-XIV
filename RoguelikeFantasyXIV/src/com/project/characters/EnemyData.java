package com.project.characters;

import com.project.game.Main;
import com.projectLibrary.mathematics.math;

/**
 * @author Jay & Billy
 * @version 1.0
 */

public class EnemyData {

    //VARIABLES

    public String eName;
    public float eHp;
    public float eMaxHp;
    public float eDmg;
    public static String enemyImgUrl;

    /**
     *
     * @return Returns enemy's current HP.
     */
    public float geteHp() {
        return eHp;
    }

    /**
     *
     * @param eHp Sets enemy's current HP.
     */
    public void seteHp(float eHp) {
        this.eHp = eHp;
    }

    /**
     *
     * @return Returns enemy's damage.
     */
    public float geteDmg() {
        return eDmg;
    }

    /**
     *
     * @param eDmg Sets enemy's damage.
     */
    public void seteDmg(float eDmg) {
        this.eDmg = eDmg;
    }

    /**
     *
     * @return Returns enemy's HP.
     */
    public float geteMaxHp() {
        return eMaxHp;
    }

    /**
     *
     * @param eMaxHp Sets enemy's HP.
     */
    public void seteMaxHp(float eMaxHp) {
        this.eMaxHp = eMaxHp;
    }

    /**
     *
     * @return Returns enemy's name.
     */
    public String geteName() {
        return eName;
    }

    /**
     *
     * @param eName Sets enemy's name.
     */
    public void seteName(String eName) {
        this.eName = eName;
    }

    /**
     * Method that creates an enemy entity.
     */
    public void createEnemy() {
        switch ((int) math.randomNumber(10, 1)) {//Change the left number so it matches the number of enemies
            case 1:
                enemyImgUrl="RoguelikeFantasyXIV/src/com/project/images/Enemy/enemyFatDodo.png";
                Main.enemyData.seteName("Fat Dodo");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(60, 30));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//Enemy HP
                Main.enemyData.seteDmg(math.randomNumber(7.5f, 3));//Enemy Damage
                break;
            case 2:
                enemyImgUrl="RoguelikeFantasyXIV/src/com/project/images/Enemy/enemyDeepEye.png";
                Main.enemyData.seteName("Deep Eye");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(50, 15));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//Enemy HP
                Main.enemyData.seteDmg(math.randomNumber(9.5f, 5));//Enemy Damage
                break;
            case 3:
                enemyImgUrl="RoguelikeFantasyXIV/src/com/project/images/Enemy/enemyCoeurl.png";
                Main.enemyData.seteName("Coeurl");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(55, 20));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//Enemy HP
                Main.enemyData.seteDmg(math.randomNumber(11, 6.5f));//Enemy Damage
                break;
            case 4:
                enemyImgUrl="RoguelikeFantasyXIV/src/com/project/images/Enemy/enemyMagitekVanguard.png";
                Main.enemyData.seteName("Magitek Vanguard");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(90, 30));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//Enemy HP
                Main.enemyData.seteDmg(math.randomNumber(12.5f, 6.5f));//Enemy Damage
                break;
            case 5:
                enemyImgUrl="RoguelikeFantasyXIV/src/com/project/images/Enemy/enemyAdamantoise.png";
                Main.enemyData.seteName("Adamantoise");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(120, 60));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//Enemy HP
                Main.enemyData.seteDmg(math.randomNumber(7.5f, 2));//Enemy Damage
                break;
            case 6:
                enemyImgUrl="RoguelikeFantasyXIV/src/com/project/images/Enemy/enemyFunguar.png";
                Main.enemyData.seteName("Funguar");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(20, 15));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//Enemy HP
                Main.enemyData.seteDmg(math.randomNumber(5, 2));//Enemy Damage
                break;
            case 7:
                enemyImgUrl="RoguelikeFantasyXIV/src/com/project/images/Enemy/enemyDullahan.png";
                Main.enemyData.seteName("Dullahan");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(85, 35));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//Enemy HP
                Main.enemyData.seteDmg(math.randomNumber(10, 5.5f));//Enemy Damage
                break;
            case 8:
                enemyImgUrl="RoguelikeFantasyXIV/src/com/project/images/Enemy/enemyDiremite.png";
                Main.enemyData.seteName("Diremite");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(35, 15));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//Enemy HP
                Main.enemyData.seteDmg(math.randomNumber(9.25f, 3.75f));//Enemy Damage
                break;
            case 9:
                enemyImgUrl="RoguelikeFantasyXIV/src/com/project/images/Enemy/enemyAmaljaa.png";
                Main.enemyData.seteName("Amalj'aa");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(65, 30));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//Enemy HP
                Main.enemyData.seteDmg(math.randomNumber(10.5f, 4));//Enemy Damage
                break;
            case 10:
                enemyImgUrl="RoguelikeFantasyXIV/src/com/project/images/Enemy/enemyGoobbue.png";
                Main.enemyData.seteName("Goobbue");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(100, 75));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//Enemy HP
                Main.enemyData.seteDmg(math.randomNumber(15, 7.5f));//Enemy Damage
                break;
        }
    }

    /**
     * Method that creates a boss entity.
     */
    public void createBoss() {
        switch ((int)math.randomNumber(6, 1)) {

            case 1:
                enemyImgUrl="RoguelikeFantasyXIV/src/com/project/images/Bosses/bossIfrit.png";
                Main.enemyData.seteName("Ifrit");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(250, 200));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//nemy HP
                Main.enemyData.seteDmg(math.randomNumber(19, 16));//Enemy Damage
                break;

            case 2:
                enemyImgUrl="RoguelikeFantasyXIV/src/com/project/images/Bosses/bossTitan.png";
                Main.enemyData.seteName("Titan");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(400, 320));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//Enemy HP
                Main.enemyData.seteDmg(math.randomNumber(16.5f, 14f));//Enemy Damage
                break;

            case 3:
                enemyImgUrl="RoguelikeFantasyXIV/src/com/project/images/Bosses/bossGaruda.png";
                Main.enemyData.seteName("Garuda");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(200, 140));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//Enemy HP
                Main.enemyData.seteDmg(math.randomNumber(20f, 15.5f));//Enemy Damage
                break;

            case 4:
                enemyImgUrl="RoguelikeFantasyXIV/src/com/project/images/Bosses/bossShiva.png";
                Main.enemyData.seteName("Shiva");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(225, 180));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//Enemy HP
                Main.enemyData.seteDmg(math.randomNumber(28.5f, 20));//Enemy Damage
                break;

            case 5:
                enemyImgUrl="RoguelikeFantasyXIV/src/com/project/images/Bosses/bossRamuh.png";
                Main.enemyData.seteName("Ramuh");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(230, 170));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//Enemy HP
                Main.enemyData.seteDmg(math.randomNumber(22.5f, 17.5f));//Enemy Damage
                break;

            case 6:
                enemyImgUrl="RoguelikeFantasyXIV/src/com/project/images/Bosses/bossLeviathan.png";
                Main.enemyData.seteName("Leviathan");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(350, 280));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//Enemy HP
                Main.enemyData.seteDmg(math.randomNumber(17.5f, 13));//Enemy Damage
                break;


        }
    }
}
