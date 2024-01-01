
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Database extends Conexion {
    
    PreparedStatement ps;
    ResultSet rs;
    
    //Este metodo es para buscar a la persona en la base datos
    public boolean buscar(Persona persona,String buscar){
        
        try {
            Connection conexion = getConnection();
            ps = conexion.prepareStatement("select * from persona where nombre = ? or correo = ?");
            ps.setString(1, buscar);
            ps.setString(2, buscar);
            
            rs = ps.executeQuery();
            
            if(rs.next()){
               persona.setCorreo(rs.getString("correo"));
               persona.setNombre(rs.getString("nombre"));
               persona.setEdad(rs.getInt("edad"));
               persona.setId(rs.getInt("id"));
               conexion.close();
               return true;
                
            }else{
                JOptionPane.showMessageDialog(null, "No existe esta persona");
                return false;
            }
            
        } catch (SQLException e) {
            System.err.println("Error "+e);
            return false;
        }finally{
            try {
                rs.close();
            } catch (SQLException e) {
                System.err.println("Error, "+e);
            }
        }
        
    }
}
