package com.es2.memento;

import java.util.ArrayList;

public class Memento extends Object{
    private ArrayList<String> aVersionShoes;

    public Memento(ArrayList<String> aMS) {
        this.aVersionShoes =new ArrayList<>(aMS);
    }

    public ArrayList<String> getState() {
        return aVersionShoes;
    }
}
