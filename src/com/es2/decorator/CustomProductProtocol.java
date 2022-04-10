package com.es2.decorator;

import java.io.IOException;

public interface CustomProductProtocol {

    void Custom(String type, int size) throws ProductException, IOException;

    String getName();
    int getSize();
    double getPrice();

}
