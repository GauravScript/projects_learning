package example.Array;

public class sortArrayOfZeroOneAndTwo {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        sortArrayOfZeroOneAndTwo ob=new sortArrayOfZeroOneAndTwo();
        ob.returnSorterArray(arr);
    }
    public int[] returnSorterArray(int[] arr){
         int c0=0,c1=0,c2=0;
         for (int i=0;i<arr.length;i++){
             if(arr[i]==0)c0++;
             else if(arr[i]==1)c1++;
             else c2++;
         }
        for (int i=0;i<arr.length;i++){
            if(i<c0)arr[i]=0;
            else if(i>=c0 && i<c0+c1)arr[i]=1;
            else if(i>=c1 && i<c0+c1+c2)arr[i]=2;
        }
        for(int ob1:arr){
            System.out.print(ob1);
        }
        return arr;
    }
}
