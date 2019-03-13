import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by root on 7/11/17.
 */
public class producerConsumer extends Thread
{
    public static void main(String[] args) {
    pc p1=new pc();
    }
}
class pc extends Thread
{
    int n;
    ArrayList<Integer> al=new ArrayList();
    pc()
    {
        Scanner sc=new Scanner(System.in);
        Thread t1=new Thread(this);
        Thread t2=new Thread(this);
        t1.setName("consumer");
        t2.setName("producer");
        System.out.println("enter size of buffer");
        n=sc.nextInt();
        t1.start();
        t2.start();
    }
    public void run()
    {
        if(Thread.currentThread().getName()=="consumer") {
            while(true){try {
                Thread.sleep(4000);
                f1();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }}
        if(Thread.currentThread().getName()=="producer")
        {while(true){
            try {
                Thread.sleep(4000);
                f2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }        }

    }}
    public synchronized void f1()
    {
        try {
                if (al.size() > 0) {
                    System.out.println("the item is being consumed");
                    al.remove(0);
                    System.out.println(al);
                } else
                    System.out.println("the buffer is empty");
            }
         catch (Exception e) {
            System.out.println("exception generated in consumer");
        }

    }
    public synchronized void f2()
    {
        try {
                if(al.size()<=n)
                {
                    System.out.println("the item is being produced");
                    al.add(1);
                    System.out.println(al);
                }
                else
                    System.out.println("the buffer is full");
        }
        catch (Exception e) {
            System.out.println("exception generated in producer");
        }
    }

}
