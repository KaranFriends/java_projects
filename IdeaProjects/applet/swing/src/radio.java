import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemListener;

/**
 * Created by root on 9/7/17.
 */
public class radio extends JApplet{
    JCheckBox cb1,cb2,cb3;
    JRadioButton rb1,rb2,rb3;
    JComboBox jcb;
    JTextField t1;
    ImageIcon i,j,k;
    FlowLayout fl;
    Container c;

    public void init()
    {
        c=getContentPane();
        fl=new FlowLayout(FlowLayout.CENTER);
        c.setLayout(fl);

        i=new ImageIcon("/root/Desktop/login.jpeg");
        j=new ImageIcon("/root/Desktop/game.png");
        k=new ImageIcon("/root/Desktop/next.jpeg");

        t1=new JTextField(30);
        cb1=new JCheckBox("UG",true);
        cb2=new JCheckBox("PG");
        cb3=new JCheckBox("Master");

        rb1=new JRadioButton("male");
        rb2=new JRadioButton("female");
        rb3=new JRadioButton(i);

        jcb = new JComboBox();
        jcb.addItem(i);
        jcb.addItem(j);
        jcb.addItem(k);

        c.add(t1);
        c.add(cb1);
        c.add(cb2);
        c.add(cb3);
        c.add(rb1);
        c.add(rb2);
        c.add(rb3);
        c.add(jcb);

    }

}
