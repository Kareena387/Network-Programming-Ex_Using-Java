import java.net.URI;

public class uri_types {
    public static void main(String[] args) throws Exception{
        String uribase = "https://www.xml.com/";
        String urirelative = "/student-clubs";
        URI uriBase = new URI(uribase);

        //create()method
        URI uri = URI.create(uribase);
        System.out.println("Base URI =" +uriBase.toString());
        URI uriRelative= new URI(urirelative);
        System.out.println("Relatuve URI = "+ uriRelative.toString());

        //resolve method
        URI uriResolved = uriBase.resolve(urirelative);
        System.out.println("Resolved URI=" +uriResolved.toString());


        
    }
    
}
