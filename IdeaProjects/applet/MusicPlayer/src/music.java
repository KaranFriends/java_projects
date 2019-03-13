import javax.swing.*;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.HashMap;

/**
 * Created by root on 11/7/17.
 */
public class music extends JApplet implements MouseListener,ItemListener
{
    File ff;
    JPanel p1,p2,p3,ppp;

    AudioClip au;
    JButton b1,b2,b3,bb1;
    Container con;
    BorderLayout bb;
    GridLayout gl1,gl2,ggg;
    FlowLayout fl;
    Choice j1;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    HashMap ht;
    public void init()
    {
        con=getContentPane();
        bb=new BorderLayout();
        con.setLayout(bb);

        ht=new HashMap();

        ppp=new JPanel();
        ggg=new GridLayout(2,1);
        ppp.setLayout(ggg);

        p1=new JPanel();
        gl1=new GridLayout(2,3);
        p1.setLayout(gl1);
        b1=new JButton("stop");
        b2=new JButton("play");
        b3=new JButton("loop");
        l1=new JLabel("");
        l2=new JLabel("");
        l3=new JLabel("");
        /*l4=new JLabel("");
        l5=new JLabel("");
        l6=new JLabel("");*/
        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        //p1.add(l4);

        p3=new JPanel();
        fl=new FlowLayout();
        p3.setLayout(fl);

        ppp.add(p1);
        ppp.add(p3);

        p2=new JPanel();
        gl2=new GridLayout(4,1);
        p2.setLayout(gl2);
        bb1=new JButton("Choose File");
        j1=new Choice();
        j1.add("SelectFile");
        l7=new JLabel("");
        l8=new JLabel("");
        p2.add(l7);
        p2.add(bb1);
        p2.add(j1);

        b1.addMouseListener(this);
        b2.addMouseListener(this);
        b3.addMouseListener(this);
        bb1.addMouseListener(this);
        j1.addItemListener(this);

        add(ppp,BorderLayout.CENTER);
        add(p2,BorderLayout.EAST);
    }

    public void mousePressed(MouseEvent e)
    {
    }

    public void mouseReleased(MouseEvent e)
    {

    }
    public void mouseEntered(MouseEvent e)
    {

    }
    public void mouseExited(MouseEvent e)
    {

    }
    public void mouseClicked(MouseEvent e)
    {
        if(e.getSource()==bb1)
        {
            JFileChooser jfc=new JFileChooser();
            int i=jfc.showOpenDialog(music.this);
            if(i==JFileChooser.APPROVE_OPTION)
            {
                ff=jfc.getSelectedFile();
            }
            ht.put(ff.getName(),ff.getAbsolutePath());
            j1.add(ff.getName());
        }

        if(e.getSource()==b1)
        {
            String s2 = ht.get(j1.getSelectedItem()).toString();
            au=getAudioClip(getDocumentBase(),s2);
            au.stop();
        }
        if(e.getSource()==b2)
        {
            String s2 = ht.get(j1.getSelectedItem()).toString();
            au=getAudioClip(getDocumentBase(),s2);
            au.play();
        }
        if(e.getSource()==b3)
        {
            String s2 = ht.get(j1.getSelectedItem()).toString();
            au=getAudioClip(getDocumentBase(),s2);
            au.loop();
        }

    }

    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource()==j1)
        {


        }
    }
}
