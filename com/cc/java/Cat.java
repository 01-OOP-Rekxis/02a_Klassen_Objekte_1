package com.cc.java;

public class Cat {

    private String firstName;
    private String furColor;
    private int age;

    public Cat(String firstName, String furColor, int age) {
        this.firstName = firstName;
        this.furColor = furColor;
        this.age = age;
    }

    public String getFirstName() {
        if (getPermission()) {
            return firstName;
        } else {
            return "I'm afraid I can't do that";
        }
    }

    public String getFurColor() {
        return furColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    private boolean getPermission() {
        return true;
    }

}
