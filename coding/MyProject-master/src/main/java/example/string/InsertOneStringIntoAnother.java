package example.string;

public class InsertOneStringIntoAnother {
    String insertString(String or, String s,int pos){
        or=or.substring(0,pos)+s+or.substring(pos);
        return or;
    }

    public static void main(String[] args) {
        InsertOneStringIntoAnother ob=new InsertOneStringIntoAnother();
        System.out.println(ob.insertString("thisstring", "is",4));
    }
}
