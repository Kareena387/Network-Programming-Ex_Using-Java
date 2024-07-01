// write a java program to fetch website content using URLConnection Class

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnection {
    public static void main(String[] args) throws Exception {
        StringBuilder content = new StringBuilder();
        try {
            @SuppressWarnings("deprecation")
            URL url = new URL("https://monkeytype.com/");
            URLConnection urlConnection = url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line).append("\n");
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(content.toString());
    }
}
