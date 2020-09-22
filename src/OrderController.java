/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tammaa
 */
public class OrderController {
    public static void insertOrder(Order order, int user_id){
        try{    
            System.out.println(order.toQuery());
            DatabaseController.insert("INSERT INTO ORDER_INFO(STREET_NUMBER,STREET_NAME,AREA,ZIP_CODE,USER_NOTE, USER_ID) VALUES ("+order.toQuery()+","+ user_id +")");
        } catch(SQLException ex)
        {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
