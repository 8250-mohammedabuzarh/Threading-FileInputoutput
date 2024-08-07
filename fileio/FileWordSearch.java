package fileio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWordSearch {
    public static void main(String[] args) throws IOException {
        File filepath = new File("C:\\Users\\shaik.mohammed02\\Downloads\\demo3.txt");
        if(filepath.exists() && filepath.length()==0)
        {
            System.out.println("File Exists");
            FileWriter writer = new FileWriter(filepath);
            try {
                writer.write("Shaik Mohammed Abuzarh");
                writer.close();
                System.out.println("File Written");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else {
            FileWriter writer = new FileWriter(filepath);
            try {
                writer.write("Shaik Mohammed Abuzarh");
                writer.close();
                System.out.println("File Created");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
