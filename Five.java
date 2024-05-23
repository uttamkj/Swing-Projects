import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Five implements ActionListener{
	JFrame frame;
	JLabel heading,lname,lroll,lmobile,lemail,laddress,lcgpa,gender;
	JTextField fname,froll,fmobile,femail,fcgpa;
	JTextArea taAdress;
	JRadioButton genderm,genderf;
	JButton addbtn;
	Five(){
		frame = new JFrame("Add Student");
		frame.setSize(450,690);
		frame.setLocation(300,150);
		frame.setLayout(null);
		
		heading = new JLabel("Add Student");
		heading.setBounds(150,20,200,50);
		frame.add(heading);
		
		Font f = new Font("Arial",Font.BOLD,30);
		heading.setFont(f);
		heading.setForeground(Color.RED);
		//name
		lname = new JLabel("Name");
		lname.setBounds(30,70,350,30);
		frame.add(lname);
		
		fname = new JTextField();
		fname.setBounds(30,110,250,30);
		frame.add(fname);
		//roll
		lroll = new JLabel("Roll");
		lroll.setBounds(30,150,350,30);
		frame.add(lroll);
		
		froll = new JTextField();
		froll.setBounds(30,190,250,30);
		frame.add(froll);
		
		//mobile
		lmobile = new JLabel("Mobile");
		lmobile.setBounds(30,230,350,30);
		frame.add(lmobile);
		
		fmobile = new JTextField();
		fmobile.setBounds(30,270,250,30);
		frame.add(fmobile);
		
		//email
		lemail = new JLabel("Email");
		lemail.setBounds(30,310,350,30);
		frame.add(lemail);
		
		femail = new JTextField();
		femail.setBounds(30,350,250,30);
		frame.add(femail);
		//address
		laddress = new JLabel("Address");
		laddress.setBounds(30,390,350,30);
		frame.add(laddress);
		
		taAdress = new JTextArea();
		taAdress.setBounds(30,410,350,80);
		frame.add(taAdress);
		
		//gender radio btn
		gender = new JLabel("Gender");
		gender.setBounds(30,500,100,20);
		frame.add(gender);
		
		genderm = new JRadioButton("Male");
		genderm.setBounds(140,500,100,20);
		frame.add(genderm);
		
		genderf = new JRadioButton("Female");
		genderf.setBounds(250,500,100,20);
		frame.add(genderf);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(genderf);
		bg.add(genderm);
		//cgpa 
		lcgpa = new JLabel("CGPA");
		lcgpa.setBounds(30,530,100,20);
		frame.add(lcgpa);
		
		fcgpa = new JTextField();
		fcgpa.setBounds(30,560,250,30);
		frame.add(fcgpa);
		
		//addd btn
		addbtn = new JButton("Add");
		addbtn.setBounds(30,600,70,30);
		addbtn.addActionListener(this);
		frame.add(addbtn);
		
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		try{
			if(ae.getSource().equals(addbtn)){
				String name = fname.getText();
				int roll = Integer.parseInt(froll.getText());
				int mobile = Integer.parseInt(fmobile.getText());
				String email = femail.getText();
				String address = taAdress.getText();
				String gender="";
				if(genderm.isSelected()){
					gender = "male";
				}
				else if(genderf.isSelected()){
					gender="female";
				}
				double cgpa = Double.parseDouble(fcgpa.getText());
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","23mmci80","uttam");
				
				Statement smt = con.createStatement();
				 String qry = "INSERT INTO Student1 values('"+name+"',"+roll+","+mobile+",'"+email+"','"+address+"','"+gender+"',"+cgpa+")";
				 System.out.println(qry);
				 int i = smt.executeUpdate(qry);
				 if(i>0){
					 JOptionPane.showMessageDialog(frame, i +" row inserted");
				 }
			}	
		}catch(Exception e){
			System.out.println(e);
			JOptionPane.showMessageDialog(frame, "ERROR!!!!!");
		}
	}
	public static void main(String args[]){
			new Five();
	}
}