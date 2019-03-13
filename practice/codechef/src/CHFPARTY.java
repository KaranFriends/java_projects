import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CHFPARTY
{
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int i=Integer.parseInt(br.readLine());
        while(i-->0)
        {
            Queue<Integer> pq= new PriorityQueue<Integer>(new Comparator() {
                @Override
                public int compare(Object o, Object t1) {
                    return (Integer.parseInt(o.toString())-Integer.parseInt(t1.toString()));
                }
            });
            int n=Integer.parseInt(br.readLine());
            int count=0;
            int[] int1 = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
            for(int r:int1)
            {
                pq.add(r);
            }
            while(n-->0)
            {

                if(pq.peek().equals(0))
                {
                    count++;
                    //System.out.println(pq.poll());
                    pq.poll();
                }
                else if(pq.peek()<=count)
                {
                    count++;
                    //System.out.println(pq.poll());
                    pq.poll();
                }
                else
                {
                    break;
                }
            }
            System.out.println(count);
        }

    }
}
