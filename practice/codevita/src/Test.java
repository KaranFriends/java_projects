// Java program to find prime factorization of a
// number n in O(Log n) time with precomputation
// allowed.

import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class Test
{
        public static void main(String args[])
    {

        // precalculating Smallest Prime Factor

        int x = 36;
        //hot s=new hot(x);
    //    s.sieve();

        int MAXN=x;

    /*hot(int e)
    {
        this.MAXN=e;
    }*/
        // stores smallest prime factor for every number
        //Integer spf[]= new Integer[x];//= new int[MAXN];
    int spf[]=new int[x*2];
        // Calculating SPF (Smallest Prime Factor) for every
        // number till MAXN.
        // Time Complexity : O(nloglogn)
       // void sieve()
        //{
            //spf= new int[MAXN];
//        MAXN=iii;
//        spf= new int[MAXN];
            spf[0]=1;
            spf[1] = 1;
            for (int i=2; i<MAXN; i++)

                // marking smallest prime factor for every
                // number to be itself.
                spf[i] = i;

            // separately marking spf for every even
            // number as 2
            for (int i=4; i<MAXN; i+=2)
                spf[i] = 2;

            for (int i=3; i*i<MAXN; i++)
            {
                // checking if i is prime
                if (spf[i] == i)
                {
                    // marking SPF for all numbers divisible by i
                    for (int j=i*i; j<MAXN; j+=i)

                        // marking spf[j] if it is not
                        // previously marked
                        if (spf[j]==j)
                            spf[j] = i;
                }
            }
        //}




        System.out.print("prime factorization for " + x + " : ");

        // calling getFactorization function
        //Vector <Integer> p = getFactorization(x);

        //HashSet<Integer> hs= s.getFactorization();

        HashSet<Integer> ret = new HashSet<>();
        while (MAXN != 1)
        {

            ret.add(spf[MAXN]);
            if(spf[MAXN]>0)
                MAXN=MAXN/ spf[MAXN];

        }

        Iterator<Integer> i = ret.iterator();




        double kk=x,key=0;
        while (i.hasNext()) {
            key=i.next();
            //System.out.println(key);
            kk=kk*(1-(1/key));
        }
        System.out.println(kk);

    }
}