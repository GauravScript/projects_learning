package example.string;

import java.util.Arrays;
import java.util.HashSet;

public class LongestPalindrom {
    public static void main(String[] args) {
        LongestPalindrom ob = new LongestPalindrom();
        String st = "enuyazszxldyujzvucidbxqcxiiqjifnxbozbiyatdzqpaljevpisfksovkxfqmctcdumdviiwyxwljcgykadvsrsdqx";
        int lengthOfPalindrom = 0;
        int startIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < st.length(); i++) {
            for (int j = i+1; j <= st.length(); j++) {
                String sub = st.substring(i, j);
               // if (ob.isPalindrom(sub) && sub.length() > lengthOfPalindrom) {
                    if (ob.isUnique(sub) && sub.length() > lengthOfPalindrom) {
                    lengthOfPalindrom = sub.length();
                    startIndex = i;
                    endIndex = j;
                }
            }

        }
        System.out.println("length Of Palindrom : " + st.substring(startIndex, endIndex).length());
        System.out.println("Palindrom is :" + st.substring(startIndex, endIndex));

    }

    private boolean isPalindrom(String st) {
        int len = st.length() - 1;
        for (int i = 0; i < st.length() / 2; i++) {
            if (st.charAt(i) != st.charAt(len)) {
                return false;
            }
            len--;
        }
        return true;
    }

    private boolean isUnique(String st) {
        HashSet<String> set=new HashSet<String>(Arrays.asList(st.split("")));
        if(st.length()==set.size()){
            return true;
        }
        return false;
    }
}


