package OnlineTests;

import java.io.*;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) throws IOException {

        //File Reading Using Buffer Reader
        System.out.println("Reading through FIS");
        File file=new File("/Users/rohanraviyadav/IdeaProjects/MyFirstProject/src/main/resources/input.txt");
        BufferedReader br=new BufferedReader(new FileReader(file));
        String s="";
        while((s=br.readLine())!=null){
            System.out.println(s);
        }

        System.out.println("File Reading using scanner");
        Scanner sc=new Scanner(file);
        while (sc.hasNext()){
            System.out.println(sc.nextLine());
        }

        FileReader fr=new FileReader("/Users/rohanraviyadav/IdeaProjects/MyFirstProject/src/main/resources/input.txt");
        int i;
        System.out.println("Reading through FileReader");
        while((i=fr.read())!=-1){
            System.out.print((char)i);
        }
    }
}
