package fileio;

import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\shaik.mohammed02\\Downloads\\demo3.txt");
        if(fileReader.ready())
        {
            int i;
            while ((i=fileReader.read())!=-1)
            {
                System.out.print((char)i);

            }

        }
        else {
            System.out.println("File Not Found");
        }

    }
}
