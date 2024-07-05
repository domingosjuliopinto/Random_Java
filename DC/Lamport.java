import java.io.*;
class Lamport
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int p[],n,st,en,tlog[][],cnt[];
String t[][];
System.out.println("Enter the number of processes");
n=Integer.parseInt(br.readLine());
p=new int[n];
tlog=new int[n][10];
cnt=new int[n];
t=new String[n][10];
for(int i=0;i<n;i++)
{

p[i]=0;
cnt[i]=0;

}
System.out.println("Enter the messages sent(0 0 to exit)");
while(true)
{

System.out.println("From process:");
st=Integer.parseInt(br.readLine());
System.out.println("To process:");
en=Integer.parseInt(br.readLine());
if(st==0 && en==0)
break;
p[st-1]+=1;
tlog[st-1][cnt[st-1]]=p[st-1];
t[st-1][cnt[st-1]++]="Send to process "+en;
p[en-1]=((p[en-1]+1)>(p[st-1]+1))?(p[en-1]+1):(p[st-1]+1);
tlog[en-1][cnt[en-1]]=p[en-1];
t[en-1][cnt[en-1]++]="Receive from process "+st;

}
for(int i=0;i<n;i++)
{

System.out.println("\nFor process "+(i+1)+",the timestamps are\n");
System.out.println("Event\t\t\t\tTime\n");
for(int j=0;j<cnt[i];j++)
System.out.println(t[i][j]+"\t\t"+tlog[i][j]);

}
}
}