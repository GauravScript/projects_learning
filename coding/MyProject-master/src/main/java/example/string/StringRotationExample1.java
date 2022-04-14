package example.string;

public class StringRotationExample1 {
    public static void main(String[] args) {
        String s1="ABCD";
        String s2="CDAB";
        StringRotationExample1 ob=new StringRotationExample1();
        System.out.println(ob.isRoatation(s1,s2));
    }
    boolean isRoatation(String s1,String s2){
        return ((s1.length()==s2.length()) &&
                s1.concat(s1).contains(s2));
    }
}
