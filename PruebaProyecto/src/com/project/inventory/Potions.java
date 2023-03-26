package com.project.inventory;

public class Potions {

    int quantity;
    String name;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Potions(int quantity, String name) {
        this.quantity = quantity;
        this.name = name;
    }
}
