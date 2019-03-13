import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ARTBALAN
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());

        while(t-->0)
        {
            String st1[]=br.readLine().split("");
            TreeMap<String,Integer> st2= new TreeMap<String, Integer>();
            for(String s:st1)
            {
                st2.put(s,Collections.frequency(Arrays.asList(st1),s));
            }
            System.out.println(st2);
            int n= st1.length;
            int e=st2.size();
            int y=0;
            PriorityQueue<Integer> pq=new PriorityQueue<Integer>(new Comparator() {
                @Override
                public int compare(Object o, Object t1) {
                    return(Integer.parseInt((String) o)-Integer.parseInt((String) t1));
                }
            });
            int i=1;
            while(e-->0)
            {
                y=n/i;
                if(i==1)
                {
                    pq.add(e);
                }
                else
                {
                    
                }
                i++;
            }
        }
    }
}
