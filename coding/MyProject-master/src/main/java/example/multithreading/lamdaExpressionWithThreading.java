package example.multithreading;

/*class A1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}

class B1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
THis Code Coverted to lamda expression
*/


public class lamdaExpressionWithThreading {
    public static void main(String[] args) throws InterruptedException {
//        Runnable r1=() ->{
//                for (int i = 0; i < 5; i++) {
//                    System.out.println(i);
//                }
//        };

//        Runnable r2=()-> {
//                for (int i = 0; i < 5; i++) {
//                    System.out.println("New" + i);
//                }
//        };
        Thread t1=new Thread(() ->{
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
            }
        });
        Thread t2=new Thread(()-> {
            for (int i = 0; i < 5; i++) {
                System.out.println("New" + i);
            }
        });
        t1.start();
        Thread.sleep(1000);
        t2.start();
    }
}
