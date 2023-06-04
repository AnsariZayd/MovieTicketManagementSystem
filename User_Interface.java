import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class User_Interface extends JFrame implements ActionListener {

    JMenuItem i3;
    JMenuItem i4;
    JMenuItem i5;
    JMenuItem i7;
    JMenuItem i8;
    JMenuItem i10;
    JMenuItem i11;
    JMenuItem i12;
    JMenuItem i13;



    User_Interface(){


        setSize(10000, 800);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JMenuBar menuBar = new JMenuBar();

        JMenu event = new JMenu("Movies");

        i5 = new JMenuItem("List of movies");
        i5.addActionListener(this);
        event.add(i5);
        menuBar.add(event);


        JMenu contact = new JMenu("contact");

        i3 = new JMenuItem("Contact info");
        i3.addActionListener(this);


        contact.add(i3);


        menuBar.add(contact);


        JMenu suggest = new JMenu("Suggest");

        i10 = new JMenuItem("Suggestion");

        i10.addActionListener(this);


        suggest.add(i10);


        menuBar.add(suggest);






        setJMenuBar(menuBar);

        JLabel l1 = new JLabel("Welcome to Movie Ticket Management System");
        l1.setBounds(300, 10,1000,50);
        l1.setFont(new Font("Arial", Font.BOLD, 40));
        l1.setForeground(Color.white);

        JLabel l2 = new JLabel("About Movie Ticket Management System");
        l2.setBounds(100, 200,1000,50);
        l2.setFont(new Font("Arial", Font.BOLD, 20));
        l2.setForeground(Color.white);

        JLabel l3 = new JLabel("An online movie ticketing system is a digital platform that allows customers to access the services of a business, reserve seats ");
        l3.setBounds(100, 300,10000,50);
        l3.setFont(new Font("Arial", Font.BOLD, 20));
        l3.setForeground(Color.white);

        JLabel l4 = new JLabel(" and buy tickets.The project objective is to book cinema tickets in online. The Ticket Reservation Systemis an Internet based ");
        l4.setBounds(100, 330,10000,50);
        l4.setFont(new Font("Arial", Font.BOLD, 20));
        l4.setForeground(Color.white);
        JLabel l5 = new JLabel(" application that can be accessed throughout the Net and can be accessed by anyone who has a net connection. This application");
        l5.setBounds(100, 360,10000,50);
        l5.setFont(new Font("Arial", Font.BOLD, 20));
        l5.setForeground(Color.white);
        JLabel l6 = new JLabel("will reserve the tickets. This online ticket reservation system provides a website for a cinema hall where any user of internet can ");
        l6.setBounds(100, 390,10000,50);
        l6.setFont(new Font("Arial", Font.BOLD, 20));
        l6.setForeground(Color.white);
        JLabel l7 = new JLabel("access it. User is required to login to the system and needs a credit card for booking the tickets. Tickets can be collected at the ");
        l7.setBounds(100, 420,10000,50);
        l7.setFont(new Font("Arial", Font.BOLD, 20));
        l7.setForeground(Color.white);
        JLabel l8 = new JLabel("counter and Watching movies with family and friends in theatres is one of the best medium of entertainment after having a hectic ");
        l8.setBounds(100, 450,10000,50);
        l8.setFont(new Font("Arial", Font.BOLD, 20));
        l8.setForeground(Color.white);
        JLabel l9 = new JLabel("schedule. Developed by VIT pune students");
        l9.setBounds(100, 480,10000,50);
        l9.setFont(new Font("Arial", Font.BOLD, 20));
        l9.setForeground(Color.white);






        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("movie.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500,768, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1380,690);
        add(image);
        setSize(10000, 800);
        //setLocation(300, 0);
        setVisible(true);

        image.add(l1);
        image.add(l2);
        image.add(l3);
        image.add(l4);
        image.add(l5);
        image.add(l6);
        image.add(l7);
        image.add(l8);
        image.add(l9);



    }

    public static void main(String[] args) {
        new User_Interface();


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Conn c = new Conn();


        if(e.getSource() == i3){
            new Contact().setVisible(true);
            dispose();
        }
        if(e.getSource() == i10){
            new Suggestion().setVisible(true);
            dispose();
        }
        if(e.getSource() == i5){
            new List_of_movies().setVisible(true);
            dispose();
        }




    }

}