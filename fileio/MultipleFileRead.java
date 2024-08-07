package fileio;

import java.io.*;

public class MultipleFileRead {
    public static void main(String[] args) {
        String inputFile1 = "C:\\Users\\shaik.mohammed02\\Downloads\\demo3.txt";

        try (
                BufferedReader reader1 = new BufferedReader(new FileReader(inputFile1));
        ) {
            String line;
            while ((line = reader1.readLine()) != null) {
                if (line.matches(".*Shaik.*")) {
                    System.out.println("\nFile: " + inputFile1 + " Shaik found");
                }
                //System.out.println(line);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
