package javaapplication13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class RegisterController 
{
    
     public static void addUserInfo(String username, String password, int id, String FirstName, String LastName, int Phoneno) 
    {
        try{     
            DatabaseController.insert("INSERT INTO PERSON VALUES ("+id+",'"+FirstName+"','"+LastName+"','"+username+"','"+password+"',"+Phoneno+")");
            JOptionPane.showMessageDialog(null, "Successfully added");
            new Login().setVisible(true);
        }catch(SQLException ex)
        {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
        }   
    }
         
    public static void removeAll()
    {
        try{
            DatabaseController.deleteAll("PERSON");
            JOptionPane.showMessageDialog(null, "successfully deleted");
        
        }catch(SQLException ex)
        {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    public static void remove(int user_id) throws SQLException{
        try{
            DatabaseController.delete("PERSON", "USERID = " + user_id);
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err);
        }
        
    }
    
   
    public static void main(String[] args) 
     {
         new Register().setVisible(true);  
     }

   
}