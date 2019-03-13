import java.applet.Applet;
import java.awt.*;

/**
 * Created by root on 26/6/17.
 */
public class flow extends Applet
{
 //   FlowLayout fl;
   GridLayout gl;
//    BorderLayout bl;
 //   CardLayout cl;
    Label p1;
    public void init()
    {
        p1=new Label("click me");
//        fl=new FlowLayout();
       gl=new GridLayout(3,2);
  //      bl=new BorderLayout();
   //     cl=new CardLayout();
        add(p1);

        setLayout(gl);
        setVisible(true);

    }
}
