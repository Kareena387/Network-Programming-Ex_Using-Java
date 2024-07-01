//splitting url
import java.io.*;
import java.net.*;


public class splitting_url {
    public static void main (String[]args) throws IOException {
        URL url = new URL("https://www.instagram.com/")
        

        //get the information about the URL
        System.out.println("Protocol:" + url.getProtocol());
        System.out.println("Host:" + url.getHost());
        System.out.println("Port:" + url.getPort());
        System.out.println("Path:" + url.getPath());
        System.out.println("Query:" + url.getQuery());
        System.out.println("Ref:" + url.getRef());
        System.out.println("File:" + url.getFile());


    }
    
}
