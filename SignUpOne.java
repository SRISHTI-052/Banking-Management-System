package bms;


import javax.swing.*;
import java.awt.*;
import java. util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignUpOne extends JFrame implements ActionListener{
	
	long random;
	JTextField nameTextField,fNameTextField,emailTextField,addressTextField,cityTextField,stateTextField,pinCodeTextField;
	JButton next;
	JRadioButton male, female,other,married,unmarried;
	JDateChooser  dateChooser;
	JLabel marital;
SignUpOne()
{
	setLayout(null);
	
	
	
	Random ran= new Random();
	long randomNumber=Math.abs(ran.nextLong()%9000L)+1000L;
	
	random = randomNumber;
	
	
	JLabel formNumber=new JLabel("APPLICATION FORM No."+ randomNumber);
	formNumber.setFont(new Font("Raleway",Font.BOLD,38));
	formNumber.setBounds(140,20,600,40);
	add(formNumber);
	
	JLabel personalDetails=new JLabel("Page 1: PERSONAL DETAILS");
	personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
	personalDetails.setBounds(290,80,400,30);
	add(personalDetails);
	
	JLabel name=new JLabel("Name:");
	name.setFont(new Font("Raleway",Font.BOLD,20));
	name.setBounds(100,140,100,30);
	add(name);
	
	nameTextField=new JTextField();
	nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
	nameTextField.setBounds(300,140,400,30);
	add(nameTextField);
	
	JLabel fName=new JLabel("Father's Name:");
	fName.setFont(new Font("Raleway",Font.BOLD,20));
	fName.setBounds(100,190,400,30);
	add(fName);
	
	 fNameTextField=new JTextField();
	fNameTextField.setFont(new Font("Raleway",Font.BOLD,14));
	fNameTextField.setBounds(300,190,400,30);
	add(fNameTextField);
	
	JLabel dob=new JLabel("Date Of Birth:");
	dob.setFont(new Font("Raleway",Font.BOLD,20));
	dob.setBounds(100,240,400,30);
	add(dob);
	
	 dateChooser=new JDateChooser();
//	dateChooser.setFont(new Font("Raleway",Font.BOLD,14));
	dateChooser.setBounds(300,240,400,30);
	dateChooser.setForeground(new Color(105,105,105));
	add(dateChooser);
	
	JLabel gender=new JLabel("Gender:");
	gender.setFont(new Font("Raleway",Font.BOLD,20));
	gender.setBounds(100,290,400,30);
	add(gender);
	
	male = new JRadioButton("Male");
//	genderTextField.setFont(new Font("Raleway",Font.BOLD,14));
	male.setBounds(300,290,60,30);
	male.setBackground(Color.WHITE);
	add(male);
	
	female = new JRadioButton("Female");
	female.setBounds(450,290,120,30);
	female.setBackground(Color.WHITE);
	add(female);
	
	ButtonGroup gendergroup=new ButtonGroup();
	gendergroup.add(male);
	gendergroup.add(female);	
	
	
	JLabel email=new JLabel("E-mail:");
	email.setFont(new Font("Raleway",Font.BOLD,20));
	email.setBounds(100,340,400,30);
	add(email);
	
	emailTextField=new JTextField();
	emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
	emailTextField.setBounds(300,340,400,30);
	add(emailTextField);
	
	marital = new JLabel("Marital Status:");
	marital.setFont(new Font("Raleway",Font.BOLD,20));
	marital.setBounds(100,390,400,30);
	add(marital);
	
	married=new JRadioButton("Married");
	married.setBounds(300,390,100,30);
	married.setBackground(Color.WHITE);
	add(married);
	
	
	unmarried=new JRadioButton("Unmarried");
	unmarried.setBounds(450,390,100,30);
	unmarried.setBackground(Color.WHITE);
	add(unmarried);
	
	
	other=new JRadioButton("Other");
	other.setBounds(630,390,100,30);
	other.setBackground(Color.WHITE);
	add(other);
	
	ButtonGroup maritalgroup=new ButtonGroup();
	maritalgroup.add(married);
	maritalgroup.add(unmarried);
	maritalgroup.add(other);
	
	JLabel address=new JLabel("Address:");
	address.setFont(new Font("Raleway",Font.BOLD,20));
	address.setBounds(100,440,400,30);
	add(address);
	
	addressTextField=new JTextField();
	addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
	addressTextField.setBounds(300,440,400,30);
	add(addressTextField);
	
	JLabel city=new JLabel("City:");
	city.setFont(new Font("Raleway",Font.BOLD,20));
	city.setBounds(100,490,400,30);
	add(city);
	
	 cityTextField=new JTextField();
	cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
	cityTextField.setBounds(300,490,400,30);
	add(cityTextField);
	
	
	JLabel state=new JLabel("State:");
	state.setFont(new Font("Raleway",Font.BOLD,20));
	state.setBounds(100,540,400,30);
	add(state);
	
	stateTextField=new JTextField();
	stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
	stateTextField.setBounds(300,540,400,30);
	add(stateTextField);
	
	
	JLabel pinCode=new JLabel("Pin Code:");
	pinCode.setFont(new Font("Raleway",Font.BOLD,20));
	pinCode.setBounds(100,590,400,30);
	add(pinCode);
	
	pinCodeTextField=new JTextField();
	pinCodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
	pinCodeTextField.setBounds(300,590,400,30);
	add(pinCodeTextField);
	
	
	
	 next=new JButton("Next");
	next.setBackground(Color.BLACK);
	next.setForeground(Color.WHITE);
	next.setFont(new Font("Raleway",Font.BOLD,14));
	next.setBounds(620,660,80,30);
	next.addActionListener(this);
	add(next);
	
	
//	Frame getContentPane = null;
	getContentPane().setBackground(Color.WHITE);
	setSize(850,800);
	setLocation(350,10);
	setVisible(true);
}


public void actionPerformed(ActionEvent ae)
{
	String formNumber=""+random;
	String name=nameTextField.getText();
	String fname=fNameTextField.getText();
	String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
	String sgender=null;
	if(male.isSelected())
	{
		sgender="Male";
	}
        else if(female.isSelected()) 
	{
		sgender="Female";
	}
	String email=emailTextField.getText();
	String smarital=null;
	if(married.isSelected())
	{
		smarital="married";
	}
	else if(unmarried.isSelected())
	{
		smarital="unmarried";	
	}
	else 
	{
		smarital="other";
	}
	
	String address=addressTextField.getText();
	String city=cityTextField.getText();
	String state=stateTextField.getText();
	String pinCode=pinCodeTextField.getText();
	
	
	
	try
	{
		if (name.equals("")) {
			JOptionPane.showMessageDialog(null,"Name is required");
		}
		else
		{
                    Conn c = new Conn();
                    String query="INSERT INTO SIGNUP VALUES('"+formNumber+"','"+name+"','"+fname+"','"+dob+"','"+sgender+"','"+email+"','"+smarital+"','"+address+"','"+city+"','"+state+"','"+pinCode+"')";
                    c.s.executeUpdate(query);
                    
                    setVisible(false);
                    new SignUpTwo(formNumber).setVisible(true);
		}
	}catch(Exception e)
	{
		System.out.println(e);
	}
}
	public static void main(String args[])
	{
		new SignUpOne();
	}
}
