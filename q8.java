// 8.Write a java program to create a file if not existed using File API.

import java.io.*;
import java.util.*;

class FileExist {
    public static void main(String[] args) {
        System.out.println("Enter the file name: ");
        Scanner scr = new Scanner(System.in);
        String fname = scr.next();
        scr.close();
        File f = new File(fname);
        try {
            if (f.exists())
                System.out.println("File is already existed");
            else {
                f.createNewFile();
                System.out.println("File created: " + f.getName());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
