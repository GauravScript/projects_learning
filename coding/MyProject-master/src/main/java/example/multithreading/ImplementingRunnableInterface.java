package example.multithreading;

class A implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}

class B implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}


public class ImplementingRunnableInterface {
    public static void main(String[] args) throws InterruptedException {
        Runnable r1=new A();
        Runnable r2=new B();
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t1.start();
        Thread.sleep(10);
        t2.start();
    }
}
