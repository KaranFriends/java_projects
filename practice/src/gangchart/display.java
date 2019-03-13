package gangchart;

import java.util.ArrayList;

/**
 * Created by root on 9/10/17.
 */
public class display
{
     public void show(ArrayList<process> ar,int n)
     {
         float avgwt=0;
         float avgtt=0;
         System.out.println("Process number waiting time turnout time");
         for(process po : ar) {
             System.out.println("P"+po.num + "\t\t\t\t" + po.wt + "\t\t\t\t" + po.tt);
             avgwt=avgwt+po.wt;
             avgtt=avgtt+po.tt;
         }

         for(int i=0;i<ar.size();i++)
         System.out.print("--------");
         System.out.println();
         for(process pp:ar)
             System.out.print("|P"+pp.num+"\t\t");
         System.out.print("|"+"\n");
         for(int i=0;i<ar.size();i++)
             System.out.print("--------");
         System.out.println();
         System.out.print("0"+"\t\t");
         for(process pp:ar)
             System.out.print(pp.tt+"\t\t");
         System.out.println();

         System.out.println("the average waiting time is  "+avgwt/n);
         System.out.println("the turn aroundtime is  "+avgtt/n);

     }
}