import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
//import java.util.Comparator;
//import java.util.PriorityQueue;

public class MAGICJAR
{
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0) {
            int tt = Integer.parseInt(br.readLine());
            //PriorityQueue<Long> pq=new PriorityQueue<Long>((i, t1) -> (int)(t1-i));
            long[] int1 = Arrays.asList(br.readLine().split(" ")).stream().mapToLong(Long::parseLong).toArray();
            long sum=0;
            for(long r:int1)
            {
                r=r-1;
                sum=sum+r;
            }
            System.out.println(sum+1);
            /*for(Long e : int1)
            {
                pq.add(e);
            }*/

            //System.out.println(pq.peek().intValue());

            /*while(!pq.isEmpty())
            {
                System.out.println(pq.poll().intValue());
            }
            */
        }
    }
}