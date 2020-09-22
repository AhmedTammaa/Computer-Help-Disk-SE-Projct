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
public class FormWriterController {
    public static boolean Write(Form form){
      try
        {  
        DatabaseController.insert("INSERT INTO FORM (ISSUE_TITLE,ISSUE,STATUE,USER_ID) VALUES ("+ form.newFormQuery()+")" );
        return true;
        }catch(SQLException ex)
        {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
        }
        return false;
        
    }
}
