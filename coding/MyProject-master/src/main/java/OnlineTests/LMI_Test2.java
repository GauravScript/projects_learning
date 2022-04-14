package OnlineTests;

public class LMI_Test2 {
    public static void main(String[] args) {
        //Array1 = {-9,7,2,10,11,72,0}
        //Array2 = (22,35,0,12,15,-9,99,200}
        int[] arr1={-9,7,2,10,12,72,0};
        int[] arr2={22,35,0,12,15,-9,99,200};
        int count=0;
        int[] output=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            int temp=arr1[i];
            for(int j=0;j<arr2.length;j++){
                if(arr2[j]==arr1[i]){
                    output[count]=arr1[i];
                    count++;
                }
            }
        }

       for (int i=0;i<count;i++){
           System.out.print(output[i]+",");
       }

    }
}
