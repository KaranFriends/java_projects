import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class onezero
{
    static int run(int a)
    {
        if(a==1)
        {
            return 2;
        }
        else {
            return( run(a - 1) / 2 + 2 * (run(a - 1) - (run(a - 1) / 2)));
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a="";
        int b=0;
        System.out.println("type break to quit");
        while(true) {
            a=br.readLine();if(a.equals("break")) {
                break;
            }
            b=Integer.parseInt(a);
         b=run(b);
         System.out.println(b);

        }
    }

}
