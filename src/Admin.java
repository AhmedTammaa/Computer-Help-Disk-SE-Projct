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
public class Admin extends Person{
    
    public Admin(int id, String first_name, String last_name, String user_name, int password) {
        super(id, first_name, last_name, user_name, password);
    }
    public static void AnswerForm(int admin_id,String sol, String issue){
        try {
            // TODO add your handling code here:
           
            Form form= AnswerFormController.find(issue);
            DatabaseController.insert("INSERT INTO ANSWERS (SOLUTION,ADMIN_ID,FORM_ISSUE) VALUES ('" + sol+"',"+admin_id+",'"+form.getIssue()+"')" );
            JOptionPane.showMessageDialog(null, "Answer submitted!");
        } catch (SQLException ex) {
            Logger.getLogger(AnswerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
