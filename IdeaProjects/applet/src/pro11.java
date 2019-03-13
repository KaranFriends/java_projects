import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class pro12 extends Frame implements ActionListener
{
    Panel p1;
    Label l1,l2;
    TextField t1,t2;
    Button b1,b2;
    pro12() {
        p1 = new Panel();
        p1.setBackground(Color.red);
        add(p1);
    }
    public void actionPerformed(ActionEvent e)
    {

    }
}
class pro11
{
    public static void main(String[] args) {
        Frame ff=new pro12();
        ff.setSize(50,50);
        ff.setVisible(true);
    }
}