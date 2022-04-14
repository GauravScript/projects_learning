package example.string;

public class RemoveCharToMakeUnique {
    public static void main(String[] args) {
        System.out.print(RemoveCharToMakeUnique.countToRemove("AABAAA"));
    }

    public static int countToRemove(String a){
        int count=0;
        for(int i=0;i<a.length()-1;i++){
            if(a.charAt(i)==a.charAt(i+1)){
                count++;
            }
        }

        return count;
    }
}
