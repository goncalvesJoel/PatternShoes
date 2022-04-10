package com.es2.decorator;

import java.io.IOException;

public class Shoes implements CustomProductProtocol{

    private String name = "salto alto";
    private int size = 36;
    private double price = 59.90;

    public Shoes() {
        System.out.println("Shoes");
    }

    @Override
    public void Custom(String type, int size) throws ProductException, IOException {

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
