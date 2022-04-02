package com.es2.singleton;

import java.util.HashMap;

public class Authentication extends Object {

    private HashMap<String, String> data = new HashMap<>();
    private static Authentication Instance=null;

    private Authentication() {
    }

    public static Authentication getInstance(){
        if(Instance == null){
            Instance = new Authentication();
        }
        return Instance;
    }

    public void addUser(String nome, String pw){
        if(data.containsKey(nome)){
            System.out.println("User already exists!");
        }
        else
            data.put(nome,pw);
    }

    public void show(){
            System.out.println(data);
    }

    public void login(String nome, String pw){
        if(!data.containsKey(nome)){
            System.out.println("User not registered!");
        }
        else
        {
            if(data.get(nome) == pw)
                System.out.println(nome+" Logged in!");
            else
                System.out.println("Wrong password!");
        }
    }


}
