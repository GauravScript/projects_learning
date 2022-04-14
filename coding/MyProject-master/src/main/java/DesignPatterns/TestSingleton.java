package DesignPatterns;

public class TestSingleton{


    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    Singleton ob=Singleton.getInstance();
                   ob.display();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    Singleton ob=Singleton.getInstance();
                    ob.display();
                }
            }
        });
        t1.start();
        t2.start();
    }
}
