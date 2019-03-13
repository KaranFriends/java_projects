import javax.swing.*;
import java.awt.*;

public class pad extends JApplet
{
    JMenuBar M;
    JMenu m1;
    JMenuItem m11,m12,m13,m14;

    JMenu m2;
    JMenuItem m21,m22,m23,m24,m25,m26,m27,m28,m29,m210,m211;

    JMenu m3;
    JMenuItem m31,m32;

    JMenu m4;
    JMenuItem m41;

    JMenu m5;
    JMenuItem m51,m52;

    Container con;
    FlowLayout fl;
    public void init()
    {
        con=getContentPane();
        fl=new FlowLayout();
        con.setLayout(fl);

        m11=new JMenuItem("New");
        m12=new JMenuItem("Open");
        m13=new JMenuItem("Save");
        m14=new JMenuItem("Exit");
        m1=new JMenu("FIle");
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m1.add(m14);

        m21=new JMenuItem("Undo");
        m22=new JMenuItem("Cut");
        m23=new JMenuItem("Copy");
        m24=new JMenuItem("Paste");
        m25=new JMenuItem("Delete");
        m26=new JMenuItem("Find");
        m27=new JMenuItem("Find Next");
        m28=new JMenuItem("Replace");
        m29=new JMenuItem("Go To");
        m210=new JMenuItem("Select all");
        m211=new JMenuItem("Time/Date");
        m2=new JMenu("Edit");
        m2.add(m21);
        m2.add(m22);
        m2.add(m23);
        m2.add(m24);
        m2.add(m25);
        m2.add(m26);
        m2.add(m27);
        m2.add(m28);
        m2.add(m29);
        m2.add(m210);
        m2.add(m211);

        m31=new JMenuItem("Word Wrap");
        m32=new JMenuItem("Font");
        m3=new JMenu("Format");
        m3.add(m31);
        m3.add(m32);

        m41=new JMenuItem("Status Bar");
        m4=new JMenu("View");
        m4.add(m41);

        m51=new JMenuItem("View Help");
        m52=new JMenuItem("About Notepad");
        m5=new JMenu("Help");
        m5.add(m51);
        m5.add(m52);

        M=new JMenuBar();
        M.add(m1);
        M.add(m2);
        M.add(m3);
        M.add(m4);
        M.add(m5);

        con.add(M);
    }
}
