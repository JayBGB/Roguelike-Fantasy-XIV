package com.project.characters;

import com.project.game.Main;

public class EnemyClasses {

    public void deepEye(){
        Main.enemyData.seteHp(45);
        Main.enemyData.seteDmg(5);
    }

    public void fatDodo(){
        Main.enemyData.seteHp(25);
        Main.enemyData.seteDmg(3);
    }
}
