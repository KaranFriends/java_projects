import java.io.*;

public class CNOTE {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i=Integer.parseInt(br.readLine());
        String[] s;
        int x,y,k,n;
        int[] pc=new int[2];
        int counter=0;
        boolean flag=false;
        while(i>0)
        {
            counter=0;
            flag=false;
            s=br.readLine().split(" ");
            x=Integer.parseInt(s[0]);
            y=Integer.parseInt(s[1]);
            k=Integer.parseInt(s[2]);
            n=Integer.parseInt(s[3]);
            if(y<x)
            {
                while(counter<n)
                {
                    s=br.readLine().split(" ");
                    pc[0]=Integer.parseInt(s[0]);
                    pc[1]=Integer.parseInt(s[1]);
                    if(pc[0]>(y-x) && pc[1]<=k)
                    {
                        System.out.println("LuckyChef");
                        flag=true;
                        break;
                    }
                }
                if(flag=false)
                {
                    System.out.println("UnluckyChef");
                }
            }

            i--;
        }
    }
}
