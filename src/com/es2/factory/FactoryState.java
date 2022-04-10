package com.es2.factory;

public class FactoryState {

    public FactoryState() {
    }

    public static Order makeOrder(String type) throws UndefinedOrderException {
        if(type.equals("Client")){
            return new Client();
        }
        else throw new UndefinedOrderException();

    }

}
