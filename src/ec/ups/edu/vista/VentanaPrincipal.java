/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.vista;

import ec.ups.edu.controlador.ControladorTexto;
import java.io.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *Esta clase se encargara de GUI(La interfaz grafica con el usuario) de manera que 
 * el usuario tendra opciones para poder  ingresar, para ello la caracteristicas principal esque 
 * la clase es dinamica ya que funcionara con caulquier ruta ingresada por el usuario,
 *  ademas esta clase esta con siertas restricciones que el usuario deberea seguir para que la ejecicion
 * del programa sea eficaz y satisfactorio para el mismo, ya puede resolver dudas 
 * que el usuario tenga en un momento de que el programa no funcione como el piensa habra 
 * mensajes emergentes que sera notificados con el JOPtionPane para que el usuario pueda ver que esta 
 * fallando y pueda corregirlo para poder avanzar con el ejecucion del programa
 * 
 * @author Adolfo
 * @version 11.3
 * @author JHON FAREZ
 * @version 8.2
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    //Creacion de una variable de tipo String 
    String name;
    //llamar ala clase controladoreTexto para poder acceder alos metodos 
    //la asscesibilidad del atributo de la clase  es de tipo  privado
    private ControladorTexto controladorTexto;

    
    public VentanaPrincipal() {
        initComponents();
        name = null;
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
        btnCrear = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear Archivo Encriptado");

        jLabel1.setText("Ruta");

        btnBuscar.setBackground(new java.awt.Color(153, 153, 255));
        btnBuscar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBuscar.setText(". . .");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtAreaTexto.setColumns(20);
        txtAreaTexto.setRows(5);
        jScrollPane2.setViewportView(txtAreaTexto);

        btnCrear.setBackground(new java.awt.Color(102, 102, 255));
        btnCrear.setText("Crear Archivo");
        btnCrear.setEnabled(false);
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 0, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btnCrear)
                        .addGap(78, 78, 78)
                        .addComponent(btnLimpiar))
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
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(btnLimpiar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        JFileChooser menu = new JFileChooser();
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT", "txt" );
        
        menu.setFileFilter(filtro);
        
        menu.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        
        int seleccionar = menu.showOpenDialog(this);

        if (seleccionar == JFileChooser.APPROVE_OPTION) {

            File fichero = menu.getSelectedFile();
            txtRuta.setText(fichero.getAbsolutePath());

            btnCrear.setEnabled(true);
                       

        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:

        String nombre = txtRuta.getText();

        if (!nombre.contains(".")) {
            do {
                name = JOptionPane.showInputDialog(this, "Escriba el nombre del archivo: ");

            } while (name == null || controladorTexto.comprobar(txtRuta.getText(), name));

            if (controladorTexto.comprobarRuta(txtRuta.getText())) {
                String path = controladorTexto.crearFichero(txtRuta.getText(), name);
                controladorTexto.desencriptar(path, txtAreaTexto.getText());
                JOptionPane.showMessageDialog(this, "Fichero creado y encriptado con exito");
                limpiar();

            } else {
                JOptionPane.showMessageDialog(this, "Ruta incorrecta intentelo de nuevo");
            }
        } else {
            if (controladorTexto.comprobarRuta(txtRuta.getText())) {
                String path = txtRuta.getText();
                controladorTexto.desencriptar(path, txtAreaTexto.getText());
                JOptionPane.showMessageDialog(this, "Fichero creado y encriptado con exito");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(this, "Ruta incorrecta intentelo de nuevo");
            }
        }
    }//GEN-LAST:event_btnCrearActionPerformed

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

    public void limpiar() {
        txtAreaTexto.setText("");
        txtRuta.setText("");
        btnCrear.setEnabled(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea txtAreaTexto;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}
