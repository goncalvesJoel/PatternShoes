package com.es2.composite;

public class Shoe extends ShoesComponents {

    private String shoesComponents="";

    public void setShoesComponents(String sC) {
        this.shoesComponents = sC;
    }
    public String getShoesComponents() {
        System.out.println("Shoes = " + shoesComponents);
        return shoesComponents;
    }
}
