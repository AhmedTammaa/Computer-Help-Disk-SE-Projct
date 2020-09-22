/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tammaa
 */
public class AnswerFormController {
    private static Deque<Form> formList= new LinkedList<>();
    public static void start() throws SQLException{
        Deque<Form> formList = new LinkedList<>();
        ResultSet rs;
        try {
            rs = DatabaseController.select(" ISSUE_TITLE, ISSUE", " FORM ", " STATUE = FALSE ");
            while(rs.next())
            formList.addFirst(new Form(rs.getString("ISSUE_TITLE"), rs.getString("ISSUE")));
        } catch (SQLException ex) {
            Logger.getLogger(AnswerFormController.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            AnswerFormController.formList = formList;
        }
        
    }
    
    public static Form nextForm(){
        Form result = formList.removeFirst();
        formList.addLast(result);
        return result;
    }
    
    public static Form prevForm(){
        Form result = formList.removeLast();
        formList.addFirst(result);
        return result;
    }
    
    public static Form find(String issue){
        for(Form itr: formList){
            if (itr.getIssue().equals(issue))
                return itr;
        }
        return null;
    }
    
}
