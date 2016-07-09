/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estudafacil.view;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author Rick-Note
 */
public class PanelEstudo extends javax.swing.JPanel {

    TelaEstudo telaEstudo;
    TelaPrincipal telaprinc;
    BufferedImage img, img2;
    
    /**
     * VARIÁVEIS PARA RECEBER OS PARÂMETROS DA MATÉRIA A SER 
     *  ESTUDADA.
     */
    private String materia, periodo;

    public PanelEstudo(TelaEstudo telaEst, TelaPrincipal telaPrincipal, String mat, String prd) {
        
        this.telaEstudo = telaEst;
        this.telaprinc = telaPrincipal;
        this.periodo = prd;
        this.materia = mat;
        
        try {
            this.img = ImageIO.read(new File("src/botoes/fundo_topo.png"));
            this.img2 = ImageIO.read(new File("src/botoes/pergunta.jpeg"));
        } catch (IOException ex) {
            Logger.getLogger(PanelEstudo.class.getName()).log(Level.SEVERE, null, ex);
        }

        initComponents();
        
        lblMateriaSelecionada.setText(materia);
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(img, 0, 0, this);
        g.drawImage(img2, 765, 305, this);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblClose = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblMateriaSelecionada = new javax.swing.JLabel();
        lblPergunta = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtPergunta = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtResposta = new javax.swing.JTextPane();
        lblRespCorreta = new javax.swing.JLabel();
        lblResposta = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtRespCorreta = new javax.swing.JTextPane();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setMaximumSize(new java.awt.Dimension(971, 600));
        setMinimumSize(new java.awt.Dimension(971, 600));
        setPreferredSize(new java.awt.Dimension(971, 600));

        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/close_normal.png"))); // NOI18N
        lblClose.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblCloseMouseMoved(evt);
            }
        });
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCloseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCloseMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblCloseMouseReleased(evt);
            }
        });

        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/estudando.png"))); // NOI18N

        lblMateriaSelecionada.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 36)); // NOI18N
        lblMateriaSelecionada.setForeground(new java.awt.Color(255, 255, 255));
        lblMateriaSelecionada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblPergunta.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPergunta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/lblPergunta.png"))); // NOI18N
        lblPergunta.setText(" ");

        txtPergunta.setEditable(false);
        txtPergunta.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), new java.awt.Color(0, 0, 255)), null));
        txtPergunta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jScrollPane4.setViewportView(txtPergunta);

        txtResposta.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), new java.awt.Color(0, 0, 255)), null));
        txtResposta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtResposta.setForeground(new java.awt.Color(0, 0, 204));
        jScrollPane5.setViewportView(txtResposta);

        lblRespCorreta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblRespCorreta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRespCorreta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/lblRespCorreta.png"))); // NOI18N
        lblRespCorreta.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lblResposta.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/lblResponda.png"))); // NOI18N

        txtRespCorreta.setEditable(false);
        txtRespCorreta.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtRespCorreta.setForeground(new java.awt.Color(0, 102, 0));
        jScrollPane3.setViewportView(txtRespCorreta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblResposta)
                            .addComponent(lblPergunta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMateriaSelecionada, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(lblRespCorreta))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblMateriaSelecionada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblClose)))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResposta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRespCorreta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseMoved
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/close_mouse.png")));
    }//GEN-LAST:event_lblCloseMouseMoved

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja cancelar e sair?", "Janela de Confirmação", JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            /**
             * ESSE MÉTODO FINALIZA O FRAME TELACADASTRO
             */

            telaEstudo.dispose();
            
            // REINICIALIZA A TELA PRINCIPAL JÁ INSTANCIADA
            telaprinc.setVisible(true);
        }

    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/close_normal.png")));
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMousePressed
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/close_clicado.png")));
    }//GEN-LAST:event_lblCloseMousePressed

    private void lblCloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseReleased
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/close_normal.png")));
    }//GEN-LAST:event_lblCloseMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMateriaSelecionada;
    private javax.swing.JLabel lblPergunta;
    private javax.swing.JLabel lblRespCorreta;
    private javax.swing.JLabel lblResposta;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextPane txtPergunta;
    private javax.swing.JTextPane txtRespCorreta;
    private javax.swing.JTextPane txtResposta;
    // End of variables declaration//GEN-END:variables
}
