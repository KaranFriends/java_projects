//SJF with preemption
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class GanttChart extends Frame{
    GanttChart obj;
    private int max;
    private ArrayList<String> ar;
    private ArrayList<Integer> ar1;
    public GanttChart(int max,ArrayList<String> ar,ArrayList<Integer> ar1)
    {
        this.max = max;
        this.ar=ar;
        this.ar1 = ar1;
        obj = this;
        //display();
        setTitle("Gantt Chart");
        setSize(800,800);
        repaint();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                obj.dispose();
            }
        });
    }
    public void paint(Graphics g)
    {
        g.drawLine(40,70,40,170);
        g.drawString("0",40,185);
        max = 700/(max+40);
        int x=40;
        for(int i=0;i<ar.size();i++)
        {
            g.drawString(ar.get(i),(ar1.get(i)*max+x+x)/2,100);
            g.drawLine(ar1.get(i)*max+x,170,ar1.get(i)*max+x,70);
            g.drawString(""+ar1.get(i),ar1.get(i)*max+x,185);
            x += ar1.get(i)*max;
        }
        g.drawLine(40,70,x,70);
        g.drawLine(40,170,x,170);
    }
    public void display()
    {
        obj.setVisible(true);
    }
}

public class SJF1
{
    private static class Process implements Comparable<Process>
    {
        int id,burst,arrival,completion,turnaround,waiting,prev_time;
        String name;
        Process(int id,String name,int burst,int arrival)
        {
            this.id=id;
            this.name = name;
            this.burst = burst;
            this.arrival = arrival;
            this.completion=0;
            this.turnaround=0;
            this.waiting=0;
            prev_time=0;
        }
        public int compareTo(Process o)
        {
            return arrival-o.arrival;
        }
    }
    static int bsearch(Process a[],int x)
    {
        int low=0,high=a.length-1,mid;
        if(x>=a[high].arrival)
            return high;
        else if(x<a[low].arrival)
            return -1;
        while(low<=high)
        {
            if(high-low<=1)
            {
                if(a[high].arrival>x)
                    return low;
                else
                    return high;
            }
            mid=(low+high)/2;
            if(a[mid].arrival<=x)
                low=mid;
            else
                high=mid-1;
        }
        return -1;
    }
    public static void main(String qa[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Process t[] = new Process[n];
        String s[];
        HashMap<Integer,Integer> h = new HashMap<>();
        ArrayList<Process> a1 = new ArrayList<>();
        ArrayList<String> a2 = new ArrayList<>();
        ArrayList<Integer> a3 = new ArrayList<>();
        int total=0;
        for(int i=0;i<n;i++)
        {
            s = br.readLine().split(" ");
            t[i] = new Process(Integer.parseInt(s[0]),s[1],Integer.parseInt(s[2]),Integer.parseInt(s[3]));
            total+=t[i].burst;
        }
        Arrays.sort(t);
        for (int i = 0; i < t.length; i++) {
            //System.out.println(t[i].name+" "+t[i].burst+" "+t[i].arrival);
            h.put(t[i].id,i);
        }
        PriorityQueue<Process> pr = new PriorityQueue<>(n, new Comparator<Process>() {
            @Override
            public int compare(Process process, Process t1) {
                return process.burst-t1.burst;
            }
        });

        pr.add(t[0]);
        int x=0,y=1,z;
        double wait_avg=0,turn_avg=0;
        Process obj;
        for(int j=0;j<total;j++)
        {
            obj = pr.peek();
            if(obj.prev_time==0)
            {
                obj.waiting+=(x-obj.prev_time-obj.arrival);
            }
            else
                obj.waiting+=(x-obj.prev_time);
            obj.turnaround += obj.waiting+1;
            obj.prev_time=x;
            x++;
            obj.burst--;
            pr.poll();
            if(obj.burst==0)
            {
                z = h.get(obj.id);
                t[z]=obj;
                turn_avg+=t[z].turnaround;
                wait_avg+=t[z].waiting;
                t[z].completion=x-1;
                a1.add(t[z]);
            }
            else
            {
                pr.add(obj);
            }
            a2.add(obj.name);
            a3.add(x-1);
            int index = bsearch(t,x);
            for (int i = y; i <=index; i++) {
                pr.add(t[i]);
            }
            y = index+1;
        }
        wait_avg/=n;
        turn_avg/=n;
        System.out.println("Average Waiting time : "+wait_avg);
        System.out.println("Average Turnaround time : "+turn_avg);
        System.out.println(a2);
        GanttChart g = new GanttChart(x,a2,a3);
        g.display();
        System.out.printf("%10s %10s %10s\n","Process name","Completion Time","Waiting Time");
        for (int i = 0; i < a1.size(); i++) {
            System.out.printf("%7s %9d %15d\n",a1.get(i).name,a1.get(i).completion,a1.get(i).waiting);
        }
    }
}
