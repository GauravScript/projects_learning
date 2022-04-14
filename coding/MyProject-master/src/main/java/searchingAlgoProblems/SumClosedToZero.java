package searchingAlgoProblems;

public class SumClosedToZero {
    public static void main(String[] args) {
        int a[]={1, 60, -10, 70, -80, 85};
        SumClosedToZero ob=new SumClosedToZero();
        ob.displayNumbersWhoseSumIsCloseToZero(a);

    }

    public void displayNumbersWhoseSumIsCloseToZero(int a[]){
        int n=a.length;
        int min_1=0;
        int min_2=1;
        int sum;
        int min_sum=a[min_1]+a[min_2];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                sum=a[i]+a[j];
                if(Math.abs(min_sum)>Math.abs(sum)){
                    min_sum=sum;
                    min_1=i;
                    min_2=j;
                }
            }
        }
        System.out.println("Numbers are" +a[min_1]+","+a[min_2]);
    }
}
