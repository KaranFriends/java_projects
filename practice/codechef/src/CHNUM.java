import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static sun.swing.MenuItemLayoutHelper.max;

public class CHNUM {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t>0)
        {
         int tt=Integer.parseInt(br.readLine());
         String st[]=br.readLine().split(" ");
         int positive=0,negative=0;//,zero=0;
         int temp=0;
         //int size=st.length;
         for(String s : st)
         {
             temp=Integer.parseInt(s);
             /*if(temp==0)
             {
                 zero++;
             }
             */
             if (temp>=1)
             {
                 positive++;
             }
             else
             {
                 negative++;
             }
         }
         if(negative==0)
         {
             System.out.println(positive+" "+positive);
         }
         else if (positive==0)
         {
             System.out.println(negative+" "+negative);
         }
         else
             System.out.println(Math.max(positive,negative)+" "+Math.min(positive,negative));
         t--;
        }
    }
}
