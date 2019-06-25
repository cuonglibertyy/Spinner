package com.example.spinner.model;

public class Phone {

   public String mavung;
   public  String id;

    public Phone(String mavung, String id) {
        this.mavung = mavung;
        this.id = id;
    }

    public Phone() {

    }

    public String getMavung() {
        return mavung;
    }

    public void setMavung(String mavung) {
        this.mavung = mavung;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
