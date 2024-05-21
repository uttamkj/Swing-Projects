import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
    JFrame frame;
    JLabel num1,num2,ans;
    JTextField n1,n2;
    JButton add, sub, div,mul,mod,result;

    Calculator(){
        frame = new JFrame(" Simple Calculator ");
        frame.setLocation(200, 200);
        frame.setLayout(null);
        frame.setSize(400,400);

        num1 = new JLabel("Number 1:");
        num1.setBounds(20, 20, 100, 30);
        frame.add(num1);

        n1 = new JTextField();
        n1.setBounds(20,60,300,30);
        frame.add(n1);
// another
        num2 = new JLabel("Number 2:");
        num2.setBounds(20, 100, 100, 30);
        frame.add(num2);

        n2 = new JTextField();
        n2.setBounds(20,140,300,30);
        frame.add(n2);

        // buttons 
        add = new JButton("+");
        sub = new JButton("-");
        div = new JButton("/");
        mul = new JButton("*");
        mod = new JButton("%");

        add.setBounds(20, 200, 50, 30);
        add.addActionListener(this);
        frame.add(add);
        
        sub.setBounds(90, 200, 50, 30);
        sub.addActionListener(this);
        frame.add(sub);
       
        mul.setBounds(160, 200, 50, 30);
        mul.addActionListener(this);
        frame.add(mul);
       
        div.setBounds(230, 200, 50, 30);
        div.addActionListener(this);
        frame.add(div);

        mod.setBounds(300, 200, 50, 30);
        mod.addActionListener(this);
        frame.add(mod);

        ans = new JLabel("Result = ");
        ans.setBounds(20,240,300,50);
        frame.add(ans);

        

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(n1.getText());
        int b = Integer.parseInt(n2.getText());
        
        if(e.getSource().equals(add)){
            int c = a+b;
            ans.setText("Addition =  "+String.valueOf(c));
        }
        else if(e.getSource().equals(sub)){
            int c = a-b;
            ans.setText("Substraction =  "+String.valueOf(c));
        } 
        else if(e.getSource().equals(mul)){
            int c = a*b;
            ans.setText("Multiplication =  "+String.valueOf(c));
        }
        else if(e.getSource().equals(div)){
            int c = a/b;
            ans.setText("Division =  "+String.valueOf(c));
        }
        else if(e.getSource().equals(mod)){
            int c = a%b;
            ans.setText("Modulo =  "+String.valueOf(c));
        }

    }


    public static void main(String[] args) {
         new Calculator();
        
    }
}

