import java.util.*;
public class ChefSubarrays
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        int sum=0,pro=1,count=0,l=0;
        for(int i=testcase;i>0;i--)
        {
            count=0;
            l=sc.nextInt();
            int a[]=new int[l];
            for(int j=0;j<l;j++)
            {
                a[j]=sc.nextInt();
            }
            for(int j=0;j<l;j++)
            {
                sum=a[j];
                pro=a[j];
                for(int k=j+1;k<l;k++)
                {
                    if(sum==pro)
                    {
                        count++;
                    }
                    sum=sum+a[k];
                    pro=pro*a[k];
                }
                if(sum==pro)
                {
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
