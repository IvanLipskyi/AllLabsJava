package serialization;

import java.io.ObjectOutputStream;
import java.io.*;

/**
 * Created by Brainacad4 on 04.07.2019.
 */
public class SerializeTest {
    public static void main(String[] args) {
        File file = new File ("C://Users//Brainacad4//parser//untitled55//for_test.txt");
        CreditCard cred1 = new CreditCard(CC.VIZA, "PrivatBank", "1234 5678 9101 1213", "12.23", 455);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream (file)))
        {
            oos.writeObject(cred1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

