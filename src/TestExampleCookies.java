import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class TestExampleCookies {
    public final static String URL_STRING ="https://www.daraz.com.np/";

public static void main(String[] args) throws Exception{
     CookieManager cookieManager = new CookieManager();
        CookieHandler.setDefault(cookieManager);
        URL url = new URL(URL_STRING);
        URLConnection connection = url.openConnection();
        connection.getContent();
        CookieStore cookieStore = cookieManager.getCookieStore();
        List<HttpCookie> cookieList = cookieStore.getCookies();

//iterate HttpCookie object
        for (HttpCookie cookie : cookieList){
            //
            System.out.println("Domain:"+ cookie.getDomain());

            System.out.println("max age:"+ cookie.getMaxAge());
            System.out.println("name of cookie:"+ cookie.getName());
            System.out.println("server path:"+ cookie.getPath());

            System.out.println("is cookie secure:"+ cookie.getSecure());

            System.out.println("Value of cookie:"+ cookie.getValue());

            System.out.println("value of cookie version:"+ cookie.getVersion());
}
}
}
