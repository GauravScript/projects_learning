package OnlineTests;

public class Test2 {
    public static void main(String[] args) {
        String s = "aaaba";
        Test2 ob =new Test2();
       // System.out.println(ob.isPallindrom(s));

        if(ob.isPallindrom(s)==true){
            System.out.println("-1");
        }

        for(int i=0;i<s.length();i++){
            if(i==0){
                if(ob.isPallindrom(s.substring(i+1))){
                    System.out.println("index is "+i);
                    break;
                }
            }
            else if(ob.isPallindrom(s.substring(0,i)+s.substring(i+1,s.length()))){
                System.out.println("index is "+i);
                break;
            }
        }


    }

    public boolean isPallindrom(String s) {
        int len = s.length()-1;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) == s.charAt(len)) {
                len--;
            } else {
                return false;

            }
        }

        return true;
    }
}
