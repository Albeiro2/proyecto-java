/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Usuario
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        botonBuscar = new javax.swing.JButton();
        cajaBuscar = new javax.swing.JTextField();
        cajaId = new javax.swing.JTextField();
        cajaCorreo = new javax.swing.JTextField();
        botonInsertar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cajaEdad = new javax.swing.JTextField();
        cajaNombre = new javax.swing.JTextField();
        botonLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setPreferredSize(new java.awt.Dimension(340, 425));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonBuscar.setText("Buscar");
        panel.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));
        panel.add(cajaBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 167, -1));
        panel.add(cajaId, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 71, -1));
        panel.add(cajaCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 315, 211, -1));

        botonInsertar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonInsertar.setText("Insertar");
        panel.add(botonInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Nombre:");
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 179, 78, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Edad:");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 60, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Correo:");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 314, 100, -1));
        panel.add(cajaEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 71, -1));
        panel.add(cajaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 210, -1));

        botonLimpiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonLimpiar.setText("Limpiar");
        panel.add(botonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonBuscar;
    public javax.swing.JButton botonInsertar;
    public javax.swing.JButton botonLimpiar;
    public javax.swing.JTextField cajaBuscar;
    public javax.swing.JTextField cajaCorreo;
    public javax.swing.JTextField cajaEdad;
    public javax.swing.JTextField cajaId;
    public javax.swing.JTextField cajaNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
