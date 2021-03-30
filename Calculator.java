import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {

    public int b=0,c=0;
		double d=0;
		StringBuilder s1 = new StringBuilder();
		String s2;
	public Calculator(){
		
		JTextField t = new JTextField(20);
		JTextField t1 = new JTextField(20);
		JButton b0 = new JButton("0");
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton b10 = new JButton("+");
		JButton b11 = new JButton("-");
		JButton b12 = new JButton("X");
		JButton b13 = new JButton("/");
        JButton b14 = new JButton("=");
        
		add(t);
		add(t1);
		add(b0);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b11);
		add(b12);
		add(b13);
        add(b14);
        
		t.setText("0");
        t1.setText("0");
        
		b0.addActionListener(ae->{ t.setText(t.getText()+"0");
					s1.append("0");});
		b1.addActionListener(ae->{ t.setText(t.getText()+"1");
					s1.append("1");});
		b2.addActionListener(ae->{ t.setText(t.getText()+"2");
					s1.append("2");});
		b3.addActionListener(ae->{ t.setText(t.getText()+"3");
					s1.append("3");});
		b4.addActionListener(ae->{ t.setText(t.getText()+"4");
					s1.append("4");});
		b5.addActionListener(ae->{ t.setText(t.getText()+"5");
					s1.append("5");});
		b6.addActionListener(ae->{ t.setText(t.getText()+"6");
					s1.append("6");});
		b7.addActionListener(ae->{t.setText(t.getText()+"7");
					s1.append("7");});
		b8.addActionListener(ae->{ t.setText(t.getText()+"8");
					s1.append("8");});
		b9.addActionListener(ae->{ t.setText(t.getText()+"9");
					s1.append("9");});
		b10.addActionListener(ae->{ t.setText(t.getText()+"+");
					c=1;s2=s1.toString();b=Integer.parseInt(s2);s2=null;s1=new StringBuilder(); });
		b11.addActionListener(ae->{ t.setText(t.getText()+"-");
					c=2;s2=s1.toString();b=Integer.parseInt(s2);s2=null;s1=new StringBuilder();});
		b12.addActionListener(ae->{ t.setText(t.getText()+"*");
					c=3;s2=s1.toString();b=Integer.parseInt(s2);s2=null;s1=new StringBuilder();});
		b13.addActionListener(ae->{ t.setText(t.getText()+"/");
					c=4;s2=s1.toString();b=Integer.parseInt(s2);s2=null;s1=new StringBuilder();});
		b14.addActionListener(ae -> { 
			s2=s1.toString();
			if(c==1){
				d=b+(Integer.parseInt(s2));
			} else if(c==2){
				d=b-(Integer.parseInt(s2));
			} else if(c==3){ 
				d=b*(Integer.parseInt(s2));
			} else{
				d=(double)b/(double)(Integer.parseInt(s2));
			}
			s2=null;
			s1=new StringBuilder();
			t1.setText(d +"");
			t.setText("");
		});

		setLayout(new FlowLayout());
		setSize(250,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}

    public static void main(String[] args) {
        new Calculator();
    }
}
