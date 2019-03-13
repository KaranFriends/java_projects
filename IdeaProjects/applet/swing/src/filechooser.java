import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

public class filechooser extends JApplet implements MouseListener
{
    JFileChooser jfc;
    File ff;
    JLabel  t1;
    JButton b1;
    Container c;
    FlowLayout f;

    public void init()
    {
        c=getContentPane();
        f=new FlowLayout();
        c.setLayout(f);


        t1=new JLabel("this is where the selected file will be shown");
        b1=new JButton("open from here");
        c.add(t1);
        c.add(b1);

        b1.addMouseListener(this);
    }

    public void mousePressed(MouseEvent e)
    {

    }

    public void mouseReleased(MouseEvent e)
    {

    }
    public void mouseClicked(MouseEvent e)
    {
        if(e.getSource()==b1) {
            jfc = new JFileChooser();
            jfc.setDialogTitle("select a file to open");
            int number = jfc.showOpenDialog(filechooser.this);
            if (number == JFileChooser.APPROVE_OPTION) {
                File sf = jfc.getSelectedFile();
               t1.setText(sf.getAbsolutePath());
            }
        }//for multiple selection simply create a array of object
    }
    public void mouseEntered(MouseEvent e)
    {

    }
    public void mouseExited(MouseEvent e)
    {

    }
}