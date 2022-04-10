package com.es2;

import com.es2.composite.*;
import com.es2.decorator.CustomProductProtocol;
import com.es2.decorator.ProductDecorator;
import com.es2.decorator.ProductSoesPatternPrinting;
import com.es2.decorator.Shoes;
import com.es2.memento.BackupService;
import com.es2.memento.ExistingShoesVersionException;
import com.es2.memento.NotExistingSnapshotException;
import com.es2.memento.ShoesVersion;
import com.es2.singleton.Authentication;

import javax.swing.*;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws NotExistingSnapshotException, ExistingShoesVersionException {
/*        //****SINGLETON***
       System.out.println("********\nSINGLETON\n********");
        com.es2.singleton.Registry.getInstance().setPath("Server=myServerName;Database=myDataBase;");
        Registry.getInstance().addUser("Pedro","123");
        Registry.getInstance().addUser("Pedro","aaa");
        Registry.getInstance().addUser("Carlos","123");
       Registry.getInstance().login("Pedro","13");
       Registry.getInstance().login("Pedro","123");


        //****Composite****
       System.out.println("********\nCOMPOSITE\n********");
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
*/
/*        //MEMENTO
        System.out.println("********\nMEMENTO\n********");

        ShoesVersion sV=new ShoesVersion();
        BackupService bS =new BackupService(sV);

        sV.addVersionShoes("versão 1");
        bS.takeSnapshot();
        sV.addVersionShoes("versão 2");
        bS.takeSnapshot();
        sV.addVersionShoes("versão 3");
        bS.takeSnapshot();
        sV.addVersionShoes("versão 4");
        bS.takeSnapshot();
        sV.addVersionShoes("versão 5");
        bS.takeSnapshot();

        System.out.println("Versões snapshot:"+ sV.getVersionShoes());

        System.out.println("array tamanho: "+sV.getVersionShoes().size());
        System.out.println("Ultima versão do array:"+ sV.lastVersion());

        bS.restoreSnapshot();System.out.println("restore");

        System.out.println("array tamanho: "+sV.getVersionShoes().size());
        System.out.println("Ultima versão do array:"+ sV.lastVersion());

        bS.restoreSnapshot();System.out.println("restore");
        bS.restoreSnapshot();System.out.println("restore");

        System.out.println("array tamanho: "+sV.getVersionShoes().size());
        System.out.println("Ultima versão do array:"+ sV.lastVersion());


        // bS.restoreSnapshotUtilizador(0);
        //System.out.println("array tamanho: "+sV.getVersionShoes().size());
        //System.out.println("Ultima versão do array:"+ sV.lastVersion());

*/


        System.out.println("DECORATOR");

        CustomProductProtocol cpp=null;
        Shoes shoe = new Shoes();
        ProductSoesPatternPrinting DecoratorShoe = new ProductSoesPatternPrinting();

        System.out.println(shoe.getPrice());
        System.out.println(shoe.getName());
        System.out.println(shoe.getSize());


        System.out.println(DecoratorShoe.getSize());


        /***Bridge***/
        System.out.println("********\nBRIDGE\n********");

    }
}
