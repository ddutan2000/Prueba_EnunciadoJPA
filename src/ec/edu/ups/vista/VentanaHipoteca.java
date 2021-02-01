/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import ec.edu.ups.controlador.*;
import ec.edu.ups.modelo.*;
import java.io.FileOutputStream;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dutan2000
 */
public class VentanaHipoteca extends javax.swing.JInternalFrame {

    private ControladorCasa controladorC;
    private ControladorHipoteca controladorH;
    private ControladorPersona controladorP;
    private ControladorRegex controladorR;

    public VentanaHipoteca(ControladorCasa controladorCasa, ControladorHipoteca controladorHipoteca, ControladorPersona controladorPersona, ControladorRegex controladorRegex) {
        initComponents();
        controladorC = controladorCasa;
        controladorH = controladorHipoteca;
        controladorP = controladorPersona;
        controladorR = controladorRegex;
        DateFormat formatDate = new SimpleDateFormat("DD/MM/YYYY");
        txtFecha.setText(formatDate.format(new Date().getTime()));
    }

    public void limpiar() {
        DateFormat formatDate = new SimpleDateFormat("DD/MM/YYYY");
        txtFecha.setText(formatDate.format(new Date().getTime()));
        txtCedula.setText("");
        txtCedulaGarante.setText("");
        txtMonto.setText("");
        txtPlazo.setText("");
    }

    public void habiliatrCajones() {
        txtMonto.setEditable(true);
        txtPlazo.setEditable(true);
        txtCedulaGarante.setEditable(true);
    }

    public void deshabiliatrCajones() {
        txtMonto.setEditable(false);
        txtPlazo.setEditable(false);
        txtCedulaGarante.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPlazo = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JToggleButton();
        btnEmitir = new javax.swing.JToggleButton();
        btnCancelar = new javax.swing.JToggleButton();
        lblGarante = new javax.swing.JLabel();
        txtCedulaGarante = new javax.swing.JTextField();
        lblCedulaGarante = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jLabel1.setText("FECHA:");

        txtFecha.setEditable(false);
        txtFecha.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setText("CEDULA:");

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        jLabel3.setText("MONTO:");

        txtMonto.setEditable(false);

        jLabel4.setText("PLAZO:");

        txtPlazo.setEditable(false);

        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnEmitir.setText("EMITIR");
        btnEmitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmitirActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblGarante.setText("GARANTE:");

        txtCedulaGarante.setEditable(false);
        txtCedulaGarante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaGaranteKeyTyped(evt);
            }
        });

        lblCedulaGarante.setText("CEDULA:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCedulaGarante)
                        .addGap(18, 18, 18)
                        .addComponent(txtCedulaGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblGarante)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnCalcular)
                        .addGap(71, 71, 71)
                        .addComponent(btnEmitir)
                        .addGap(47, 47, 47)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblGarante)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedulaGarante)
                    .addComponent(txtCedulaGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnEmitir)
                    .addComponent(btnCancelar))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        char type = evt.getKeyChar();

        if (type == '\n') {
            if (!txtCedula.getText().isEmpty()) {
                try {
                    if (controladorP.read(txtCedula.getText()) != null) {
                        habiliatrCajones();
                        JOptionPane.showMessageDialog(null, "PERSONA REGISTRADA DENTRO DEL SISTEMA \nPROCEDA A INGRESAR SUS DATOS");
                        txtCedula.setEditable(false);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(null, "EL CAMPO CEDULA SE ENCUENTRA VACIO");
            }
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        try {
            Persona p = controladorP.read(txtCedula.getText());
            Casa c = controladorC.verPorCedula(p.getCedula());
            Persona garante= new Persona();
            if (!txtCedulaGarante.getText().isEmpty()) {
                garante = controladorP.read(txtCedulaGarante.getText());
            }

            //la cantidad le prestamo
            double prestamo = Double.parseDouble(txtMonto.getText());
            //el tiempo que esta pidiendo el prestamo en meses
            int tiempo = Integer.parseInt(txtPlazo.getText());
            //el capital es la cantidad base dividido por el tiempo que esta pidiendo prestado el dinero
            double capital = prestamo / tiempo;

            //verificar si el salario es suficiente sino necesita garante
            Document document = new Document();

            PdfWriter.getInstance(document, new FileOutputStream("/Users/newuser/NetBeansProjects/PruebaEnunciadoJPA/pdfs/estimado.pdf"));

            document.open();

            Paragraph into = new Paragraph("      BANCO PAUTE");
            Paragraph entrada = new Paragraph("GARANTE");
            Paragraph space = new Paragraph(" ");
            Paragraph solicitante = new Paragraph("SOLICITANTE");

            PdfPTable table = new PdfPTable(4);

            PdfPCell c1 = new PdfPCell(new Paragraph("CEDULA"));
            PdfPCell c2 = new PdfPCell(new Paragraph("NOMBRE"));
            PdfPCell c3 = new PdfPCell(new Paragraph("APELLIDO"));
            PdfPCell c4 = new PdfPCell(new Paragraph("TELEFONO"));

            table.addCell(c1);
            table.addCell(c2);
            table.addCell(c3);
            table.addCell(c4);

            c1 = new PdfPCell(new Paragraph(p.getCedula()));
            c2 = new PdfPCell(new Paragraph(p.getNombre()));
            c3 = new PdfPCell(new Paragraph(p.getApellido()));
            c4 = new PdfPCell(new Paragraph(p.getTelefono()));
            table.addCell(c1);
            table.addCell(c2);
            table.addCell(c3);
            table.addCell(c4);

            PdfPTable tableGarante = new PdfPTable(4);

            PdfPCell c10 = new PdfPCell(new Paragraph("CEDULA"));
            PdfPCell c11 = new PdfPCell(new Paragraph("NOMBRE"));
            PdfPCell c12 = new PdfPCell(new Paragraph("APELLIDO"));
            PdfPCell c13 = new PdfPCell(new Paragraph("TELEFONO"));

            tableGarante.addCell(c10);
            tableGarante.addCell(c11);
            tableGarante.addCell(c12);
            tableGarante.addCell(c13);

            c10 = new PdfPCell(new Paragraph(garante.getCedula()));
            c11 = new PdfPCell(new Paragraph(garante.getNombre()));
            c12 = new PdfPCell(new Paragraph(garante.getApellido()));
            c13 = new PdfPCell(new Paragraph(garante.getTelefono()));
            tableGarante.addCell(c10);
            tableGarante.addCell(c11);
            tableGarante.addCell(c12);
            tableGarante.addCell(c13);

            PdfPTable table1 = new PdfPTable(5);
            PdfPCell c5 = new PdfPCell(new Paragraph("MES"));
            PdfPCell c6 = new PdfPCell(new Paragraph("CAPITAL"));
            PdfPCell c7 = new PdfPCell(new Paragraph("SALDO"));
            PdfPCell c8 = new PdfPCell(new Paragraph("INTERES"));
            PdfPCell c9 = new PdfPCell(new Paragraph("TOTAL"));

            table1.addCell(c5);
            table1.addCell(c6);
            table1.addCell(c7);
            table1.addCell(c8);
            table1.addCell(c9);

            for (int i = 0; i < tiempo; i++) {
                double saldo = prestamo - (i * capital);
                double interes = saldo * (.17 / 12);

                c5 = new PdfPCell(new Paragraph((i + 1) + ""));
                c6 = new PdfPCell(new Paragraph(String.format("%,.2f", capital)));
                c7 = new PdfPCell(new Paragraph(String.format("%,.2f", saldo)));
                c8 = new PdfPCell(new Paragraph(String.format("%,.2f", interes)));
                c9 = new PdfPCell(new Paragraph(String.format("%,.2f", (capital + interes))));

                table1.addCell(c5);
                table1.addCell(c6);
                table1.addCell(c7);
                table1.addCell(c8);
                table1.addCell(c9);

            }

            document.add(into);
            document.add(space);
            document.add(solicitante);
            document.add(space);
            document.add(table);
            document.add(space);
            document.add(entrada);
            document.add(space);
            document.add(tableGarante);
            document.add(space);
            document.add(table1);

            document.close();

            JOptionPane.showMessageDialog(null, "ESTIMADO REALIZADO CON EXITO");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnEmitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmitirActionPerformed
        if (!txtMonto.getText().isEmpty() && !txtCedula.getText().isEmpty() && !txtPlazo.getText().isEmpty()) {

            Hipoteca h= new Hipoteca();
            try {

                h.setCedulaCliente(txtCedula.getText());
                h.setCedulaGarante(txtCedulaGarante.getText());
                h.setInteres(17.00);
                h.setLapzoDeTiempo(txtPlazo.getText());
                h.setPrestamo(Double.parseDouble(txtMonto.getText()));
                controladorH.create(h);
                limpiar();
                deshabiliatrCajones();
                txtCedula.setEditable(true);
                JOptionPane.showMessageDialog(null, "HIPOTECA EMITIDO CON EXITO");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }else{
            System.out.println("EXISTEN CAMPOS VACIOS");
        }

    }//GEN-LAST:event_btnEmitirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        limpiar();
        txtCedula.setEditable(true);
        deshabiliatrCajones();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCedulaGaranteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaGaranteKeyTyped
        char type = evt.getKeyChar();

        if (type == '\n') {
            try {
                if (controladorP.read(txtCedulaGarante.getText()) != null) {
                    JOptionPane.showMessageDialog(null, "PERSONA INGRESADA CON EXITO");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }//GEN-LAST:event_txtCedulaGaranteKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCalcular;
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JToggleButton btnEmitir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCedulaGarante;
    private javax.swing.JLabel lblGarante;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCedulaGarante;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtPlazo;
    // End of variables declaration//GEN-END:variables
}
