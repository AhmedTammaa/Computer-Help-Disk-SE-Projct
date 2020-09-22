package javaapplication13;

import static java.lang.Integer.parseInt;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class LoginController
{
    public static void runLogin(String username, String password)
    {
        try{
        boolean flag = false;
        ResultSet rs = DatabaseController.select("PERSON");
        while(rs.next())
        {
            if(rs.getString(1).equals(username) && rs.getString(5).equals(password))
            {
                flag = true;
                break;
            }    
        } 
        DatabaseController.close();
        if(flag)
        {
            JOptionPane.showMessageDialog(null, "Login successful");
            new UserHome(parseInt(username)).setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Wrong username or password!");
        }
        }catch(SQLException ex)
        {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    } 
     public static void main(String[] args) 
     {
         Login L = new Login();
         L.setVisible(true);
         L.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     }
    
}
