package example.string;

import java.util.*;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ConversionOfTypeinCollections {
    public static void main(String[] args) {

        //List of char to String
        List<Character> chl=Arrays.asList('c','a','l','l','m','e','b','a','c','k');
        System.out.println(chl.stream().map(String::valueOf).collect(Collectors.joining()));

        //List of Int to List of Array
        List<Integer> inl=Arrays.asList(1,2,3,4,5,6);
        System.out.println(inl.stream().map(s->String.valueOf(s)).collect(Collectors.joining()));

        //List of String to list of int
        List<String> sl=Arrays.asList("1","2","3","4","5");
        System.out.println(sl.stream().map(Integer::parseInt).collect(Collectors.toList()));

        //Set of String to set of Integer
        Set<String> stringSet=new HashSet<String>(Arrays.asList("1","2","4","6"));
        System.out.println(stringSet.stream().map(Integer::parseInt).collect(Collectors.toSet()));

        //Set of Integer to set of String
        Set<Integer> integerSet=new HashSet<Integer>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(integerSet.stream().map(String::valueOf).collect(Collectors.toSet()));

    }
}
