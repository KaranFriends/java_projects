import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Hmappy2
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String ss=br.readLine();
        int t = Integer.parseInt(ss);
        long ans=0;

        while(t-->0)
        {
            String st1[] = br.readLine().split(" ");
            long[] int1 = Arrays.asList(st1).stream().mapToLong(Long::parseLong).toArray();

            long e = int1[0] / int1[1];
            long f = int1[0] / int1[2];
            long g = int1[0] / (int1[1] * int1[2]);

            if((int1[1]%int1[2])==0 || (int1[2]%int1[1])==0)
            {
                ans = e - f;
                ans=ans<0?-ans:ans;
            }
            else
            {
                ans = e + f - (2 * g);
            }
            if(ans>=int1[3])
            {
                System.out.println("Win");
            }
            else
            {
                System.out.println("Lose");
            }
            ans=0;

        }
    }
}
