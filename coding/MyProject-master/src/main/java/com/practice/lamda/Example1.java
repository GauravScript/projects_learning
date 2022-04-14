package com.practice.lamda;

/**
 * A functional interface is an interface that contains only one abstract method.
 * They can have only one functionality to exhibit.
 * From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface.
 * A functional interface can have any number of default/static methods
 */
interface A{
    void display();
    default void a(){System.out.print("Hello");}
    static void b(){}
}

public class Example1 {
    public static void main(String[] args) {
        A ob=()->System.out.println("This is lamda code");
        //ob.display();
        ob.a();
    }
}
