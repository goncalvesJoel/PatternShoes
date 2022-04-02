package com.es2.decorator;

public class ProductDecorator implements CustomProductProtocol{
    protected ProductDecorator() {
        System.out.println("ProductDecorator ");
    }

    @Override
    public String getName() {
        return this.getName();
    }

    @Override
    public int getSize() {
        return this.getSize();
    }

    @Override
    public double getPrice() {return this.getPrice();}
}
