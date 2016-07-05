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
import javax.swing.JPanel;

/**
 *
 * @author Rick-Note
 */
public class BannerPrincipal extends javax.swing.JPanel {
    
    TelaPrincipal telaPrinc;

    BufferedImage imagemFundo, imagemFundo2, imagemLogo;
    TelaCadMaterias tela_materia = new TelaCadMaterias();
    TelaCadastro tela_pergunta = new TelaCadastro();

    /**
     * Creates new form BannerCad
     */
    public BannerPrincipal(TelaPrincipal telaPrincial) {
        this.telaPrinc = telaPrincial;
        
        initComponents();
        
        tela_materia.setVisible(false);
        tela_pergunta.setVisible(false);

        try {
            File img = new File("src/botoes/bannerfundo.png");
            File img2 = new File("src/botoes/sala_aula.jpg");
            File imgLogo = new File("src/botoes/logo.png");
            this.imagemFundo = ImageIO.read(img);
            this.imagemFundo2 = ImageIO.read(img2);
            this.imagemLogo = ImageIO.read(imgLogo);
        } catch (IOException ex) {
            Logger.getLogger(BannerPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(imagemFundo, 0, 0, this.getWidth(), 350, this);
        g.drawImage(imagemFundo2, 390, 230, this);
        g.drawImage(imagemLogo, 190, 180, this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBTCadMateria = new javax.swing.JLabel();
        lblBTCadPergunta = new javax.swing.JLabel();
        lblBTRanking = new javax.swing.JLabel();
        lblBTEstude = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
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
                .addContainerGap(493, Short.MAX_VALUE))
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
        if (!tela_materia.isVisible()) {
            tela_materia.setVisible(true);
        }
    }//GEN-LAST:event_lblBTCadMateriaMouseClicked

    private void lblBTCadPerguntaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBTCadPerguntaMouseClicked
        if (!tela_pergunta.isVisible()) {
            tela_pergunta.setVisible(true);
        }
    }//GEN-LAST:event_lblBTCadPerguntaMouseClicked

    /**
     * IMPLEMENTAÇÃO DAS FUNÇÕES DO BOTÃO DE RANKING
     */
    private void lblBTRankingMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBTRankingMouseMoved
        lblBTRanking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/rk_perf_2.png")));
    }//GEN-LAST:event_lblBTRankingMouseMoved

    private void lblBTRankingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBTRankingMouseClicked
       
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
        TelaEscolhaEstuda tela = new TelaEscolhaEstuda(telaPrinc);
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
    private javax.swing.JLabel lblBTCadMateria;
    private javax.swing.JLabel lblBTCadPergunta;
    private javax.swing.JLabel lblBTEstude;
    private javax.swing.JLabel lblBTRanking;
    // End of variables declaration//GEN-END:variables
  
}

