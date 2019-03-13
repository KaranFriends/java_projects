import javax.xml.soap.Text;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class pro6 extends Applet implements ItemListener
{
    Checkbox c1,c2,c3;
    Choice cc,ss;
    TextField t1,t2,t3;
    Label l1,l2,l3;

    public void init()
    {
        c1 = new Checkbox("UG",true);
        c2 = new Checkbox("pG");
        c3 = new Checkbox("p.hd");

        cc=new Choice();
        cc.add("indore");
        cc.add("Ratlam");
        cc.add("Ujjain");

        ss=new Choice();
        ss.add("c");
        ss.add("c++");
        ss.add("java");

        t1 =new TextField(30);
        t2 =new TextField(30);
        t3 =new TextField(30);

        l1 =new Label("choose your qualification");
        l2 =new Label("choose your city");
        l3 =new Label("choose your langun");

        add(l1);
        add(c1);
        add(c2);
        add(c3);
        add(l2);
        add(cc);
        add(l3);
        add(ss);
        add(t1);
        add(t2);
        add(t3);
        cc.addItemListener(this);
        ss.addItemListener(this);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource()==cc)
        {
            t1.setText(cc.getSelectedItem().toString());
        }
        if(e.getSource()==ss)
        {
            t2.setText(ss.getSelectedItem().toString());
        }
        if(e.getSource()==c1)
        {
            t3.setText(c1.getLabel().toString());
            c2.setState(false);
            c3.setState(false);
        }
        if(e.getSource()==c2)
        {
            t3.setText(c2.getLabel().toString());
            c1.setState(false);
            c3.setState(false);
        }
        if(e.getSource()==c3)
        {
            t3.setText(c3.getLabel().toString());
            c1.setState(false);
            c2.setState(false);
        }

    }
}