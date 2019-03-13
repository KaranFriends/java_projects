import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by karanraj on 15-07-2018.
 */
public class chn15a
{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i=Integer.parseInt(br.readLine());
        int n=0,k=0,sum=0;
        String[] s;


        while(i>0)
        {
            s=br.readLine().split(" ");
            n=Integer.parseInt(s[0]);
            k=Integer.parseInt(s[1]);
            s=br.readLine().split(" ");
            sum=0;
            for(String ss : s)
            {
                if((Integer.parseInt(ss)+k)%7==0)
                {
                    sum=sum+1;
                }
            }
            System.out.println(sum);
            i--;
        }
    }
}
