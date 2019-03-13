import java.util.ArrayList;
import java.util.Scanner;

public class code2
{
    public static void main(String[] args)
    {
        int q;
        Scanner sc = new Scanner(System.in);
        q=sc.nextInt();
        ArrayList ar= new ArrayList();
        for(int i=2;i<=q;i++)
        {
            if(prime(i))
            {
                ar.add(i);
            }
        }
        String s1,s2,s3;
        int count=0;
        for(int i=ar.size()-1;i>=0;i--)
        {
            s1=ar.get(i).toString();
            for(int j=ar.size()-1;j>=0;j--)
            {
                s2=ar.get(j).toString();
                s3=s1.concat(s2);
                if(prime(Integer.parseInt(s3)))
                {
                    count++;
                }
            }
        }
        System.out.println(count);

    }
    public static boolean prime(int x)
    {
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
                return false;
        }
        return true;
    }
}
