import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rainbowa
{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i=Integer.parseInt(br.readLine());
        int size=0;
        int mid=0;
        String[] s;
        int pre=0;
        boolean flag=true;
        while(i>0)
        {

            size=Integer.parseInt(br.readLine());
            s=br.readLine().split(" ");
            pre=Integer.parseInt(s[0]);
            if(size%2==0)
            {
                mid=(size/2)-1;
            }
            else
            {
                mid=(size/2)+1;
            }
            for(int j=0;j<mid;j++)
            {
                              if(s[j].equals(s[size-j-1]))
                              {
                                  if(pre==Integer.parseInt(s[j]) || pre==(Integer.parseInt(s[j])-1))
                                  {
                                      pre=Integer.parseInt(s[j]);
                                  }
                                  else
                                  {
                                      flag=false;
                                      break;
                                  }
                              }

                              else{
                                  flag=false;
                                  break;
                              }
            }

            if(flag==true)
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
            flag=true;
            i--;
        }
    }
}
