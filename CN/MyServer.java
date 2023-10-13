import java.net.*;
import java.io.*; 
class MyServer{
    public static void main(String args[])throws Exception{
        ServerSocket ss=new ServerSocket(6666);
        Socket s=ss.accept();
        Socket r=ss.accept();
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        DataInputStream dins=new DataInputStream(r.getInputStream());
        DataOutputStream douts=new DataOutputStream(r.getOutputStream());
        BufferedReader brs=new BufferedReader(new InputStreamReader(System.in));
        String str="",str2="",str3="",str4="";
        while(!str.equals("stop")){
            str=din.readUTF();
            System.out.println("client1 sys: "+str);
            str2=br.readLine(); dout.writeUTF(str2);
            dout.flush(); str3=dins.readUTF();
            System.out.println("client2 sys: "+str3);
            str4=brs.readLine();
            douts.writeUTF(str4);
            douts.flush();
        }
        din.close();
        s.close();
        dins.close();
        r.close();
        ss.close();
    }
}