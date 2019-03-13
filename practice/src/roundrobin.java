import gangchart.process;
import java.util.ArrayList;
import java.util.Scanner;

public class roundrobin
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of processes");
        int n;
        int ar,bt,duration=0,counter=0;
        n=sc.nextInt();
        System.out.println("enter duration");
        duration=sc.nextInt();
        ArrayList<process> al = new ArrayList<process>();
        ArrayList<process> al1 = new ArrayList<process>();
        for(int i=0;i<n;i++)
        {
            System.out.println("enter burst time for "+i+" Process");
            bt=sc.nextInt();
            al.add(new process(0, bt,i));
        }

        while(!al.isEmpty())
        {
            for(int i=0;i<n;)
            {
              if (al.get(i).burst >= duration)
              {
                  al.get(i).burst = al.get(i).burst-duration;
                  al.get(i).wt =al.get(i).wt+counter-al.get(i).tt;
                  counter+=duration;
                  al.get(i).tt = counter;
                  System.out.println("P" + al.get(i).num + "\t" + counter);
                  i++;
              }
              else
              {
                  al.get(i).wt =al.get(i).wt+counter-al.get(i).tt;
                  counter = al.get(i).burst + counter;
                  al.get(i).tt = counter;
                  al.get(i).burst = 0;
                  al1.add(new process(al.get(i).wt,al.get(i).tt,al.get(i).num,0));
                  System.out.println("P" + al.get(i).num + "\t" + counter);
                  al.remove(i);
                  n--;
              }
          }
        }
        System.out.print("Process\twaiting\tturnaround");
        System.out.println();
        for(process p :al1)
        {
            System.out.println("P"+p.num+"\t"+p.wt+"\t"+p.tt);
        }

    }
}
