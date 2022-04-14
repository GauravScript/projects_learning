package features.java8;
import java.util.function.BiFunction;

//Example case : 1
interface A{
    void display();
}

class B implements A{
    public void display(){
        System.out.println("This is for instance method references");
    }
}
//Example case : 2
class Multiplication{
    public static int multiply(int a, int b){
        return a*b;
    }
}

//Example case : 3
interface interf{
    Hello display(String exmp);
}

class Hello{
    public Hello(String exmp){
        System.out.println(exmp);
        }
    }


public class MethodReferences {

    /*Method reference is a shorthand notation of a lambda expression to call a method. For example:
    If your lambda expression is like this:

    str -> System.out.println(str)
    then you can replace it with a method reference like this:

    System.out::println*/

    public static void main(String[] args) {
        //1. Method reference to an instance method of an object
        System.out.println("1. Method reference to an instance method of an object");
       // B ob=new B(); A mi=ob::display;
        A mi=new B()::display;
        mi.display();

        //2. Method reference to a static method of a class
        System.out.println("2. Method reference to a static method of a class");
        BiFunction<Integer, Integer, Integer> product = Multiplication::multiply;
        int pr = product.apply(11, 5);
        System.out.println("Product of given number is: "+pr);

        //3. Method reference to a constructor
        System.out.println("3. Method reference to a constructor");
        interf obi=Hello::new;
        obi.display("Hello World !!");


    }




}
