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
public class TelaEstudo extends javax.swing.JFrame {

    TelaPrincipal telaPrinc;
    
    //VARÍAVEIS PARA RECEBER PARAMETROS DA MATERIA SELECIONADA
    private PanelEscolhaEstuda pnEscEst;
    private String materia, periodo;
   
    public TelaEstudo(TelaPrincipal telaPrincipal, String mat, String prd) {
        this.materia = mat;
        this.periodo = prd;
        
        initComponents();
        
       
        this.telaPrinc = telaPrincipal;
        PanelEstudo panelEstudo = new PanelEstudo(this ,telaPrinc, materia, periodo);
        
        this.pnPrincipal.add(panelEstudo);
        
        System.out.println(materia + "  -  " + periodo);

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(971, 600));
        setMinimumSize(new java.awt.Dimension(971, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(971, 600));

        pnPrincipal.setMaximumSize(new java.awt.Dimension(971, 600));
        pnPrincipal.setMinimumSize(new java.awt.Dimension(971, 600));
        pnPrincipal.setPreferredSize(new java.awt.Dimension(971, 600));
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
