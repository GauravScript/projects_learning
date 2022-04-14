package example.string;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String s = "reverseprogramme";
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            System.out.print(stack.peek());
            stack.pop();
        }
    }
}
