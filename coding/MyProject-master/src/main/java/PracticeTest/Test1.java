package PracticeTest;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test1 {
    /*In a sequence of alphabets (like aaabbddaabbcc)
     write a program to find the number of the consecutive alphabets in and print the alphabet and number.
     example :if input is aaabbddaabbcc then output should be 3a, 2b, 2d, 2a, 2b, 2c */

    public static void main(String[] args) {
        String s = "aaabbddaabbcc";
        for(int i=0;i<s.length()-1;i++){
            int count=0;
            for(int j=i;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }else{
                    i+=count-1;
                    break;
                }
            }
            System.out.print(count+""+s.charAt(i));
        }
    }

}
