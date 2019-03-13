import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AVG
{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());

        while(t>0) {
            String st[] = br.readLine().split(" ");
            int n, k, v;
            n = Integer.parseInt(st[0]);
            k = Integer.parseInt(st[1]);
            v = Integer.parseInt(st[2]);
            String st1[] = br.readLine().split(" ");
          //  int a2[] = new int[n];
          //  int e = 0;
            int sum = 0;
            for (String rr : st1) {
              //  a2[e++] = Integer.parseInt(rr);
                sum = sum +Integer.parseInt(rr);
            }
            v = v * (n + k);
            int i=v;
            v = v - sum;
            if (v % k != 0 || i<=sum) {
                System.out.println("-1");
            } else
                System.out.println(v/k);
            t--;
        }

    }
}
