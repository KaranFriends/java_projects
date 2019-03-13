import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mixi
{
    public static void main(String[] args) throws IOException
    {
        int xx;
        int n,k;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        xx=Integer.parseInt(br.readLine());
        String[] ss,s;
        int flag = 0,check=0;
        int x = 0, y = 0;
        while(xx>0)
        {
            s = br.readLine().split(" ");
            n = Integer.parseInt(s[0]);
            k = Integer.parseInt(s[1]);
            ss = br.readLine().split(" ");
            flag=0;
            check=0;
            x=0;
            y=0;
            for (String q : ss) {
                if (flag == 0) {
                    x = x + Integer.parseInt(q);
                    flag = 1;
                    if (x >= k) {
                        System.out.println(1);
                        check=1;
                        break;
                    }
                } else {
                    y = y + Integer.parseInt(q);
                    flag = 0;
                    if (y >= k) {
                        System.out.println(2);
                        check=1;
                        break;
                    }
                }

            }
            if (x > y && check==0) {
                System.out.println(1);
            }
            else if(check ==0)
                System.out.println(2);
            xx--;
        }
    }
}
