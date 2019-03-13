import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;

class first
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of non terminals");
        int n = Integer.parseInt(br.readLine());
        System.out.println("enter the non terminal -> terminal/terminal");
        HashMap<String,Set<String>> given=new HashMap<>();

        for (int i=0;i<n;i++)
        {
            String e[]=br.readLine().split("->");
            String ee[]=e[1].split("/");
            given.put(e[0],Set.of(ee));
        }



        HashMap<String,Set<String>> first=new HashMap<>();

        for (String name : given.keySet())
        {
            first.put(name,hello(name,given));
        }

        for (String name : first.keySet())
        {
            System.out.println(name+"  "+first.get(name));
        }
    }

    static Set<String> hello(/*Set<String> given,*/String s,HashMap<String,Set<String>> given)
    {
/*        for (String name : given.keySet())
        {
            System.out.println(name+"  "+given.get(name));
        }
*/
        Set<String> ll=new HashSet<>();
        if(given.get(s).isEmpty())
        {
            return ll;
        }
        else
        {
            for(String it : given.get(s))
            {
                    if(it.charAt(0)>=65 && it.charAt(0)<=90)
                    {
                        String temp=it;
                        given.get(s).remove(it);
                        Set<String> ss =hello(it.charAt(0)+"",given);
                        for(String sss : ss)
                        {
                            given.get(s).addAll(Collections.singleton(temp.replaceFirst(temp.charAt(0) + "", sss)));
                            //ll.add();
                        }

                    }
                    else
                    {
                        ll.add(it.charAt(0)+"");
                    }
            }
        }
        return ll;
    }
}
