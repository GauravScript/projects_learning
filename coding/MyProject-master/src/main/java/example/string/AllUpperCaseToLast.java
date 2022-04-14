package example.string;

public class AllUpperCaseToLast {

    String upperCaseToLast(String s){
        //^ mean not
        s=s.replaceAll("[A-Z]+","")+s.replaceAll("[^A-Z]+","");
        return s;
    }

    public static void main(String[] args) {
        AllUpperCaseToLast ob=new AllUpperCaseToLast();
        System.out.println(ob.upperCaseToLast("This is Example Of UPPER to Lower"));
        System.out.println(ob.upperCaseToLast("TEST Commit"));
    }
}
