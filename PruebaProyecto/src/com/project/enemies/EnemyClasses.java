package com.project.enemies;

import com.project.game.Main;

public class EnemyClasses {

    public void deepEye(){
        Main.enemy.seteHp(45);
        Main.enemy.seteDmg(5);
    }

    public void fatDodo(){
        Main.enemy.seteHp(25);
        Main.enemy.seteDmg(3);
    }
}
