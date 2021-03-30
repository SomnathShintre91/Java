import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class StopWatch extends JFrame implements ActionListener,Runnable
{
    JLabel disp,lap1,lap2,lap3;
    JButton btn,lapbtn;
        boolean stop=false;
    int i,j,k,l;
    static int count=0;
    public StopWatch()
    {
        disp=new JLabel();
        disp.setBounds(80,20,120,20);
        btn=new JButton("Start");
        btn.setBounds(250,20,80,20);
        disp.setFont(new Font("Helvetica",Font.PLAIN,20));
        disp.setBackground(Color.cyan);
        disp.setForeground(Color.red);
        Container c=getContentPane();
        c.setLayout(null);
        c.add(disp);
        c.add(btn);
        btn.addActionListener(this);
        lapbtn=new JButton("Lap");
        lapbtn.setBounds(200,80,80,20);
        c.add(lapbtn);
        lap1=new JLabel("");
        lap1.setBounds(100,120,100,30);
        c.add(lap1);
        lap2=new JLabel("");
        lap2.setBounds(100,160,100,30);
        c.add(lap2);
        lap3=new JLabel("");
        lap3.setBounds(100,200,100,30);
        c.add(lap3);
        lapbtn.addActionListener(this);
    }
    public void run()
    {
        for(i=0;;i++)
        {
            for(j=0;j<60;j++)
            {
                for(k=0;k<60;k++)
                {
                    for(l=0;l<100;l++)
                    {
                        if(stop)
                        {
                            break;
                        }
                        NumberFormat nf=new DecimalFormat("00");
                        disp.setText(nf.format(i)+":"+nf.format(j)+":"+nf.format(k)+":"+nf.format(l));
                        try
                        {
                            Thread.sleep(10);
                        }
                        catch(Exception e)
                        {
                        }
                    }
                }
            }
        }
    }
    public void actionPerformed(ActionEvent ae)
    {
        Thread t=new Thread(this);
            if(ae.getActionCommand().equals("Start"))
            {
                t.start();
                btn.setText("Stop");
            }
            if(ae.getActionCommand().equals("Stop"))
            {
            stop=true;
            }
            if(ae.getActionCommand().equals("Lap"))
            {
                String label=null;
                if(count==0)
                {
                    label=disp.getText();
                    lap1.setText(label);
                }
                if(count==1)
                {
                    label=disp.getText();
                    lap2.setText(label);
                }
                if(count==2)
                {
                    label=disp.getText();
                    lap3.setText(label);
                }
                count++;
            }
    }
    public static void main(String args[])
    {
        StopWatch s=new StopWatch();
        s.setSize(500,500);
        s.setVisible(true);
        s.setTitle("StopWatch");
        s.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}