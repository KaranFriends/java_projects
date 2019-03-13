import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by root on 26/6/17.
 */
public class audio extends Applet implements ActionListener
{
    AudioClip au;
    Button b1,b2,b3;
    public void init()
    {
        au=getAudioClip(getDocumentBase(),"/root/Desktop/1.wav" );
        b1=new Button("play");
        b2=new Button("stop");
        b3=new Button("loop");

        add(b1);
        add(b2);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            au.play();
        }
        if(e.getSource()==b2)
        {
            au.stop();
        }
        if(e.getSource()==b3)
        {
            au.loop();
        }
    }
}
