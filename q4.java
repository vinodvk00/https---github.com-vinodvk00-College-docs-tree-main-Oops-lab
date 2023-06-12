// 4. write a java program that reads a file and displays the file on the screen with a line number
// before each line.

import java.io.*;
import java.util.*;

class Display {
    public static void main(String[] args) {
        System.out.println("Enter the file name");
        Scanner sc = new Scanner(System.in);
        String fname = sc.next();
        File f = new File(fname);
        int l = 0;
        try {
            FileReader a = new FileReader(f);
            BufferedReader b = new BufferedReader(a);
            String line;
            while ((line = b.readLine()) != null) {
                l++;
                System.out.println(l + " " + line);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
