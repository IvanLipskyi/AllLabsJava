package netLaba;
import java.net.*;
import java.io.*;

/**
 * Created by Brainacad4 on 09.07.2019.
 */
public class IpInfo {
    public static void main(String[] args) throws Exception{
        int c;
        URL url = new URL("https://api.2ip.ua/geo.json");
        HttpURLConnection aaa = (HttpURLConnection)url.openConnection();
        aaa.connect();
        try(BufferedReader bf1 = new BufferedReader(new InputStreamReader(aaa.getInputStream()))){
            String userInput;
            while((userInput = bf1.readLine())!=null){
                System.out.println(userInput);
            }
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
}
