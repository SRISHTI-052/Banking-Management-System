
package bms;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;


public class SignUpThree extends JFrame implements ActionListener{
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit, cancel;
    String formNumber;
    
    SignUpThree(String formNumber){
        
        this.formNumber = formNumber;
        setLayout(null);
        
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280, 40, 400,40);
        add(l1);
       
        JLabel type = new JLabel("Account Type:");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100, 140, 200,30);
        add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100, 180, 150, 30);
        add(r1);
        
        r2 = new JRadioButton("Current Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(450, 180, 150, 30);
        add(r2);
        
        r3 = new JRadioButton("Fixed Deposit Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(450, 235, 250, 30);
        add(r3);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(100, 235, 250, 30);
        add(r4);
        
        ButtonGroup accountgroup=new ButtonGroup();
	accountgroup.add(r1);
	accountgroup.add(r2);
	accountgroup.add(r3);
        accountgroup.add(r4);
        
        JLabel card = new JLabel("Card Number:");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100, 300, 200,30);
        add(card);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-1234");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(350, 300, 300,30);
        add(number);
        
        JLabel cdetail = new JLabel("Your 16 Digit Card Number");
        cdetail.setFont(new Font("Raleway",Font.BOLD,13));
        cdetail.setBounds(100, 330, 300, 20);
        add(cdetail);
        
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100, 380, 200,30);
        add(pin);
        
        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(350, 380, 300,30);
        add(pnumber);
        
        JLabel pdetail = new JLabel("Your 4 Digit PIN");
        pdetail.setFont(new Font("Raleway",Font.BOLD,13));
        pdetail.setBounds(100, 410, 300, 20);
        add(pdetail);
        
        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100, 455, 250,30);
        add(services);
        
        c1 = new JCheckBox("    ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100, 510, 200,30);
        add(c1);
        
        c2 = new JCheckBox("    Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350, 510, 200,30);
        add(c2);
        
        c3 = new JCheckBox("    Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100, 560, 200,30);
        add(c3);
        
        c4 = new JCheckBox("    Email & SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350, 560, 200,30);
        add(c4);
        
        c5 = new JCheckBox("    Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100, 610, 200,30);
        add(c5);
        
        c6 = new JCheckBox("    eStatements");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350, 610, 200,30);
        add(c6);
        
        c7 = new JCheckBox("    I hereby declares that the above entered details are correct to the best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD,13));
        c7.setBounds(100, 680, 600,30);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(300, 750, 100, 30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(435, 750, 100, 30);
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 870);
        setLocation(350, 0);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            String accountType = null;
            if(r1.isSelected()){
                accountType = "Savings Account";
            }
            else if(r2.isSelected()){
                accountType = "Current Account";
            }
            else if(r3.isSelected()){
            accountType = "Fixed Deposit Account";
            }
            else if(r4.isSelected()){
            accountType = "Recurring Deposit Account";
            }
            
            Random random = new Random();
            String cardno = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
            String pinno = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
            
            String facilities = "";
            if(c1.isSelected()){
                facilities = facilities + "ATM Card ";
            }
            else if(c2.isSelected()){
                facilities = facilities + "Internet Banking ";
            }
            else if(c3.isSelected()){
                facilities = facilities + "Mobile Banking ";
            }
            else if(c4.isSelected()){
                facilities = facilities + "Email & SMS Alerts ";
            }
            else if(c5.isSelected()){
                facilities = facilities + "Cheque Book ";
            }
            else if(c6.isSelected()){
                facilities = facilities + "eStatements ";
            }
            
            try{
                if(accountType == null){
                    JOptionPane.showMessageDialog(null, "Account Type is Required");
                }
                else if(!c7.isSelected()){
                    JOptionPane.showMessageDialog(null, "Declaration is Required");                    
                }
                else{
                    Conn conn = new Conn();
                    String query1 = "insert into signupthree values('"+formNumber+"', '"+accountType+"', '"+cardno+"', '"+pinno+"', '"+facilities+"')";
                    String query2 = "insert into login values('"+formNumber+"', '"+cardno+"', '"+pinno+"')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    
                    JOptionPane.showMessageDialog(null, "Card Number:   " + cardno + "\n PIN:   " + pinno);
                
                    setVisible(false);
                    new Deposit(pinno).setVisible(true);
                
                }
                
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        else if(ae.getSource() == cancel){
            try{
                Conn conn = new Conn();
                String query3 = "delete from signup where formNumber = '"+formNumber+"'";
                String query4 = "delete from signuptwo where formNumber = '"+formNumber+"'";            
                conn.s.executeUpdate(query3);
                conn.s.executeUpdate(query4);
                JOptionPane.showMessageDialog(null, "Registration Cancelled");
                setVisible(false);
                new Login().setVisible(true);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String atrgs[]){
        new SignUpThree("");
    }
}
