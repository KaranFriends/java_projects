import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class second
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split(" ");
        int total=1;
        for(String ss : s)
        {
            total=total*Integer.parseInt(ss);
        }
        for(String ss : s)
        {
            System.out.print(total/Integer.parseInt(ss)+" ");
        }
        }
}
