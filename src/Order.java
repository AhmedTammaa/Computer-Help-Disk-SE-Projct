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
public class Order {
    private int st_number;
    private String st_name;
    private String Area;
    private int zip_code;
    private String user_note;

    public Order(int st_number, String st_name, String Area, int zip_code, String note) {
        this.st_number = st_number;
        this.st_name = st_name;
        this.Area = Area;
        this.zip_code = zip_code;
        user_note = note;
    }
    public String toQuery(){
        return Integer.toString(st_number) + " ,'"+st_name+"','"+Area+"', "+ Integer.toString(zip_code)+ ",'"+user_note+"'";
    }
    public String getUserNote(){
        return user_note;
    }
    public int getStNumber() {
        return st_number;
    }

    public void setStNumber(int st_number) {
        this.st_number = st_number;
    }

    public String getStName() {
        return st_name;
    }

    public void setStName(String st_name) {
        this.st_name = st_name;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public int getZipCode() {
        return zip_code;
    }

    public void setZipCode(int zip_code) {
        this.zip_code = zip_code;
    }
    
}
