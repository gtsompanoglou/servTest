import java.net.Socket;
import java.net.SocketAddress;

public class Client {
    public static void main(String[] args) {
        int sport=Ref.serPort;
        try{
            Socket cls =new Socket(Ref.serAd, sport);
            System.out.println("hello from client");
            cls.connect(Ref.serAd);
            cls.close();
        }catch(Exception ge){
            ge.printStackTrace();
        }
    }//end of main
}//end of 
