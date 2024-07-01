import java.net.URLDecoder;
import java.net.URLEncoder;

public class encoding_decoding_url {
    public static void main(String[] args) throws Exception {
        String url1 = URLEncoder.encode("https://www.daraz.com.np/computing-projectors/nec/", "UTF-8");
        String deurl = URLDecoder.decode(url1);
        System.out.println(deurl);
        
    }

    
}
