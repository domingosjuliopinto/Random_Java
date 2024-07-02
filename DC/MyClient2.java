import java.net.*;
import java.io.*;
class MyClient2{
    public static void main(String args[])throws Exception{
String serverName = "192.168.3.169";       
Socket r=new Socket(serverName,9999);
        DataInputStream dins=new DataInputStream(r.getInputStream());
        DataOutputStream douts=new DataOutputStream(r.getOutputStream());
        BufferedReader brs=new BufferedReader(new InputStreamReader(System.in));
        String str3="",str4="";
        while(!str3.equals("stop")){
            str3=brs.readLine();
            douts.writeUTF(str3);
            douts.flush();
            str4=dins.readUTF();
            System.out.println("Server says: "+str4);
        }
        douts.close();
        r.close();
    }
}