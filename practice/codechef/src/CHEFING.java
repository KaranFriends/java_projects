import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CHEFING
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int e=Integer.parseInt(br.readLine());
        while(e-->0)
        {
            int ee=Integer.parseInt(br.readLine());
            String[] st1=new String[ee];
            int f=0;
            while(f<ee)
            {
                st1[f]=br.readLine();
                f++;
            }

            ArrayList ei=new ArrayList();
            f=0;
            while(f<ee)
            {
                     Set<String> ii=new HashSet(Arrays.asList(st1[f].split("")));
                //   System.out.println(ii);
                     ei.add(ii);
                     f++;
            }
            f=0;
            while(f<(ee-1))
            {
                Set er= (Set) ei.get(f+1);
                er.retainAll((Set)ei.get(f));
                f++;
            }

            Set et=(Set)ei.get(ee-1);
            System.out.println(et.size());
        }
    }
}
