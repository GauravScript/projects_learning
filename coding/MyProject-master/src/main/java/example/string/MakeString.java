package example.string;

public class MakeString {
    public static void main(String[] args) {

        System.out.print(MakeString.makeAnagram("abcdef", "bdctoy"));
    }

    public static int makeAnagram(String a, String b) {
        int common = 0;
        for (int i = 0; i < a.length(); i++) {
            if (b.contains(a.substring(i, i + 1))) {

                b = b.replaceFirst(a.substring(i, i + 1), "");
                common++;
            }
        }
        return (a.length()-common) + b.length();
    }
}
