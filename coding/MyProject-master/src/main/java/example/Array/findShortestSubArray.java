package example.Array;

import java.util.*;

public class findShortestSubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1,4,2};
        findShortestSubArray ob = new findShortestSubArray();
        System.out.println(ob.getLengthShortestSubArray(arr));
    }

    int getLengthShortestSubArray(int[] a) {
        int len = 0;
        int range = Integer.MAX_VALUE;
        int maxtime=Integer.MIN_VALUE;;
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++) {
            if (hashMap.containsKey(a[i])) {
                hashMap.put(a[i], hashMap.get(a[i]) + 1);
            } else {
                hashMap.put(a[i], 1);
            }
        }
       // maxtime=hashMap.get(a[0]);
        for (Map.Entry<Integer, Integer> ob : hashMap.entrySet()) {
            if (ob.getValue() < 2) {
                //hashMap.remove(ob.getKey());
                //do nothing
            } else {
                if(ob.getValue()==maxtime){
                int valueofrange = range(a, ob.getKey());
                if (valueofrange < range) {
                    range = valueofrange;
                }
                }else if (ob.getValue()>maxtime){
                    int valueofrange = range(a, ob.getKey());
                    if (valueofrange < range) {
                        range = valueofrange;
                    }
                }
                maxtime=ob.getValue();
            }
        }
        len=range+1;


        return len;
    }

    int range(int[] arr, int number) {
        int range = 0;
        int left = 0, right = arr.length - 1;
        while (left < right) {
            while (arr[left] != number) left++;
            while (arr[right] != number) right--;
            if(left < right){
            range= right-left;
            break;
            }
        }
        return range;

    }
}
