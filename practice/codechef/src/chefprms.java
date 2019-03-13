import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class chefprms
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String[] e=br.readLine().split(" ");
        int[] num= Arrays.asList(e).stream().mapToInt(Integer::parseInt).toArray();
        boolean flag=true;
        int days=0;
        int init=1,fin=num[0];
        int sum=num[0];
        while(flag)
        {
            System.out.println(init);
            System.out.println(fin);
            System.out.println(days);
            if(fin>=num.length-1)
            {
                flag=false;
                continue;
            }
            for(int i=init;init<=fin;i++)
            {
                sum=sum+num[i];
            }
            init=fin+1;
            fin=fin+sum;
            days++;

        }
        System.out.println(days);

    }
}
