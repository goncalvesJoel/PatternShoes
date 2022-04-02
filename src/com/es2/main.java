package com.es2;

import com.es2.decorator.CustomProductProtocol;
import com.es2.decorator.ProductDecorator;
import com.es2.decorator.ProductSoesPatternPrinting;
import com.es2.decorator.Shoes;
import com.es2.singleton.Authentication;

import javax.swing.*;
import java.io.IOException;

public class main {
    public static void main(String[] args) {

        System.out.println("SINGLETON");
        Authentication A1 = Authentication.getInstance();
        Authentication A2 = Authentication.getInstance();
        System.out.println(A1==A2);
        Authentication.getInstance().login("User1", "pass");
        Authentication.getInstance().addUser("User1", "pass");
        Authentication.getInstance().addUser("User2", "pass");
        Authentication.getInstance().addUser("User3", "pass");
        Authentication.getInstance().login("User2", "pass");
        Authentication.getInstance().login("User3", "pass");
        Authentication.getInstance().show();



        System.out.println("DECORATOR");

        CustomProductProtocol cpp=null;
        Shoes shoe = new Shoes();
        ProductSoesPatternPrinting DecoratorShoe = new ProductSoesPatternPrinting();

        System.out.println(shoe.getPrice());
        System.out.println(shoe.getName());
        System.out.println(shoe.getSize());


        System.out.println(DecoratorShoe.getSize());


    }
}
