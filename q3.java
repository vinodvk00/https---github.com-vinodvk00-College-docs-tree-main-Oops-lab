
//3. write a java program to print list of files and directories and count number of files and
// directories in specified path using File API

import java.util.Scanner;
import java.io.File;

class countDirect {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("file names");
        File f = new File(".");
        String flist[] = f.list();
        int c = 0;
        for (String fname : flist) {
            File fl = new File(fname);
            if (fl.isFile())
                System.out.println("file name : " + fname);
            else if (fl.isDirectory())
                System.out.println("Directoary name : " + fname);
            c++;
        }
        System.out.println("Total Files " + c);
    }
}