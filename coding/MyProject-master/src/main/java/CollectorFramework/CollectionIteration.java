package CollectorFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionIteration {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<String>();
        collection.add("Sunday");
        collection.add("Monday");
        collection.add("Monday1");
        collection.add("Monday2");

        //Iterator
        Iterator<String> itr=collection.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //ListIterator
       for(String ob:collection){
           System.out.println(ob);
       }
        //stream
        collection.stream().forEach(c-> System.out.println(c));
    }
}
