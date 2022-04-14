package OnlineTests;

import java.util.*;

public class LMI_TEST1 {
    public static void main(String[] args) {
        String name = "Ramanan";

        HashMap<Character,Integer> map=new HashMap<Character, Integer>();
        for(int i=0;i<name.length();i++){
            if(map.containsKey(name.charAt(i))){
                map.put(name.charAt(i),map.get(name.charAt(i))+1);
            }else{
                map.put(name.charAt(i),1);
            }
        }

        for(Map.Entry<Character,Integer> ob:map.entrySet()){
            System.out.println(ob.getKey()+"-->"+ob.getValue());
        }

    }
}
