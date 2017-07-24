package com.futball.asa.futball365;

/**
 * Created by asa on 4/20/2017.
 */

public class WhateverObject{
    private int age;
    private String name;
    private String city;
    private String gender;
    private String birthdate;

    public WhateverObject(int age, String name, String city, String gender, String birthdate){
        this.age = age;
        this.name = name;
        this.city = city;
        this.gender = gender;
        this.birthdate = birthdate;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public String getCity(){
        return this.city;
    }

    public String getGender(){
        return this.gender;
    }

    public String getBirthdate(){
        return this.birthdate;
    }
}