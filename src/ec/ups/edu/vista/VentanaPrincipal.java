/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.vista;

import ec.ups.edu.controlador.ControladorTexto;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Esta clase se encargara de GUI(La interfaz grafica con el usuario) de manera
 * que el usuario tendra opciones para poder ingresar, para ello la
 * caracteristicas principal esque la clase es dinamica ya que funcionara con
 * caulquier ruta ingresada por el usuario, ademas esta clase esta con siertas
 * restricciones que el usuario deberea seguir para que la ejecicion del
 * programa sea eficaz y satisfactorio para el mismo, ya puede resolver dudas
 * que el usuario tenga en un momento de que el programa no funcione como el
 * piensa habra mensajes emergentes que sera notificados con el JOPtionPane para
 * que el usuario pueda ver que esta fallando y pueda corregirlo para poder
 * avanzar con el ejecucion del programa
 *
 * @author Adolfo
 * @version 11.3
 * @author JHON FAREZ
 * @version 8.2
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    //llamar ala clase controladoreTexto para poder acceder alos metodos 
    //la asscesibilidad del atributo de la clase  es de tipo  privado
    private ControladorTexto controladorTexto;

    /**
     * Es el metodo constructor de la Ventana Principal, en este se inicializa
     * la ventana, y ademas el controlador
     *
     */
    public VentanaPrincipal() {
        initComponents();

        controladorTexto = new ControladorTexto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaTexto = new javax.swing.JTextArea();
        btnLimpiar = new javax.swing.JButton();
        btnDesencriptar = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear Archivo Encriptado");

        jLabel1.setText("Ruta");

        txtRuta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRutaKeyTyped(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(153, 153, 255));
        btnBuscar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBuscar.setText(". . .");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtAreaTexto.setEditable(false);
        txtAreaTexto.setBackground(new java.awt.Color(102, 102, 102));
        txtAreaTexto.setColumns(20);
        txtAreaTexto.setRows(5);
        jScrollPane2.setViewportView(txtAreaTexto);

        btnLimpiar.setBackground(new java.awt.Color(255, 0, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnDesencriptar.setBackground(new java.awt.Color(102, 102, 255));
        btnDesencriptar.setText("Buscar");
        btnDesencriptar.setEnabled(false);
        btnDesencriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesencriptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDesencriptar)
                .addGap(86, 86, 86)
                .addComponent(btnLimpiar)
                .addGap(158, 158, 158))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnDesencriptar))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo para el boton de limpiar. Es el encargado de limpiar las cajas de
     * texto y de poner invisble al boton de buscar
     *
     * @param evt
     */
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();

    }//GEN-LAST:event_btnLimpiarActionPerformed

    /**
     * El metodo btnBuscarActionPerformed se encarga de buscar d la rutaa
     * ingresada en el computador huesped para poder explorar dedentro de si
     * segun los datos ingresados
     *
     * @param evt
     */
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        JFileChooser menu = new JFileChooser();

        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT", "txt");

        menu.setFileFilter(filtro);

        menu.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int seleccionar = menu.showOpenDialog(this);

        if (seleccionar == JFileChooser.APPROVE_OPTION) {

            File fichero = menu.getSelectedFile();
            txtRuta.setText(fichero.getAbsolutePath());
            btnDesencriptar.setEnabled(true);

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
     * Metodo encargado de desencriptar un archivo .txt. Además, comprueba si es
     * un directori o no pero tambien muestra mensajes en caso de que pase lo
     * anteriormente mencionado
     *
     * @param evt
     */
    private void btnDesencriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesencriptarActionPerformed
        // TODO add your handling code here:
        String ruta = txtRuta.getText();
        if (ruta == null) {
            JOptionPane.showMessageDialog(this, "Escriba o seleccione la ruta");
        } else {
            if (controladorTexto.comprobarRuta(ruta)) {
                try {
                    String text = controladorTexto.desencriptar(ruta);
                    txtAreaTexto.setText(text);
                    btnDesencriptar.setEnabled(false);
                } catch (IOException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ruta no existe o es una carpeta");
                limpiar();
            }
        }
    }//GEN-LAST:event_btnDesencriptarActionPerformed

    /**
     * Este metodo es solo en el caso de que el usuario ecscriba la ruta,
     * entonces activamos el boton de buscar para proceder a desencriptar el
     * texto.
     *
     * @param evt
     */
    private void txtRutaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutaKeyTyped
        // TODO add your handling code here:
        btnDesencriptar.setEnabled(true);
    }//GEN-LAST:event_txtRutaKeyTyped

    /**
     * @param args los argumentos de la línea de comando
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    /**
     * Metodo encargado de limpiar las cajas de texto y ademas de desvanecer el
     * boton de buscar
     */
    public void limpiar() {
        txtAreaTexto.setText("");
        txtRuta.setText("");
        btnDesencriptar.setEnabled(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDesencriptar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea txtAreaTexto;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}
