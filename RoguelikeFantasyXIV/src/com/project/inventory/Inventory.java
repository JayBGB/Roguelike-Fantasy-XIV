package com.project.inventory;

import com.project.game.Main;

import java.io.*;

/**
 * @author Jay & Billy
 * @version 1.0
 */

public class Inventory {

    //Objects and Array
    private Item[] items;
    private File file;
    public static final int GOLD = 0;

    /**
     * Creates the inventory
     * @param file File that's to be stored.
     * @param size Inventory size.
     */

    public Inventory(File file, int size) {
        this.file = file;
        this.items = new Item[size];
        save();
    }

    /**
     * Method to save items in your inventory.
     */
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

    /**
     * Method to load items from your inventory.
     */
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



