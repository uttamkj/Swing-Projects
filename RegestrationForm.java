// creating registration form using java swing(gui)and later on connect with data base uttam kumar jena

import javax.swing.*;

public class RegestrationForm {
    public static void main(String[] args) {
        JFrame frame ;
        JLabel lName,lGender,lAddress,lPhoneNumber,lEmail,lPassword,Lcountry;
        JTextArea taAdress;
        JTextField tfname,tfPhoneNUmber,TfEmail;
        JRadioButton rbMale,rbFemale;
        @SuppressWarnings("rawtypes")
        JComboBox cbCountry;
        JPasswordField pfPassword;
        JButton btSubmit;
     
        frame = new JFrame("Registration form");
        frame.setLocation(200,200);
        frame.setSize(400, 600);
        frame.setLayout(null);

        // name field
        lName = new JLabel("Name: ");
        lName.setBounds(20, 20, 350, 20);
        frame.add(lName);

        tfname = new JTextField();
        tfname.setBounds(20,40,350,30);
        frame.add(tfname);
        // phone number
        lPhoneNumber = new JLabel("Phone Number: ");
        lPhoneNumber.setBounds(20, 70, 350, 20);
        frame.add(lPhoneNumber);

        tfPhoneNUmber = new JTextField();
        tfPhoneNUmber.setBounds(20,90,350,30);
        frame.add(tfPhoneNUmber);

        //Email
        lEmail = new JLabel("Email: ");
        lEmail.setBounds(20, 120, 350, 20);
        frame.add(lEmail);

        TfEmail = new JTextField();
        TfEmail.setBounds(20,140,350,30);
        frame.add(TfEmail);

        // address
        lAddress = new JLabel("Address: ");
        lAddress.setBounds(20, 170, 350, 30);
        frame.add(lAddress);

        taAdress = new JTextArea();
        taAdress.setBounds(20,200,350,50);
        frame.add(taAdress);

        //gender
        lGender = new JLabel("Gender: ");
        lGender.setBounds(20, 260, 350 , 30);
        frame.add(lGender);

        rbMale = new JRadioButton("Male");
        rbMale.setBounds(100,262,100,30);
        frame.add(rbMale);

        rbFemale = new JRadioButton("Male");
        rbFemale.setBounds(260,262,100,30);
        frame.add(rbFemale);

        // for single check add them as group
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbFemale);
        bg.add(rbMale);

        String[] countryName = {"India","USA","China","Russia","Nepal","Brazil"};
        Lcountry = new JLabel("Country");
        Lcountry.setBounds(20,300,350,30);
        frame.add(Lcountry);

        cbCountry = new JComboBox<String>(countryName);
        cbCountry.setBounds(20,340,150,30);
        frame.add(cbCountry);

        // password
        lPassword = new JLabel("Password");
        lPassword.setBounds(20,380,350,30);
        frame.add(lPassword);

        pfPassword = new JPasswordField();
        pfPassword.setBounds(20,420,350,30);
        frame.add(pfPassword);

        // button 
        btSubmit = new JButton("Submit");
        btSubmit.setBounds(150,480,80,50);
        frame.add(btSubmit);

        frame.setVisible(true);
    }
    
}
