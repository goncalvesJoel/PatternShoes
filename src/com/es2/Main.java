package com.es2;
import com.es2.singleton.Registry;

public class Main {

    public Main() {
        // TODO Auto-generated constructor stub
    }
    public static void main(String[] args) {
        com.es2.singleton.Registry.getInstance().setPath("test");
        System.out.println(Registry.getInstance().getPath());
    }
}
