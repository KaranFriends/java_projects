import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class stone
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String[] n=br.readLine().split(" ");
        String[] s=br.readLine().split(" ");

        int o=Integer.parseInt(n[0]);
        int oo=Integer.parseInt(n[1]);

        Integer[][] ii = new Integer[oo][2]; //array which stores range

        Integer[] iii = new Integer[o];//array which stores number

        for(int i=0;i<Integer.parseInt(n[1]);i++)
        {
            String[] e=br.readLine().split(" ");
            ii[i][0]=Integer.parseInt(e[0]);
            ii[i][1]=Integer.parseInt(e[1]);
        }

        for(int i=0;i<o;i++)
        {
            iii[i]=Integer.parseInt(s[i]);
        }

        Integer[] count=new Integer[oo];

        for(int j=0;j<oo;j++)
        {
            count[j]=0;
        }

        for(int i=0;i<o;i++)
        {
            for(int j=0;j<oo;j++)
            {
                if(ii[j][0]<=iii[i] && ii[j][1]>=iii[i])
                {
                    count[j]=count[j]+1;
                }
            }
        }
        for(int j=0;j<oo;j++)
        {
            System.out.println(count[j]);
        }
    }
}