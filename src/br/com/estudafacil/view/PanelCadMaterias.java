package br.com.estudafacil.view;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * PAINEL DA TELA DE CADASTRO DE MATÉRIAS
 * @author Ricardo Vanni
 */
public class PanelCadMaterias extends javax.swing.JPanel {
    
    TelaCadMaterias telaCadMaterias;

    private final Image imagem;
    
    PanelCadMateriaSalva painelSalva = new PanelCadMateriaSalva();

    public PanelCadMaterias(TelaCadMaterias telaCad) {
        this.telaCadMaterias = telaCad;
        initComponents();

        imagem = new ImageIcon(getClass().getResource("/Botoes/tela_cad_materias.png")).getImage();
        
        rgbBtn.add(rbCad);
        rgbBtn.add(rbDelete);

        rbCad.setSelected(true);

        pnCad.add(painelSalva);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(imagem, 0, 0, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rgbBtn = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        rbCad = new javax.swing.JRadioButton();
        rbDelete = new javax.swing.JRadioButton();
        pnCad = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 255));
        setMaximumSize(new java.awt.Dimension(750, 417));
        setMinimumSize(new java.awt.Dimension(750, 417));
        setPreferredSize(new java.awt.Dimension(750, 417));

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Developed by Ricardo Vanni");

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

        rbCad.setFont(new java.awt.Font("Segoe Print", 1, 16)); // NOI18N
        rbCad.setForeground(new java.awt.Color(0, 153, 0));
        rbCad.setText("Cadastrar Novas Matérias");
        rbCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCadActionPerformed(evt);
            }
        });

        rbDelete.setFont(new java.awt.Font("Segoe Print", 1, 16)); // NOI18N
        rbDelete.setForeground(new java.awt.Color(255, 0, 0));
        rbDelete.setText("Deletar Matérias");
        rbDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDeleteActionPerformed(evt);
            }
        });

        pnCad.setBackground(new java.awt.Color(255, 255, 255));
        pnCad.setLayout(new java.awt.BorderLayout());

        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/titulo_cad_materias.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(220, Short.MAX_VALUE)
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblClose))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnCad, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(rbCad)
                                .addGap(10, 10, 10)
                                .addComponent(rbDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblClose))
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnCad, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseMoved
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/close_mouse.png")));
    }//GEN-LAST:event_lblCloseMouseMoved

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked

        telaCadMaterias.dispose();
        
//        /**
//         * ESSE MÉTODO FINALIZA O FRAME TELACADASTRO
//         */
//        Container c = this.getParent();
//        while (!(c instanceof javax.swing.JFrame)) {
//            c = c.getParent();
//        }
//
//        ((javax.swing.JFrame) c).dispose();

    }//GEN-LAST:event_lblCloseMouseClicked

    /**
     * FUNÇOES DO BOTÃO CLOSE
     */
    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/close_normal.png")));
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMousePressed
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/close_clicado.png")));
    }//GEN-LAST:event_lblCloseMousePressed

    private void lblCloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseReleased
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/close_normal.png")));
    }//GEN-LAST:event_lblCloseMouseReleased

    // FUNÇÃO ACIONADA QUANDO SELECIONA RADIO BUTTON DE CADASTRO DE MATÉRIA
    private void rbCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCadActionPerformed
        pnCad.removeAll();
        pnCad.add(painelSalva);
        pnCad.repaint();
    }//GEN-LAST:event_rbCadActionPerformed

    // FUNÇÃO ACIONADA QUANDO SELECIONA RADIO BUTTON DE DELETE DE MATÉRIA
    private void rbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDeleteActionPerformed
        PanelCadMateriaDeleta pnDeleta = new PanelCadMateriaDeleta();
        pnCad.removeAll();
        pnCad.add(pnDeleta);
        pnCad.repaint();
    }//GEN-LAST:event_rbDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnCad;
    private javax.swing.JRadioButton rbCad;
    private javax.swing.JRadioButton rbDelete;
    private javax.swing.ButtonGroup rgbBtn;
    // End of variables declaration//GEN-END:variables
}
