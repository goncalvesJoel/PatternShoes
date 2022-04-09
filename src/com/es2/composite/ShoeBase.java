package com.es2.composite;

import java.util.ArrayList;

//b sapato
public class ShoeBase extends ShoesComponents {
    private ArrayList<Insole> alI=new ArrayList<>();

    private String shoesComponents="";
    public void addChild(Insole i){alI.add(i);}

    public void removeChild(Insole i) {alI.remove(i);}

    public void setShoesComponents(String sC) {
        this.shoesComponents = sC;
    }
    public String getShoesComponents() {
        String total="";
        for (int i=0;i< alI.size();i++){
            // System.out.println("Insole "+ i + "="+alI.get(i).getShoesComponents());
            total+= alI.get(i).getShoesComponents();
        }
        return total+shoesComponents;
    }



}
