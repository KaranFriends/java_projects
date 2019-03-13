import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;


public class app5 extends Applet implements MouseListener
{
    int a,b,c,d;
    boolean ff=true;
    public void init()
    {
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e)
    {
        if(ff==true) {
            a = getX();
            b = getY();
            ff=false;
        }
        else {
            c = getX();
            d = getY();
            c=c-a;
            d=d-b;
            ff=true;
            new karan(a,b,c-a,d-b).paint(null);
        }
    }


    public void mousePressed(MouseEvent e)
    {

    }
    public void mouseEntered(MouseEvent e)
    {

    }
    public void mouseReleased(MouseEvent e)
    {

    }
    public void mouseExited(MouseEvent e)
    {

    }
}
class karan extends Applet
{
    int a,b,c,d;
    karan(int q,int w,int e,int r)
    {
        a=q;
        b=w;
        c=e;
        d=r;
    }
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawLine(a,b,c,d);
    }


}

