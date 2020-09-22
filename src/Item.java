/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author Tammaa
 */
class Item {
    private int item_id;
    private String item_name;
    private int price;

    public Item(String item_name, int price) {
        this.item_name = item_name;
        this.price = price;
    }

    public Item(int item_id, String item_name, int price) {
        this.item_id = item_id;
        this.item_name = item_name;
        this.price = price;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String toString(){
        return "Item name: "+ item_name + "\nItem price:"+price;
    }
}
