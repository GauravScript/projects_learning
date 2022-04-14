package features.java8;

import java.util.function.Predicate;

public class predicate {
    //There are some predefined "functional interface" in Java like Predicate, consumer, supplier etc.
    //The Functional Interface PREDICATE is defined in the java.util.Function package.
    /*
    static  Predicate isEqual(Object targetRef)
    default Predicate and(Predicate other)
    default Predicate negate()
    default Predicate or(Predicate other)
    test(T t)
     */


    public static void main(String[] args) {
        //Example 1:
        System.out.println("Example : 1");
        Predicate<Integer> p=i->i%2==0;
        System.out.println(p.test(20));
        System.out.println(p.test(21));

        //Example 2: Predicate Chaining
        System.out.println("Example : 2");
        Predicate<Integer> p2=i->i<50;
        System.out.println(p.and(p2).test(52));
        System.out.println(p.and(p2).test(48));

        //Example 3: Predicate in to function
        System.out.println("Example : 3");
        predicateFuction(18,i->i<20);
        predicateFuction(22,i->i<20);
    }

    //for example 3
    static void predicateFuction(int num,Predicate<Integer> p){
        if(p.test(num)){
            System.out.println("number is "+num);
        }else{
            System.out.println("Wrong input");
        }
    }




}
