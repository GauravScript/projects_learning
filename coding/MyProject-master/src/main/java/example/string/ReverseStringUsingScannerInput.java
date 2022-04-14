package example.string;

import java.util.Scanner;

public class ReverseStringUsingScannerInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String");
        String s=sc.nextLine();
        String output="";
        int length=s.length()-1;
        for(int i=length;i>=0;i--){
            output+=s.charAt(i);
        }
        System.out.println(output);
    }
}
