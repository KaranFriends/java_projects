import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<Applet width=50 height=50 code="app1.class"

</Applet>
*/

public class app1 extends Applet
{
    Font ff,ll;
    String s1,s2,s3;
    public void init()
    {
        ff=new Font("Times New Roman",Font.BOLD,40);
        ll=new Font("stmary10LyX",Font.PLAIN,40);
        s1="hello";
        s2="Dude";
        setBackground(Color.yellow);
        setForeground(Color.white);
        setFont(ff);
    }
    public void paint(Graphics g){
  //          g.drawString("karan",100,100);
            g.draw3DRect(100,100,100,100,true);
  //          g.drawArc(100,100,100,100,90,90);
  //          g.drawRect(100,100,100,100);
  //          g.drawLine(100,100,200,200);
        g.fillArc(100,100,100,100,90,90);
        g.drawLine(100,100,200,200);
        g.drawLine(200,100,100,200);

    }
}
