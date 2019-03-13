import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class parallelogram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(",");
        HashMap<Integer,Integer> ll = new HashMap();
        HashSet el = new HashSet();
        int t = 0;
        for (String e : s) {
            if (el.add(Integer.parseInt(e)))
            {
                ll.put(Integer.parseInt(e), 1);
            } else {
                t = (int) ll.get(Integer.parseInt(e));
                t++;
                ll.put(Integer.parseInt(e), t);
            }
        }

        //ArrayList io = (ArrayList) ll.entrySet();
        HashMap<Integer,Integer> hm = new HashMap();
        for(Integer k : ll.keySet()) {
            //System.out.println(k);
            if (ll.get(k)>= 2)
            {
                hm.put(k,ll.get(k));
            }
        }

        //System.out.println(hm);

      /*  for (Iterator q= ll.keySet().iterator();q.hasNext();) {
            if (Integer.parseInt(q.toString()) < 2) {
                ll.remove(q);

            }
        }

        */
        //System.out.println(ll);
        if (hm.isEmpty() || hm.size()==1)
        {
            System.out.println(0);
            return;
        }
        else {
            List a=new ArrayList();
            for (Integer k : hm.values())
            {
                a.add(nCr(Integer.parseInt(String.valueOf(k)),2));

            }
            //System.out.println(a);
            int aa[]=new int[a.size()];
            for(int iw=0;iw<a.size();iw++)
            {
                aa[iw]=Integer.parseInt(String.valueOf(a.get(iw)));
            }
            //System.out.println(ll.size());
            printCombination(aa,hm.size(),2);
        }

    }


    static int nCr(int n, int r) {
        // The array C is going to store last
        // row of pascal triangle at the end.
        // And last entry of last row is nCr
        int C[] = new int[r + 1];
        Arrays.fill(C, 0);

        C[0] = 1; // Top row of Pascal Triangle

        // One by constructs remaining rows of Pascal
        // Triangle from top to bottom
        for (int i = 1; i <= n; i++) {
            // Fill entries of current row using previous
            // row values
            for (int j = Math.min(i, r); j > 0; j--)

                // nCj = (n-1)Cj + (n-1)C(j-1);
                C[j] = (C[j] + C[j - 1]);
        }
        return C[r];
    }
    static int jj=0;
    static void combinationUtil(int arr[], int data[], int start,
                                int end, int index, int r)
    {
        // Current combination is ready to be printed, print it
        int e=1;
        if (index == r)
        {
            for (int j=0; j<r; j++)
            {
                e=e*data[j];
              //  System.out.print(data[j]+" ");
            }
            //System.out.println(e);
            jj=jj+e;
            //System.out.print("");
            return;
        }

        // replace index with all possible elements. The condition
        // "end-i+1 >= r-index" makes sure that including one element
        // at index will make a combination with remaining elements
        // at remaining positions
        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r);
        }
    }

    static void printCombination(int arr[], int n, int r)
    {
        // A temporary array to store all combination one by one
        int data[]=new int[r];

        // Print all combination using temprary array 'data[]'
        combinationUtil(arr, data, 0, n-1, 0, r);
        System.out.print(jj);
    }
}