import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        int sport=Ref.serPort;
        try{
            if(args.length!=1){
                System.out.println("enter server Port !! ");
                System.exit(-1);
            }
            Scanner scan = new Scanner(System.in);
            //Socket cls =new Socket(Ref.serAd, sport);
            Socket cls = new Socket(Ref.serAd,Integer.parseInt(args[0]));
            System.out.println("SADR: "+Ref.serAd);
            System.out.println("SPORT: "+ sport);
            System.out.println("hello from client");
            PrintWriter out = new PrintWriter(cls.getOutputStream(),true);
             BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            
            while(true){
                    String line =new String();
                    System.out.println("Enter your Command:");
                    line=bf.readLine();
                    System.out.println(line);
                        if(line.equals("exit")){break;}
                    out.print(line);
                    //out.flush();
                }
            out.close();
            cls.close();
        }catch(Exception ge){
            ge.printStackTrace();
        }
    }//end of main
}//end of 
