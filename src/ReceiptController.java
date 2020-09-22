/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Tammaa
 */
public class ReceiptController {
    public static Address getAddress(int user_id) throws SQLException{
        try{
        ResultSet rs = DatabaseController.select("STREETNAME,STREETNUMBER,AREA,ZIPCODE ", "ADDRESS", " USERID = " + user_id );
        if(rs.next()){
        System.out.println(rs.getString("STREETNAME")+rs.getInt("STREETNUMBER")+rs.getString("AREA")+rs.getInt("ZIPCODE"));
        return new Address(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4));
        }
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null,err);
        }
        return null;
    }
    public static ArrayList<Item> itemList(int user_id) throws SQLException{
        ArrayList<Integer> item_id = new ArrayList<>();
        ArrayList<Item> item_list = new ArrayList<>();
        HashMap<Item,Integer> item_count = new HashMap<>();
        ResultSet rs = DatabaseController.select("ITEM_ID,NUMBER_OF_PIECES ","REQUESTS"," USER_ID= "+user_id);
        Item item;
        while(rs.next()){
            item_id.add(rs.getInt(1));
            
        }
        DatabaseController.close();
        for(Integer itr : item_id){
            rs = DatabaseController.select("ITEMNAME,PRICE"," ITEM "," ITEMID= "+itr);
            if(rs.next()){
            item = new Item(rs.getString(1),rs.getInt(2));
            item_list.add(item);
            }
        }
        return item_list;
    }
}
