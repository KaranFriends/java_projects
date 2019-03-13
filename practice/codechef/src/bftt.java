import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bftt
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(br.readLine());
        int y=10;
        int e=0;
        while(true)
        {
            if(x/y==0)
            {
                break;
            }
            e++;
            y=y*10;
        }
            StringBuffer s=new StringBuffer();
            s.append(x);
            s.reverse();
            String[] ss=(s+"").split("");
            int flag=0;
            for(String ww:ss)
            {
                if(Integer.parseInt(ww)==3)
                {
                    flag++;
                    if(flag>=3)
                    {
                        break;
                    }
                }
            }
            if(flag==1)
            {

            }


    }
}
