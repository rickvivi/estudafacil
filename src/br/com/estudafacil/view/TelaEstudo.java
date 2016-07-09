/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estudafacil.view;

import br.com.estudafacil.model.Perguntas;
import java.util.ArrayList;

/**
 *
 * @author Rick-Note
 */
public class TelaEstudo extends javax.swing.JFrame {

    TelaPrincipal telaPrinc;
    
    //VARÍAVEIS PARA RECEBER PARAMETROS DA MATERIA SELECIONADA
    private PanelEscolhaEstuda pnEscEst;
    private String materia;
    private ArrayList<Perguntas> lista;
   
    public TelaEstudo(TelaPrincipal telaPrincipal, String mat, ArrayList<Perguntas> list) {
        this.materia = mat;
        this.lista = list;
        
        initComponents();
        
       
        this.telaPrinc = telaPrincipal;
        PanelEstudo panelEstudo = new PanelEstudo(this ,telaPrinc, materia, lista);
        
        this.pnPrincipal.add(panelEstudo);
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(971, 600));
        setMinimumSize(new java.awt.Dimension(971, 600));
        setUndecorated(true);

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
