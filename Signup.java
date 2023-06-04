import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup extends JFrame implements ActionListener {
    JButton b;
    JButton b1;
    JButton b2;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JTextField t4;
    JPasswordField t5;
    JPasswordField t6;

    Signup(){

        setSize(10000, 800);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Login.png"));
        Image i2 = i1.getImage().getScaledInstance(1500,768, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1500,750);
        add(image);
        setSize(10000, 800);
        //setLocation(300, 0);
        setVisible(true);

        JLabel l7 = new JLabel("Create your account here");
        JLabel l1 = new JLabel("Name: ");
        JLabel l2 = new JLabel("Email id ");
        JLabel l3 = new JLabel("Contact number: ");
        JLabel l4 = new JLabel("PRN no: ");
        JLabel l5 = new JLabel("Password: ");
        JLabel l6 = new JLabel("Confirm password: ");

        l7.setBounds(550, 10,1000,100);
        l1.setBounds(500, 100, 100, 25);
        l2.setBounds(500, 150, 100, 25);
        l3.setBounds(440, 200, 200, 25);
        l4.setBounds(500, 250, 100, 25);
        l5.setBounds(480, 300, 150, 25);
        l6.setBounds(420, 350, 200, 25);


        l1.setFont(new Font("Arial", Font.BOLD, 20));
        l1.setForeground(Color.black);
        l2.setFont(new Font("Arial", Font.BOLD, 20));
        l2.setForeground(Color.black);
        l3.setFont(new Font("Arial", Font.BOLD, 20));
        l3.setForeground(Color.black);
        l4.setFont(new Font("Arial", Font.BOLD, 20));
        l4.setForeground(Color.black);
        l5.setFont(new Font("Arial", Font.BOLD, 20));
        l5.setForeground(Color.black);
        l6.setFont(new Font("Arial", Font.BOLD, 20));
        l6.setForeground(Color.black);
        l7.setFont(new Font("Arial", Font.BOLD, 30));
        l7.setForeground(Color.black);


        t1 = new JTextField(20); // name
        t2 = new JTextField(30); // email id
        t3 = new JTextField(12); // Contact number
        t4 = new JTextField(5); // PRN number
        t5 = new JPasswordField(50); // Password
        t6 = new JPasswordField(10); // confirm password


        t1.setBounds(600, 100, 200, 25);
        t2.setBounds(600, 150, 200, 25);
        t3.setBounds(600, 200, 200, 25);
        t4.setBounds(600, 250, 200, 25);
        t5.setBounds(600, 300, 200, 25);
        t6.setBounds(600,350,200,25);


        b = new JButton("Submit");
        b.setBounds(580, 450, 100, 25);
        b.addActionListener(this);

        b1 = new JButton("Reset");
        b1.setBounds(700,450,100,25);
        b1.addActionListener(this);

        b2 = new JButton("Back to Login");
        b2.setBounds(1,1,150,25);
        b2.addActionListener(this);



        image.add(l1);
        image.add(l2);
        image.add(l3);
        image.add(l4);
        image.add(l5);
        image.add(l6);
        image.add(l7);
        image.add(t1);
        image.add(t2);
        image.add(t3);
        image.add(t4);
        image.add(t5);
        image.add(t6);
        image.add(b);
        image.add(b1);
        image.add(b2);


    }
    public static void main(String[] args){
        new Signup();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Conn c = new Conn();


        if(e.getSource() == b) {
            if (t1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "All fields are mandatory");
            }
            else if(t2.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"All fields are mandatory");
            }
            else if(t3.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"All fields are mandatory");
            }
            else if(t4.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"All fields are mandatory");
            }
            else if(t5.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"All fields are mandatory");
            }
            else if(t6.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"All fields are mandatory");
            }

            else {

                try{
                    String Name = t1.getText();
                    String email_id = t2.getText();
                    String Contact_number = t3.getText();
                    String prn_no = t4.getText();


                    String password = t5.getText();
                    String confirm_password = t6.getText();

                    String query = "insert into signup values('"+Name+"', '"+email_id+"', '"+Contact_number+"', '"+prn_no+"', '"+password+"', '"+confirm_password+"')";
                    c.s.executeUpdate(query);

                }
                catch(Exception e1){
                    System.out.println(e1);

                }
                JOptionPane.showMessageDialog(null,"Successfully Signed up");
                new Login().setVisible(true);
                dispose();

            }


        }
        if(e.getSource() == b1){
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");

        }
        if(e.getSource() == b2){
            new Login().setVisible(true);
            dispose();
        }
    }
}
