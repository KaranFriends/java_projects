import javax.swing.*;
import java.awt.*;

/**
 * Created by root on 9/7/17.
 */
public class menu extends JApplet
{
    JMenuBar M;
    JMenu m1,m2,m3;
    JMenuItem n0,n1,n2,n3,n4,n5,n6,n7,n8;

    Container c;
    FlowLayout f;

    public void init()
    {
        c=getContentPane();
        f=new FlowLayout();
        c.setLayout(f);

        M=new JMenuBar();

        m1=new JMenu("File");
        m2=new JMenu("Edit");
        m3=new JMenu("Run");

        n0=new JMenuItem("open");
        n1=new JMenuItem("save");
        n2=new JMenuItem("new");

        n3=new JMenuItem("cut");
        n4=new JMenuItem("copy");
        n5=new JMenuItem("paste");

        n6=new JMenuItem("Run");
        n7=new JMenuItem("Debug");
        n8=new JMenuItem("Compile");

        m1.add(n0);
        m1.add(n1);
        m1.add(n2);

        m2.add(n3);
        m2.add(n4);
        m2.add(n5);

        m3.add(n6);
        m3.add(n7);
        m3.add(n8);

        M.add(m1);
        M.add(m2);
        M.add(m3);

        c.add(M);
    }
}
