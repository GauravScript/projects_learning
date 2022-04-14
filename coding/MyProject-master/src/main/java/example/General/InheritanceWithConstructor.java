package example.General;

class SuperC {
    /*
    In Java, constructor of base class with no argument gets automatically called in derived class constructor
    */
    public SuperC() {
        System.out.println("De3faukt");
    }
    /*
     if we want to call parameterized contructor of base class, then we can call it using super()
     */
    public SuperC(String s) {
        System.out.println("I am constructor of parent"+s);
    }
}

class Test extends SuperC {

    public Test() {
        //This should be first line of the method
        super();
        System.out.println("I am constructor of Child class");
    }
}

public class InheritanceWithConstructor{
    public static void main(String[] args) {
        Test t=new Test();
    }
}
