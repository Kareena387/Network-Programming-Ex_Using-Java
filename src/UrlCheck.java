import java.net.MalformedURLException;
import java.net.URL;

public class UrlCheck {
    public static void main(String[] args) throws MalformedURLException {
        String baseurl = "https://samriddicollege.edu.np/wp-content/uploads/2019/09/";

        String relativeUrl = "Networking_Programming-Syllabus.zip";

        URL baseUrl = new URL(baseurl);
        URL resolvedRelativeUrl = new URL(baseUrl,relativeUrl);
        System.out.println("BaseUrl:"+ baseUrl);
        System.out.println("RelativeUrl Url:" + relativeUrl);
        System.out.println("resolvedRelativeUrl Url:" + resolvedRelativeUrl);

}
}
    

