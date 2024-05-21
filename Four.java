
import java.awt.event.*;
import javax.swing.*;

public class Four implements ActionListener {
    JFrame frame;
    JLabel label;
    JTextField field;
    JButton inBtn,deBtn,resetBtn;
    int counter = 0;

    Four(){
        frame = new JFrame("Counter Applicaion");
        frame.setLocation(500,200);
        frame.setSize(350,450);
        frame.setLayout(null);

        label = new JLabel("Counter Application");
        label.setBounds(30,40,350,30);
        frame.add(label);

        field = new JTextField();
        field.setBounds(30,80,250,30);
        field.setText("0");
        field.setEditable(false); // Make the text field read-only
        frame.add(field);

        inBtn = new JButton("Increment");
        deBtn = new JButton("Decrement");
        resetBtn = new JButton("Reset");

        inBtn.addActionListener(this);
        deBtn.addActionListener(this);
        resetBtn.addActionListener(this);

        inBtn.setBounds(30,120,90,30);
        deBtn.setBounds(130,120,90,30);
        resetBtn.setBounds(240,120,90,30);

        frame.add(inBtn);
        frame.add(deBtn);
        frame.add(resetBtn);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(inBtn)){
            counter++;
        }
        else if(e.getSource().equals(deBtn)){
            counter--;
        }
        else if(e.getSource().equals(resetBtn)){
            counter =0;
        }
        updateTextField();
    }

    private void updateTextField() {
        field.setText(String.valueOf(counter));
    }
    public static void main(String[] args) {
        new Four();
    }

    
}
