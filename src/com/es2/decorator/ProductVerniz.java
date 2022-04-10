package com.es2.decorator;

import java.io.IOException;

public class ProductVerniz  extends ProductDecorator{
    protected ProductVerniz() {
        super();
    }

    public ProductVerniz(CustomProductProtocol cust) {
        super(cust);
    }

    @Override
    public void Custom(String type, int size) throws ProductException, IOException {
        super.Custom(type, size);
    }
}
