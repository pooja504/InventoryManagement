package com.pooja.product.inventorymanagement.service;

public class Test{

    public static void main(String[] args) {


        Singleton sing=Singleton.getInstance();

        Singleton singi2=Singleton.getInstance();
        System.out.println(sing.toString());
        System.out.println(singi2.toString());

    }
    
}
