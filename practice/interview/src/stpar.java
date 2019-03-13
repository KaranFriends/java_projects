import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by karanraj on 16-07-2018.
 */
public class stpar
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> qq=new LinkedList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        List<Integer> ll=new Stack<Integer>();

        boolean flag = true;
        int size;
        while(true) {
            size=Integer.parseInt(br.readLine());
            if(size==0)
            {
                return;
            }
            String[] s=br.readLine().split(" ");
            ll.clear();
            flag=true;
            for (String ss : s) {
                pq.add(Integer.parseInt(ss));
                qq.add(Integer.parseInt(ss));
            }


            while (qq.isEmpty() && pq.isEmpty()) {
                if (pq.peek() == qq.peek()) {
                    qq.poll();
                    pq.poll();
                } else if (((Stack<Integer>) ll).peek() == pq.peek()) {
                    ((Stack<Integer>) ll).pop();
                    pq.poll();
                } else if (qq.peek() != pq.peek()) {
                    ((Stack<Integer>) ll).push(qq.poll());
                } else {
                    flag = false;
                    break;
                }

            }
            if (flag == true) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }

        }

    }

}
