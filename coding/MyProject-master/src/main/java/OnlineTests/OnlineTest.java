package OnlineTests;

public class OnlineTest {
    //Array Even Odd
    public static void main(String[] args) {
        int[] arr = new int[]{3,3,3,3,3,3,3,2,2,2,2,21,1};
        OnlineTest ob = new OnlineTest();
        //int[] arr1=ob.getSorterArray(arr);
        int[] arr1 = ob.lessComplexitySort(arr);
        for (int ob1 : arr1) {
            System.out.print(ob1 + ",");
        }

    }

    public int[] getSorterArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                continue;
            } else {
                temp = arr[i];
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] % 2 == 0) {
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    } else {
                        continue;
                    }
                }

            }
        }
        return arr;
    }

    public int[] lessComplexitySort(int[] arr) {
        int left=0;
        int right = arr.length - 1;
        while(left<right){
            while (arr[left]%2==0 && left<right)left++;
            while (arr[right]%2!=0 && left<right)right--;
            if(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }
        return arr;
    }

}
