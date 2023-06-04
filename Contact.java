import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import java.awt.*;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Contact extends JFrame implements ActionListener {

    JButton b;
    JButton b1;
    JButton b2;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JTextArea t4;
    Contact(){
        setSize(10000, 800);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon img = new ImageIcon("images.jpeg");
        JLabel background;
        background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(0,0,10000,800);

        JLabel l1 = new JLabel("Contacts Us");
        JLabel l2 = new JLabel("Name: ");
        JLabel l3 = new JLabel("Email id: ");
        JLabel l4 = new JLabel("Phone no: ");
        JLabel l5 = new JLabel("Message: ");

        l1.setBounds(550, 10,1000,100);
        l2.setBounds(370,100,100,25);
        l3.setBounds(370,150,150,25);
        l4.setBounds(370,200,150,25);
        l5.setBounds(370,250,150,25);

        l1.setFont(new Font("Arial", Font.BOLD, 45));
        l1.setForeground(Color.black);
        l2.setFont(new Font("Arial", Font.PLAIN, 20));
        l2.setForeground(Color.black);
        l3.setFont(new Font("Arial", Font.PLAIN, 20));
        l3.setForeground(Color.black);
        l4.setFont(new Font("Arial", Font.PLAIN, 20));
        l4.setForeground(Color.black);
        l5.setFont(new Font("Arial", Font.PLAIN, 20));
        l5.setForeground(Color.black);

        t1 = new JTextField(20); // Name
        t2 = new JTextField(20); // Email ID
        t3 = new JTextField(20); // Phone number
        t4 = new JTextArea(); // Message

        t1.setBounds(475,100,200,25);
        t2.setBounds(475,150,200,25);
        t3.setBounds(475,200,200,25);
        t4.setBounds(475,250,500,250);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Contact.png"));
        Image i2 = i1.getImage().getScaledInstance(1500,768, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1500,768);
        add(image);
        setSize(10000, 800);
        //setLocation(300, 0);
        setVisible(true);

        b = new JButton("Submit");
        b1 = new JButton("Reset");


        b.setBounds(490,550,100,25);

        b1.setBounds(600,550,100,25);
        b1.addActionListener(this);
        b.addActionListener(this);

        b2 = new JButton("Back to Home");
        b2.setBounds(1,1,150,25);
        b2.addActionListener(this);

        image.add(l1);
        image.add(l2);
        image.add(l3);
        image.add(l4);
        image.add(l5);
        image.add(t1);
        image.add(t2);
        image.add(t3);
        image.add(t4);
        image.add(b);
        image.add(b1);
        image.add(b2);
        add(background);
    }
    public static void main(String[] args) {
        new Contact();




    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == b2){
            new User_Interface().setVisible(true);
            dispose();
        }
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

            else {
                try{
                    String Name = t1.getText();
                    String Email_id = t2.getText();
                    String Phone_no = t3.getText();
                    String Message = t4.getText();

                    Conn c = new Conn();
                    String query = "insert into Contact values('"+Name+"','"+Email_id+"', '"+Phone_no+"', '"+Message+"')";
                    c.s.executeUpdate(query);

                }
                catch(Exception e1){
                    System.out.println(e1);

                }

                new Submitted().setVisible(true);
                dispose();

            }
        }else if(e.getSource() == b1) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
        }

    }

}
