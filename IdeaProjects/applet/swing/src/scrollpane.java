import javax.swing.*;
import java.awt.*;

/**
 * Created by root on 9/7/17.
 */
public class scrollpane extends JApplet
{
    JTextArea t1,t2;
    JScrollPane p;
    Container c;
    FlowLayout f;
    public void init()
    {
        c=getContentPane();
        f=new FlowLayout(FlowLayout.CENTER);
        c.setLayout(f);

        t1 = new JTextArea(10,30);
        t2 = new JTextArea(10,30);
        p=new JScrollPane(t1,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        c.add(p);
        c.add(t2);

    }
}
