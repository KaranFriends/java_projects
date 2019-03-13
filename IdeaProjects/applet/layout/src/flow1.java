import java.applet.Applet;
import java.awt.*;

/**
 * Created by root on 8/7/17.
 */
public class flow1 extends Applet{
    FlowLayout fl;
    Label l;
    public void init()
    {
        fl = new FlowLayout(FlowLayout.LEFT);
        setLayout(fl);
        l=new Label("click me");
        add(l);
    }
}
