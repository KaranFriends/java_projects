
import java.io.*;
import java.util.*;

class Test2
{
    static final int putty1 = 20;

    // stores smallest prime factor for every number
    static int spf[] = new int[putty1];
    static void sieve()
    {
        spf[1] = 1;
        for (int i=2; i<putty1; i++)

            // marking smallest prime factor for every
            // number to be itself.
            spf[i] = i;

        // separately marking spf for every even
        // number as 2
        for (int i=4; i<putty1; i+=2)
            spf[i] = 2;

        for (int i=3; i*i<putty1; i++)
        {
            // checking if i is prime
            if (spf[i] == i)
            {
                // marking SPF for all numbers divisible by i
                for (int j=i*i; j<putty1; j+=i)

                    // marking spf[j] if it is not
                    // previously marked
                    if (spf[j]==j)
                        spf[j] = i;
            }
        }
    }

    // A O(log n) function returning primefactorization
    // by dividing by smallest prime factor at every step
    static HashSet<Integer> getFactorization(int x)
    {
        HashSet<Integer> ret = new HashSet<>();
        while (x != 1)
        {
            ret.add(spf[x]);
            x = x / spf[x];
        }
        return ret;
    }

    // Driver method
    public static void main(String args[])throws IOException
    {
        // precalculating Smallest Prime Factor
        sieve();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        //System.out.print("prime factorization for " + x + " : ");

        // calling getFactorization function
        HashSet<Integer> p = getFactorization(x);
        Iterator<Integer> i = p.iterator();
        //for (int i=0; i<p.size(); i++)
          //  System.out.print(p.get(i) + " ");
        double kk=x,key=0;
        while (i.hasNext()) {
            key=i.next();
            //System.out.println(key);
            kk=kk*(1-(1/key));
        }
        System.out.println((int)kk);

    }
}
