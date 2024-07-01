import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IpAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an IP address: ");
        String ipAddress = scanner.nextLine();

        try {
            InetAddress inetAddress = InetAddress.getByName(ipAddress);

            if (inetAddress.isLoopbackAddress()) {
                System.out.println(ipAddress + " is a loopback address.");
            } else if (inetAddress.isSiteLocalAddress()) {
                System.out.println(ipAddress + " is a private address.");
            } else if (inetAddress.isMulticastAddress()) {
                System.out.println(ipAddress + " is a multicast address.");
            } else {
                System.out.println(ipAddress + " does not fall into any specific category.");
            }
        } catch (UnknownHostException e) {
            System.out.println("Invalid IP address.");
        } finally {
            scanner.close();
        }
    }
}
