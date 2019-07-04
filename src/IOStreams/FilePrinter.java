package IOStreams;
import java.io.*;
import java.io.BufferedReader;

public class FilePrinter {
    public static void main(String[] args) {
        File file = new File ("C://Users//User/IdeaProjects//hello_world//target.txt");
        try(BufferedReader bf1 = new BufferedReader(new FileReader(file.getPath())))
        {
            int c;
            while((c = bf1.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
