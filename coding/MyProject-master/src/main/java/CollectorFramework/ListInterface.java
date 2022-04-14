package CollectorFramework;

import java.util.*;

public class ListInterface {
    public static void main(String[] args) {
        //Array List
        /*
        Java ArrayList class uses a dynamic array for storing the elements.
        The ArrayList in Java can have the duplicate elements also
        The ArrayList maintains the insertion order internally.
         */
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("Hello");
        arrayList.add("Hello");
        arrayList.add("Hello1");
        System.out.println(arrayList);
        //Remove Duplicate from List
        Set<String> set=new HashSet<String>(arrayList);
        System.out.println(set);

        //Liked List
        LinkedList<Integer> linkedList=new LinkedList<Integer>();
        linkedList.add(11);
        linkedList.add(22);
        linkedList.add(33);
        //Stream to Print
        linkedList.stream().forEach(o-> System.out.println(o));
        //Reverse LinkedList
        Iterator itr=linkedList.descendingIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

//        //Stack
//        Stack<String> stack=new Stack<String>();
//        stack.push("stack1");
//        stack.push("stack2");
//        stack.push("stack3");
//        System.out.println(stack);
//        System.out.println( stack.peek());
//        stack.pop();System.out.println(stack);

        Integer[] intarr={1,2,4,3,2,1};
        ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(intarr));
        System.out.println(al);



    }
}
