/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CapaInterfaz;

import CapaDatos.Conexionbd;
import Gestiones.GestionEmpleado;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author PROFESORES
 */
public class InterfazEmpleado extends javax.swing.JInternalFrame {

    GestionEmpleado empleados = new GestionEmpleado ();
    
   
    /**
     * Creates new form Interfaz
     */
    public InterfazEmpleado() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApe = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_datos = new javax.swing.JTable();
        btnConsul = new javax.swing.JButton();
        btnModi = new javax.swing.JButton();
        btnElimiinar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnInser = new javax.swing.JButton();
        jbtconsulta = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCed = new javax.swing.JTextField();
        txtSexo = new javax.swing.JComboBox();
        txtEdad = new javax.swing.JTextField();
        jbtconsulta1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(102, 102, 255));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Codigo");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Sexo");

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        txtApe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApeKeyPressed(evt);
            }
        });

        Tabla_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla_datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_datosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla_datos);

        btnConsul.setText("Consultar por Id");
        btnConsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulActionPerformed(evt);
            }
        });

        btnModi.setText("Modificar");
        btnModi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModiActionPerformed(evt);
            }
        });

        btnElimiinar.setText("Eliminar");
        btnElimiinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimiinarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnInser.setText("Insertar");
        btnInser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserActionPerformed(evt);
            }
        });

        jbtconsulta.setText("Consulta por tabla");
        jbtconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtconsultaActionPerformed(evt);
            }
        });

        jLabel5.setText("Edad");

        jLabel7.setText("Telefono");

        jLabel8.setText("Cedula");

        txtSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione:", "M", "F" }));

        jbtconsulta1.setText("Generar Reporte");
        jbtconsulta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtconsulta1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                                .addComponent(txtApe)
                                                .addComponent(txtCed, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(32, 32, 32)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConsul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnElimiinar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtconsulta)
                    .addComponent(jbtconsulta1))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsul)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModi)
                        .addGap(8, 8, 8)
                        .addComponent(btnElimiinar)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jbtconsulta1)
                        .addGap(33, 33, 33)
                        .addComponent(jbtconsulta)))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserActionPerformed
        empleados.getEmpleados().setCodigo(Integer.parseInt(txtId.getText()));
        empleados.getEmpleados().setNombre(txtNombre.getText());
        empleados.getEmpleados().setApellido(txtApe.getText());
        empleados.getEmpleados().setSexo(txtSexo.getSelectedItem().toString());
        empleados.getEmpleados().setEdad(Integer.parseInt(txtEdad.getText().toString()));
        empleados.getEmpleados().setCedula(txtCed.getText());
        empleados.getEmpleados().setTelefono(txtTel.getText());
                
        try {
         empleados.Insertar();
         JOptionPane.showMessageDialog(this, "Dato insertado correctamente");
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
    }//GEN-LAST:event_btnInserActionPerformed

    private void btnConsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulActionPerformed
        // TODO add your handling code here:
//        usuario.getUsuario().setId(txtId.getText());
        empleados.getEmpleados().setCodigo(Integer.parseInt(txtId.getText()));
        try
        {
            empleados.Consultar();
            JOptionPane.showMessageDialog(this, "EL DATO ENCONTRADO");
            txtId.setText(Integer.toString(empleados.getEmpleados().getCodigo()));
            txtNombre.setText(empleados.getEmpleados().getNombre());
            txtApe.setText(empleados.getEmpleados().getApellido());
            txtSexo.setSelectedItem(empleados.getEmpleados().getSexo());
            txtEdad.setText(Integer.toString(empleados.getEmpleados().getEdad()));
            txtCed.setText(empleados.getEmpleados().getCedula());
            txtTel.setText(empleados.getEmpleados().getTelefono());
            
            
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
       

       
    }//GEN-LAST:event_btnConsulActionPerformed

    private void Tabla_datosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_datosMouseClicked
        // TODO add your handling code here:
         int row = Tabla_datos.getSelectedRow();
        this.txtId.setText(Tabla_datos.getModel().getValueAt(row, 0).toString());
        this.txtNombre.setText(Tabla_datos.getModel().getValueAt(row, 1).toString());
        this.txtApe.setText(Tabla_datos.getModel().getValueAt(row, 2).toString());
        this.txtSexo.setSelectedItem(Tabla_datos.getModel().getValueAt(row, 3).toString());
        this.txtEdad.setText(Tabla_datos.getModel().getValueAt(row, 4).toString());
        this.txtTel.setText(Tabla_datos.getModel().getValueAt(row, 5).toString());
        this.txtCed.setText(Tabla_datos.getModel().getValueAt(row, 6).toString());

//        this.txtApe.setText(Tabla_datos.getModel().getValueAt(row, 2).toString());
//        this.txtCed.setText(Tabla_datos.getModel().getValueAt(row, 3).toString());
    }//GEN-LAST:event_Tabla_datosMouseClicked

    private void btnModiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModiActionPerformed
        // TODO add your handling code here:
         {
        empleados.getEmpleados().setNombre(txtNombre.getText());
        empleados.getEmpleados().setApellido(txtApe.getText());
        empleados.getEmpleados().setSexo(txtSexo.getSelectedItem().toString());
        empleados.getEmpleados().setEdad(Integer.parseInt(txtEdad.getText().toString()));
        empleados.getEmpleados().setCedula(txtCed.getText());
        empleados.getEmpleados().setTelefono(txtTel.getText());
                
        try
        {
           empleados.Modificar();
            JOptionPane.showMessageDialog(this, "El dato se modificó correctamente");
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        }

    }//GEN-LAST:event_btnModiActionPerformed

    private void btnElimiinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimiinarActionPerformed
        // TODO add your handling code here:
        
{
       empleados.getEmpleados().setCodigo(Integer.parseInt(txtId.getText()));
        empleados.getEmpleados().setNombre(txtNombre.getText());
        empleados.getEmpleados().setApellido(txtApe.getText());
        empleados.getEmpleados().setSexo(txtSexo.getSelectedItem().toString());
        empleados.getEmpleados().setEdad(Integer.parseInt(txtEdad.getText().toString()));
        empleados.getEmpleados().setCedula(txtCed.getText());
        empleados.getEmpleados().setTelefono(txtTel.getText());
        
        try
        {
            empleados.Eliminar();
            JOptionPane.showMessageDialog(this, "El dato se eliminó correctamente");
            
            }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        }
    }//GEN-LAST:event_btnElimiinarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
txtId.setText(Integer.toString(empleados.getEmpleados().getCodigo()));
        txtNombre.setText(empleados.getEmpleados().getNombre());
        txtApe.setText(empleados.getEmpleados().getApellido());
        txtSexo.setSelectedItem(empleados.getEmpleados().getSexo());
        txtEdad.setText(Integer.toString(empleados.getEmpleados().getEdad()));
        txtTel.setText(empleados.getEmpleados().getTelefono());
        txtCed.setText(empleados.getEmpleados().getCedula());            
    }//GEN-LAST:event_btnNuevoActionPerformed
public void SLetras (JTextField a){//solo letras
a.addKeyListener(new KeyAdapter() {
    public void keyTyped (KeyEvent e){
        char c=e.getKeyChar();
        if(Character.isDigit(c)){
            e.consume();
        }
    }
});
}
    private void jbtconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtconsultaActionPerformed

    try {
        this.Tabla_datos.setModel(empleados.cargarTabla());
    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    
    }//GEN-LAST:event_jbtconsultaActionPerformed

    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtIdKeyPressed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        // TODO add your handling code here:
        SLetras(txtNombre);
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtApeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeKeyPressed
        // TODO add your handling code here:
        SLetras(txtApe);
    }//GEN-LAST:event_txtApeKeyPressed

    private void jbtconsulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtconsulta1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jbtconsulta1ActionPerformed

    /**     * @param args the command line arguments

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
            java.util.logging.Logger.getLogger(InterfazEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_datos;
    private javax.swing.JButton btnConsul;
    private javax.swing.JButton btnElimiinar;
    private javax.swing.JButton btnInser;
    private javax.swing.JButton btnModi;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtconsulta;
    private javax.swing.JButton jbtconsulta1;
    private javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtCed;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JComboBox txtSexo;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
