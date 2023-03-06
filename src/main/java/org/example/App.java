package org.example;

import com.google.gson.Gson;
public class App
{
    public static void main( String[] args ){
        Name name = new Name("Artur","Didur");
        System.out.println(new Gson().toJson(name));
    }
}
