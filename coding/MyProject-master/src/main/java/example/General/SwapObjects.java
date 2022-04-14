package example.General;

public class SwapObjects {
    int num;

    public SwapObjects(int n){
        this.num=n;
    }
    public static void swap(SwapObjects ob1,SwapObjects ob2){
        int temp=ob1.num;
        ob1.num=ob2.num;
        ob2.num=temp;
    }
    public static void main(String[] args) {
        SwapObjects ob1=new SwapObjects(1);
        SwapObjects ob2=new SwapObjects(2);
        System.out.println("before swap ob1>>num --"+ob1.num+" --ob2>>num---"+ob2.num);
        SwapObjects.swap(ob1,ob2);
        System.out.println(" after swap ob1>>num --"+ob1.num+" --ob2>>num---"+ob2.num);
    }


}
