package fileio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        readfile("C:\\Users\\shaik.mohammed02\\Downloads\\demo3.txt");
    }

    public static void readfile(String source) {
        Path sourcefile = Paths.get(source);
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(sourcefile);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}