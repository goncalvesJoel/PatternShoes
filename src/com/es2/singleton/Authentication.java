package com.es2.singleton;

import java.util.HashMap;

public class Authentication extends Object {

    // private String ConnectionString;
    private static Authentication	Instance=null;
    private String Path;
    private HashMap<String,String> hashUsers=new HashMap<>();

    private Authentication() {
    }
    /*
        public String getConnectionString() {
            return ConnectionString;
        }
        public void setConnectionString(String connectionString) {
            this.ConnectionString = connectionString;
        }
    */
    public static Authentication getInstance() {
        if(Instance==null){//Se vazio
            Instance = new Authentication();//cria nova
            System.out.println("Nova ligação BD");
        }
        return Instance;
    }
    public String getPath() {
        return Path;
    }
    public void setPath(String path) {
        this.Path = path;
        System.out.println("string ligação: "+path);
    }

    public void addUser(String name, String password) {
        if(hashUsers.containsKey(name))
            System.out.println("Utilizador já existe!");
        else
        {
            hashUsers.put(name, password);
            System.out.println("Novo utilizador inserido!");
        }
    }

    public void login(String name,String password){
        if(!hashUsers.containsKey(name))
            System.out.println("Utilizador não registado");
        else
        {
            if(hashUsers.get(name)==password)
                System.out.println("Login com sucesso");
            else
                System.out.println("Password errada");
        }
    }
}
