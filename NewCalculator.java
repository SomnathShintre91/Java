import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NewCalculator extends JFrame {

    // Instance variables
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button0;
    private JButton buttonS;
    private JButton buttonE;
    private JButton buttonP;
    private JButton buttonM;
    private JButton buttonMu;
    private JButton buttonDi;
    private JTextField jTextField1;
    private JTextField jTextField2;

    String query = "";
    String enter = "";
    int result = 0;

    //  Constructor
    public NewCalculator(){

        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        button0 = new JButton("0");
        buttonS = new JButton("CE");
        buttonE = new JButton("=");
        buttonP = new JButton("+");
        buttonM = new JButton("-");
        buttonMu = new JButton("X");
        buttonDi = new JButton("/");

        jTextField1 = new JTextField(7);
        jTextField2 = new JTextField(25);

        //  add textfield to frame
        add(jTextField2);
        add(jTextField1);

        // add buttons to frame
        add(button7);
        add(button8);
        add(button9);
        add(buttonDi);

        add(button4);
        add(button5);
        add(button6);
        add(buttonMu);

        add(button3);
        add(button2);
        add(button1);
        add(buttonM);

        add(buttonS);
        add(button0);
        add(buttonE);
        add(buttonP);


        // set properties for textfiedl
        jTextField2.setFont(new Font("MV Boli", 0, 18));
        jTextField2.setHorizontalAlignment(JTextField.RIGHT);
        jTextField2.setBorder(null);
        jTextField2.setOpaque(false);
        jTextField2.setEditable(false);

        jTextField1.setFont(new Font("MS Reference Sans Serif", 0, 60)); 
        jTextField1.setHorizontalAlignment(JTextField.RIGHT);
        jTextField1.setText("0");
        jTextField1.setBorder(null);
        jTextField1.setOpaque(false);


        // set dimensions to duttons
        Dimension D = new Dimension(94,50);
        button7.setPreferredSize(D);
        button8.setPreferredSize(D);
        button9.setPreferredSize(D);
        buttonDi.setPreferredSize(D);

        button4.setPreferredSize(D);
        button5.setPreferredSize(D);
        button6.setPreferredSize(D);
        buttonMu.setPreferredSize(D);

        button1.setPreferredSize(D);
        button2.setPreferredSize(D);
        button3.setPreferredSize(D);
        buttonM.setPreferredSize(D);

        buttonS.setPreferredSize(D);
        button0.setPreferredSize(D);
        buttonE.setPreferredSize(D);
        buttonP.setPreferredSize(D);


        // add ActionListener to each button
        buttonS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                query = "";
                enter = "";
                result = 0;
                jTextField1.setText("0");
                jTextField2.setText(query);
            }
        });

        button0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if("".equals(enter)){
                    enter = "0";
                    jTextField1.setText(enter);
                } else {
                    String s = jTextField1.getText();
                    enter = s + "0";
                    jTextField1.setText("");
                    jTextField1.setText(enter);
                }
            }
        });

        buttonE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if( result == 0){
                    query = "";
                    jTextField2.setText(query);
                } else if(result == Integer.parseInt(jTextField1.getText())){
                    query = "";
                    jTextField2.setText(query);
                    jTextField1.setText(String.valueOf(result));
                    result = 0;
                } else if (result != Integer.parseInt(jTextField1.getText())){
                    char O = query.charAt(query.length() -1);
                    if( O == '+'){
                        result = result + Integer.parseInt(jTextField1.getText());
                    } else if( 0 == '-'){
                        result = result - Integer.parseInt(jTextField1.getText());
                    } else if(0 == 'X'){
                        result = result * Integer.parseInt(jTextField1.getText());
                    } else if(0 == '/'){
                        result = result / Integer.parseInt(jTextField1.getText());
                    }
                    query = "";
                    jTextField2.setText(query);
                    jTextField1.setText(String.valueOf(result));
                    result = 0;
                }
            }
        });

        buttonP.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if("".equals(query)){
                    String s = jTextField1.getText();
                    enter = "";
                    query = s + "+";
                    jTextField2.setText(query);
                    result += Integer.parseInt(s);
                    jTextField1.setText(String.valueOf(result));
                } else {
                    String s = jTextField1.getText();
                    enter = "";
                    query += s + "+";
                    jTextField2.setText(query);
                    result += Integer.parseInt(s);
                    jTextField1.setText(String.valueOf(result));
                }
            }
        });

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if("".equals(enter)){
                    enter = "1";
                    jTextField1.setText(enter);
                } else {
                    String s = jTextField1.getText();
                    enter = s + "1";
                    jTextField1.setText("");
                    jTextField1.setText(enter);
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if("".equals(enter)){
                    enter = "2";
                    jTextField1.setText(enter);
                } else {
                    String s = jTextField1.getText();
                    enter = s + "2";
                    jTextField1.setText("");
                    jTextField1.setText(enter);
                }
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if("".equals(enter)){
                    enter = "3";
                    jTextField1.setText(enter);
                } else {
                    String s = jTextField1.getText();
                    enter = s + "3";
                    jTextField1.setText("");
                    jTextField1.setText(enter);
                }
            }
        });

        buttonM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if("".equals(query)){
                    String s = jTextField1.getText();
                    enter = "";
                    query = s + "-";
                    jTextField2.setText(query);
                    result = Integer.parseInt(s);
                    jTextField1.setText(s);
                } else {
                    String s = jTextField1.getText();
                    enter = "";
                    query += s + "-";
                    jTextField2.setText(query);
                    result -= Integer.parseInt(s);
                    jTextField1.setText(String.valueOf(result));
                }
            }
        });

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if("".equals(enter)){
                    enter = "4";
                    jTextField1.setText(enter);
                } else {
                    String s = jTextField1.getText();
                    enter = s + "4";
                    jTextField1.setText("");
                    jTextField1.setText(enter);
                }
            }
        });

        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if("".equals(enter)){
                    enter = "5";
                    jTextField1.setText(enter);
                } else {
                    String s = jTextField1.getText();
                    enter = s + "5";
                    jTextField1.setText("");
                    jTextField1.setText(enter);
                }
            }
        });

        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if("".equals(enter)){
                    enter = "6";
                    jTextField1.setText(enter);
                } else {
                    String s = jTextField1.getText();
                    enter = s + "6";
                    jTextField1.setText("");
                    jTextField1.setText(enter);
                }
            }
        });

        buttonMu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if("".equals(query)){
                    String s = jTextField1.getText();
                    enter = "";
                    query = s + "X";
                    jTextField2.setText(query);
                    result = Integer.parseInt(s);
                    jTextField1.setText(String.valueOf(result));
                } else {
                    String s = jTextField1.getText();
                    enter = "";
                    query = s + "X";
                    jTextField2.setText(query);
                    result *= Integer.parseInt(s);
                    jTextField1.setText(String.valueOf(result));
                }
            }
        });

        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if("".equals(enter)){
                    enter = "7";
                    jTextField1.setText(enter);
                } else {
                    String s = jTextField1.getText();
                    enter = s + "7";
                    jTextField1.setText("");
                    jTextField1.setText(enter);
                }
            }
        });

        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if("".equals(enter)){
                    enter = "8";
                    jTextField1.setText(enter);
                } else {
                    String s = jTextField1.getText();
                    enter = s + "8";
                    jTextField1.setText("");
                    jTextField1.setText(enter);
                }
            }
        });

        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if("".equals(enter)){
                    enter = "9";
                    jTextField1.setText(enter);
                } else {
                    String s = jTextField1.getText();
                    enter = s + "9";
                    jTextField1.setText("");
                    jTextField1.setText(enter);
                }
            }
        });

        buttonDi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if("".equals(query)){
                    String s = jTextField1.getText();
                    enter = "";
                    query = s + "/";
                    jTextField2.setText(query);
                    result = Integer.parseInt(s);
                    jTextField1.setText(String.valueOf(result));
                } else {
                    String s = jTextField1.getText();
                    enter = "";
                    query += s + "/";
                    jTextField2.setText(query);
                    result /= Integer.parseInt(s);
                    jTextField1.setText(String.valueOf(result));
                }
            }
        });


        // set properties for frame
        setBackground(new java.awt.Color(51, 51, 51));
        setTitle("Caculator");
        setLayout(new FlowLayout());
		setSize(424,400);
		setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public static void main(String[] args) {

        new NewCalculator();
    }
}