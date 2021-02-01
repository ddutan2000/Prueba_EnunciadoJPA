/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.*;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author Dutan2000
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private VentanaHipoteca hipoteca;
    private IniciarSession inciarS;
    private RegistrarCasa regsitrarC;
    private RegistrarPersona registrarP;
    private RegistrarUsuario registrarU;
    
    private ControladorCasa controladorC;
    private ControladorHipoteca controladorH;
    private ControladorPersona controladorP;
    private ControladorRegex controladorR;
    private ControladorUsuario controladorU;
    
    
    public VentanaPrincipal() {
        initComponents();
        
        controladorC=new ControladorCasa();
        controladorH=new ControladorHipoteca();
        controladorP= new ControladorPersona();
        controladorR = new ControladorRegex();
        controladorU=new ControladorUsuario();
        
        hipoteca=new VentanaHipoteca(controladorC,controladorH, controladorP, controladorR);
        inciarS=new IniciarSession(controladorC,controladorH, controladorP, controladorR, controladorU,this);
        registrarP=new RegistrarPersona(controladorC,controladorH, controladorP,controladorR);
        registrarU=new RegistrarUsuario(controladorC,controladorH, controladorP, controladorR,controladorU);
        regsitrarC=new RegistrarCasa(controladorC,controladorH, controladorP, controladorR);
        
        desktopPane.add(hipoteca);
        desktopPane.add(inciarS);
        desktopPane.add(registrarP);
        desktopPane.add(registrarU);
        desktopPane.add(regsitrarC);
        
        itemCerrarS.setVisible(false);
        menuBanco.setVisible(false);
        
    }
    
    public JMenu getMenuBanco(){
        return menuBanco;
    }
    public JMenuItem getItemCerrarS(){
        return itemCerrarS;
    }
    
    public JMenuItem getIteminiciarS(){
        return itemIniciarS;
    }
    public JMenuItem getItemRegistraU(){
        return itemRegistrarU;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        itemIniciarS = new javax.swing.JMenuItem();
        itemRegistrarP = new javax.swing.JMenuItem();
        itemRegistrarC = new javax.swing.JMenuItem();
        itemRegistrarU = new javax.swing.JMenuItem();
        itemCerrarS = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        menuBanco = new javax.swing.JMenu();
        itemHipoteca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setLayout(null);

        fileMenu.setMnemonic('f');
        fileMenu.setText("MENU");

        itemIniciarS.setMnemonic('o');
        itemIniciarS.setText("INICIAR S.");
        itemIniciarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemIniciarSActionPerformed(evt);
            }
        });
        fileMenu.add(itemIniciarS);

        itemRegistrarP.setMnemonic('s');
        itemRegistrarP.setText("R. PERSONA");
        itemRegistrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistrarPActionPerformed(evt);
            }
        });
        fileMenu.add(itemRegistrarP);

        itemRegistrarC.setMnemonic('a');
        itemRegistrarC.setText("R. CASA");
        itemRegistrarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistrarCActionPerformed(evt);
            }
        });
        fileMenu.add(itemRegistrarC);

        itemRegistrarU.setMnemonic('a');
        itemRegistrarU.setText("R. USUARIO");
        itemRegistrarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistrarUActionPerformed(evt);
            }
        });
        fileMenu.add(itemRegistrarU);

        itemCerrarS.setMnemonic('a');
        itemCerrarS.setText("CERRAR S.");
        itemCerrarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCerrarSActionPerformed(evt);
            }
        });
        fileMenu.add(itemCerrarS);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("EXIT");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        menuBanco.setMnemonic('e');
        menuBanco.setText("BANCO");

        itemHipoteca.setMnemonic('t');
        itemHipoteca.setText("HIPOTECA");
        itemHipoteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemHipotecaActionPerformed(evt);
            }
        });
        menuBanco.add(itemHipoteca);

        menuBar.add(menuBanco);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void itemRegistrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistrarPActionPerformed

        registrarP.setVisible(true);
    }//GEN-LAST:event_itemRegistrarPActionPerformed

    private void itemRegistrarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistrarCActionPerformed
    regsitrarC.setVisible(true);
    }//GEN-LAST:event_itemRegistrarCActionPerformed

    private void itemRegistrarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistrarUActionPerformed

        registrarU.setVisible(true);

    }//GEN-LAST:event_itemRegistrarUActionPerformed

    private void itemCerrarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCerrarSActionPerformed
        menuBanco.setVisible(false);
        itemCerrarS.setVisible(false);
        itemIniciarS.setVisible(true);
        itemRegistrarU.setVisible(true);
    }//GEN-LAST:event_itemCerrarSActionPerformed

    private void itemIniciarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemIniciarSActionPerformed

        inciarS.setVisible(true);
    }//GEN-LAST:event_itemIniciarSActionPerformed

    private void itemHipotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemHipotecaActionPerformed
        hipoteca.setVisible(true);
    }//GEN-LAST:event_itemHipotecaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem itemCerrarS;
    private javax.swing.JMenuItem itemHipoteca;
    private javax.swing.JMenuItem itemIniciarS;
    private javax.swing.JMenuItem itemRegistrarC;
    private javax.swing.JMenuItem itemRegistrarP;
    private javax.swing.JMenuItem itemRegistrarU;
    private javax.swing.JMenu menuBanco;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
