// 6.Write a java program to read data from a file and write and another file.

import java.util.*;
import java.io.*;

class FileCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name");
        String name = sc.next();
        File f = new File(name);
        try {
            FileReader a = new FileReader(f);
            BufferedReader b = new BufferedReader(a);
            String line;
            FileWriter fileWriter = new FileWriter("output.txt");
            while ((line = b.readLine()) != null) {
                fileWriter.write(line + "\n");
                fileWriter.flush();
            }
            System.out.println("File copied successfully..");
            fileWriter.close();
            b.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}