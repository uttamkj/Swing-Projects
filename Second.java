import javax.swing.*;
// import java.awt.*;
import java.awt.event.*;
public class Second implements ActionListener{
	JFrame frame;
	JLabel label,msg;
	JTextField field;
	JButton click;
	Second(){
		frame = new JFrame("Welcome");
		frame.setSize(350,450);
		frame.setLocation(300,200);
		frame.setLayout(null);
		
		label = new JLabel("Enter your name");
		label.setBounds(30,20,350,30);
		frame.add(label);
		
		field = new JTextField();
		field.setBounds(30,60,250,30);
		frame.add(field);
		
		click = new JButton("Click");
		click.setBounds(30,110,90,30);
		click.addActionListener(this);
		frame.add(click);
		
		msg = new JLabel("Message");
		msg.setBounds(30,150,350,30);
		frame.add(msg);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		String name = field.getText();
		if(ae.getSource().equals(click)){
			if(name.equals("")){
				msg.setText("Please Enter your name");
			}
			else{
				msg.setText("Hello: "+name);
			}
		}
	}
	public static void main(String args[]){
			new Second();
	}
}