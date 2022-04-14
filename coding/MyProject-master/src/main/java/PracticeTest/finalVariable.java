package PracticeTest;

import sun.lwawt.macosx.CSystemTray;

public class finalVariable {
   final static int a;
    static{
        a=20;
    }
    public static void main(String[] args) {
        System.out.println(finalVariable.a);
      //  finalVariable ob=new finalVariable(50);
        System.out.println(finalVariable.a);
    }
}
