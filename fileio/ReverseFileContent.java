package fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReverseFileContent {
    public static void main(String[] args) {
        String inputFile1 = "C:\\Users\\shaik.mohammed02\\Downloads\\demo3.txt";

        try (
                BufferedReader reader1 = new BufferedReader(new FileReader(inputFile1));
        ) {
            String line;
            while ((line = reader1.readLine()) != null) {
                line = new StringBuilder(line).reverse().toString();
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
