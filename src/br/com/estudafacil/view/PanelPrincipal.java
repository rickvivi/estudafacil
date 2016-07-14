package br.com.estudafacil.view;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * PAINEL DA TELA PRINCIPAL
 *
 * @author Rick-Note
 */
public class PanelPrincipal extends javax.swing.JPanel {

    TelaPrincipal telaPrinc;

    private final Image imagemFundo, imagemFundo2, imagemLogo;
    
    public PanelPrincipal(TelaPrincipal telaPrincial) {
        this.telaPrinc = telaPrincial;

        initComponents();

        imagemFundo = new ImageIcon(getClass().getResource("/Botoes/BannerFundo.png")).getImage();
        imagemFundo2 = new ImageIcon(getClass().getResource("/Botoes/sala_aula.jpg")).getImage(); 
        imagemLogo = new ImageIcon(getClass().getResource("/Botoes/Logo.png")).getImage();

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(imagemFundo, 0, 0, this.getWidth(), 350, this);
        g.drawImage(imagemFundo2, 390, 230, this);
        g.drawImage(imagemLogo, 190, 180, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBTCadMateria = new javax.swing.JLabel();
        lblBTCadPergunta = new javax.swing.JLabel();
        lblBTRanking = new javax.swing.JLabel();
        lblBTEstude = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(925, 560));
        setMinimumSize(new java.awt.Dimension(925, 560));
        setPreferredSize(new java.awt.Dimension(925, 560));

        lblBTCadMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/cad_materia_1.png"))); // NOI18N
        lblBTCadMateria.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblBTCadMateriaMouseMoved(evt);
            }
        });
        lblBTCadMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBTCadMateriaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBTCadMateriaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBTCadMateriaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBTCadMateriaMouseReleased(evt);
            }
        });

        lblBTCadPergunta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/cad_questao_1.png"))); // NOI18N
        lblBTCadPergunta.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblBTCadPerguntaMouseMoved(evt);
            }
        });
        lblBTCadPergunta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBTCadPerguntaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBTCadPerguntaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBTCadPerguntaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBTCadPerguntaMouseReleased(evt);
            }
        });

        lblBTRanking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/rk_perf_1.png"))); // NOI18N
        lblBTRanking.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblBTRankingMouseMoved(evt);
            }
        });
        lblBTRanking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBTRankingMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBTRankingMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBTRankingMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBTRankingMouseReleased(evt);
            }
        });

        lblBTEstude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/estude_1.png"))); // NOI18N
        lblBTEstude.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblBTEstudeMouseMoved(evt);
            }
        });
        lblBTEstude.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBTEstudeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBTEstudeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBTEstudeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBTEstudeMouseReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel5.setText("Developed by Ricardo Vanni");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(lblBTCadMateria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBTCadPergunta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBTRanking)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBTEstude)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBTEstude)
                    .addComponent(lblBTRanking)
                    .addComponent(lblBTCadMateria)
                    .addComponent(lblBTCadPergunta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 472, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * IMPLEMENTAÇÃO DAS FUNÇÕES DO BOTÃO DE CADASTRO DE MATÉRIAS
     */
    private void lblBTCadMateriaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBTCadMateriaMouseMoved
        lblBTCadMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/cad_materia_2.png")));
    }//GEN-LAST:event_lblBTCadMateriaMouseMoved

    private void lblBTCadMateriaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBTCadMateriaMouseReleased
        lblBTCadMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/cad_materia_2.png")));
    }//GEN-LAST:event_lblBTCadMateriaMouseReleased

    private void lblBTCadMateriaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBTCadMateriaMousePressed
        lblBTCadMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/cad_materia_3.png")));
    }//GEN-LAST:event_lblBTCadMateriaMousePressed

    private void lblBTCadMateriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBTCadMateriaMouseExited
        lblBTCadMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/cad_materia_1.png")));
    }//GEN-LAST:event_lblBTCadMateriaMouseExited

    /**
     * IMPLEMENTAÇÃO DAS FUNÇÕES DO BOTÃO DO CADASTRO DE QUESTÕES
     */
    private void lblBTCadPerguntaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBTCadPerguntaMouseMoved
        lblBTCadPergunta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/cad_questao_2.png")));
    }//GEN-LAST:event_lblBTCadPerguntaMouseMoved

    private void lblBTCadPerguntaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBTCadPerguntaMouseExited
        lblBTCadPergunta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/cad_questao_1.png")));
    }//GEN-LAST:event_lblBTCadPerguntaMouseExited

    private void lblBTCadPerguntaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBTCadPerguntaMousePressed
        lblBTCadPergunta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/cad_questao_3.png")));
    }//GEN-LAST:event_lblBTCadPerguntaMousePressed

    private void lblBTCadPerguntaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBTCadPerguntaMouseReleased
        lblBTCadPergunta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/cad_questao_2.png")));
    }//GEN-LAST:event_lblBTCadPerguntaMouseReleased


    private void lblBTCadMateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBTCadMateriaMouseClicked
        TelaCadMaterias tela = new TelaCadMaterias(telaPrinc, true);
        tela.setVisible(true);
    }//GEN-LAST:event_lblBTCadMateriaMouseClicked

    private void lblBTCadPerguntaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBTCadPerguntaMouseClicked
        TelaCadPerguntas tela = new TelaCadPerguntas(telaPrinc, true);
        tela.setVisible(true);
    }//GEN-LAST:event_lblBTCadPerguntaMouseClicked

    /**
     * IMPLEMENTAÇÃO DAS FUNÇÕES DO BOTÃO DE RANKING
     */
    private void lblBTRankingMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBTRankingMouseMoved
        lblBTRanking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/rk_perf_2.png")));
    }//GEN-LAST:event_lblBTRankingMouseMoved

    private void lblBTRankingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBTRankingMouseClicked
       // telaPrinc.dispose();
        /**
         * O método dispose() deve ser colocado antes da criação do JDialog,
         * pois se for colocado depois ele impossibilita que a janela seja
         * fechada
         */
        TelaRanking tela = new TelaRanking(telaPrinc, true, telaPrinc);
        tela.setVisible(true);
    }//GEN-LAST:event_lblBTRankingMouseClicked

    private void lblBTRankingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBTRankingMouseExited
        lblBTRanking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/rk_perf_1.png")));
    }//GEN-LAST:event_lblBTRankingMouseExited

    private void lblBTRankingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBTRankingMousePressed
        lblBTRanking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/rk_perf_3.png")));
    }//GEN-LAST:event_lblBTRankingMousePressed

    private void lblBTRankingMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBTRankingMouseReleased
        lblBTRanking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/rk_perf_2.png")));
    }//GEN-LAST:event_lblBTRankingMouseReleased

    /**
     * IMPLEMENTAÇÃO DAS FUNÇÕES DO BOTÃO DE ESTUDE
     */
    private void lblBTEstudeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBTEstudeMouseMoved
        lblBTEstude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/estude_2.png")));
    }//GEN-LAST:event_lblBTEstudeMouseMoved

    private void lblBTEstudeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBTEstudeMouseClicked
        TelaEscolhaEstudo tela = new TelaEscolhaEstudo(telaPrinc, true, telaPrinc);
        tela.setVisible(true);
    }//GEN-LAST:event_lblBTEstudeMouseClicked

    private void lblBTEstudeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBTEstudeMouseExited
        lblBTEstude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/estude_1.png")));
    }//GEN-LAST:event_lblBTEstudeMouseExited

    private void lblBTEstudeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBTEstudeMousePressed
        lblBTEstude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/estude_3.png")));
    }//GEN-LAST:event_lblBTEstudeMousePressed

    private void lblBTEstudeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBTEstudeMouseReleased
        lblBTEstude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/estude_2.png")));
    }//GEN-LAST:event_lblBTEstudeMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblBTCadMateria;
    private javax.swing.JLabel lblBTCadPergunta;
    private javax.swing.JLabel lblBTEstude;
    private javax.swing.JLabel lblBTRanking;
    // End of variables declaration//GEN-END:variables

}
