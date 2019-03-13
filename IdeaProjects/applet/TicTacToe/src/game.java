import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

/**
 * Created by root on 12/7/17.
 */
public class game extends JApplet implements ActionListener {
    Container con;
    CardLayout cl;

    JPanel p1;
    JLabel l1;
    Boolean flag1=false;
    int qq;
    ImageIcon I, J;
    JButton b1, b2;

    JPanel p2,p3,p4;
    JButton bp1, bp2, bp3, bp4, bp5, bp6, bp7, bp8, bp9;
    BorderLayout bl;
    FlowLayout fl;
    GridLayout gl;
    int a[][]=new int[3][3];
    JLabel ll1;

    JPanel p5;
    JLabel lll1;

    JPanel p6;
    JButton bbbb;

    public void init() {
        a[0][0]=11;
        a[0][1]=12;
        a[0][2]=13;
        a[1][0]=14;
        a[1][1]=15;
        a[1][2]=16;
        a[2][0]=17;
        a[2][1]=18;
        a[2][2]=19;

        con = getContentPane();
        cl = new CardLayout();
        con.setLayout(cl);

        qq=1;
        flag1=false;

        p1 = new JPanel();
        l1 = new JLabel("The first player select's what he want");
        I = new ImageIcon("/root/Desktop/image/xsign.jpg");
        J = new ImageIcon("/root/Desktop/image/osign.jpg");
        b1 = new JButton();
        b2 = new JButton();
        b1.setIcon(I);
        b2.setIcon(J);
        p1.add(l1);
        p1.add(b1);
        p1.add(b2);

        p2 = new JPanel();
        bl=new BorderLayout();
        p2.setLayout(bl);


        p3 = new JPanel();
        fl=new FlowLayout(FlowLayout.CENTER);
        p3.setLayout(fl);
        ll1=new JLabel("");
        p3.add(ll1);


        p4 = new JPanel();
        gl = new GridLayout(3, 3);
        p4.setLayout(gl);
        bp1 = new JButton();
        bp2 = new JButton();
        bp3 = new JButton();
        bp4 = new JButton();
        bp5 = new JButton();
        bp6 = new JButton();
        bp7 = new JButton();
        bp8 = new JButton();
        bp9 = new JButton();
        p4.add(bp1);
        p4.add(bp2);
        p4.add(bp3);
        p4.add(bp4);
        p4.add(bp5);
        p4.add(bp6);
        p4.add(bp7);
        p4.add(bp8);
        p4.add(bp9);

        p6 = new JPanel();
        p6.setLayout(fl);
        bbbb=new JButton("Refresh");
        p6.add(bbbb);

        p2.add(p3,BorderLayout.NORTH);
        p2.add(p4,BorderLayout.CENTER);
        p2.add(p6,BorderLayout.WEST);


        p5=new JPanel();
        p5.setLayout(fl);
        lll1=new JLabel();
        p5.add(lll1);

        con.add(p1, "1");
        con.add(p2, "2");
        con.add(p5,"3");

        b1.addActionListener(this);
        b2.addActionListener(this);

        bp1.addActionListener(this);
        bp2.addActionListener(this);
        bp3.addActionListener(this);
        bp4.addActionListener(this);
        bp5.addActionListener(this);
        bp6.addActionListener(this);
        bp7.addActionListener(this);
        bp8.addActionListener(this);
        bp9.addActionListener(this);

        bbbb.addActionListener(this);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bbbb) {
            qq=1;
            a[0][0]=21;
            a[0][1]=22;
            a[0][2]=23;
            a[1][0]=24;
            a[1][1]=25;
            a[1][2]=26;
            a[2][0]=27;
            a[2][1]=28;
            a[2][2]=29;
            bp1.setIcon(new ImageIcon("/root/Desktop/image/123.jpg"));
            bp2.setIcon(new ImageIcon("/root/Desktop/image/123.jpg"));
            bp3.setIcon(new ImageIcon("/root/Desktop/image/123.jpg"));
            bp4.setIcon(new ImageIcon("/root/Desktop/image/123.jpg"));
            bp5.setIcon(new ImageIcon("/root/Desktop/image/123.jpg"));
            bp6.setIcon(new ImageIcon("/root/Desktop/image/123.jpg"));
            bp7.setIcon(new ImageIcon("/root/Desktop/image/123.jpg"));
            bp8.setIcon(new ImageIcon("/root/Desktop/image/123.jpg"));
            bp9.setIcon(new ImageIcon("/root/Desktop/image/123.jpg"));
        }

        if (e.getSource() == b1) {
            flag1 = true;
            cl.show(con, "2");
            ll1.setText("Player 1's turn");
        }
        if (e.getSource() == b2) {
            cl.show(con, "2");
            ll1.setText("Player 1's turn");
        }

        if (e.getSource()==bp1)
        {
            if(flag1==true  && qq%2==1)
            {
                bp1.setIcon(I);
                a[0][0]=1;
                check();
                ll1.setText("Player 2's turn");
            }
            if(flag1==false  && qq%2==1)
            {
                bp1.setIcon(J);
                a[0][0]=0;
                check();
                ll1.setText("Player 2's turn");
            }
            if(flag1==true  && qq%2==0)
            {
                bp1.setIcon(J);
                a[0][0]=0;
                check();
                ll1.setText("Player 1's turn");
            }
            if(flag1==false  && qq%2==0)
            {
                bp1.setIcon(I);
                a[0][0]=1;
                check();
                ll1.setText("Player 1's turn");
            }
            qq++;
        }

        if (e.getSource() == bp2)
        {
            if(flag1==true  && qq%2==1)
            {
                bp2.setIcon(I);
                a[0][1]=1;
                check();
                ll1.setText("Player 2's turn");
            }
            if(flag1==false  && qq%2==1)
            {
                bp2.setIcon(J);
                a[0][1]=0;
                check();
                ll1.setText("Player 2's turn");
            }
            if(flag1==true  && qq%2==0)
            {
                bp2.setIcon(J);
                a[0][1]=0;
                check();
                ll1.setText("Player 1's turn");
            }
            if(flag1==false  && qq%2==0)
            {
                bp2.setIcon(I);
                a[0][1]=1;
                check();
                ll1.setText("Player 1's turn");
            }
            qq++;
        }


        if (e.getSource() == bp3)
        {
            if(flag1==true  && qq%2==1)
            {
                bp3.setIcon(I);
                a[0][2]=1;
                check();
                ll1.setText("Player 2's turn");
            }
            if(flag1==false  && qq%2==1)
            {
                bp3.setIcon(J);
                a[0][2]=0;
                check();
                ll1.setText("Player 2's turn");
            }
            if(flag1==true  && qq%2==0)
            {
                bp3.setIcon(J);
                a[0][2]=0;
                check();
                ll1.setText("Player 1's turn");
            }
            if(flag1==false  && qq%2==0)
            {
                bp3.setIcon(I);
                a[0][2]=1;
                check();
                ll1.setText("Player 1's turn");
            }
            qq++;
        }


        if (e.getSource() == bp4)
        {
            if(flag1==true  && qq%2==1)
            {
                bp4.setIcon(I);
                a[1][0]=1;
                check();
                ll1.setText("Player 2's turn");
            }
            if(flag1==false  && qq%2==1)
            {
                bp4.setIcon(J);
                a[1][0]=0;
                check();
                ll1.setText("Player 2's turn");
            }
            if(flag1==true  && qq%2==0)
            {
                bp4.setIcon(J);
                a[1][0]=0;
                check();
                ll1.setText("Player 1's turn");
            }
            if(flag1==false  && qq%2==0)
            {
                bp4.setIcon(I);
                a[1][0]=1;
                check();
                ll1.setText("Player 1's turn");
            }
            qq++;
        }


        if (e.getSource() == bp5)
        {
            if(flag1==true  && qq%2==1)
            {
                bp5.setIcon(I);
                a[1][1]=1;
                check();
                ll1.setText("Player 2's turn");
            }
            if(flag1==false  && qq%2==1)
            {
                bp5.setIcon(J);
                a[1][1]=0;
                check();
                ll1.setText("Player 2's turn");
            }
            if(flag1==true  && qq%2==0)
            {
                bp5.setIcon(J);
                a[1][1]=0;
                check();
                ll1.setText("Player 1's turn");
            }
            if(flag1==false  && qq%2==0)
            {
                bp5.setIcon(I);
                a[1][1]=1;
                check();
                ll1.setText("Player 1's turn");
            }
            qq++;
        }


        if (e.getSource() == bp6)
        {
            if(flag1==true  && qq%2==1)
            {
                bp6.setIcon(I);
                a[1][2]=1;
                check();
                ll1.setText("Player 2's turn");
            }
            if(flag1==false  && qq%2==1)
            {
                bp6.setIcon(J);
                a[1][2]=0;
                check();
                ll1.setText("Player 2's turn");
            }
            if(flag1==true  && qq%2==0)
            {
                bp6.setIcon(J);
                a[1][2]=0;
                check();
                ll1.setText("Player 1's turn");
            }
            if(flag1==false  && qq%2==0)
            {
                bp6.setIcon(I);
                ll1.setText("Player 1's turn");
                check();
                a[1][2]=1;
            }
            qq++;
        }


        if (e.getSource() == bp7)
        {
            if(flag1==true  && qq%2==1)
            {
                bp7.setIcon(I);
                a[2][0]=1;
                check();
                ll1.setText("Player 2's turn");
            }
            if(flag1==false  && qq%2==1)
            {
                bp7.setIcon(J);
                a[2][0]=0;
                check();
                ll1.setText("Player 2's turn");
            }
            if(flag1==true  && qq%2==0)
            {
                bp7.setIcon(J);
                a[2][0]=0;
                check();
                ll1.setText("Player 1's turn");
            }
            if(flag1==false  && qq%2==0)
            {
                bp7.setIcon(I);
                a[2][0]=1;
                check();
                ll1.setText("Player 1's turn");
            }
            qq++;
        }


        if (e.getSource() == bp8)
        {
            if(flag1==true  && qq%2==1)
            {
                bp8.setIcon(I);
                a[2][1]=1;
                check();
                ll1.setText("Player 2's turn");
            }
            if(flag1==false  && qq%2==1)
            {
                bp8.setIcon(J);
                a[2][1]=0;
                check();
                ll1.setText("Player 2's turn");
            }
            if(flag1==true  && qq%2==0)
            {
                bp8.setIcon(J);
                a[2][1]=0;
                check();
                ll1.setText("Player 1's turn");
            }
            if(flag1==false  && qq%2==0)
            {
                bp8.setIcon(I);
                a[2][1]=1;
                check();
                ll1.setText("Player 1's turn");
            }
            qq++;
        }


        if (e.getSource() == bp9)
        {
            if(flag1==true  && qq%2==1)
            {
                bp9.setIcon(I);
                a[2][2]=1;
                check();
                ll1.setText("Player 2's turn");
            }
            if(flag1==false  && qq%2==1)
            {
                bp9.setIcon(J);
                a[2][2]=0;
                check();
                ll1.setText("Player 2's turn");
            }
            if(flag1==true  && qq%2==0)
            {
                bp9.setIcon(J);
                a[2][2]=0;
                check();
                ll1.setText("Player 1's turn");
            }
            if(flag1==false  && qq%2==0)
            {
                bp9.setIcon(I);
                a[2][2]=1;
                check();
                ll1.setText("Player 1's turn");
            }
            qq++;
        }

    }
    void check()
    {
        for(int i=0;i<3;i++)
        {
            if(a[i][0]==a[i][1] && a[i][1]==a[i][2])
            {
                if(a[i][0]==1) {
                    lll1.setText("player 1 wins");
                }
                else {
                    lll1.setText("player 2 wins");
                }
                cl.show(con, "3");
            }
            if(a[0][i]==a[1][i] && a[1][i]==a[2][i])
            {
                if(a[0][i]==1) {
                    lll1.setText("player 1 wins");
                }
                else {
                    lll1.setText("player 2 wins");
                }

                cl.show(con, "3");
            }
        }
        if(a[0][0]==a[1][1] && a[1][1]==a[2][2])
        {
            if(a[0][0]==1) {
                lll1.setText("player 1 wins");
            }
            else {
                lll1.setText("player 2 wins");
            }
            cl.show(con, "3");
        }
        if(a[0][2]==a[1][1] && a[1][1]==a[2][0])
        {
            if(a[0][2]==1) {
                lll1.setText("player 1 wins");
            }
            else {
                lll1.setText("player 2 wins");
            }
            cl.show(con, "3");
        }

    }


}
