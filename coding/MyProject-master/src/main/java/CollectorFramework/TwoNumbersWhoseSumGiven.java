package CollectorFramework;

import java.util.*;

public class TwoNumbersWhoseSumGiven {
    public static void main(String[] args) {
        TwoNumbersWhoseSumGiven ob = new TwoNumbersWhoseSumGiven();
        int[] arr = {8, 1, 2, 3, 0, 1, 8, 8, 8, 8, 4, 5, 6, 4, 6, 1, 9, 10};
        int sum = 10;
        ob.displayCombination(arr, sum);

    }

    public void displayCombination(int[] arr, int sum) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println("Combinations are :");
        for (Map.Entry<Integer, Integer> ob : map.entrySet()) {

            if (map.containsKey(sum - ob.getKey())) {
                if ((ob.getKey() == sum - ob.getKey()) && (map.get(sum - ob.getKey()) == 1)) {
                    continue;
                } else {
                    System.out.print("(" + ob.getKey() + "," + (sum - ob.getKey()) + ")");
                }
            }
        }

    }
}
