package example.string;

public class OccuranceOfEachCharactor {
    public static void main(String[] args) {
        String s = "aaaaaassfdfdsferqwqadasfdsrweqasdadasweqa";
        char c = '\u0000';
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                c = s.charAt(0);
                count = 1;
            } else {
                if (s.charAt(i) == c) {
                    count++;
                } else {
                    System.out.print(c + "" + count);
                    c = s.charAt(i);
                    count = 1;
                }
            }
        }
    }
}
