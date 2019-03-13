import javax.swing.*;
import java.awt.*;

/**
 * Created by root on 9/7/17.
 */
public class tabbedpane extends JApplet
{
    JTabbedPane jtb;
    JPanel p1,p2,p3,p4;

    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1,b2;

    JCheckBox cb1,cb2;
    JTextArea T1;

    ImageIcon i,j,k;
    JComboBox cb;

    JRadioButton r1,r2,r3;
    JPasswordField p;

    Container c;
    FlowLayout fl;
    public void init()
    {
        c=getContentPane();
        fl=new FlowLayout(FlowLayout.LEFT);
        c.setLayout(fl);

        jtb=new JTabbedPane();

        p1=new JPanel();
        l1=new JLabel("Karan");
        l2=new JLabel("Raj");
        t1=new JTextField(30);
        t2=new JTextField(30);
        b1=new JButton("CLICK ME");
        b2=new JButton("PUSH me");
        p1.add(l1);
        p1.add(l2);
        p1.add(t1);
        p1.add(t2);
        p1.add(b1);
        p1.add(b2);

        p2=new JPanel();
        cb1=new JCheckBox("Male");
        cb2=new JCheckBox("Female");
        T1=new JTextArea(10,8);
        p2.add(cb1);
        p2.add(cb2);
        p2.add(T1);

        p3=new JPanel();
        i=new ImageIcon("/root/Desktop/login.jpeg");
        j=new ImageIcon("/root/Desktop/game.png");
        k=new ImageIcon("/root/Desktop/next.jpeg");
        cb=new JComboBox();
        cb.addItem(i);
        cb.addItem(j);
        cb.addItem(k);
        p3.add(cb);

        p4=new JPanel();
        r1=new JRadioButton("PG");
        r2=new JRadioButton("UG");
        r3=new JRadioButton("SCHOOL");
        p=new JPasswordField(30);
        p4.add(r1);
        p4.add(r2);
        p4.add(r3);
        p4.add(p);

        jtb.addTab("LoginScreen",p1);
        jtb.addTab("Qualification",p4);
        jtb.addTab("SkillSet",p2);
        jtb.addTab("ImageIcon",p3);

        c.add(jtb);

    }
}
