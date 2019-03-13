import javax.swing.*;
import java.awt.*;


public class iicon extends JApplet {
    JButton b1;
    ImageIcon i1;
    Container c;
    FlowLayout f;
    public void init()
    {
        c=getContentPane();
        f=new FlowLayout();
        c.setLayout(f);

        i1=new ImageIcon("/root/Desktop/2.jpg");
        b1=new JButton(i1);

        c.add(b1);
    }
}
