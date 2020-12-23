

import java.io.*;
import java.net.*;
public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss=new ServerSocket(6666);
        Socket s= ss.accept();
        DataInputStream din= new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        System.out.println("server is online.");
        String str=new String();
        while(!str.equals("stop")){
            str=din.readUTF();
            String str1=str.toUpperCase();
            System.out.println("\n Client says:" +str);
            dout.writeUTF(str1);
        }
        ss.close();
        s.close();
        
    }
    
}

