package example.string;

public class Max69Number {
    public static void main(String[] args) {
        int num = 9966;
        System.out.println(Integer.parseInt( String.valueOf(num).replaceFirst("6", "9")));
    }
}
