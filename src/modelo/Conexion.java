
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Conexion {
    
 public static final String URL = "jdbc:mysql://localhost:3306/personas?autoReconnet=true&useSSL=false";
 public static final String usuario = "root";
 public static final String contra = "1234";
 
 
 public Connection getConnection(){
     
        Connection conexion = null;
        
        try {  
            Class.forName("com.mysql.jdbc.Driver");
           conexion =  DriverManager.getConnection(URL,usuario,contra);
           
                    
        } catch (Exception e) {
            
            System.err.println(e);
        }
        
        return conexion;
    }
}
