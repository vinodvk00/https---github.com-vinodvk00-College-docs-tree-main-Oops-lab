// 5. write a java program to delete specified file or directory.(Read file name or directory name
// from the user).

import java.io.*;
import java.util.*;

class Delete {
    public static void main(String[] args) {
        System.out.println("Enter the file name");
        Scanner sc = new Scanner(System.in);
        String fname = sc.next();
        File f = new File(fname);
        if (f.delete()) {
            System.out.println("Deleted the file :" + f.getName());
        } else {
            System.out.println("The file " + f.getName() + " does not exist");
        }
    }
}