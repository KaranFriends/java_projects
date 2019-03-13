        import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LECANDY
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r=Integer.parseInt(br.readLine());

        while(r>0) {
            String st1[] = br.readLine().split(" ");
            String st2[] = br.readLine().split(" ");

            int[] int1 = Arrays.asList(st2).stream().mapToInt(Integer::parseInt).toArray();
            int sum = 0;
            for (int e : int1) {
                sum = sum + e;
            }
            if (sum <= Integer.parseInt(st1[1])) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            r--;
        }

    }
}
