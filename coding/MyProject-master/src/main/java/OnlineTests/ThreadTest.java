package OnlineTests;

public class ThreadTest extends Thread {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        thread3 t3 = new thread3();

        t1.start();
        t2.start();
        t3.start();
    }
}

class thread1 extends Thread {
    public void run() {
        System.out.println("Thread 1");
    }

}

class thread2 extends Thread {
    public void run() {
        System.out.println("Thread 2");
    }
}

class thread3 extends Thread {
    public void run() {
        System.out.println("Thread 3");
    }
}