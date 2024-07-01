import java.net.URL;
import java.net.URLConnection;

public class fetchSpecificHeader {
    public static void main(String[] args) throws Exception{
        URL u = new URL("");
        URLConnection uc = u.openConnection();
        System.out.println("content-type:" + uc.getContentType());
        
        
    }{

    
    System.out.println("content-length:"+uc.getContentLength());
    }
}
