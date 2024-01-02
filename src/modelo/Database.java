
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
        Connection conexion;
        try {
            conexion = getConnection();
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
    
    //Aqui insertamos personas en la base de datos
    public boolean insertar(Persona persona){
        Connection conexion;
        try {
            
            conexion = getConnection();
            ps = conexion.prepareStatement("insert into persona(nombre,correo,edad)values(?,?,?)");
            ps.setString(1, persona.getNombre());
            ps.setString(2, persona.getCorreo());
            ps.setInt(3, persona.getEdad());
            
            int resultado = ps.executeUpdate();
            conexion.close();
            if(resultado > 0){
                return true;
                
            }else{
                return false;    
            }
            
            
        } catch (SQLException e) {  
            System.err.println("Error, "+e);
            return false;
        }
    }
    
    //Aqui modificamos en la base de datos
    public boolean modificar(Persona persona,String buscar){
        Connection conexion;
        
        try {
            conexion = getConnection();
            ps = conexion.prepareStatement("update persona set nombre =?, correo =?,edad =? where id = ?");
            ps.setString(1, persona.getNombre());
            ps.setString(2, persona.getCorreo());
            ps.setInt(3, persona.getEdad());
            ps.setInt(4, Integer.parseInt(buscar));
            
            int resultado = ps.executeUpdate();
            conexion.close();
            
            if(resultado > 0){
                return true;
            }else{
                return false;
            }
            
        } catch (Exception e) {
            System.err.println("Error, "+e);
            return false;
        }
    }
    
    //Aqui eliminamos en la base de datos
    public boolean eliminar(int id){
        Connection conexion;
        
        try {
            conexion = getConnection();
            ps = conexion.prepareStatement("delete from persona where id = ?");
            ps.setInt(1, id);
            
            int resultado = ps.executeUpdate();
            conexion.close();
            if(resultado > 0){
                return true;
            }else{
                return false;
            }
            
        } catch (Exception e) {
            System.err.println("Error, "+e);
            return false;
        }
    }
}
