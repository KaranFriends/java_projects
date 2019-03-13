import javax.print.DocFlavor;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.*;
import java.net.URL;

/**
 * Created by root on 4/7/17.
 */
public class title extends Applet implements Runnable
{
    String msg="A Simple Moving Banner";
    Thread t;
    int state;
    boolean stopFlag;
    public void init() {
        setForeground(Color.red);
        setBackground(Color.cyan);
        showStatus("this");

        getDocumentBase();

        AppletContext ac = getAppletContext();
        try {
            ac.showDocument(new URL(/*getCodeBase()+*/"test.txt"));
        } catch (Exception e) {
        }
    }

    public void start()
    {
        t=new Thread(this);
        stopFlag=false;
        t.start();
    }
    public void run()
    {
        char ch;
        for(;;)
        {
            try
            {
                repaint();
                t.sleep(250);
                ch=msg.charAt(0);
                msg=msg.substring(1,msg.length());
                msg+=ch;
                if(stopFlag)
                    break;
            }
            catch(InterruptedException e)
            {

            }
        }
    }
    public void stop()
    {
        stopFlag=true;
        t=null;
    }
    /*public void paint(Graphics g)
    {
        g.drawString(msg,50,50);
        URL url=getCodeBase();
        g.drawString("codeBase :  " + url.toString(),50,100);
        url=getDocumentBase();
        g.drawString("documentBase  :"+url.toString(),50,150);
    }*/
}
