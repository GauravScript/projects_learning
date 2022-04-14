package example.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfStringToCommaSeparated {
    String commaSeparatedString;

    String commaSeparated(List<String> s) {
    /*
    Returns a new String composed of copies of the CharSequence elements joined together with a copy of the specified delimiter
     */
        commaSeparatedString = commaSeparatedString.join(",", s);
        return commaSeparatedString;
    }

    public static void main(String[] args) {
        String st = null;
        List<String> al = new ArrayList<String>(Arrays.asList("Hello", "Print", "World"));
        ListOfStringToCommaSeparated ob = new ListOfStringToCommaSeparated();
        System.out.println(ob.commaSeparated(al));
    }
}
