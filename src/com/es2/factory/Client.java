package com.es2.factory;

public class Client implements Order{
    private String CodState;

    protected Client() {
        System.out.println("Client");
    }

    @Override
    public void setState(String state) {
        this.CodState = state;

    }

    @Override
    public String getState() {
        return null;
    }
}
