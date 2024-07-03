//Lab: Write a Java program to retrieving Specific Header Fields from URL using URLConnection Class.
import java.net.URL;
import java.net.URLConnection;

public class Retrieving_SpecificHeaderFields {
    public static void main(String[] args) throws Exception{
        @SuppressWarnings("deprecation")
        URL u = new URL("https://www.instagram.com/");
        URLConnection uc = u.openConnection();

        System.out.println("content-type:" + uc.getContentType());
        System.out.println("content-encoding:" + uc.getContentEncoding());
        System.out.println("Date:" + new Date(uc.getLastModified()));
        System.out.println("Last modified:" + new Date(uc.getLastModified()));
        System.out.println("Expiration Date:" + new Date (uc.getExpiration()));
        System.out.println("content-length:" + uc.getContentLength());
        
    }

    
    }

