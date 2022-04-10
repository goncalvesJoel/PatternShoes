package com.es2.memento;

import java.util.ArrayList;

public class ShoesVersion {

    public ShoesVersion() {}
    private ArrayList<String> aVersionShoes=new ArrayList<String>();

    //*******lastVersionModelShoes = lvms******
    public void addVersionShoes(String lvms)
            throws ExistingShoesVersionException {

        if(aVersionShoes.contains(lvms))
            throw new ExistingShoesVersionException(lvms);
        else
            aVersionShoes.add(lvms);
    }

    public Memento backup(){
        Memento m=new Memento(aVersionShoes);
        return m;
    }
    public void restore(Memento state){
        aVersionShoes=state.getState();
    }
    public ArrayList<String> getVersionShoes(){
        return aVersionShoes;
    }
    public String lastVersion(){
        return aVersionShoes.get(aVersionShoes.size()-1);
    }
}
