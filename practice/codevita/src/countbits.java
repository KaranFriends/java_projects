import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class countbits
{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String[] s=br.readLine().split(",");
        List<Integer> i=new ArrayList<Integer>();
        String o;
        int count=0;
        for(String ss:s)
        {
            o=Long.toBinaryString(Long.parseLong(ss));
            count=0;

            for(String r:o.split(""))
            {
                if(r.equals("1"))
                {
                    count++;
                }
            }
            i.add(count);
        }
        int count11=0;
        for(int io=0;io<i.size();io++)
        {
            for(int iu=io;iu<i.size();iu++)
            {
                if(i.get(io) > i.get(iu))
                {
                    count11++;
                }
            }
        }
        System.out.println(count11);
    }
}
