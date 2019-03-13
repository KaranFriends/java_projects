import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.lang.management.GarbageCollectorMXBean;
import java.text.AttributedCharacterIterator;
public class pro8 extends Applet
{
    boolean stringflag=false;
    public void init()
    {
        setBackground(Color.white);
        setForeground(Color.red);
        repaint();
    }
    public void paint(Graphics g) {
        if (stringflag = true) {
            g.drawString("karan", 10, 50);
            stringflag=false;
        }
    }
}