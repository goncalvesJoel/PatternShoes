package com.es2.decorator;

import java.io.IOException;

public class ProductLed extends ProductDecorator{
    public ProductLed(CustomProductProtocol cust) {
        super(cust);
    }

    @Override
    public void Custom(String type, int size) throws ProductException, IOException {
        super.Custom(type, size);
    }
}
