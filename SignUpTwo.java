package bms;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SignUpTwo extends JFrame implements ActionListener{
	
	JTextField pan,adhar;
	JButton next;
	JRadioButton syes, sno, eyes, eno;
	JLabel marital,panNO;
        JComboBox religion, category, occupation, education, income;
        String formNumber;
        
SignUpTwo(String formNumber)
{
        this.formNumber = formNumber;
	setLayout(null);
	
        setTitle("NEW ACCOUNT APPLICATION - PAGE 2");
        
	JLabel additionalDetails=new JLabel("Page 2: Additional DETAILS");
	additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
	additionalDetails.setBounds(290,80,400,30);
	add(additionalDetails);
	
	JLabel name=new JLabel("Religion:");
	name.setFont(new Font("Raleway",Font.BOLD,20));
	name.setBounds(100,140,100,30);
	add(name);
	
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
	add(religion);

	JLabel fName=new JLabel("Category:");
	fName.setFont(new Font("Raleway",Font.BOLD,20));
	fName.setBounds(100,190,400,30);
	add(fName);
	
	String valCategory[] = {"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox(valCategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
	add(category);
	
	JLabel dob=new JLabel("Income:");
	dob.setFont(new Font("Raleway",Font.BOLD,20));
	dob.setBounds(100,240,400,30);
	add(dob);
	
	String incomeCategory[] = {"Null", "less than 1,50,000", "less than 5,00,000", "less than 10,00,000", "more than 10,00,000"};
        income = new JComboBox(incomeCategory);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
	add(income);
	
	JLabel gender=new JLabel("Educational");
	gender.setFont(new Font("Raleway",Font.BOLD,20));
	gender.setBounds(100,290,200,30);
	add(gender);
	
	JLabel email=new JLabel("Qualification:");
	email.setFont(new Font("Raleway",Font.BOLD,20));
	email.setBounds(100,315,400,30);
	add(email);
	
	String valEducation[] = {"High School", "Graduation", "Post-Graduation", "PHD", "Other"};
        education = new JComboBox(valEducation);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
	add(education);
	
	marital = new JLabel("Occupation:");
	marital.setFont(new Font("Raleway",Font.BOLD,20));
	marital.setBounds(100,370,400,30);
	add(marital);
	
	String valOccupation[] = {"Unemployed", "Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Other"};
        occupation = new JComboBox(valOccupation);
        occupation.setBounds(300,370,400,30);
        occupation.setBackground(Color.WHITE);
	add(occupation);
	
	panNO=new JLabel("PAN Number:");
	panNO.setFont(new Font("Raleway",Font.BOLD,20));
	panNO.setBounds(100,420,400,30);
	add(panNO);
	
	pan=new JTextField();
	pan.setFont(new Font("Raleway",Font.BOLD,14));
	pan.setBounds(300,420,400,30);
	add(pan);
	
	JLabel adharNo=new JLabel("Adhar Number:");
	adharNo.setFont(new Font("Raleway",Font.BOLD,20));
	adharNo.setBounds(100,470,400,30);
	add(adharNo);
	
	adhar=new JTextField();
	adhar.setFont(new Font("Raleway",Font.BOLD,14));
	adhar.setBounds(300,470,400,30);
	add(adhar);
	
	
	JLabel state=new JLabel("Senior Citizen:");
	state.setFont(new Font("Raleway",Font.BOLD,20));
	state.setBounds(100,520,400,30);
	add(state);
	
	syes = new JRadioButton("Yes");
//	genderTextField.setFont(new Font("Raleway",Font.BOLD,14));
	syes.setBounds(300,520,60,30);
	syes.setBackground(Color.WHITE);
	add(syes);
	
	sno = new JRadioButton("No");
	sno.setBounds(450,520,120,30);
	sno.setBackground(Color.WHITE);
	add(sno);
	
	ButtonGroup sCitizen=new ButtonGroup();
	sCitizen.add(syes);
	sCitizen.add(sno);
	
	
	JLabel pinCode=new JLabel("Existing Account:");
	pinCode.setFont(new Font("Raleway",Font.BOLD,20));
	pinCode.setBounds(100,570,400,30);
	add(pinCode);
	
	eyes = new JRadioButton("Yes");
//	genderTextField.setFont(new Font("Raleway",Font.BOLD,14));
	eyes.setBounds(300,570,60,30);
	eyes.setBackground(Color.WHITE);
	add(eyes);
	
	eno = new JRadioButton("No");
	eno.setBounds(450,570,120,30);
	eno.setBackground(Color.WHITE);
	add(eno);
	
	ButtonGroup existingAcc=new ButtonGroup();
	existingAcc.add(eyes);
	existingAcc.add(eno);
	
	
	
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
	String sreligion= (String) religion.getSelectedItem();
	String scategory = (String) category.getSelectedItem();
	String sincome = (String) income.getSelectedItem();
	String seducation = (String) education.getSelectedItem();
	String soccupation = (String) occupation.getSelectedItem();
	String span = pan.getText();
        String sadhar = adhar.getText();
        String scitizen = null;
	if(syes.isSelected())
	{
		scitizen="Yes";
	}
	else 
	{
		scitizen="No";
	}
        
	String existingacc = null;
	if(eyes.isSelected())
	{
		existingacc="Yes";
	}
	else 
	{
		existingacc="No";
	}
        
	try
	{
            Conn c = new Conn();
            String query="INSERT INTO SIGNUPTWO VALUES('"+formNumber+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+sadhar+"','"+scitizen+"','"+existingacc+"')";
            c.s.executeUpdate(query);
            
            setVisible(false);
            new SignUpThree(formNumber).setVisible(true);
	}catch(Exception e)
	{
		System.out.println(e);
	}
}
	public static void main(String args[])
	{
		new SignUpTwo("");
	}
}
