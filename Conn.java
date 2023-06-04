import java.sql.Statement;
import java.sql.*;

public class Conn {
    public ResultSet rs;
    Connection c;
    Statement s;
    public Conn(){
        try{
            c = DriverManager.getConnection("jdbc:mysql:///movie_ticket_management_system_CP", "root", "root");
            s = c.createStatement();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}