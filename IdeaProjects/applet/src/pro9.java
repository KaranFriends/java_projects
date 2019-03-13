import com.sun.java.accessibility.util.java.awt.TextComponentTranslator;

import javax.xml.stream.events.Characters;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class pro9 extends Applet implements KeyListener
{
    TextField t1,t2,t3;
    char ch;
    public void init()
    {
        t1=new TextField(40);
        t2=new TextField(40);
        t3=new TextField(40);

        add(t1);
        add(t2);
        add(t3);

        t1.addKeyListener(this);
        t2.addKeyListener(this);
        t3.addKeyListener(this);
    }
    public void keyPressed(KeyEvent e)
    {
        if(e.getSource()==t1)
        {
            ch = e.getKeyChar();
            ch++;
            ch++;
            ch++;
            t2.setText(Character.toString(ch));
            t3.setText(Character.toString(ch));
            t3.setEditable(false);
        }
    }
    public void keyTyped(KeyEvent e)
    {

    }
    public void keyReleased(KeyEvent e)
    {

    }
}
