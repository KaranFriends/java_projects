import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionListener;

public class image extends Applet
{
    Image i;
    public void init()
    {
        i=getImage(getDocumentBase(),"/root/Desktop/1.jpg");
    }
    public void paint(Graphics g)
    {
        g.drawImage(i,10,10,null);
    }
}