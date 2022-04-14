package CollectorFramework;

public class ArrayRotation {
    public static void main(String[] args) {
        //9,8,16,18,29,40,1,2,7,79,67 
       // pivot 4
        //29,40,1,2,7,79,67 ,9,8,16,18,
        int[] arr={29,40,1,2,7,79,67,9,8,16,18};
      //  int[] arr={29,40};
        int pivot=4;
       // int pivot=2;
        ArrayRotation ob=new ArrayRotation();
        ob.rotatedArray(arr,pivot);
    }

    public void rotatedArray(int[] arr, int pivot){
     int[] temp=new int[arr.length];
     int count=0;
     if(arr.length==0){
         System.out.println("Array is empty,Can't rotate");
         return;
     }
     if(pivot>arr.length ||pivot<0){
         System.out.println("out of range");
         return;
     }else if(pivot==0){
         System.out.println("No ratations");
         for(int prev:arr){
             System.out.print(prev+",");
         }
         return;
     }
     for(int i=pivot;i<arr.length;i++){
        temp[count]=arr[i];
        count++;
     }
     for(int j=0;j<pivot;j++){
         temp[count]=arr[j];
         count++;
     }
        System.out.println("Before rotation");

        for(int prev:arr){
            System.out.print(prev+",");

        }
        System.out.println("");
        System.out.println("After rotation, total rotatio : "+pivot);
     for(int o:temp){
         System.out.print(o+",");
     }
    }
}
