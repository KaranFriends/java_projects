import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class lapin
{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i=Integer.parseInt(br.readLine());
        String s1,s2,s;

        while(i>0)
        {
        s=br.readLine();
        if((s.length()%2)!=0)
        {
            s1=s.substring(0,s.length()/2);
            s2=s.substring((s.length()/2)+1);
        }
        else
        {
            s1 = s.substring(0,s.length() / 2);
            s2 = s.substring(s.length() / 2);
        }

        Arrays.sort(s1.split(""));
        Arrays.sort(s2.split(""));

          if(s1.equals(s2))
          {
              System.out.println("YES");
          }
          else
          {
              System.out.println("NO");
          }
          i--;
        }
    }
}
