package fileio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyfileContent {
    public static void main(String[] args) {

        copyfile("C:\\Users\\shaik.mohammed02\\Downloads\\file1.txt", "C:\\Users\\shaik.mohammed02\\Downloads\\file2.txt");


    }

    public static void copyfile(String source, String destination) {
        Path sourcefile = Paths.get(source);
        Path destinationfile = Paths.get(destination);
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(sourcefile);
            Files.write(destinationfile, lines);
        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}
