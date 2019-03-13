import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by karanraj on 14-11-2017.
 */
class pro
{
    int burst_time;
    int wt;
    int tt;
    int priority;
    int num;
    pro(int burst_time,int priority,int num)
    {
        this.burst_time=burst_time;
        this.priority=priority;
        this.num=num;
    }
}
public class priority
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of processes");
        n=sc.nextInt();
        ArrayList<pro> al=new ArrayList<pro>();
        PriorityQueue<pro> pq=new PriorityQueue<pro>(n, new Comparator<pro>()
        {
            public int compare(pro p1,pro p2)
            {
                return p1.priority-p2.priority;
            }
        });
        int bt,p,counter=0;
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the burst time of process P"+i);
            bt=sc.nextInt();
            System.out.println("enter the priority of process P"+i);
            p=sc.nextInt();
            pq.add(new pro(bt,p,i));
        }
        while(!pq.isEmpty())
        {
            pq.peek().wt=counter;
            counter+=pq.peek().burst_time;
            pq.peek().tt=counter;
            System.out.println("P"+pq.peek().num+"\t"+pq.peek().wt);
            al.add(pq.poll());
        }
        System.out.println("process\twaiting time\tturnaround time");
        for (pro pro12 : al)
        {
            System.out.println("P"+pro12.num+"\t"+pro12.wt+"\t"+pro12.tt);
        }
    }
}