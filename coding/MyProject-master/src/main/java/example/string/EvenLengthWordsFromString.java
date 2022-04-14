package example.string;

public class EvenLengthWordsFromString {

    EvenLengthWordsFromString(String s) {
        String[] arr = s.split(" ");
        for (String ob : arr) {
            if (ob.length() % 2 == 0) {
                System.out.println(ob);
            } else {
                continue;
            }
        }
    }

    public static void main(String[] args) {
        EvenLengthWordsFromString ob=new EvenLengthWordsFromString("i am Geeks for Geeks and a Geek");
    }

}
