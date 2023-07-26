package com.cc.java;

public class App {

    public static void main(String[] args) {

        /* Instanziierung Klasse --> Objekt */
        // Cat -- Referenztyp
        // cat -- Referenzvariable

        Cat cat1 = new Cat();
        System.out.println("Blick von aussen:" + cat1);
        cat1.tellYourAdress();


        System.out.println("-------------------");

        Cat cat2 = new Cat();
        System.out.println("Blick von aussen:" + cat2);
        cat2.tellYourAdress();

    }
}
