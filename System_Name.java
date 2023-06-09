import java.net.InetAddress;
public class System_Name {
    public static void main(String[] args)
    {
        try {
 
            String SystemName
                = InetAddress.getLocalHost().getHostName();
 
            System.out.println("System Name : "
                               + SystemName);
        }
        catch (Exception E) {
            System.err.println(E.getMessage());
        }
    }
}