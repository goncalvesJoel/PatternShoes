package com.es2.singleton;

public class Registry extends Object {
    private String ConnectionString;
    private static Registry	Instance=null;
    private String Path;

    public String getConnectionString() {
        return ConnectionString;
    }
    private Registry() {
    }
    public void setConnectionString(String connectionString) {

        ConnectionString = connectionString;
    }
    public static Registry getInstance() {
        if(Instance==null){
            Instance = new Registry();
        }
        return Instance;
    }
    public String getPath() {
        return Path;
    }
    public void setPath(String path) {
        Path = path;
    }
}
