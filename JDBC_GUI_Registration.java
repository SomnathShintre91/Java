import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.*;

public class JDBC_GUI_Registration extends JFrame implements ActionListener
{
	private JLabel lblNewUserRegister;
	private JFrame jf;
	private JPanel contentPane;
    private JTextField firstname;
    private JTextField lastname;
    private JTextField email;
    private JTextField username;
    private JTextField mob;
    private JPasswordField passwordField;
    private JButton btnNewButton1;
    private JButton btnNewButton2;
	
	JDBC_GUI_Registration(){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
		setTitle("Registration Form");
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        lblNewUserRegister = new JLabel("New User Register");
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        lblNewUserRegister.setBounds(362, 52, 325, 50);
        contentPane.add(lblNewUserRegister);

        JLabel lblName = new JLabel("First name");
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblName.setBounds(58, 152, 99, 43);
        contentPane.add(lblName);

        JLabel lblNewLabel = new JLabel("Last name");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setBounds(58, 243, 110, 29);
        contentPane.add(lblNewLabel);

        JLabel lblEmailAddress = new JLabel("Email\r\n address");
        lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblEmailAddress.setBounds(58, 324, 124, 36);
        contentPane.add(lblEmailAddress);

        firstname = new JTextField();
        firstname.setFont(new Font("Tahoma", Font.PLAIN, 32));
        firstname.setBounds(214, 151, 228, 50);
        contentPane.add(firstname);
        firstname.setColumns(10);

        lastname = new JTextField();
        lastname.setFont(new Font("Tahoma", Font.PLAIN, 32));
        lastname.setBounds(214, 235, 228, 50);
        contentPane.add(lastname);
        lastname.setColumns(10);

        email = new JTextField();

        email.setFont(new Font("Tahoma", Font.PLAIN, 32));
        email.setBounds(214, 320, 228, 50);
        contentPane.add(email);
        email.setColumns(10);

        username = new JTextField();
        username.setFont(new Font("Tahoma", Font.PLAIN, 32));
        username.setBounds(707, 151, 228, 50);
        contentPane.add(username);
        username.setColumns(10);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblUsername.setBounds(542, 159, 99, 29);
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPassword.setBounds(542, 245, 99, 24);
        contentPane.add(lblPassword);

        JLabel lblMobileNumber = new JLabel("Mobile number");
        lblMobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblMobileNumber.setBounds(542, 329, 139, 26);
        contentPane.add(lblMobileNumber);

        mob = new JTextField();
        mob.setFont(new Font("Tahoma", Font.PLAIN, 32));
        mob.setBounds(707, 320, 228, 50);
        contentPane.add(mob);
        mob.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
        passwordField.setBounds(707, 235, 228, 50);
        contentPane.add(passwordField);
		
		btnNewButton1 = new JButton("Register");   
        btnNewButton1.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton1.setBounds(199, 430, 259, 74);
		btnNewButton1.addActionListener(this); 
        contentPane.add(btnNewButton1);
		
		btnNewButton2 = new JButton("Login");   
        btnNewButton2.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton2.setBounds(590, 430, 259, 74);
		btnNewButton2.addActionListener(this); 
        contentPane.add(btnNewButton2);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == btnNewButton1)
		{
			String firstName = firstname.getText();
			String lastName = lastname.getText();
			String emailId = email.getText();
			String userName = username.getText();
			String mobileNumber = mob.getText();
			int len = mobileNumber.length();
			String password = passwordField.getText();

			String msg = "" + firstName;
			msg += " \n";
			if (len != 10) 
			{
				JOptionPane.showMessageDialog(lblNewUserRegister, "Enter a valid mobile number");
			}
			
			Connection con = null;
			PreparedStatement ps = null;

			try 
			{
				Class.forName("oracle.jdbc.OracleDriver");
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "sgmcoe", "som123");

				ps = con.prepareStatement("insert into JDBC_STUDENT_REGISTRATION values(?,?,?,?,?,?)");
				ps.setString(1,firstName);
				ps.setString(2,lastName);
				ps.setString(3,userName);
				ps.setString(4,password);
				ps.setString(5,emailId);
				ps.setString(6,mobileNumber);
				
				int x = ps.executeUpdate();
				if (x == 0) {
					JOptionPane.showMessageDialog(lblNewUserRegister, "This is alredy exist");
				} else if(x>0) {
					JOptionPane.showMessageDialog(lblNewUserRegister, "Welcome, " + msg + "Your account is sucessfully created");
				} else {
					JOptionPane.showMessageDialog(lblNewUserRegister, "Somethings Wrong");
				}
				con.close();
				
			}
			catch (Exception exception) 
			{
				exception.printStackTrace();
			}
		}
		if(ae.getSource() == btnNewButton2)
		{
			JDBC_GUI_Login form = new JDBC_GUI_Login();
			form.setVisible(true);
			this.setVisible(false);
		}
    }
	
	public static void main(String args[]){
		JDBC_GUI_Registration frame = new JDBC_GUI_Registration();
        frame.setVisible(true);
	}
	
}