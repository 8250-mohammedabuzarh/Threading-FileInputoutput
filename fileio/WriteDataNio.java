package fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteDataNio {
    public static void main(String[] args) throws IOException {
        writeData("C:\\Users\\shaik.mohammed02\\Downloads\\file1.txt");

    }

    public static void writeData(String destination) throws IOException {
        Path sourcefile = Paths.get(destination);
        Files.write(sourcefile, "Hello World".getBytes(),StandardOpenOption.APPEND);

    }
}
