package com.cc.java;

public class App {

    public static void main(String[] args) {

        // Instanziierung mit custom construktor
        Cat cat1 = new Cat("Grizabella", "white", 29);

        // Ausgabe
        output(cat1.tellYourName());
        output(cat1.furColor);
        // Typkonvertierung int--> String
        output(Integer.toString(cat1.age));

        output("-------------------");

        Cat cat2 = new Cat("Alonso", "grey", 35);

        output(cat2.tellYourName());
        output(cat2.furColor);
        // Typkonvertierung int--> String
        output(Integer.toString(cat2.age));
    }

    public static void output(String outputData) {
        System.out.println(outputData);
    }
}
