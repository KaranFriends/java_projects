import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.*;
import gangchart.*;

class pro1
{
    static int counter;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of processes");
        int n;
        int ar,bt;
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

        counter=pq.peek().burst;
        process pp=pq.peek();
        pp.wt=0;
        pp.tt=counter;
        al.add(pp);
        //System.out.println(pq.poll().num);
        pq.poll();
        while(!pq.isEmpty())
        {
            if(pq.peek().arr_time<=counter)
            {
                pq1.add(pq.poll());
            }
            else
            {
                pp=pq1.peek();
                pp.wt=counter;
                counter = counter + pq1.peek().burst;
                pp.tt=counter;
                al.add(pq1.peek());
              //  System.out.println(pq1.poll().num);
                pq1.poll();
            }
        }
        while(!pq1.isEmpty())
        {
            pp=pq1.peek();
            pp.wt=counter;
            counter = counter + pq1.peek().burst;
            pp.tt=counter;
            al.add(pq1.peek());
           //System.out.println(pq1.poll().num);
            pq1.poll();
        }

        display dl=new display();
        dl.show(al,n);
    }

}