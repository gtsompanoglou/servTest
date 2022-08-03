import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class App {
    public static void main(String[] args) throws Exception {
        int servPort= Ref.serPort;
        System.out.println("Hello, World!");
            try{
                ServerSocket ss = new ServerSocket(servPort);
                Socket cls = new Socket();
                cls.setReuseAddress(true);
                ss.setReuseAddress(true);
                Ref.serAd=ss.getInetAddress().toString();

                InputStreamReader insr = new InputStreamReader(cls.getInputStream());
                BufferedReader br = new BufferedReader(insr);
                System.out.println(ss.getInetAddress());

                    while(Ref.servListen==true){
                        String line;
                        line=br.readLine();
                        System.out.println(line);
                        if(line.equals("shut")){
                            Ref.servListen=false;
                            break;
                        }
                    }//end of while
                insr.close();
                br.close();
                cls.close();
                ss.close();
            }catch(Exception ge){
                ge.printStackTrace();
            }
    }//end of main 
}//end of class
