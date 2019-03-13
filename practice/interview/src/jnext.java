/*
to sort a string convert it into a list
List l=new ArrayList();
then call
Collections.sort(l)

else you can try sorting using below code, although it is not working

String s;
Arrays.sort(s.split("");
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class jnext
{
    public static void main(String[] args) throws IOException,java.lang.Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i=Integer.parseInt(br.readLine());

        int max=0,b=0,s2,min=0,b2=0;
        String temp,ss="";
        String[] s;
        List<Integer> l=new ArrayList<Integer>();
        while(i>0)
        {
            b=0;max=0;b2=0;ss="";l.clear();temp="";s2=0;
            s2=Integer.parseInt(br.readLine());
            s=br.readLine().split(" ");
            max=Integer.parseInt(s[s2-1]);
            for(int j=s2-1;j>=0;j--)
            {
                if(max<=Integer.parseInt(s[j])) {
                    max = Integer.parseInt(s[j]);
                }
                else
                {
                   b=j;
                   max = Integer.parseInt(s[j]);
                   break;
                }
            }
            for(int j=s2-1;j>=0;j--)
            {
                if(max<Integer.parseInt(s[j])) {
                    b2=j;
                    break;
                }
            }
            temp=s[b2];
            s[b2]=s[b];
            s[b]=temp;

/*            for(int j=b+1;j<s2;j++) {
                l.add(Integer.parseInt(s[j]));
            }
            */
            for(int j=s2-1;j>b;j--) {
                l.add(Integer.parseInt(s[j]));
            }
            //Collections.sort(l);

            for(int o=0;o<=b;o++)
            {
                System.out.print(s[o]);
            }

            for(Integer o : l)
            {
                ss=ss+o.toString();
            }
            System.out.println(ss);
            i--;
        }
        return;
    }
}