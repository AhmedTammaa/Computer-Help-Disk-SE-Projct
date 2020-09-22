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
public class Address {
    private int user_id;
    private String street_name;
    private int street_number;
    private String area;
    private int ZIP_code;
    

    public Address(int user_id, String street_name,int st_no, String area, int ZIP_code) {
        this.user_id = user_id;
        this.street_name = street_name;
        this.area = area;
        this.ZIP_code = ZIP_code;
        street_number = st_no;
    }

    public Address(String street_name,int st_no, String area, int ZIP_code) {
        this.street_name = street_name;
        this.area = area;
        this.ZIP_code = ZIP_code;
        street_number = st_no;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getStreet_name() {
        return street_name;
    }

    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getZIP_code() {
        return ZIP_code;
    }

    public void setZIP_code(int ZIP_code) {
        this.ZIP_code = ZIP_code;
    }
    public String toString(){
        return "Street Name: "+ street_name + "\n" + "Street number: "+ street_number + "\n"+ "Area: "+ area + "\n"+ "ZIP code: "+ ZIP_code;
    }
}
