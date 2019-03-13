import java.io.*;
import java.util.*;
public class pro3 {
    public static void main(String[] args) {
        new my3();
    }
}

class my3
{
    File ff;
    FileWriter fr;
    String ss;
    Scanner sc;
    my3()
    {
        try {
            ff = new File("/root/Desktop/file/file.txt");

            fr = new FileWriter(ff);

            ss = new String();
            sc = new Scanner(System.in);

            ss = sc.next();
            fr.write(ss);
            fr.close();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }

    }
}