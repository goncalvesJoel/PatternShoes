package com.es2.decorator;

import java.io.IOException;

public class ProductDecorator extends Object implements CustomProductProtocol{


    private String type;
    private int size;

    protected ProductDecorator() {
        System.out.println("ProductDecorator ");
    }

    public ProductDecorator(CustomProductProtocol cust){
        System.out.println("ProductDecorator");
    }

    @Override
    public void Custom(String type, int size) throws ProductException, IOException {
        this.size = size;
        this.type = type;
    }

    @Override
    public String getName() {
        return this.getName();
    }

    @Override
    public int getSize() {
        return getSize()+10;
    }

    @Override
    public double getPrice() {return this.getPrice();}
}
