// 1. write a java program that reads a file name from the user,and then displays information
// about whether the file exists,.......readable,writable,file length and length of the file in bytes.

import java.io.*;
import java.util.*;

class Example {
    public static void main(String[] args) {
        System.out.println("Enter the file name ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        File f = new File(name);
        if (f.exists()) {
            System.out.println("The name of the file is :" + f.getName());
            if (f.canRead())
                System.out.println("The file is readable");
            else
                System.out.println("The file is not readable");
            if (f.canWrite())
                System.out.println("The file is Writable");
            else
                System.out.println("The file is not Writable");
            System.out.println("The length of the file is " + f.length());
        } else
            System.out.println("The file do not exists");
    }
}