package com.es2;

import com.es2.singleton.Authentication;

import javax.swing.*;

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

    }
}
