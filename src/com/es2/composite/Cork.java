package com.es2.composite;

import java.util.ArrayList;

//cortiça
public class Cork {
    private ArrayList<Tissue> alT=new ArrayList<>();

    private String shoesComponents="";
    public void addChild(Tissue t){alT.add(t);}

    public void removeChild(Tissue t) {alT.remove(t);}

    public void setShoesComponents(String sC) {
        this.shoesComponents = sC;
    }
    public String getShoesComponents() {
        String total="";
        for (int i=0;i< alT.size();i++){
            //System.out.println("Tissue "+ i + "="+alT.get(i).getShoesComponents());
            total+= alT.get(i).getShoesComponents();

        }
        return total+shoesComponents;
    }
}
