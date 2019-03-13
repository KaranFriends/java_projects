package PACKAGE_NAME;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by root on 30/10/17.
 */
public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(3307);
        Socket s = ss.accept();
        DataInputStream din = new DataInputStream(s.getInputStream());
        System.out.println(s.getInetAddress().toString());
        int read;
        byte buf[] = new byte[1024];
        while ((read=din.read(buf))!=-1)
        {
            String s1 = new String(buf,0,read);
            System.out.println(s1);
        }
        din.close();
        s.close();ss.close();
    }

}
