package com.project.inventory;

public class Potions {

    public int quantity;
    public float value;

    public Potions(int quantity, float value) {
        this.quantity = quantity;
        this.value = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
