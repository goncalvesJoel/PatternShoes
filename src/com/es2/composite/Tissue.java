package com.es2.composite;

import java.util.ArrayList;

//tecido
public class Tissue {
    private ArrayList<Wire> alW=new ArrayList<>();

    private String shoesComponents="";

    public void addChild(Wire w){alW.add(w);}

    public void removeChild(Wire w) {alW.remove(w);}

    public void setShoesComponents(String sC) {
        this.shoesComponents = sC;
    }
    public String getShoesComponents() {
        String total="";
        for (int i=0;i< alW.size();i++){
            // System.out.println("Wire "+ i + "="+alW.get(i).getShoesComponents());
            total+= alW.get(i).getShoesComponents();

        }
        return total+shoesComponents;
    }
}
