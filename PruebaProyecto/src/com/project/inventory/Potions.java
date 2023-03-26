package com.project.inventory;

/**
 * @author Jay & Billy
 * @version 1.0
 */

public class Potions {

    //VARIABLES
    int quantity;
    String name;

    /**
     *
     * @return Returns potions quantity.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     *
     * @param quantity Sets potions quantity.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Constructor.
     * @param quantity Potions quantity.
     * @param name Potion name.
     */
    public Potions(int quantity, String name) {
        this.quantity = quantity;
        this.name = name;
    }
}
