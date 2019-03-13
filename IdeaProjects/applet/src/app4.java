import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class app4 extends Applet implements ActionListener
{
    Label l1,l2;
    TextField t1,t2;
    Button b1,b2;
    GridLayout gg;

    @Override
    public void init() {
        super.init();
        gg=new GridLayout(3,3);
        setLayout(gg);

        l1=new Label("Enter Your Mail-id");
        l2=new Label("Enter Your Password");

        t1=new TextField(20);
        t2=new TextField(20);
        t2.setEchoChar('*');

        b1=new Button("Login");
        b2=new Button("Reset");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b2)
        {
            t1.setText("");t2.setText("");

        }
    }
}
