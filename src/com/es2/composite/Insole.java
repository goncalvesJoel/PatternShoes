package com.es2.composite;

import java.util.ArrayList;

//palmilha
public class Insole {
    private ArrayList<Cork> alC=new ArrayList<>();

    private String shoesComponents="";
    public void addChild(Cork i){alC.add(i); }

    public void removeChild(Cork i) {alC.remove(i);}

    public void setShoesComponents(String sC) {
        this.shoesComponents = sC;
    }
    public String getShoesComponents() {
        String total="";
        for (int i=0;i< alC.size();i++){
            //System.out.println("Cork "+ i + "="+alC.get(i).getShoesComponents());
            total+= alC.get(i).getShoesComponents();

        }
        return total+shoesComponents;
    }
}
