import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by root on 8/7/17.
 */
public class card extends Applet implements ActionListener{
    CardLayout c;
    FlowLayout f1,f2;
    Button b1,b2;
    Panel p1,p2,p3;
    Label l1,l2;

    public void init()
    {
        c=new CardLayout();
        f1=new FlowLayout(FlowLayout.CENTER);
        f2=new FlowLayout(FlowLayout.LEFT);

        b1=new Button("move to second");
        b2=new Button("move to first");

        p1=new Panel();
        p1.setLayout(c);
        add(p1);

        p2=new Panel();
        p2.setBackground(Color.RED);
        p2.setLayout(f1);
        l1=new Label("this is the first panel");

        p3=new Panel();
        p3.setBackground(Color.GREEN);
        p3.setLayout(f2);
        l2=new Label("this is the second panel");

        p1.add(p2,"1");
        p1.add(p3,"2");


        p2.add(b1);
        p2.add(l1);

        p3.add(b2);
        p3.add(l2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        c.show(p1,"1");
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            c.show(p1,"2");
        }
        if(ae.getSource()==b2)
        {
            c.show(p1,"1");
        }
    }
}
