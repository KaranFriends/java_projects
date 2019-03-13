import gangchart.*;
import java.util.*;

/**
 * Created by root on 10/10/17.
 */

public class pro2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of processes");
        int n;
        int ar,bt,counter=0;
        n=sc.nextInt();
        ArrayList<process> al = new ArrayList<process>();

        PriorityQueue<process> pq=new PriorityQueue<process>(n,new Comparator<process>() {
            @Override
            public int compare(process pro, process t1) {

                return pro.arr_time-t1.arr_time;
            }
        });
        for(int i=1;i<=n;i++)
        {
            System.out.println("enter arrival time for "+i+" Process");
            ar=sc.nextInt();
            System.out.println("enter burst time for "+i+" Process");
            bt=sc.nextInt();

            pq.add(new process(ar, bt,i));
        }

        PriorityQueue<process> pq1=new PriorityQueue<process>(n,new Comparator<process>() {
            @Override
            public int compare(process t2, process t1) {

                return t2.burst-t1.burst;
            }
        });

        process pp;

        while(!pq.isEmpty())
        {

            if(pq.peek().arr_time<=counter)
            {
                pq1.add(pq.poll());
            }
            System.out.println("P"+pq1.peek().num+"\t"+counter);
            counter++;
            pp=pq1.poll();
            pp.burst=pp.burst-1;
            pq1.add(pp);
            if(pq1.peek().burst==0)
            {
                pp=pq1.peek();
                pp.tt=counter;
                //pp.wt=pp.tt-pp.burst;
                System.out.println("P"+pq1.peek().num+"\t"+counter);
                pq1.poll();
            }
        }
        while(!pq1.isEmpty())
        {
            System.out.println("P"+pq1.peek().num+"\t"+counter);
            pp=pq1.peek();
            pp.wt=counter;
            counter = counter + pq1.peek().burst;
            pp.tt=counter;
            System.out.println("P"+pq1.peek().num+"\t"+counter);
            pq1.poll();

        }
    }
}
