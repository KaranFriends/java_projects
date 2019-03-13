import java.applet.Applet;
import java.awt.*;

/**
 * Created by root on 8/7/17.
 */
public class Grid extends Applet {
    Label l1,l2,l3,l4;
    GridLayout g;
    public void init()
    {
        g=new GridLayout(2,2);
        setLayout(g);

        l1=new Label("First");
        l2=new Label("Second");
        l3=new Label("Third");
        l4=new Label("Fourth");

        add(l1);
        add(l2);
        add(l3);
        add(l4);

    }
}
