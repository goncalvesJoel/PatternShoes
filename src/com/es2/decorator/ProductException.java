package com.es2.decorator;

import java.io.Serializable;

public class ProductException extends Exception implements Serializable {
    public ProductException() {
        System.out.println("ProductException");
    }
}
