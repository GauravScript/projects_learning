package example.string;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccuranceOfCharCount {
    int count=0;

    int countOfChar(String s, char ch) {
        s=s.toLowerCase();
        for(int i=0; i<s.length();i++){
        if(s.charAt(i)==ch){
            count++;
        }
        }
        return count;
    }
    int countUsingRegex(String s, char ch){
        count=0;
        s=s.toLowerCase();
        Matcher m= Pattern.compile(String.valueOf(ch)).matcher(s);
        while (m.find()){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        OccuranceOfCharCount c=new OccuranceOfCharCount();
        //My Solution
        System.out.println(c.countOfChar("ExampleOfExamples", 'e'));
        //RegExSolution
        System.out.println(c.countUsingRegex("ExampleOfExamples", 'e'));


    }
}
