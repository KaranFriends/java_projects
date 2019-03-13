import java.io.DataInputStream;
import java.io.IOException;
public class sum {
    public static void main(String[] args) throws IOException
    {
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long sum = 0;
        Reader r = new Reader();
        int N = r.nextInt();
        String[] x = r.readLine().split(" ");

        for (int i = 0; i < N; i++)
        {
            sum += power(Long.parseLong(x[i]));
        }
        System.out.print(sum%100);
    }

    static int power(long power)
    {
        if(power==0)
        {
            return 1;
        }
        else
        {
            return (2*power(power-1)%100);
        }
    }
}
class Reader
{
    private byte buffer[];
    private DataInputStream din;
    private final int size = 1<<16;
    private int bufferpointer,bytesRead;
    public Reader()  {
        din = new DataInputStream(System.in);
        bufferpointer=bytesRead=0;
        buffer = new byte[size];
    }
    public String readLine()throws IOException
    {
        byte b[] = new byte[100];
        int cnt=0,c;
        while((c=scan())!=-1)
        {
            if(c=='\n')
                break;
            b[cnt++] = (byte)c;
        }
        return new String(b,0,cnt);
    }
    public int nextInt()throws IOException
    {
        int num=0,c=scan();
        boolean neg = false;
        while(c<=' ')
            c = scan();
        if(c=='-')
        {
            neg=true;
            c = scan();
        }
        do
        {
            num = num*10+c-'0';
            c = scan();
        }
        while(c<='9'&&c>='0');
        if(neg)
            return -1*num;
        else
            return num;
    }
    public long nextLong()throws IOException
    {
        long num=0,c=scan();
        boolean neg = false;
        while(c<=' ')
            c = scan();
        if(c=='-')
        {
            neg=true;
            c = scan();
        }
        do
        {
            num = num*10+c-'0';
            c = scan();
        }
        while(c<='9'&&c>='0');
        if(neg)
            return -1*num;
        else
            return num;
    }
    private byte scan()throws IOException
    {
        if(bufferpointer>=bytesRead) {
            fillBuffer();
        }
        return buffer[bufferpointer++];
    }
    private void fillBuffer()throws IOException
    {
        bytesRead = din.read(buffer, bufferpointer=0, size);
        if(bytesRead==-1)
            buffer[0] = -1;
    }
}