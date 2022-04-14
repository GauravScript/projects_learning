package OnlineTests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;

public class TestOnline2 {
    public static void main(String[] args) throws FileNotFoundException {
        //name1 org1 1234
        //name2 org2 2345
        //name1 org2 1234
        //name4 org4 4567
        //name1 org3 1234
        FileInputStream fis = new FileInputStream("/Users/rohanraviyadav/IdeaProjects/MyFirstProject/src/main/resources/input.txt");
        Scanner scanner = new Scanner(fis);
        Map<String, String> hm = new HashMap<String, String>();
        while (scanner.hasNext()) {
            String[] s = scanner.nextLine().split(" ");
            hm.put(s[0] + " " + s[2], s[1]);
        }
        for (Map.Entry<String, String> itr : hm.entrySet()) {
            String[] s1 = itr.getKey().split(" ");
            String s2 = itr.getValue();
            System.out.println(s1[0] + " " + s2 + " " + s1[1]);
        }

    }
}
