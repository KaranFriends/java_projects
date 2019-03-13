import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class app3 extends Applet implements ActionListener
{
    Label l2,l3,l4;
    TextField t1,t2,t3;
    Button b1,b2,b3,b4;
    int a,b,c;
    FlowLayout f1;

    public void init()
    {
        f1=new FlowLayout(FlowLayout.TRAILING);
        setLayout(f1);
        l2=new Label("Enter First Number");
        l3=new Label("Enter Second Number");
        l4=new Label("The Result is");

        t1=new TextField(20);
        t2=new TextField(20);
        t3=new TextField(20);

        b1=new Button("ADD");
        b2=new Button("SUBTRACT");
        b3=new Button("MULTIPLY");
        b4=new Button("DIVIDE");

        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(l4);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);


        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            a = Integer.parseInt(t1.getText());
            b = Integer.parseInt(t2.getText());
            c = a + b;
            t3.setText(Integer.toString(c));
        }
        if (e.getSource() == b2) {
            a = Integer.parseInt(t1.getText());
            b = Integer.parseInt(t2.getText());
            c = a - b;
            t3.setText(Integer.toString(c));
        }
        if (e.getSource() == b3) {
            a = Integer.parseInt(t1.getText());
            b = Integer.parseInt(t2.getText());
            c = a * b;
            t3.setText(Integer.toString(c));
        }
        if (e.getSource() == b4) {
            a = Integer.parseInt(t1.getText());
            b = Integer.parseInt(t2.getText());
            c = a / b;
            t3.setText(Integer.toString(c));
        }
    }
}
