import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TABLET
{
    static class obj
    {
        int height;
        int breath;
        int price;
        obj(int breath,int height,int price)
        {
            this.breath=breath;
            this.height=height;
            this.price=price;
        }
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int i=Integer.parseInt(br.readLine());
        while(i-->0)
        {
            String i1[]=br.readLine().split(" ");
            int n=Integer.parseInt(i1[0]);
            int b=Integer.parseInt(i1[1]);
            //ArrayList<obj> i11= new ArrayList<obj>();
            PriorityQueue<obj> pq =new PriorityQueue<obj>(new Comparator<obj>() {
                @Override
                public int compare(obj obj, obj t1) {
                    int i=obj.breath*obj.height;
                    int ii=t1.height*t1.breath;
                    return(ii-i);
                }
            });
            while(n-->0)
            {
                String s1[]=br.readLine().split(" ");
                if(Integer.parseInt(s1[2])<=b)
                {
                    pq.add(new obj(Integer.parseInt(s1[0]), Integer.parseInt(s1[1]), Integer.parseInt(s1[2])));
                    //i11.add(new obj(Integer.parseInt(s1[0]), Integer.parseInt(s1[1]), Integer.parseInt(s1[2])));
                }
            }

            if(pq.isEmpty())
            {
                System.out.println("no tablet");
            }
            else
            {
                System.out.println(pq.peek().breath*pq.peek().height);
            }
            /*while(!pq.isEmpty())
            {
                System.out.print(pq.poll().price);
            }*/
        }
    }
}
