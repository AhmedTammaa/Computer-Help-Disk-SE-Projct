/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Tammaa
 */
public class Moderator extends Person {
    public static void sendTask(String techName, String task){
         try
        {  
            boolean add_task=false;
            ResultSet rs = DatabaseController.select("TECH_TASK");
            while(rs.next())
            {
                if(rs.getString(1).equals(techName))
                {                
                    if(rs.getString(3)== null)
                    {
                        add_task = true;
                    }
                       break; 
                }
            }
            
            if(add_task)
            {
                DatabaseController.update(" TECH_TASK "," TASK = '"+task+"'"," TECHNICAINS = '"+techName+"'");   
            }
            else
            {
                JOptionPane.showMessageDialog(null, "This technicain already has a task");
            }
            
        }catch(SQLException ex)
        {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }

    public Moderator(int id, String first_name, String last_name, String user_name, int password) {
        super(id, first_name, last_name, user_name, password);
    }
}
