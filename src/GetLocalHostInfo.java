import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetLocalHostInfo {
    public static void main(String[] args) {
        try {
            InetAddress myAddress = InetAddress.getLocalHost();
            System.out.println("Hostname: " + myAddress.getHostName());
            System.out.println("Host IP: " + myAddress.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Couldn't find the local address.");
        }
    }
}
