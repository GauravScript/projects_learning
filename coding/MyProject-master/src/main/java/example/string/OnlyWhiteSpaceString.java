package example.string;

public class OnlyWhiteSpaceString {
    boolean onlyWhiteSpaceString(String s){

        //Solution from GFK is  str.trim().isEmpty(); my solution was below
        if(s.trim().length()<=0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        OnlyWhiteSpaceString ob=new OnlyWhiteSpaceString();
        System.out.println(ob.onlyWhiteSpaceString("      x     "));
    }
}
