package example.string;

public class StringPadding {
    String leftPad;
    String rightPad;
    String MiddlePad;

    public StringPadding(String s, char ch, int length){
        leftPad=s;
        rightPad=s;
        MiddlePad =s;
        for(int i=0; i<length-s.length() ; i++) {
            leftPad = ch + leftPad;
            rightPad = rightPad + ch;
            if (i < ((length-s.length()) / 2))
                MiddlePad = ch + MiddlePad;
            else
                MiddlePad = MiddlePad + ch;

        }
    }
    public static void main(String[] args) {
       /* Example "GeeksForGeeks",'-',20
        -------GeeksForGeeks
        GeeksForGeeks-------
                ---GeeksForGeeks----
                */
        StringPadding ob=new StringPadding("GeeksForGeeks",'-',20);
        System.out.println(ob.leftPad);
        System.out.println(ob.rightPad);
        System.out.println(ob.MiddlePad);

    }


}
