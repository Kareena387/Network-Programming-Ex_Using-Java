//WAP in Java program to read content from website


import java.net.*;
import java.io.*;
public class Get_ContentfromWebsite {
    public static void main(String[] args)  throws IOException{
        @SuppressWarnings("deprecation")
        URL url = new URL("https://www.kaggle.com/");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

        // read and print the content of the web page 
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            
        }

        //close the input stream
         reader.close();
        
    }
    
}
