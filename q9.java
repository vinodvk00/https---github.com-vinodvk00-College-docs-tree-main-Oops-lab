//9. Write a java program to copy one file data to another file

import java.io.*;
import java.util.Scanner;

class FileCopytoOtherFile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source file : ");
        
        String sourceFile = sc.next();
        System.out.println("Enter destination file : ");
        String destinationFile = sc.next();
        sc.close();
        // "path/to/destination/file.txt";

        try {
            File fileToCopy = new File(sourceFile);
            File copiedFile = new File(destinationFile);

            FileReader reader = new FileReader(fileToCopy);
            FileWriter writer = new FileWriter(copiedFile);

            int character;

            while ((character = reader.read()) != -1) {
                writer.write(character);
            }

            reader.close();
            writer.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred during file copy.");
            e.printStackTrace();
        }
    }
}
