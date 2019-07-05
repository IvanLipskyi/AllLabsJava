
package ioStreams;
import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("C://Users//User//IdeaProjects//hello_world//testing.txt");
            FileOutputStream fos = new FileOutputStream("C://Users//User//IdeaProjects//hello_world//testing_new.txt"))
        {
            byte[]buffer = new byte[fis.available()];
            fis.read(buffer, 0, buffer.length);
            fos.write(buffer, 0, buffer.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
