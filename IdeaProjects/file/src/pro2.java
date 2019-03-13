import java.io.*;
import java.security.spec.ECField;

class my1
{
    File ff;
    FileReader fr;
    FileWriter fw;
    char ch;
    long len;
    my1()
    {
        try {
            ff = new File("/root/Desktop/file/new.txt");

            len = ff.length();

            fr = new FileReader("/root/Desktop/file/new.txt");
            for(int i=0;i<len;i++){
                ch=(char)fr.read();
                System.out.print(ch);
            }

            fr.close();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
public class pro2 {
    public static void main(String[] args) {
        new my1();
    }
}
