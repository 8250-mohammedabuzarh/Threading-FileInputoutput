package fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileMoveNio {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\shaik.mohammed02\\Downloads\\demo3.txt";

        String destinationFile = "C:\\Users\\shaik.mohammed02\\Downloads\\demo3_copy.txt";

        moveFile(sourceFile, destinationFile);
    }

    public static void moveFile(String sourceFile, String destinationFile) {
        Path source = Paths.get(sourceFile);
        Path destination = Paths.get(destinationFile);
        try {
            Files.move(source, destination, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved successfully");
        } catch (IOException e) {
            e.printStackTrace();
}
