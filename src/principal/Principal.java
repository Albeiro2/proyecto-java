
package principal;

import controlador.Controlador;
import javax.swing.UIManager;
import modelo.Database;
import modelo.Persona;
import vista.Vista;


public class Principal {
    public static void main(String[] args) {
        
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
        } catch (Exception e) {
            
        }
        Vista vista = new Vista();
        Persona persona = new Persona();
        Database operar = new Database();
        
        Controlador controlador = new Controlador(vista, operar, persona);
        controlador.iniciar();
    }
}
