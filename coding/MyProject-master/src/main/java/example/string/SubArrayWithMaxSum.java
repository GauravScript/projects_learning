package example.string;

public class SubArrayWithMaxSum {
    public static void main(String[] args) {
        int[] arr={7,2,-4,-2,-12,5,7,1,-5};
        int maxSum=Integer.MIN_VALUE;
        int startIndex=0;
        int endIndex=0;
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            temp=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                temp=temp+arr[j];
                if(temp>maxSum)
                {
                    maxSum=temp;
                    startIndex=i;
                    endIndex=j;
                }

            }
        }
        System.out.println("Start Index :"+startIndex +" and End Index :"+endIndex);
        System.out.println("Sum :"+maxSum);
    }
}
