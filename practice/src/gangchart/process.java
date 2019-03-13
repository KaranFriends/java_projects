package gangchart;

/**
 * Created by root on 10/10/17.
 */
public class process
{
    public int num;
    public int arr_time;
    public int burst;
    public int wt;
    public int tt;
    public process(int arr_time, int burst, int num)
    {
        this.arr_time=arr_time;
        this.burst=burst;
        this.num=num;
        this.wt=0;
        this.tt=0;
    }
    public process(){}
    public process(int wt, int tt, int num,int n)
    {
        this.num=num;
        this.wt=wt;
        this.tt=tt+n;
        this.arr_time=0;
        this.burst=0;
    }
}