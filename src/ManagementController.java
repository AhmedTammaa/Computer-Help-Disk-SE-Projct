/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Tammaa
 */
public class ManagementController {
    public static void deleteItem(int x){
        try
        {
            DatabaseController.delete("REQUESTS ","ITEM_ID = "+x);
            
        }catch(SQLException ex)
        {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    public static void updateItem(int x,int y){
        DatabaseController.update("REQUESTS ","NUMBER_OF_PIECES = " + x,"ITEM_ID = " + y);
    }
}
