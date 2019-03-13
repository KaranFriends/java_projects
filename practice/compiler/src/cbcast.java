import java.io.*;
import java.util.*;

public class cbcast
{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter number of processes");
        int n= Integer.parseInt(br.readLine());
        System.out.println("enter the time stamps sequentially");

        HashMap l2=new HashMap();
        int y=0;
        while(y<n)
        {
            List l1=new ArrayList<Integer>();
            String st[]=br.readLine().split(" ");
            for (String l : st)
            {
                l1.add(Integer.parseInt(l));
            }
            l2.put(y,l1);
            y++;
        }

        System.out.println("enter the reciever and sender process number");
        int i= Integer.parseInt(br.readLine());
        int j= Integer.parseInt(br.readLine());

        List ll = (List<Integer>) l2.get(i);
        List lll= (List<Integer>) l2.get(j);

        int flag=0;
        if((Integer.parseInt(ll.get(i).toString()))==(Integer.parseInt(lll.get(i).toString())+1))
        {
            for (int k=0;k<n;k++)
            {
                if(k==i)
                {
                    continue;
                }
                if(Integer.parseInt(ll.get(i).toString())>(Integer.parseInt(lll.get(j).toString())))
                {
                    System.out.println("there is fault");
                    flag++;
                    break;
                }
            }
            if(flag==0)
            System.out.println("it is possible");
        }
        else
        {
            System.out.println("there is fault");
        }
    }
}
