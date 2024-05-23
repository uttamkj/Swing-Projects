// claculator
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Three implements ActionListener{
	JFrame frame;
	JLabel text1,text2,result;
	JTextField field1,field2;
	JButton btnAdd, btnmin,btnMul,btnDiv;
	Three(){
		frame = new JFrame("Simple Calculator");
		frame.setSize(450,450);
		frame.setLocation(300,200);
		frame.setLayout(null);
		
		text1 = new JLabel("Enter First number");
		text1.setBounds(30,20,350,30);
		frame.add(text1);
		
		field1 = new JTextField();
		field1.setBounds(30,60,250,30);
		frame.add(field1);
		
		text2 = new JLabel("Enter Second number");
		text2.setBounds(30,100,350,30);
		frame.add(text2);
		
		field2 = new JTextField();
		field2.setBounds(30,140,250,30);
		frame.add(field2);
		
		
		
		btnAdd = new JButton("+");
		btnmin = new JButton("-");
		btnMul = new JButton("*");
		btnDiv = new JButton("/");
		
		
		btnAdd.setBounds(30,180,50,30);
		btnmin.setBounds(110,180,50,30);
		btnMul.setBounds(190,180,50,30);
		btnDiv.setBounds(270,180,50,30);
		
		frame.add(btnAdd);
		frame.add(btnmin);
		frame.add(btnMul);
		frame.add(btnDiv);
		
		btnAdd.addActionListener(this);
		btnmin.addActionListener(this);
		btnMul.addActionListener(this);
		btnDiv.addActionListener(this);
		
		result = new JLabel("Result");
		result.setBounds(30,220,350,30);
		frame.add(result);
	    
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		
		try{
			int a = Integer.parseInt(field1.getText());
		    int b = Integer.parseInt(field2.getText());
			int c ;
			if(ae.getSource().equals(btnAdd)){
				c = a+b;
				result.setText("Result: "+c);
			}
			else if(ae.getSource().equals(btnmin)){
				c = a-b;
				result.setText("Result: "+c);
			}
			else if(ae.getSource().equals(btnMul)){
				c = a*b;
				result.setText("Result: "+c);
			}else if (ae.getSource().equals(btnDiv)){
			c = a/b;
				result.setText("Result: "+c);
			}
			}catch(NumberFormatException ne){
				result.setText("NumberFormatException");
			}catch(ArithmeticException aa ){
				result.setText("ArithmeticException");
			}catch(Exception e){
				System.out.println(e);
			}
		
	}
	public static void main(String args[]){
			new Three();
	}
}