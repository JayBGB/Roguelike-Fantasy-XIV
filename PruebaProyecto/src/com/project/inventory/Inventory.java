package com.project.inventory;

import com.project.game.Main;

import java.io.*;

public class Inventory {

    private Item[] items;
    private File file;
    public static final int GOLD = 0;

    public Inventory(File file, int size) {
        this.file = file;
        this.items = new Item[size];
        save();
    }

    public void addItem(Item item, int slot) {
        items[slot] = item;
        save();
    }

    public void removeItem(int slot) {
        items[slot] = null;
        save();
    }

    public Item getItem(int slot) {
        return items[slot];
    }

    public void save() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("PruebaProyecto/inventory.txt"))) {
            writer.write(Main.gold.getName() + "," + Main.gold.getQuantity());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void load() {
        try (BufferedReader reader = new BufferedReader(new FileReader("PruebaProyecto/inventory.txt"))) {
            String[] values;
            values = reader.readLine().split(",");
            Main.gold.setName(values[0]);
            Main.gold.setQuantity(Integer.parseInt(values[1]));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}



