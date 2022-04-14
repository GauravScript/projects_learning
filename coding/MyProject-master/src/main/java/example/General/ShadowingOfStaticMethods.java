package example.General;

public class ShadowingOfStaticMethods {
    public static void main(String[] args) {
        A ob=new B();
        ob.display();//method A
        //if method are not static it will print >>method B

    }
}

class A {
    public static void display() {
        System.out.println("method A");
    }
}

class B extends A {
    public static void display() {
        System.out.println("method B");
    }
}
