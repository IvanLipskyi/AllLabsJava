package serialization;
import java.io.*;

public class DeserializeTest {

    public static void main(String[] args) {

        File file = new File ("C://Users//Brainacad4//parser//untitled55//for_test.txt");
        try(ObjectInputStream ooo = new ObjectInputStream(new FileInputStream(file))) {
            CreditCard cr1 = (CreditCard)ooo.readObject();
            System.out.printf("Имя банка:" + cr1.toString());
        }
        catch (IOException e){
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
