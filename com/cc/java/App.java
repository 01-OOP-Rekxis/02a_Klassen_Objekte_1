package com.cc.java;

public class App {

    public static void main(String[] args) {

        Cat cat1 = new Cat();

        // Wertzuweisung
        cat1.firstName = "Grizabella";
        cat1.furColor = "white";
        cat1.age = 29;

        output(cat1.firstName);
        output(cat1.furColor);

        // .. was nicht passt, wird passend gemacht..
        // .. Typkonvertierung

        output(Integer.toString(cat1.age));
        output(String.valueOf(cat1.age));
        
        output("-------------------");

        Cat cat2 = new Cat();

        cat2.firstName = "Alonso";
        cat2.furColor = "grey";
        cat2.age = 35;

        output(cat2.firstName);
        output(cat2.furColor);
        output(String.valueOf(cat2.age));

    }

    public static void output(String outputData) {
        System.out.println(outputData);
    }
}
