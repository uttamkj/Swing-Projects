import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class First implements ActionListener {
    JFrame frame;
    JLabel label;
    JButton btnRed,btnGreen,btnBlue;
    First(){
        frame = new JFrame("Change Color");
        frame.setSize(350, 450);
        frame.setLocation(500, 200);
        frame.setLayout(null);
        
        label = new JLabel("Click on a button to change the frame colour");
        label.setBounds(30,20,300,30);
        frame.add(label);

        btnRed = new JButton("Red");
        btnGreen = new JButton("Green");
        btnBlue = new JButton("Blue");

        btnRed.setBackground(Color.red);
        btnBlue.setBackground(Color.BLUE);
        btnGreen.setBackground(Color.GREEN);

        btnRed.setBounds(30, 60, 70, 30); 
        btnGreen.setBounds(120, 60, 70, 30); 
        btnBlue.setBounds(210, 60, 70, 30); 

        frame.add(btnRed);
        frame.add(btnGreen);
        frame.add(btnBlue);

        btnRed.addActionListener(this);
        btnGreen.addActionListener(this);
        btnBlue.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRed) {
            frame.getContentPane().setBackground(Color.RED);
        } else if (e.getSource() == btnGreen) {
            frame.getContentPane().setBackground(Color.GREEN);
        } else if (e.getSource() == btnBlue) {
            frame.getContentPane().setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        new First();
    }
    
}
