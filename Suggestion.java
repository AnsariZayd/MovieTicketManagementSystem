import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Suggestion extends JFrame implements ActionListener {

    JButton b;
    JTextField t1;
    JTextArea t2;
    JButton b1;
    JButton b2;
    Suggestion(){
        setSize(10000, 800);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Suggestions1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500,768, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1500,750);
        add(image);
        setSize(10000, 800);
        //setLocation(300, 0);
        setVisible(true);

        JLabel l1 = new JLabel("Add your suggestions here ");
        JLabel l2 = new JLabel("Name of the  movie");
        JLabel l3 = new JLabel("Describe your thoughts below");

        l1.setBounds(350, 10,1000,100);
        l2.setBounds(100,100,200,25);
        l3.setBounds(100,150,300,25);
        l1.setFont(new Font("Arial", Font.BOLD, 60));
        l1.setForeground(Color.black);

        l2.setFont(new Font("Arial",Font.BOLD,20));
        l2.setForeground(Color.black);
        l3.setFont(new Font("Arial",Font.BOLD,20));
        l3.setForeground(Color.black);

        t1 = new JTextField(20);
        t2 = new JTextArea();

        t1.setBounds(290,100,200,25);
        t2.setBounds(100,200,500,400);

        b = new JButton("Submit");

        b.setBounds(200,650,200,25);
        b.addActionListener(this);

        b1 = new JButton("Back to Home");
        b1.setBounds(1,1,150,25);
        b1.addActionListener(this);

        b2 = new JButton("Reset");
        b2.setBounds(300,650,100,25);
        b2.addActionListener(this);

        image.add(l1);
        image.add(l2);
        image.add(l3);
        image.add(t1);
        image.add(t2);
        image.add(b);
        image.add(b1);
        image.add(b2);
    }
    public static void main(String[] args) {
        new Suggestion();




    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b2){
            t1.setText("");
            t2.setText("");
        }
        if(e.getSource() == b1){
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

            else {


                try{
                    String select_movie = t1.getText();
                    String des = t2.getText();
                    Conn c = new Conn();
                    String query = "insert into Suggestion values('"+select_movie+"','"+des+"')";
                    c.s.executeUpdate(query);

                }
                catch(Exception e1){
                    System.out.println(e1);

                }
                new Feedback().setVisible(true);
                dispose();

            }

        }
    }

}


