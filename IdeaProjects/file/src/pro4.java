import com.sun.org.apache.xml.internal.utils.StringVector;

import java.io.*;
import java.util.Scanner;

public class pro4 {
    public static void main(String[] args) {
        System.out.println("do you want to copy the file or cut the file");
        String ss=new String();
        Scanner sc=new Scanner(System.in);
        ss=sc.next();
        int b;
        b = ss.compareTo("copy");
        if(b==0)
            new copy();
        else
            new cut();
    }
}

class copy {
    FileReader fr;
    FileWriter wf;
    File ff;
    Scanner sc = new Scanner(System.in);
    String ss, ss1, ss2 = new String();

    copy() {
        try {
            System.out.println("which file you want to copy");
            ss1 = sc.next();
            System.out.println("where you want to paste it");
            ss2 = sc.next();

            ff = new File(ss1);
            fr = new FileReader(ff);
            int o=0;

            ff = new File(ss2);
            wf = new FileWriter(ff);
            do
            {
                o = (int) fr.read();
                if(o==-1)
                    break;
                wf.write((char) o);
            }while(true);
                wf.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}


class cut {
    FileReader fr;
    FileWriter wf;
    File ff,fp;
    Scanner sc = new Scanner(System.in);
    String ss, ss1, ss2 = new String();

    cut() {
        try {
            System.out.println("which file you want to copy");
            ss1 = sc.next();
            System.out.println("where you want to paste it");
            ss2 = sc.next();

            ff = new File(ss1);
            fr = new FileReader(ff);
            int o=0;

            fp = new File(ss2);
            wf = new FileWriter(fp);
            do
            {
                o = (int) fr.read();
                if(o==-1)
                    break;
                wf.write((char) o);
            }while(true);
            wf.close();
            fr.close();
            fp.delete();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
