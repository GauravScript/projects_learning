package OnlineTests;

public class TESTOnline1 {
    public static void main(String[] args) {
        //education - reverse with o(n)/2 complexity
        String s="education";
        int last=s.length()-1;
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length/2;i++){
            char temp=arr[i];
            arr[i]=arr[last];
            arr[last]=temp;
            last--;
        }
        for(char ob:arr){
            System.out.print(ob);
        }
    }

}
