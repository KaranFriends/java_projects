import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class base6
{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        String[] s=br.readLine().split(",");
        List<Integer> i=new ArrayList<Integer>();
        String base;
        int sum=0;
        for(String ii : s)
        {
            base=Integer.toString(Integer.parseInt(ii),6);
            sum=0;
            for(String bb : base.split(""))
            {
                sum=sum+Integer.parseInt(bb);
            }
            i.add(sum);
        }
        int count=0;

         for(int ii=0;ii<(i.size()-1);ii++)
        {
            //System.out.println(i);
            //System.out.println(ii);
            if(i.get(ii) > i.get(ii+ 1))
            {
                int e=i.get(ii);
                //System.out.println(i);
                i.add(ii,i.get(ii+1));
                //System.out.println(i);
                i.remove(ii+2);
                //System.out.println(i);
                i.add(ii+1,e);
                //System.out.println(i);
                i.remove(ii+1);
                //System.out.println(i);
                count++;
                ii=ii-2;
                if(ii<=0)
                {
                    ii=-1;
                }
            }
        }
        System.out.println(count);
        return;
    }
}
