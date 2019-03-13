import java.util.Scanner;

/**
 * Created by karanraj on 01-02-2018.
 */
public class Stringoperation
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        if(A.compareToIgnoreCase(B)>1)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1,A.length()).toLowerCase()+" "+B.substring(0,1).toUpperCase()+B.substring(1,B.length()).toLowerCase());
    }
}
