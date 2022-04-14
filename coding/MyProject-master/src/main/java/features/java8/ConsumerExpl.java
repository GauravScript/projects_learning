package features.java8;

import java.util.function.Consumer;

public class ConsumerExpl {
    //The Consumer Interface is a part of the java.util.function package which has been introduced since Java 8,
    // to implement functional programming in Java.
    //It represents a function which takes in one argument and produces a result

    // 1. accept()
    // 2. andThen()

    public static void main(String[] args) {
        //Example 1
        Consumer<Integer> c1= a->System.out.println(a);
        c1.accept(10);

        //Example 2
        Consumer<String> c2=s->System.out.println(s.length());
        c2.accept("Rohan");

        //Example 3 andThen()
        Consumer<String> c3=s->System.out.println(s.startsWith("r"));
        c2.andThen(c3).accept("rohan");
        c2.andThen(c3).accept("yadsdfsfsffdav");
    }


}
