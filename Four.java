import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Four implements ActionListener{
	JFrame frame;
	JLabel label;
	JTextField field;
	JButton btninc,btndec,btnreset;
	int count = 0 ;
	Four(){
		frame = new JFrame("Counter Application");
		frame.setSize(350,450);
		frame.setLocation(300,200);
		frame.setLayout(null);
		
		label = new JLabel("Counter Application");
		label.setBounds(30,20,350,30);
		frame.add(label);
		
		field = new JTextField();
		field.setBounds(30,60,250,30);
		frame.add(field);
		field.setEditable(false);
		
		btninc= new JButton("Increment");
		btninc.setBounds(30,110,90,30);
		btninc.addActionListener(this);
		frame.add(btninc);
		
		btndec= new JButton("Decrement");
		btndec.setBounds(130,110,90,30);
		btndec.addActionListener(this);
		frame.add(btndec);
		
		btnreset= new JButton("Reset");
		btnreset.setBounds(230,110,90,30);
		btnreset.addActionListener(this);
		frame.add(btnreset);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource().equals(btninc)){
			count++;
		}
		else if(ae.getSource().equals(btndec)){
			count--;
		}
		else if(ae.getSource().equals(btnreset)){
			count = 0;
		}
		
		field.setText(String.valueOf(count));
	}
	
	public static void main(String args[]){
			new Four();
	}
}