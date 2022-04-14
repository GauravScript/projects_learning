package example.multithreading;

public class ExtendingThreadClass extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Num: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        ExtendingThreadClass ob1 = new ExtendingThreadClass();
        ExtendingThreadClass2 ob2=new ExtendingThreadClass2();
        ob1.start();
        ob2.start();
    }
}

class ExtendingThreadClass2 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("New Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}

