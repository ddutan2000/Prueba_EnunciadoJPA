/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.*;
import ec.edu.ups.modelo.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dutan2000
 */
public class RegistrarCasa extends javax.swing.JInternalFrame {

    private ControladorCasa controladorC;
    private ControladorHipoteca controladorH;
    private ControladorPersona controladorP;
    private ControladorRegex controladorR;

    public RegistrarCasa(ControladorCasa controladorCasa, ControladorHipoteca controladorHipoteca, ControladorPersona controladorPersona, ControladorRegex controladorRegex) {
        initComponents();
        controladorC = controladorCasa;
        controladorH = controladorHipoteca;
        controladorP = controladorPersona;
        controladorR = controladorRegex;
    }

    public void limpiar() {
        txtCedula.setText("");
        txtCalle1.setText("");
        txtCalle2.setText("");
        txtCodigo.setText("");
        txtValor.setText("");
    }

    public void habilitarCajones() {
        txtCalle1.setEditable(true);
        txtCalle2.setEditable(true);
        txtCodigo.setEditable(true);
        txtValor.setEditable(true);
    }

    public void deshabiliatCajones() {
        txtCalle1.setEditable(false);
        txtCalle2.setEditable(false);
        txtCodigo.setEditable(false);
        txtValor.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCalle1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCalle2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jLabel1.setText("CODIGO:");

        txtCodigo.setEditable(false);

        jLabel2.setText("DIRECCION");

        txtCalle1.setEditable(false);

        jLabel3.setText("CALLE 2:");

        txtCalle2.setEditable(false);

        jLabel4.setText("VALOR:");

        txtValor.setEditable(false);

        jLabel5.setText("CALLE 1:");

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel6.setText("CEDULA:");

        txtCedula.setToolTipText("1. PRIMERO INGRESE CEDULA");
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addGap(36, 36, 36)
                        .addComponent(btnCancelar))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(txtCalle1))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(txtCalle2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCalle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCalle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnCancelar))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        limpiar();
        txtCedula.setEditable(true);
        deshabiliatCajones();
        this.setVisible(false);

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (!txtCedula.getText().isEmpty() && !txtCalle1.getText().isEmpty() && !txtCalle2.getText().isEmpty()
                && !txtCodigo.getText().isEmpty() && !txtValor.getText().isEmpty()) {
            controladorR.ingreseRegex("^\\d{1,}$");
            boolean validarC = controladorR.validar(txtCodigo.getText());
            if (validarC) {
                
                List<Casa> casas = new ArrayList<>();
                try {
                    
                    Persona persona = controladorP.read(txtCedula.getText());
                    Casa c = new Casa();
                    c.setCodigoCasa(Integer.parseInt(txtCodigo.getText()));
                    c.setDireccionCalle1(txtCalle1.getText());
                    c.setDireccionCalle2(txtCalle2.getText());
                    c.setValorDeCasa(Double.parseDouble(txtValor.getText()));
                    c.setPersona(persona);
                    casas.add(c);
                    persona.setCasas(casas);
                    controladorP.update(persona);
                    JOptionPane.showMessageDialog(null, persona.getNombre().toUpperCase()+" SE HA REGISTRADO SU CASA EXITOSAMENTE");
                    txtCedula.setEditable(true);
                    limpiar();
                    deshabiliatCajones();
                    this.setVisible(false);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                
                
            } else {
                JOptionPane.showMessageDialog(null, "DEBE INGRESAR UN DIGITO EN EL CMAPO DE CODIGO");
            }

        } else {
            JOptionPane.showMessageDialog(null, "EXISTEN CAMPOS VACIOS");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        char type = evt.getKeyChar();

        if (type == '\n') {
            try {
                if (controladorP.read(txtCedula.getText()) != null) {
                    habilitarCajones();
                    JOptionPane.showMessageDialog(null, "PUEDE PROCEDER A EDITAR LOS DEMAS CAMPOS");
                    txtCedula.setEditable(false);
                } else {
                    JOptionPane.showMessageDialog(null, "LA CEDULA DE ESTA PERSONA NO SE ENCUENTRA \nREGISTRADO EN EL SISTEMA");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }//GEN-LAST:event_txtCedulaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCalle1;
    private javax.swing.JTextField txtCalle2;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
