import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class digitaltime {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader((new InputStreamReader(System.in)));
        String s[]=br.readLine().split(",");
        int a[]=new int[]{0,0,0,0,0,0,0,0,0,0};//array of 9
        for(int i=0;i<9;i++)
        {
            a[Integer.parseInt(s[i])]++;//increment on encounter with that digit
        }

        int hour=Integer.MIN_VALUE,min=Integer.MIN_VALUE,sec=Integer.MIN_VALUE;
        int tens=0,ones=0,tens1=0,ones1=0,j=0;
        //for hour 0<=hour<=24
        for(int i=2;i>=0;i--)
        {
            if(a[i]>0){
                tens=i;
                for(j=9;j>=0;j--)
                {
                    if(tens==2){
                        j=4;
                    }
                    if(a[j]>0){
                        ones=j;break;
                    }
                }
                if((hour=10*tens+ones)<=24){a[i]--;a[j]--;break;}
            }
        }
        boolean flag1=true,flag2=true;
        //0<=minutes<=59 and 0<=sec<=59
        for(int i=5;i>=0;i--)
        {
            //minutes
            if(a[i]>0&&flag1){
                tens1=i;
                for(j=9;j>=0;j--)
                {
                    //if(tens==6){
                    //     j=0;
                    // }
                    if(a[j]>0){
                        ones1=j;break;
                    }
                }
                if((min=10*tens1+ones1)<60){a[i]--;a[j]--;flag1=false;}
            }
            //sec
            if(a[i]>0&&flag2){
                tens=i;
                for(j=9;j>=0;j--)
                {
                    // if(tens==6){
                    //   j=0;
                    //}
                    if(a[j]>0){
                        ones=j;break;
                    }
                }
                if((sec=10*tens+ones)<60){a[i]--;a[j]--;flag2=false;}
            }
        }

        //seconds

        if(hour>=0&&min>=0&&sec>=0)
            //seconds
            System.out.println(hour+":"+min+":"+tens+""+ones);
        else{
            System.out.println("Impossible");
        }
    }

}