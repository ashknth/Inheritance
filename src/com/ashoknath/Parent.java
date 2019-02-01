package com.ashoknath;
/**
 * Created by Ashok on 2/1/2019.
 */
public class Parent {

    public void parentMethod() {
        System.out.println("Parent class method.");
    }
}

class Uncle extends Parent {
    public void uncleMethod() {
        System.out.println("This is a uncle class method.");
    }
}

class Brother extends Uncle {

    public void brotherMethod() {
        System.out.println("This is a brother class method.");
    }
}

class Child extends Brother {
    public void childMethod() {
        System.out.println("Child class method.");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.parentMethod();
        child.childMethod();
        child.uncleMethod();
        child.brotherMethod();

    }
}

