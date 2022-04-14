package features.java8;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.function.Supplier;

public class SupplierExample {
    /**
     * The Supplier Interface is a part of the java.util.
     * function package which has been introduced since Java 8, to implement functional programming in Java.
     * It represents a function which does not take in any argument but produces a value of type T.
     */

    //get()
    public static void main(String[] args) {
        //Example 1
        Supplier<Double> supplier=()->Math.random();
        System.out.println(supplier.get());

        Supplier<LocalDateTime> supplier1=()-> LocalDateTime.now();
        System.out.println(supplier1.get());

    }
}
