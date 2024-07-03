//Lab: Write a java program to fetch all HTTP header Fields using URLConnection
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class FethHttpHeader {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("deprecation")
        URL u = new URL("https://monkeytype.com/");
        URLConnection uc = u.openConnection();

        Map<String,List<String>> header = uc.getHeaderFields();
        
        for(Map.Entry<String, List<String>> mp1 : header.entrySet())
        {
            System.out.println(mp1.getKey() +":");
            System.out.println(mp1.getValue().toString());
        }

    }
   
}
