import java.util.*;


public class compare implements Comparable<compare>
{
    String name;
    int a;
    compare(String n,int aa)
    {
        name=n;
        a=aa;
    }
    public int compareTo(compare tl)
    {
        return Integer.compare(a,tl.a);
    }
}

class karan
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<compare> al=new ArrayList<compare>();
        TreeMap<Integer,compare> tm = new TreeMap<Integer,compare>();

        String ss="";
        int y;
    /*     for(int i=0;i<2;i++)
        {
            ss=sc.next();
            y=sc.nextInt();
            al.add(new compare(ss,y));
        }
    */
        for(int i=0;i<2;i++)
        {
            ss=sc.next();
            y=sc.nextInt();
            tm.put(y,new compare(ss,i));
        }

//        Set<compare> sse= (Set<compare>) tm.keySet();

/*        for(compare c : sse) {
            System.out.println(c.a);
        }
        /*for(compare c : al)
            System.out.println(c.a+"\t");

        System.out.println("\n\n");

        for(int i=0;i<al.size();i++)
        System.out.println(al.get(i).a);

        System.out.println("\n\n");
        Collections.sort(al);

        for(int i=0;i<al.size();i++)
            System.out.println(al.get(i).a);

//        PriorityQueue<compare> pq=new PriorityQueue<compare>();
 //       pq.add(23);

 */
//    PriorityQueue<comparre> pq =;

    }
}