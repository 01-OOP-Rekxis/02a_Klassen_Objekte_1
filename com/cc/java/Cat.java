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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private boolean getPermission() {
        return true;
    }

    
    
}
