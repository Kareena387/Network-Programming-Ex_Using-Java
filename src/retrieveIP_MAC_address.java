//retreive MAC Address and IP address

import java.io.*;
import java.net.*;

public class retrieveIP_MAC_address {
    public static void main(String[] args) throws IOException {
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println("IP Address:" +ip.getHostAddress());
        NetworkInterface network = NetworkInterface.getByInetAddress(ip);


        // get the MAC Address
         byte[] mac = network.getHardwareAddress();
         StringBuilder macAddress = new StringBuilder();

         for (int i = 0; i<mac.length; i++){
            macAddress.append(String.format("%02x%s", mac[i],(i<mac.length-1)?"-":""));
         }
         System.out.println("Mac Address:" + macAddress.toString());
         System.out.println(mac);
         
        
    }
    
}
