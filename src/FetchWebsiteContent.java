//Lab: Write a java program to fetch Website content using URLConnection Class
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class FetchWebsiteContent {
    public static void main(String[] args) throws Exception {
        StringBuilder content = new StringBuilder();

        
            @SuppressWarnings("deprecation")
            URL u = new URL ("https://www.linkedin.com/");
            URLConnection uc = u.openConnection();
            InputStream in = uc.getInputStream();

            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in))) {
                String line;
                while ((line = bufferedReader.readLine()) != null){
                    content.append(line).append("\n");
                }
            }

        
        catch(Exception e){
        }
        System.out.println(content);   
        
    }
    
}
