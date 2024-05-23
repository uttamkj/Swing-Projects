import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class First implements ActionListener{
	JFrame frame;
	JLabel label;
	JButton btnRed, btnGreen,btnBlue;
	First(){
		frame = new JFrame("Change Color");
		frame.setSize(350,450);
		frame.setLocation(300,200);
		frame.setLayout(null);
		
		label = new JLabel("Click on a button to change the frame color");
		label.setBounds(30,20,350,30);
		frame.add(label);
		
		btnRed = new JButton("Red");
		btnGreen = new JButton("Green");
		btnBlue = new JButton("blue");
		
		btnRed.setBounds(30,60,70,30);
		btnGreen.setBounds(110,60,70,30);
		btnBlue.setBounds(190,60,70,30);
		
		frame.add(btnRed);
		frame.add(btnGreen);
		frame.add(btnBlue);
		
		btnRed.addActionListener(this);
		btnGreen.addActionListener(this);
		btnBlue.addActionListener(this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource().equals(btnRed)){
			frame.getContentPane().setBackground(Color.RED);
		}
		else if (ae.getSource().equals(btnBlue)){
			frame.getContentPane().setBackground(Color.BLUE);
		}
		else if (ae.getSource().equals(btnGreen)){
			frame.getContentPane().setBackground(Color.GREEN);
		}
	}
	public static void main(String args[]){
			new First();
	}
}