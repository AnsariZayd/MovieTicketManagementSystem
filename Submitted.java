import java.awt.Font;
import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Submitted extends JFrame implements ActionListener{
    JButton b;
    Submitted(){
        setLayout(null);
        setSize(1000,600);
        setLocation(0,0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Submited.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500,768, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1400,768);
        add(image);
        setSize(10000, 800);
        //setLocation(300, 0);
        setVisible(true);

        b = new JButton("Back to Home");
        b.setBounds(1,1,150,25);
        b.addActionListener(this);

        JLabel l1 = new JLabel("Your form is successfully submited");
        l1.setBounds(300, 10,1000,100);
        l1.setFont(new Font("Arial", Font.BOLD, 50));
        image.add(l1);
        image.add(b);

    }

    public static void main(String[] args) {
        new Submitted();



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b){
            new User_Interface().setVisible(true);
            dispose();
        }

    }
}