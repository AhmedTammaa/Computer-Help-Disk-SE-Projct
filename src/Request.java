/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tammaa
 */
class Request {
    private int user_ID;
    private int item_ID;
    private int pcs_cnt;
    
    public Request(int UID,int IID,int pcnt){
      user_ID = UID;
      item_ID = IID;
      pcs_cnt = pcnt;   
    }
    public int getUserID(){
        return user_ID;
    }
    public int getItemID(){
        return item_ID;
    }
    public int getPcsCnt(){
        return pcs_cnt;
    }
    public static ArrayList<Request> requestList(){
        try {
            ArrayList<Request> list = new ArrayList<Request>();
            ResultSet rs =  DatabaseController.select("REQUESTS");
            Request req;
            while(rs.next()){
                req = new Request(rs.getInt(1),rs.getInt(2),rs.getInt(3));
               list.add(req);
            }
            return list;    
        } catch (SQLException ex) {
            Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
     }
}
