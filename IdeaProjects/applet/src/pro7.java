import javax.xml.soap.Text;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class pro7 extends Applet implements MouseMotionListener,ActionListener
{


    TextArea t1,t2;
    Button b1;

    public void init()
    {
        t1=new TextArea();
        t2=new TextArea();
        b1=new Button("Click Me");

        add(t1);
        add(b1);
        add(t2);

        t1.addMouseMotionListener(this);
        t2.addMouseMotionListener(this);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            t2.setText(t1.getText().toString());
        }
    }



    public void mouseMoved(MouseEvent e)
    {
        if(e.getSource()==t1)
        {
            t1.setBackground(Color.red);
        }
        if(e.getSource()==t2)
        {
            t2.setBackground(Color.red);
        }
    }

    public void mouseDragged(MouseEvent e)
    {
    }

}
