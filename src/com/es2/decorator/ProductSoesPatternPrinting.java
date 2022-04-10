package com.es2.decorator;

import java.io.IOException;

public class ProductSoesPatternPrinting extends ProductDecorator {

    public ProductSoesPatternPrinting() {
        super();

    }
    public ProductSoesPatternPrinting(CustomProductProtocol cust) {
        super(cust);
    }

    @Override
    public void Custom(String type, int size) throws ProductException, IOException {
        super.Custom(type, size);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public int getSize() {
        return super.getSize();
    }
}
