
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Database;
import modelo.Persona;
import vista.Vista;


public class Controlador implements ActionListener {
    
    Vista vista;
    Database operar;
    Persona persona;

    public Controlador(Vista vista, Database operar, Persona persona) {
        this.vista = vista;
        this.operar = operar;
        this.persona = persona;
        
        this.vista.botonBuscar.addActionListener(this);
        this.vista.botonInsertar.addActionListener(this);
        this.vista.botonLimpiar.addActionListener(this);
        
    }
    
    private void limpiar(){
        vista.cajaBuscar.setText(null);
        vista.cajaCorreo.setText(null);
        vista.cajaEdad.setText(null);
        vista.cajaId.setText(null);
        vista.cajaNombre.setText(null);
    }
    
    public void iniciar(){
        vista.setTitle("Personas");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        vista.cajaId.setVisible(false);
    }
    
    private void llenarPersona(){
        persona.setCorreo(vista.cajaCorreo.getText());
        persona.setId(Integer.parseInt(vista.cajaId.getText()));
        persona.setEdad(Integer.parseInt(vista.cajaEdad.getText()));
        persona.setNombre(vista.cajaNombre.getText());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.botonLimpiar){
            limpiar();
        }
        
        if(e.getSource() == vista.botonBuscar){
            if(operar.buscar(persona, vista.cajaBuscar.getText())){
                vista.cajaNombre.setText(persona.getNombre());
                vista.cajaCorreo.setText(persona.getCorreo());
                vista.cajaEdad.setText(""+persona.getEdad());
                vista.cajaId.setText(""+persona.getId());
            }else{
                JOptionPane.showMessageDialog(null, "Esta persona no existe");
            }
        }
        
        if(e.getSource() == vista.botonInsertar){
            llenarPersona();
            if(operar.insertar(persona)){
                JOptionPane.showMessageDialog(null, "registro exitoso");
            }else{
                JOptionPane.showMessageDialog(null, "registro fallidos");
            }
        }
    }
}
