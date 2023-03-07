package org.example;

import com.google.gson.Gson;
public class App
{
    public static void main( String[] args ){
        Person name = new Person("Artur","Didur");
        System.out.println(new Gson().toJson(name));
    }
}
