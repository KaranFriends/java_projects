import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class salary
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i=Integer.parseInt(br.readLine());
        int n=0;
        String[] s;
        int min,sum;
        while(i>0)
        {
            n=Integer.parseInt(br.readLine());
            s=br.readLine().split(" ");
            min=Integer.parseInt(s[0]);
            sum=0;
            for(String ss : s)
            {
                if(min>Integer.parseInt(ss))
                {
                    min=Integer.parseInt(ss);
                }
                sum=sum+Integer.parseInt(ss);
            }
            sum=sum-(n*min);
            System.out.println(sum);
            i--;
        }
    }
}
