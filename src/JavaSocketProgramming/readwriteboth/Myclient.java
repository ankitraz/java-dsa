package JavaSocketProgramming.readwriteboth;
import java.io.*;
import java.net.*;

public class Myclient {
    public static void main(String[] args) throws  Exception{
        ServerSocket ss = new ServerSocket(3333);
        Socket s = ss.accept();
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String str = "", str2 = "";
        while (!str.equals("Stop")){
//            str.din.re
        }
    }
}
