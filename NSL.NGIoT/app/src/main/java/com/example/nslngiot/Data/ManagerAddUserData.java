package com.example.nslngiot.Data;

import java.util.ArrayList;

public class ManagerAddUserData {
    public String Number;
    public String Name;
    public String ID;

    public void setNumber(String number){
        this.Number = number;
    }

    public void setName(String name){
        this.Name = name;
    }

    public void setID(String id){
        this.ID = id;
    }

    public String getNumber(){
        return Number;
    }

    public String getName(){
        return Name;
    }

    public String getID(){
        return ID;
    }
}