package CollectorFramework;

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<String>();
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<String>();
        TreeSet<String> treeSet=new TreeSet<String>();

        treeSet.add("one1");
        treeSet.add("one3");
        treeSet.add("one2");
        treeSet.add("one5");
        treeSet.add("one4");

        linkedHashSet.add("one1");
        linkedHashSet.add("one3");
        linkedHashSet.add("one2");
        linkedHashSet.add("one5");
        linkedHashSet.add("one4");

        hashSet.add("one1");
        hashSet.add("one3");
        hashSet.add("one2");
        hashSet.add("one5");
        hashSet.add("one4");

        System.out.println("Tree set sorted order");
        treeSet.stream().forEach(c-> System.out.println(c));

        System.out.println("Linkedhashset natural order");
        linkedHashSet.stream().forEach(c-> System.out.println(c));

        System.out.println("hashset natural order, No ordering , no sorting");
        hashSet.stream().forEach(c-> System.out.println(c));

    }
}
