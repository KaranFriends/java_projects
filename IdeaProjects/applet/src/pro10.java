import java.applet.Applet;
import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class pro10 extends Applet implements TextListener
{
    TextField t1;
    public void init()
    {
        t1=new TextField(30);
        t1.setText("karan");
        add(t1);
        t1.addTextListener(this);
    }

    public void textValueChanged(TextEvent e)
    {
        t1.setEditable(false);
    }
}
