package example.Array;

public class Segregate01 {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 1, 0, 0, 0, 1 };
        Segregate01 ob=new Segregate01();
        ob.display(arr);

    }
    public void display(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            while(arr[left]==0)left++;
            while(arr[right]==1)right--;
            if(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }
        for(int ob:arr){
            System.out.print(ob);
        }
    }
}
