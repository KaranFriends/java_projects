import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cal extends JApplet implements ActionListener
{
    Double f1,f2;
    Boolean add=false,sub=false,mul=false,div=false,equal=false;
    BorderLayout b;
    JPanel p1,p2,p3,p4;
    JTextField t1,t2;
    Container c;
    GridLayout g1,g2,g3,g4;
    FlowLayout f;
    JLabel l1,l2;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,bb1,bb2,bb3,bb4,bbb1,bbb2;
    public void init()
    {
        f1=0.0;
        f2=0.0;
        b=new BorderLayout();

        c= getContentPane();
        c.setLayout(b);

        l1=new JLabel("Provide Input");
        l2=new JLabel("Result");


        p1=new JPanel();
        g1=new GridLayout(3,2);
        p1.setLayout(g1);

        p3=new JPanel();
        g3=new GridLayout(4,1);
        p3.setLayout(g3);

        bb1=new JButton("  +  ");
        bb2=new JButton("  -  ");
        bb3=new JButton("  /  ");
        bb4=new JButton("  *  ");

        p3.add(bb1);
        p3.add(bb2);
        p3.add(bb3);
        p3.add(bb4);

        t1=new JTextField("0");
        t2=new JTextField("0");
        t2.setEditable(false);

        p2=new JPanel();
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        b10=new JButton(".");
        b11=new JButton("=");

        g2=new GridLayout(4,3);
        p2.setLayout(g2);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b0);
        p2.add(b11);

        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);

        p4=new JPanel();
        bbb1=new JButton("Clear");
        bbb2=new JButton("Back");
        g4=new GridLayout(2,1);
        p4.setLayout(g4);

        p4.add(bbb1);
        p4.add(bbb2);

        c.add(p1,BorderLayout.NORTH);
        c.add(p2,BorderLayout.CENTER);
        c.add(p3,BorderLayout.EAST);
        c.add(p4,BorderLayout.WEST);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        bb1.addActionListener(this);
        bb2.addActionListener(this);
        bb3.addActionListener(this);
        bb4.addActionListener(this);
        bbb1.addActionListener(this);
        bbb2.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b0)
        {
            t1.setText(t1.getText().toString()  +"0");
        }
        if(e.getSource()==b1)
        {
            t1.setText(t1.getText().toString()  +"1");
        }

        if(e.getSource()==b2)
        {
            t1.setText(t1.getText().toString()  +"2");
        }
        if(e.getSource()==b3)
        {
            t1.setText(t1.getText().toString()  +"3");
        }
        if(e.getSource()==b4)
        {
            t1.setText(t1.getText().toString()  +"4");
        }
        if(e.getSource()==b5)
        {
            t1.setText(t1.getText().toString()  +"5");
        }
        if(e.getSource()==b6)
        {
            t1.setText(t1.getText().toString()  +"6");
        }
        if(e.getSource()==b7)
        {
            t1.setText(t1.getText().toString()  +"7");
        }
        if(e.getSource()==b8)
        {
            t1.setText(t1.getText().toString()  +"8");
        }
        if(e.getSource()==b9)
        {
            t1.setText(t1.getText().toString()  +"9");
        }
        if(e.getSource()==b10)
        {
            t1.setText(t1.getText().toString()  +".");
        }



        if(e.getSource()==bb1)
        {
            f1=Double.parseDouble(t1.getText());
            t1.setText("0");
            add=true;
        }
        if(e.getSource()==bb2)
        {
            f1=Double.parseDouble(t1.getText());
            t1.setText("0");
            sub=true;
        }
        if(e.getSource()==bb3)
        {
            f1=Double.parseDouble(t1.getText());
            t1.setText("0");
            div=true;
        }
        if(e.getSource()==bb4)
        {
            f1=Double.parseDouble(t1.getText());
            t1.setText("0");
            mul=true;
        }

        if(e.getSource()==b11)
        {
            if(add==true) {
                if(equal==false) {
                    f1 = f1 + Double.parseDouble(t1.getText());
                    t2.setText(f1.toString());
                    equal=true;
                    f2=Double.parseDouble(t2.getText());
                }
                else {
                    f2 = f2 + Double.parseDouble(t1.getText());
                    t2.setText(f2.toString());
                }
                add = false;
            }

            if(sub==true) {
                if(equal==false) {
                    f1 = f1 - Double.parseDouble(t1.getText());
                    t2.setText(f1.toString());
                    equal=true;
                    f2=Double.parseDouble(t2.getText());
                }
                else {
                    f2 = f2 - Double.parseDouble(t1.getText());
                    t2.setText(f2.toString());
                }
                sub = false;
            }

            if(div==true) {
                if(equal==false) {
                    f1 = f1 / Double.parseDouble(t1.getText());
                    t2.setText(f1.toString());
                    equal=true;
                    f2=Double.parseDouble(t2.getText());
                }
                else {
                    f2 = f2 / Double.parseDouble(t1.getText());
                    t2.setText(f2.toString());
                }
                div = false;
            }

            if(mul==true) {
                if(equal==false) {
                    f1 = f1 * Double.parseDouble(t1.getText());
                    t2.setText(f1.toString());
                    equal=true;
                    f2=Double.parseDouble(t2.getText());
                }
                else {
                    f2 = f2 * Double.parseDouble(t1.getText());
                    t2.setText(f2.toString());
                }
                mul = false;
            }
        }

        if(e.getSource()==bbb1)
        {
            f1=0.0;
            add=false;
            sub=false;
            div=false;
            mul=false;
            t1.setText("0");
            t2.setText("0");
        }

        if(e.getSource()==bbb2)
        {
            String ss;
            ss=t1.getText().toString();
            int i=0;
            i=ss.length();
            i=i-1;
            t1.setText(ss.substring(0,i));
        }
    }
}

