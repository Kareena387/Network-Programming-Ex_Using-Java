import java.net.NetworkInterface;
public class Main {
    public static void main(String [] args) {
        try {
            NetworkInterface networkInterface = NetworkInterface.getByName("eth3");
            if(networkInterface!= null)
            {
                System.out.println("NIC Name.:" + networkInterface.getName());
                System.out.println("NIC Display Name:" + networkInterface.getDisplayName());
            }
            else{
                System.out.println("Network interface is not found");
            }
        }
        catch (Exception e){
            System.out.println("Fix this error");
        }
    }
}