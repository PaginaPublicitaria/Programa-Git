package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author milto
 */
public class conexion {
    Connection con;
    public conexion(){
    ,.
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo_conex", "root", "Miltondominick2@");
        }catch (ClassNotFoundException | SQLException e){
        System.out.println("No conectado");
        }
    }
    public Connection getConection(){
    return con;
    }

       
}
