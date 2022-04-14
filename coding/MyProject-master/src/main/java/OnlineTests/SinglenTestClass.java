package OnlineTests;

public class SinglenTestClass {
    private static SinglenTestClass instance1;

    private SinglenTestClass() {
    }
    public SinglenTestClass(String s) {
        System.out.println(s);
    }

    public static synchronized SinglenTestClass getInstance() {
        if (instance1 == null) {
            instance1 = new SinglenTestClass();
        }
        return instance1;
    }

    public static void main(String[] args) {
        SinglenTestClass ob=new SinglenTestClass();
    }
}



