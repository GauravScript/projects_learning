package example.Array;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 1, 1, 2, 2, 3, 6, 6};
        DuplicatesInArray ob = new DuplicatesInArray();
        ob.findDuplicate(arr);

    }

    void findDuplicate(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[Math.abs(a[i])] > 0) {
                a[Math.abs(a[i])] = -a[Math.abs(a[i])];
            } else {
                System.out.print(Math.abs(a[i]) + ",");
            }
        }
    }
}
