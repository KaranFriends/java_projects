import java.io.*;

/**
 * Created by karanraj on 14-07-2018.
 */
public class LECANDY
{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int ii=Integer.parseInt(br.readLine());

        long sum=0;
        while(ii>0) {

            String[] s = br.readLine().split(" ");
            long[] i = new long[2];
            i[0] = Integer.parseInt(s[0]);
            i[1] = Integer.parseInt(s[1]);

            int[] l = new int[(int) i[0]];

            String[] s1 = br.readLine().split(" ");
            sum = 0;
            for (String r : s1) {
                sum = sum + Integer.parseInt(r);
            }

            if (sum > i[1]) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
            ii--;
        }
    }
}
