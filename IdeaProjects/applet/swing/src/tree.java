import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

/**
 * Created by root on 11/7/17.
 */
public class tree extends JApplet
{
    DefaultMutableTreeNode top,n0,n1,n2,n3,n4,n5,m4,m3,m2,m1;
    JTree tr;
    JTextField t1;
    FlowLayout fl;
    Container con;

    public void init()
    {
        con=getContentPane();
        fl=new FlowLayout();
        con.setLayout(fl);

        t1=new JTextField(50);

        top=new DefaultMutableTreeNode("My Day");
        m1=new DefaultMutableTreeNode("College");
        m2=new DefaultMutableTreeNode("Home");
        m3=new DefaultMutableTreeNode("Coaching");
        m4=new DefaultMutableTreeNode("Home");
        n0=new DefaultMutableTreeNode("STUDY");
        n1=new DefaultMutableTreeNode("EATING");
        n2=new DefaultMutableTreeNode("JAVA");
        n3=new DefaultMutableTreeNode("EATING");
        n4=new DefaultMutableTreeNode("MUSIC");
        n5=new DefaultMutableTreeNode("SLEEP");

        top.add(m1);
        top.add(m2);
        top.add(m3);
        top.add(m4);

        m1.add(n0);
        m2.add(n1);
        m3.add(n2);
        m4.add(n3);
        m4.add(n4);
        m4.add(n5);

        tr=new JTree(top);
        con.add(tr);

    }
}
