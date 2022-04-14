package example.string;

public class ShuffleString {
    public static void main(String[] args)
    {
        ShuffleString ob = new ShuffleString();
        String s = "codeleet";
        int[] ind = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.print(ob.restoreString(s, ind));
    }


    public String restoreString(String s, int[] a) {
        char[] ch=new char[s.length()];
        for(int i=0;i<ch.length;i++)
        {
            ch[a[i]]=s.charAt(i);
        }

        return new String(ch);

    }
}
