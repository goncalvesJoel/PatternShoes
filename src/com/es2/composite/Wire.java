package com.es2.composite;

import java.util.ArrayList;

//fio
public class Wire {
    private ArrayList<Shoe> alS=new ArrayList<>();

    private String shoesComponents="";

    public void addChild(Shoe s){alS.add(s);}

    public void removeChild(Shoe s) {alS.remove(s);}

    public void setShoesComponents(String sC) {
        this.shoesComponents = sC;
    }
    public String getShoesComponents() {

        return shoesComponents;
    }
}
