package CollectorFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComparableTest implements Comparable<ComparableTest> {
    int rollno;
    String Name;
    static String Company="NewCompany";
    ComparableTest(int rn,String name){
        this.rollno=rn;
        this.Name=name;
    }

    @Override
    public int compareTo(ComparableTest o) {
        if(rollno==o.rollno){
            return 0;
        }
        else if (rollno>o.rollno){
            return 1;
        }
        else
            return -1;
    }

    public static void main(String[] args) {
        ArrayList<ComparableTest> arrayList=new ArrayList<ComparableTest>();
        arrayList.add(new ComparableTest(1,"rohan"));
        arrayList.add(new ComparableTest(17,"suresh"));
        arrayList.add(new ComparableTest(14,"Rajesh"));
        arrayList.add(new ComparableTest(15,"Usman"));

        arrayList.stream().forEach(c-> System.out.println(c.rollno+"--"+c.Name+"--"+ComparableTest.Company));
        Collections.sort(arrayList);
        arrayList.stream().forEach(c-> System.out.println(c.rollno+"--"+c.Name+"--"+ComparableTest.Company));

    }
}
