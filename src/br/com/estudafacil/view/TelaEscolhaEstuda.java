/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estudafacil.view;

/**
 *
 * @author Rick-Note
 */
public class TelaEscolhaEstuda extends javax.swing.JFrame {
    TelaPrincipal telaPrinc;
    /**
     * Creates new form TelaEscolhaEstuda
     */
    public TelaEscolhaEstuda(TelaPrincipal telaPrincipal) {
        this.telaPrinc = telaPrincipal;
        
        initComponents();
        PanelEscolhaEstuda painel = new PanelEscolhaEstuda(telaPrinc);
        pnPrincipal.add(painel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(397, 198));
        setMinimumSize(new java.awt.Dimension(397, 198));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(397, 198));

        pnPrincipal.setMaximumSize(new java.awt.Dimension(397, 198));
        pnPrincipal.setMinimumSize(new java.awt.Dimension(397, 198));
        pnPrincipal.setPreferredSize(new java.awt.Dimension(397, 198));
        pnPrincipal.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnPrincipal;
    // End of variables declaration//GEN-END:variables
}
