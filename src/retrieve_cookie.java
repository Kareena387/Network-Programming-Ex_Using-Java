import java.net.*;
import java.util.*;


public class retrieve_cookie {
    private final static String URL_STRING = "https://www.dummy.restapiexample.com/";
    public static void main(String[] args)  throws Exception{      

        //cookieManager and CookieStore

         CookieManager cookieManager = new CookieManager();
         CookieHandler.setDefault(cookieManager);

         URL url = new URL(URL_STRING);
         URLConnection connection = url.openConnection();
         connection.getContent();
         
          CookieStore cookieStore = cookieManager.getCookieStore();
          List<HttpCookie> cookie = cookieStore.getCookies();

          for(HttpCookie c : cookie){
            System.out.println("Cookie Name"  + c.getName());
            System.out.println("Cookie Value"  + c.getValue());
            System.out.println("Cookie Domain"  + c.getDomain());
            System.out.println("Cookie Path"  + c.getPath());
            System.out.println("Cookie Expiry"  + c.getMaxAge());


          }
    }
    
}


 