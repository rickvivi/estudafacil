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
public class TelaCadMaterias extends javax.swing.JFrame {

    
    public TelaCadMaterias() {
        initComponents();
        
        BannerCadMaterias painel = new BannerCadMaterias();
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
        setMaximumSize(new java.awt.Dimension(750, 417));
        setMinimumSize(new java.awt.Dimension(750, 417));
        setUndecorated(true);
        setSize(new java.awt.Dimension(750, 417));

        pnPrincipal.setMaximumSize(new java.awt.Dimension(750, 417));
        pnPrincipal.setMinimumSize(new java.awt.Dimension(750, 417));
        pnPrincipal.setPreferredSize(new java.awt.Dimension(750, 417));
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