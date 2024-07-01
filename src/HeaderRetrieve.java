import java.net.URL;
import java.net.URLConnection;


public class HeaderRetrieve {
    public static void main (String []args) throws Exception {
        URL u = new URL("https://www.instagram.com/");
        URLConnection uc = u.openConnection();
        String contentType = uc.getHeaderField("server");
        System.out.println(contentType);
        String headerkey = uc.getHeaderFieldKey(1);
        System.out.println(headerkey);


    }
    
}
