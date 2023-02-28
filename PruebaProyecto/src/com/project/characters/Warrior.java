package com.project.characters;

/**
 * @author JayBGB
 */
public interface Warrior {

    public final String WARRIORWEAPONCAPS = "Axe";
    public final String WARRIORWEAPONMINOR = "axe";
    public final int WARRIORMSTARTINGHP = 200;
    public final int WARRIORSTARTINGMANA = 50;
    public final int WARRIORSTARTINGAC = 15;

    public void warriorRage();
    public void warriorAttack();
    public void warriorDefense();

}
