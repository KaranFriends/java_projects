import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.*;


public class hello
{
    public static void main(String[] args)
    {
        TreeMap<Integer,Float> tr = new TreeMap();
        TreeSet ts=new TreeSet();

        System.out.println("\nenter number of processes");
        int p;
        Scanner sc =new Scanner(System.in);
        p=sc.nextInt();
        float i;
                int j;
        int n=1;
        float temp=0;
        while(n<=p)
        {
            System.out.println("\nenter the burst time of " + n + " processes");
            i = sc.nextFloat();
            System.out.println("\nenter the arrival time of " + n + " processes");
            j = sc.nextInt();
            temp=(float)n/10;
            temp=i+temp;
            tr.put(j,temp);
            n++;
        }

        int count=0;
        count=Integer.parseInt(tr.get(tr.firstKey()).toString());
        float qq=0;
        for(int l=2;l<=p;l++)
        {

            for(int k=l;k<=p;k++)
            {
                if(count>Integer.parseInt(tr.get(l).toString()))
                {
                    ts.add(tr.get(l));
                }
                else
                    break;
            }

            qq=Float.parseFloat(ts.first().toString());
            qq=qq*10;

            System.out.println(qq);
            count=Integer.parseInt(ts.first().toString())+count;
            ts.pollFirst();
        }

    }
}
