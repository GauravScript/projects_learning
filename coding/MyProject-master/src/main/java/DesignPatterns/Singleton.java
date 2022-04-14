package DesignPatterns;

public class Singleton {
    //private static int count = 0;
    private static Singleton instance;

    private Singleton() {
        System.out.println("Instance Created");
    }
    //Synchronized to Handle Thread Scenario
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;

    }

    public void display() {
        System.out.println("Thread");
    }
}
