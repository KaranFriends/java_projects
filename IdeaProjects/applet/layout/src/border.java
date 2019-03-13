import javax.swing.border.Border;
import java.applet.Applet;
import java.awt.*;

/**
 * Created by root on 8/7/17.
 */
public class border extends Applet {
    BorderLayout b;
    Panel p1,p2,p3,p4,p5;
    Button l1,l2,l3,l4,l5;
    public void init()
    {
        b=new BorderLayout();

        setLayout(b);

        p1=new Panel();
        p2=new Panel();
        p3=new Panel();
        p4=new Panel();
        p5=new Panel();

        l1=new Button("North");
        l2=new Button("South");
        l3=new Button("East");
        l4=new Button("West");
        l5=new Button("Center");

        p1.add(l1);
        p2.add(l2);
        p3.add(l3);
        p4.add(l4);
        p5.add(l5);

        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.SOUTH);
        add(p3,BorderLayout.EAST);
        add(p4,BorderLayout.WEST);
        add(p5,BorderLayout.CENTER);

    }
}
