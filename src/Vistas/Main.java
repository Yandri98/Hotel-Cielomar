/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Method.CiudadesMetodos;
import Method.ClienteMetodos;
import Method.PaisesMetodos;
import Method.ProvinciasMetodos;
import Objetos.Ciudades;
import Objetos.Clientes;
import Objetos.Paises;
import Objetos.Provincias;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Yandri
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    PaisesMetodos paises = new PaisesMetodos();
    ProvinciasMetodos provincias = new ProvinciasMetodos();
    CiudadesMetodos ciudades =  new CiudadesMetodos();
    public Main() {
        initComponents();
        paises.Listar_Pais(boxPais);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        boxPais = new javax.swing.JComboBox<>();
        boxProvincia = new javax.swing.JComboBox<>();
        boxCiudad = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        chboxPremium = new javax.swing.JCheckBox();
        chboxBasic = new javax.swing.JCheckBox();
        txtId_Cliente = new javax.swing.JTextField();
        txtNombres_Cliente = new javax.swing.JTextField();
        txtCedula_Cliente = new javax.swing.JTextField();
        txtDireccion_Cliente = new javax.swing.JTextField();
        txtCelular_Cliente = new javax.swing.JTextField();
        txtTelefono_CLiente = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boxPais.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxPaisItemStateChanged(evt);
            }
        });
        boxPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxPaisActionPerformed(evt);
            }
        });

        boxProvincia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxProvinciaItemStateChanged(evt);
            }
        });

        boxCiudad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxCiudadItemStateChanged(evt);
            }
        });

        jLabel1.setText("PAIS:");

        jLabel2.setText("PROVINCIA:");

        jLabel3.setText("CIUDAD:");

        jLabel4.setText("ID:");

        jLabel5.setText("NOMBRES:");

        jLabel6.setText("CEDULA:");

        jLabel7.setText("DIRECCION:");

        jLabel8.setText("CELULAR:");

        jLabel9.setText("TELEFONO:");

        jLabel10.setText("TIPO DE CLIENTE:");

        chboxPremium.setText("PREMIUM");
        chboxPremium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chboxPremiumActionPerformed(evt);
            }
        });

        chboxBasic.setText("BASIC");
        chboxBasic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chboxBasicActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/guardar_1.png"))); // NOI18N
        btnGuardar.setText("REGISTRAR");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(64, 64, 64)
                            .addComponent(txtId_Cliente))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(31, 31, 31)
                            .addComponent(txtCelular_Cliente))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(27, 27, 27)
                            .addComponent(txtCedula_Cliente))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(txtDireccion_Cliente))
                        .addComponent(txtNombres_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel3)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGap(19, 19, 19)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(boxProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 62, Short.MAX_VALUE))
                                .addComponent(txtTelefono_CLiente)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(boxCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(boxPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chboxPremium)
                                .addGap(18, 18, 18)
                                .addComponent(chboxBasic, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnGuardar))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtId_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombres_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCedula_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDireccion_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCelular_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTelefono_CLiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(boxCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chboxPremium)
                    .addComponent(chboxBasic))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxPaisActionPerformed

    private void boxPaisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxPaisItemStateChanged
        Paises paisesm = (Paises)this.boxPais.getSelectedItem();
        int id = paisesm.getId_pais();
         
        provincias.Listar_Provincia(boxProvincia, id);
                // TODO add your handling code here:
    }//GEN-LAST:event_boxPaisItemStateChanged

    private void boxCiudadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxCiudadItemStateChanged
      
              

// TODO add your handling code here:
    }//GEN-LAST:event_boxCiudadItemStateChanged

    private void boxProvinciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxProvinciaItemStateChanged
                Provincias provinciaspr = (Provincias)this.boxProvincia.getSelectedItem();
        int id = provinciaspr.getId_provincias();
        ciudades.Listar_Ciudad(boxCiudad, id);              
// TODO add your handling code here:
    }//GEN-LAST:event_boxProvinciaItemStateChanged

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Paises paises = (Paises)boxPais.getSelectedItem();
        Provincias provincias = (Provincias)boxProvincia.getSelectedItem();
        Ciudades ciudad = (Ciudades)boxCiudad.getSelectedItem();
        int id_cliente = Integer.parseInt(txtId_Cliente.getText());
       String nombres = txtNombres_Cliente.getText();
       String cedula =  txtCedula_Cliente.getText();
       String direccion = txtDireccion_Cliente.getText();
       String celular = txtCelular_Cliente.getText();
       String telefono = txtTelefono_CLiente.getText();
     Clientes clientes = new Clientes (id_cliente , nombres, cedula, direccion, celular, telefono,paises.getId_pais(),provincias.getId_provincias(),ciudad.getId_ciudad());
       ClienteMetodos clientemetodos = new ClienteMetodos();
       
       int resultado = clientemetodos.Guardar(clientes);
       
       if (resultado==1)
       {
           JOptionPane.showMessageDialog(null,"Cliente guardado exitosamente");
       }
       else
       {
           JOptionPane.showMessageDialog(null,"A Ocurrido un error");
       }
    }//GEN-LAST:event_btnGuardarActionPerformed
   //private String Tipo_Cliente;
    
    private void chboxPremiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chboxPremiumActionPerformed
     //  Tipo_Cliente = "Premium";      // TODO add your handling code here:
    }//GEN-LAST:event_chboxPremiumActionPerformed

    private void chboxBasicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chboxBasicActionPerformed
       // Tipo_Cliente = "Basic"; // TODO add your handling code here:
    }//GEN-LAST:event_chboxBasicActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCiudad;
    private javax.swing.JComboBox<String> boxPais;
    private javax.swing.JComboBox<String> boxProvincia;
    private javax.swing.JButton btnGuardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chboxBasic;
    private javax.swing.JCheckBox chboxPremium;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCedula_Cliente;
    private javax.swing.JTextField txtCelular_Cliente;
    private javax.swing.JTextField txtDireccion_Cliente;
    private javax.swing.JTextField txtId_Cliente;
    private javax.swing.JTextField txtNombres_Cliente;
    private javax.swing.JTextField txtTelefono_CLiente;
    // End of variables declaration//GEN-END:variables
}
