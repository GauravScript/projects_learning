package features.java8;

interface I1{
public void test1();
default void display(){
    System.out.println("Hello Display");
};

}

interface I2 {
    public void test2();

    default void display() { System.out.println("Hello");};

}


public class multupleDefault {
    public static void main(String[] args) {
        I1 objI=()->System.out.println("Hello test");
        objI.display();
        objI.test1();
    }
}
