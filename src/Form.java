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
public class Form {
    private int ID;
    private String title;
    private String issue;
    private boolean statues;
    private int user_id;
    private String answer;
    private int admin_id;

    public Form(String title, String issue, boolean statues, int user_id) {
        this.title = title;
        this.issue = issue;
        this.statues = statues;
        this.user_id = user_id;
    }

    public Form(String title, String issue) {
        this.title = title;
        this.issue = issue;
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public boolean isStatues() {
        return statues;
    }

    public void setStatues(boolean statues) {
        this.statues = statues;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }
    
    public String newFormQuery(){
        return "'"+title+"','" + issue + "', FALSE, "+user_id;
    }
}
