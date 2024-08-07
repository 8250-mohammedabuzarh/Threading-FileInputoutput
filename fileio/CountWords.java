package fileio;

import javax.swing.plaf.IconUIResource;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CountWords {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\shaik.mohammed02\\Downloads\\demo3.txt");
        if (fileReader.ready()) {
            int i;
            int count = 1;
            while ((i = fileReader.read()) != -1) {
                if ((char) i == ' ') {
                    count++;
                }


            }
            System.out.println("Number of words in the file: " + count);

        } else {
            System.out.println("File Not Found");
        }
    }
}
