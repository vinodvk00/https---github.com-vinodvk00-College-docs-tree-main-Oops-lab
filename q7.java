// 7.Write a java program to append text/string in a file(Use Stream class)

import java.util.*;
import java.io.*;

class Insert {
    public static void main(String[] args) {
        System.out.println("Enter the file name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        sc.close();
        try {
            String line;
            FileOutputStream b = new FileOutputStream(name, true);
            System.out.println("Enter the string");
            line = sc.next();
            String l = line + "\n";
            b.write(l.getBytes());
            b.flush();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("String inserted successfully");
    }
}