import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Second implements ActionListener{
    JFrame frame;
    JLabel label;
    JTextField field;
    JButton btnclk;
    JLabel msg ;
    Second(){
        frame = new JFrame("Welcome");
        frame.setSize(450,450);
        frame.setLocation(500,200);
        frame.setLayout(null);

        label = new JLabel("Enter your name");
        label.setBounds(50, 30, 150, 30);
        frame.add(label);

        field = new JTextField();
        field.setBounds(50,70,300,30);
        frame.add(field);

        btnclk = new JButton("Click");
        btnclk.setBounds(50, 120, 90, 30);
        btnclk.addActionListener(this);
        frame.add(btnclk);

        msg = new JLabel("Message");
        msg.setBounds(50,170,350,30);
        frame.add(msg);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("Button clicked ");
        String name = field.getText();
        if(e.getSource().equals(btnclk)){
            if (name.isEmpty()) {
                msg.setText("Please enter your name");
            } else {
                msg.setText("Hello " + name);
            }
        }
    }
    public static void main(String[] args) {
        new Second();
    }
}
