import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class first
{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split(" ");
        int b=Integer.parseInt(br.readLine());

        List<Integer> ll=new ArrayList<Integer>();
        List<Integer> lll=new ArrayList<Integer>();

        for(String ss : s)
        {
            ll.add(Integer.parseInt(ss));
        }

        Collections.sort(ll);

        for(Integer o:ll)
        {
            lll.add(b-o);
        }
        System.out.println(ll);
        System.out.println(lll);
        boolean flag = false;
        for(Integer o:ll)
        {
            for(Integer oo:lll)
            {
                if((o-oo)==0)
                {
                    int r=b-o;
                    System.out.println(o+" "+r);
                    flag=true;
                }
            }
        }
        if(flag==false)
        {
            System.out.println("no");
        }
        else
        {
            System.out.println("yes");
        }

    }
}
