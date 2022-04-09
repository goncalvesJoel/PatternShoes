package com.es2;

import com.es2.composite.*;
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


        System.out.println("COMPOSITE");
        ShoeBase shoeBaseA=new ShoeBase();

        Insole insoleA=new Insole();
        Insole insoleB=new Insole();
        Cork corkA=new Cork();
        Cork corkB=new Cork();

        Tissue tissueA=new Tissue();
        Tissue tissueB=new Tissue();

        Wire wireA=new Wire();
        Wire wireB=new Wire();

        shoeBaseA.addChild(insoleA);
        shoeBaseA.addChild(insoleB);
        insoleA.setShoesComponents("Palmilha_A ");
        insoleB.setShoesComponents("Palmilha_B ");

        insoleA.addChild(corkA);
        insoleA.addChild(corkB);
        corkA.setShoesComponents("Cortiça_A ");
        corkB.setShoesComponents("Cortiça_B ");

        corkA.addChild(tissueA);
        corkA.addChild(tissueB);
        tissueA.setShoesComponents("Tecido_A ");
        tissueB.setShoesComponents("Tecido_B ");

        tissueA.addChild(wireA);
        tissueA.addChild(wireB);
        wireA.setShoesComponents("Fio_A ");
        wireB.setShoesComponents("Fio_B ");

        System.out.println("Registo dos materiais: ");
        System.out.println("Fios: " + wireA.getShoesComponents());
        //System.out.println("Fios: " + wireB.getShoesComponents());
        System.out.println("Tecidos: " + tissueA.getShoesComponents());
        // System.out.println("Tecidos: " + tissueB.getShoesComponents());
        System.out.println("Cortiça: " + corkA.getShoesComponents());
        //System.out.println("Cortiça: " + corkB.getShoesComponents());
        System.out.println("Palmilha: " + insoleA.getShoesComponents());
        //System.out.println("Palmilha: " + insoleB.getShoesComponents());
        System.out.println("Sapato: " + shoeBaseA.getShoesComponents());



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
