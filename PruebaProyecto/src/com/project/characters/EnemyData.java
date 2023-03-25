package com.project.characters;

import com.project.game.Main;
import com.projectLibrary.mathematics.math;

public class EnemyData {

    public String eName;
    public float eHp;
    public float eMaxHp;
    public float eDmg;

    public float geteHp() {
        return eHp;
    }

    public void seteHp(float eHp) {
        this.eHp = eHp;
    }

    public float geteDmg() {
        return eDmg;
    }

    public void seteDmg(float eDmg) {
        this.eDmg = eDmg;
    }

    public float geteMaxHp() {
        return eMaxHp;
    }

    public void seteMaxHp(float eMaxHp) {
        this.eMaxHp = eMaxHp;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public void getEnemy() {

    }

    public void createEnemy() {
        switch (math.randomNumber(10, 1)) {//Change the left number so it matches the number of enemies
            case 1:
                Main.enemyData.seteName("Fat Dodo");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(60, 30));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//Enemy HP
                Main.enemyData.seteDmg(math.randomNumber(7.5f, 3));//Enemy Damage
                break;
            case 2:
                Main.enemyData.seteName("Deep Eye");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(50, 15));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//Enemy HP
                Main.enemyData.seteDmg(math.randomNumber(9.5f, 5));//Enemy Damage
                break;
            case 3:
                Main.enemyData.seteName("Coeurl");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(55, 20));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//Enemy HP
                Main.enemyData.seteDmg(math.randomNumber(11, 6.5f));//Enemy Damage
                break;
            case 4:
                Main.enemyData.seteName("Magitek Vanguard");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(90, 30));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//Enemy HP
                Main.enemyData.seteDmg(math.randomNumber(12.5f, 6.5f));//Enemy Damage
                break;
            case 5:
                Main.enemyData.seteName("Adamantoise");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(120, 60));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//Enemy HP
                Main.enemyData.seteDmg(math.randomNumber(7.5f, 2));//Enemy Damage
                break;
            case 6:
                Main.enemyData.seteName("Funguar");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(15, 5));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//Enemy HP
                Main.enemyData.seteDmg(math.randomNumber(5, 2));//Enemy Damage
                break;
            case 7:
                Main.enemyData.seteName("Dullahan");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(85, 35));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//Enemy HP
                Main.enemyData.seteDmg(math.randomNumber(10, 5.5f));//Enemy Damage
                break;
            case 8:
                Main.enemyData.seteName("Diremite");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(35, 15));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//Enemy HP
                Main.enemyData.seteDmg(math.randomNumber(9.25f, 3.75f));//Enemy Damage
                break;
            case 9:
                Main.enemyData.seteName("Amalj'aa");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(65, 30));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//Enemy HP
                Main.enemyData.seteDmg(math.randomNumber(10.5f, 4));//Enemy Damage
                break;
            case 10:
                Main.enemyData.seteName("Goobbue");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(100, 75));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//Enemy HP
                Main.enemyData.seteDmg(math.randomNumber(15, 7.5f));//Enemy Damage
                break;
        }
    }

    public void createBoss() {
        switch (math.randomNumber(6, 1)) {

            case 1:
                Main.enemyData.seteName("Ifrit");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(250, 200));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//nemy HP
                Main.enemyData.seteDmg(math.randomNumber(19, 16));//Enemy Damage
                break;

            case 2:
                Main.enemyData.seteName("Titan");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(1000, 650));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//Enemy HP
                Main.enemyData.seteDmg(math.randomNumber(45, 30));//Enemy Damage
                break;

            case 3:
                Main.enemyData.seteName("Garuda");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(550, 500));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//Enemy HP
                Main.enemyData.seteDmg(math.randomNumber(55, 35));//Enemy Damage
                break;

            case 4:
                Main.enemyData.seteName("Shiva");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(600, 500));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//Enemy HP
                Main.enemyData.seteDmg(math.randomNumber(70, 40));//Enemy Damage
                break;

            case 5:
                enemyImgUrl="PruebaProyecto/src/com/project/images/Bosses/bossRamuh.png";
                Main.enemyData.seteName("Ramuh");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(230, 170));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//Enemy HP
                Main.enemyData.seteDmg(math.randomNumber(65, 40));//Enemy Damage
                break;

            case 6:
                Main.enemyData.seteName("Leviathan");//Enemy name
                Main.enemyData.seteMaxHp(math.randomNumber(850, 600));//Max HP
                Main.enemyData.seteHp(Main.enemyData.geteMaxHp());//Enemy HP
                Main.enemyData.seteDmg(math.randomNumber(50, 35));//Enemy Damage
                break;


        }
    }
}
