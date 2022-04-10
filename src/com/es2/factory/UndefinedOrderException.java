package com.es2.factory;

public class UndefinedOrderException extends Exception{

    public UndefinedOrderException() {
    }

    public UndefinedOrderException(String message) {
        super(message);
    }

    public UndefinedOrderException(String message, Throwable cause) {
        super(message, cause);
    }

    public UndefinedOrderException(Throwable cause) {
        super(cause);
    }
}
