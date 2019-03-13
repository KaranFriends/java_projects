import javax.swing.*;
import java.awt.*;

/**
 * Created by root on 11/7/17.
 */
public class color extends JApplet
{
    JColorChooser jcc;
    Container con;
    FlowLayout fl;

    public void init()
    {
        con=getContentPane();
        fl=new FlowLayout();
        con.setLayout(fl);

        jcc=new JColorChooser();
        con.add(jcc);
    }
}
