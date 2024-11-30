/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package railway;
import java.sql.*;

/**
 *
 * @author nanay
 */
public class DBConnection {
    private static Connection con;

    public static Connection createDBConnection() {
       
            try {
                String url ="com.mysql.cj.jdbc.Driver";
                con = DriverManager.getConnection("jdbc:mysql://localhost/railwayreservation", "root", "123");
            } 
            catch (SQLException ex) {
                System.out.println("DB Connection ERROR");
            }
        
        return con;
    }

   
}
