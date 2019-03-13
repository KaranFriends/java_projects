import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DEPCHEF
{
   static class chef
   {
       int attack;
       int defence;
       int value;
       chef(int attack,int defence,int value)
       {
           this.attack=attack;
           this.defence=defence;
           this.value=value;
       }
   }
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int tt= Integer.parseInt(br.readLine());
            ArrayList<chef> ar=new ArrayList<chef>();
            int[] int1 = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
            int[] int2 = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();

            PriorityQueue<chef> pq=new PriorityQueue<>(new Comparator<chef>() {
                @Override
                public int compare(chef chef, chef t1) {
                    return (int) (t1.defence-chef.defence);
                }
            });

            int e=0;
            while(e<tt)
            {
                if(e==0)
                {
                    ar.add(new chef(int1[0],int2[0],int1[1]+int1[tt-1]));
                }
                else if(e==tt-1)
                {
                    ar.add(new chef(int1[e],int2[e],int1[0]+int1[e-1]));
                }
                else
                {
                    ar.add(new chef(int1[e],int2[e],int1[e+1]+int1[e-1]));
                }
                    e++;
            }

     /*       for(chef chh : ar)
            {
                System.out.println("attack "+chh.attack+"  defence  "+chh.defence+" value "+chh.value);
            }
*/
            for(chef rr : ar)
            {
                if(rr.defence > rr.value)
                {
                    pq.add(rr);
                }
            }

            /*
            while(pq.isEmpty())
            {
                System.out.println(pq.peek().defence+pq.peek().attack+pq.poll().value);
            }
            */
            if(pq.isEmpty())
            {
                System.out.println("-1");
            }
            else {
                System.out.println(pq.peek().defence);
            }

        }
    }
}
