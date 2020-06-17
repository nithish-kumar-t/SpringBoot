package com.example.demo.Models;
import java.util.UUID;
import com.example.demo.utils.Constants;


public class User {

    public UUID uuid = UUID.randomUUID();
    public String name ;
    public Constants.Gender gender;

    public User(String name, Constants.Gender gender){
        this.name = name;
        this.gender = gender;
    }

}