/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Tammaa
 */
class DatabaseController {
    private static String query;
    private static Connection conn;
    private static Statement st;
    private static ResultSet rs; 
    
    public static void connect(){
        try{ 
        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/cc","sameh","123");
       }catch (SQLException err){
          
       }
    }
    
    public static ResultSet select(String tableName) throws SQLException{
        try{
        connect();
        query = "SELECT * FROM "+tableName;
        st = conn.createStatement();
        rs = st.executeQuery(query);
   
        return rs;
        }catch(SQLException err){
         
        }
        return null;
    }
    
    public static ResultSet select(String tableName, String condition) throws SQLException{
        try{
        connect();
        query = "SELECT * FROM " + tableName + " WHILE " + condition;
        st = conn.createStatement();
        rs = st.executeQuery(query);
        return rs;
        } catch(SQLException err){
            
        }
        return null;
    }
    public static ResultSet select(String col, String tableName, String condition) throws SQLException{
        try{
        connect();
        query = "SELECT " + col + " FROM " + tableName + " WHERE " + condition;
        st = conn.createStatement();
        rs = st.executeQuery(query);
        return rs;
        } catch(SQLException err){
             JOptionPane.showMessageDialog(null, err);
        }
        return null;
    }
    
    public static void insert(String query) throws SQLException{
        try{
        connect();
        st = conn.createStatement();
        st.execute(query);
        conn.close();
        } catch(SQLException err){
            JOptionPane.showMessageDialog(null, err);
        }
    }
    
    public static void close() throws SQLException{
        conn.close();
    }
    
    public static void deleteAll(String table_name) throws SQLException{
        connect();
        try{
        query = "DELETE FROM "+ table_name;
        st = conn.createStatement();
        rs = st.executeQuery(query);
        conn.close();
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err);
        }
    }
    
    public static void delete(String table_name, String condition) throws SQLException{
        connect();
        try{
            query = "DELETE FROM " + table_name + " WHERE "+ condition;
            st = conn.createStatement();
            st.execute(query);
            conn.close();
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err);
        }
    }
    public static void update(String tablename, String change, String condition)
    {
       try
       {
           query = "UPDATE "+ tablename + " SET "+ change + " WHERE " + condition;
           System.out.println(query);
           st = conn.createStatement();
           st.execute(query);
           conn.close();
       }catch(SQLException err)
       {
            JOptionPane.showMessageDialog(null, err);
       }
    }
}
