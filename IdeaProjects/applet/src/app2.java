import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class app2 extends Applet implements ActionListener{
    Label l1,l2;
    TextField   t1,t2;
    Button b1,b2;
    Font ff;
    boolean b;

    public void init()
    {
        b=true;
        ff=new Font("MonotypeCorsiva",Font.BOLD,15);

        l1=new Label("Enter Your Name");
        l2=new Label("Enter your class");

        t1=new TextField(30);
        t2=new TextField(30);

        b1=new Button("clear");
        b2=new Button("change color");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e)
    {
            if(e.getSource()==b1)
            {
                t2.setText("");
                t1.setText("");
            }
            if(e.getSource()==b2 && b==true)
            {
                setBackground(Color.green);
                b=false;
            }
            else
            {
                setBackground(Color.WHITE);
                b=true;
            }
    }
}
