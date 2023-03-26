package com.project.inventory;

/**
 * @author Jay & Billy
 * @version 1.0
 */

public class Item {

    //Variables
    private String name;
    private int quantity;

    /**
     * Item Constructor.
     * @param name Item name
     * @param quantity Item quantity
     */
    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    /**
     *
     * @return Returns item's name.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return Returns item's quantity.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     *
     * @param name Sets item's name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param quantity Sets item's quantity.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}