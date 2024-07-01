import java.net.*;
public class differentparts_uri {
    public static void main(String[] args)throws Exception {
        String str = "https://www.xml.com/";
        URI uri = URI.create(str);
        System.out.println(uri.normalize().toString());
        System.out.println("Scheme = "+ uri.getScheme());
        System.out.println("Schemespecificpart = "+ uri.getRawSchemeSpecificPart());
        System.out.println("Raw User Info = "+ uri.getFragment());
        System.out.println("User Info = "+ uri.getUserInfo());
        System.out.println("Authority = "+ uri.getAuthority());
        System.out.println("Host = "+ uri.getHost());
        System.out.println("Path = "+ uri.getPath());
        System.out.println("Port = "+ uri.getPort());
        System.out.println("Query = "+ uri.getQuery());

        
        
    }
    
}
