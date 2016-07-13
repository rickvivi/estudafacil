package br.com.estudafacil.view;

import br.com.estudafacil.controller.RankingDAO;
import br.com.estudafacil.model.Ranking;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * PAINEL DA TELA DE RANKING
 * @author Ricardo Vanni
 */
public class PanelRanking extends javax.swing.JPanel {

    TelaPrincipal telaPrinc;
    TelaRanking telaRanking;

    BufferedImage img;

    private ArrayList<JLabel> label = new ArrayList<>();
    private ArrayList<Ranking> listaRk = new ArrayList<>();
    private RankingDAO rkDAO = new RankingDAO();
    private int index = 4;

    public PanelRanking(TelaPrincipal tp, TelaRanking telaRk) {
        this.telaPrinc = tp;
        this.telaRanking = telaRk;

        // CARREGA A LISTA DO RANKING        
        listaRk = rkDAO.geraRanking();

        initComponents();

        // PINTA O FUNDO DO PAINEL COM A IMAGEM SELECIONADA
        try {
            this.img = ImageIO.read(new File("src/botoes/fundo_ranking.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(PanelRanking.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TORNA AS POSIÇÕES DO RANKING INVISIVEIS ATÉ PREENCHER COM A CLASSIFICAÇÃO
        addLabels();
        for (int i = 0; i <= 35; i++) {
            label.get(i).setVisible(false);
        }

        // EXIBE AS INDICAÇÕES DO RANKING CASO EXISTAM DADOS NA LISTA
        if (!listaRk.isEmpty()) {
            for (int i = 0; i <= 3; i++) {
                label.get(i).setVisible(true);
            }

            int cont = 4;
            while (cont <= (listaRk.size() * 4)) {
                label.get(cont).setVisible(true);
                cont = cont + 4;
            }
        }

        // PASSA O RANKING DA LISTA PARA AS LABELS
        int cont = 5;
        for (Ranking i : listaRk) {

            // PREENCHE A MATERIA DO RANKING
            label.get(cont).setText(rkDAO.capturaID(i.getIdMateria()));
            label.get(cont++).setVisible(true);

            // PREENCHE O PERIODO DO RANKING
            String period;
            if (i.getIdPeriodo() == 0) {
                period = "1º Bimestre";
            } else if (i.getIdPeriodo() == 1) {
                period = "2º Bimestre";
            } else {
                period = "Semestral";
            }
            label.get(cont).setText(period);
            label.get(cont++).setVisible(true);

            // PREENCHE A POSIÇÃO DO RANKING
            label.get(cont).setText(Integer.toString(i.getPorcentagem()) + "%");
            label.get(cont++).setVisible(true);
            cont++;
        }

    }

    /**
     * MÉTODO PARA ADICIONAR TODAS AS LABELS EM UMA LISTA
     */
    private void addLabels() {
        this.label.add(lblPosicao);
        this.label.add(lblMateria);
        this.label.add(lblPeriodo);
        this.label.add(lblAcertos);

        this.label.add(lblPosicao1);
        this.label.add(lblMateria1);
        this.label.add(lblPeriodo1);
        this.label.add(lblAcertos1);

        this.label.add(lblPosicao2);
        this.label.add(lblMateria2);
        this.label.add(lblPeriodo2);
        this.label.add(lblAcertos2);

        this.label.add(lblPosicao3);
        this.label.add(lblMateria3);
        this.label.add(lblPeriodo3);
        this.label.add(lblAcertos3);

        this.label.add(lblPosicao4);
        this.label.add(lblMateria4);
        this.label.add(lblPeriodo4);
        this.label.add(lblAcertos4);

        this.label.add(lblPosicao5);
        this.label.add(lblMateria5);
        this.label.add(lblPeriodo5);
        this.label.add(lblAcertos5);

        this.label.add(lblPosicao6);
        this.label.add(lblMateria6);
        this.label.add(lblPeriodo6);
        this.label.add(lblAcertos6);

        this.label.add(lblPosicao7);
        this.label.add(lblMateria7);
        this.label.add(lblPeriodo7);
        this.label.add(lblAcertos7);

        this.label.add(lblPosicao8);
        this.label.add(lblMateria8);
        this.label.add(lblPeriodo8);
        this.label.add(lblAcertos8);
    }

    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblClose = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblPosicao = new javax.swing.JLabel();
        lblMateria = new javax.swing.JLabel();
        lblAcertos = new javax.swing.JLabel();
        lblPosicao1 = new javax.swing.JLabel();
        lblPosicao2 = new javax.swing.JLabel();
        lblPosicao3 = new javax.swing.JLabel();
        lblPosicao4 = new javax.swing.JLabel();
        lblPosicao5 = new javax.swing.JLabel();
        lblPosicao6 = new javax.swing.JLabel();
        lblPosicao7 = new javax.swing.JLabel();
        lblPosicao8 = new javax.swing.JLabel();
        lblMateria1 = new javax.swing.JLabel();
        lblMateria2 = new javax.swing.JLabel();
        lblMateria3 = new javax.swing.JLabel();
        lblMateria4 = new javax.swing.JLabel();
        lblMateria5 = new javax.swing.JLabel();
        lblMateria6 = new javax.swing.JLabel();
        lblMateria7 = new javax.swing.JLabel();
        lblMateria8 = new javax.swing.JLabel();
        lblAcertos1 = new javax.swing.JLabel();
        lblAcertos2 = new javax.swing.JLabel();
        lblAcertos3 = new javax.swing.JLabel();
        lblAcertos4 = new javax.swing.JLabel();
        lblAcertos5 = new javax.swing.JLabel();
        lblAcertos6 = new javax.swing.JLabel();
        lblAcertos7 = new javax.swing.JLabel();
        lblAcertos8 = new javax.swing.JLabel();
        lblPeriodo = new javax.swing.JLabel();
        lblPeriodo1 = new javax.swing.JLabel();
        lblPeriodo2 = new javax.swing.JLabel();
        lblPeriodo3 = new javax.swing.JLabel();
        lblPeriodo4 = new javax.swing.JLabel();
        lblPeriodo5 = new javax.swing.JLabel();
        lblPeriodo6 = new javax.swing.JLabel();
        lblPeriodo7 = new javax.swing.JLabel();
        lblPeriodo8 = new javax.swing.JLabel();
        lblReset = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(900, 590));
        setMinimumSize(new java.awt.Dimension(900, 590));
        setPreferredSize(new java.awt.Dimension(900, 590));
        setLayout(null);

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
        add(lblClose);
        lblClose.setBounds(860, 0, 40, 46);

        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/rk_performance.png"))); // NOI18N
        add(lblTitulo);
        lblTitulo.setBounds(72, 11, 782, 64);

        lblPosicao.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPosicao.setForeground(new java.awt.Color(0, 0, 204));
        lblPosicao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPosicao.setText("Posição");
        add(lblPosicao);
        lblPosicao.setBounds(207, 86, 96, 32);

        lblMateria.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblMateria.setForeground(new java.awt.Color(0, 0, 204));
        lblMateria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMateria.setText("Matéria");
        add(lblMateria);
        lblMateria.setBounds(345, 86, 167, 32);

        lblAcertos.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblAcertos.setForeground(new java.awt.Color(0, 0, 204));
        lblAcertos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcertos.setText("Acertos");
        add(lblAcertos);
        lblAcertos.setBounds(746, 86, 105, 32);

        lblPosicao1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPosicao1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPosicao1.setText("1º");
        add(lblPosicao1);
        lblPosicao1.setBounds(216, 144, 59, 32);

        lblPosicao2.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPosicao2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPosicao2.setText("2º");
        add(lblPosicao2);
        lblPosicao2.setBounds(216, 194, 59, 32);

        lblPosicao3.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPosicao3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPosicao3.setText("3º");
        add(lblPosicao3);
        lblPosicao3.setBounds(216, 244, 59, 32);

        lblPosicao4.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPosicao4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPosicao4.setText("4º");
        add(lblPosicao4);
        lblPosicao4.setBounds(216, 294, 59, 32);

        lblPosicao5.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPosicao5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPosicao5.setText("5º");
        add(lblPosicao5);
        lblPosicao5.setBounds(216, 344, 59, 32);

        lblPosicao6.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPosicao6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPosicao6.setText("6º");
        add(lblPosicao6);
        lblPosicao6.setBounds(216, 394, 59, 32);

        lblPosicao7.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPosicao7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPosicao7.setText("7º");
        add(lblPosicao7);
        lblPosicao7.setBounds(216, 444, 59, 32);

        lblPosicao8.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPosicao8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPosicao8.setText("8º");
        add(lblPosicao8);
        lblPosicao8.setBounds(216, 494, 59, 32);

        lblMateria1.setFont(new java.awt.Font("Segoe Print", 1, 20)); // NOI18N
        lblMateria1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMateria1.setText("Engenharia de Software");
        add(lblMateria1);
        lblMateria1.setBounds(293, 145, 278, 32);

        lblMateria2.setFont(new java.awt.Font("Segoe Print", 1, 20)); // NOI18N
        lblMateria2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMateria2.setText("Qualidade de Software");
        add(lblMateria2);
        lblMateria2.setBounds(293, 195, 278, 32);

        lblMateria3.setFont(new java.awt.Font("Segoe Print", 1, 20)); // NOI18N
        lblMateria3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMateria3.setText("Desenv. de Sist. Distribuidos");
        add(lblMateria3);
        lblMateria3.setBounds(293, 245, 278, 32);

        lblMateria4.setFont(new java.awt.Font("Segoe Print", 1, 20)); // NOI18N
        lblMateria4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMateria4.setText("Matéria Selecionada");
        add(lblMateria4);
        lblMateria4.setBounds(293, 295, 278, 32);

        lblMateria5.setFont(new java.awt.Font("Segoe Print", 1, 20)); // NOI18N
        lblMateria5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMateria5.setText("Matéria Selecionada");
        add(lblMateria5);
        lblMateria5.setBounds(293, 345, 278, 32);

        lblMateria6.setFont(new java.awt.Font("Segoe Print", 1, 20)); // NOI18N
        lblMateria6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMateria6.setText("Matéria Selecionada");
        add(lblMateria6);
        lblMateria6.setBounds(293, 395, 278, 32);

        lblMateria7.setFont(new java.awt.Font("Segoe Print", 1, 20)); // NOI18N
        lblMateria7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMateria7.setText("Matéria Selecionada");
        add(lblMateria7);
        lblMateria7.setBounds(293, 445, 278, 32);

        lblMateria8.setFont(new java.awt.Font("Segoe Print", 1, 20)); // NOI18N
        lblMateria8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMateria8.setText("Matéria Selecionada");
        add(lblMateria8);
        lblMateria8.setBounds(293, 495, 278, 32);

        lblAcertos1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblAcertos1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAcertos1.setText("10%");
        add(lblAcertos1);
        lblAcertos1.setBounds(762, 144, 72, 32);

        lblAcertos2.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblAcertos2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAcertos2.setText("10%");
        add(lblAcertos2);
        lblAcertos2.setBounds(762, 194, 72, 32);

        lblAcertos3.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblAcertos3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAcertos3.setText("10%");
        add(lblAcertos3);
        lblAcertos3.setBounds(762, 244, 72, 32);

        lblAcertos4.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblAcertos4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAcertos4.setText("10%");
        add(lblAcertos4);
        lblAcertos4.setBounds(762, 294, 72, 32);

        lblAcertos5.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblAcertos5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAcertos5.setText("10%");
        add(lblAcertos5);
        lblAcertos5.setBounds(762, 344, 72, 32);

        lblAcertos6.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblAcertos6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAcertos6.setText("10%");
        add(lblAcertos6);
        lblAcertos6.setBounds(762, 394, 72, 32);

        lblAcertos7.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblAcertos7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAcertos7.setText("10%");
        add(lblAcertos7);
        lblAcertos7.setBounds(762, 444, 72, 32);

        lblAcertos8.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblAcertos8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAcertos8.setText("10%");
        add(lblAcertos8);
        lblAcertos8.setBounds(762, 494, 72, 32);

        lblPeriodo.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPeriodo.setForeground(new java.awt.Color(0, 0, 204));
        lblPeriodo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPeriodo.setText("Período");
        add(lblPeriodo);
        lblPeriodo.setBounds(606, 86, 105, 32);

        lblPeriodo1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPeriodo1.setForeground(new java.awt.Color(0, 204, 0));
        lblPeriodo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPeriodo1.setText("1º Bimestre");
        add(lblPeriodo1);
        lblPeriodo1.setBounds(581, 144, 155, 32);

        lblPeriodo2.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPeriodo2.setForeground(new java.awt.Color(0, 204, 0));
        lblPeriodo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPeriodo2.setText("Semestral");
        add(lblPeriodo2);
        lblPeriodo2.setBounds(581, 194, 155, 32);

        lblPeriodo3.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPeriodo3.setForeground(new java.awt.Color(0, 204, 0));
        lblPeriodo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPeriodo3.setText("1º Bimestre");
        add(lblPeriodo3);
        lblPeriodo3.setBounds(581, 244, 155, 32);

        lblPeriodo4.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPeriodo4.setForeground(new java.awt.Color(0, 204, 0));
        lblPeriodo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPeriodo4.setText("1º Bimestre");
        add(lblPeriodo4);
        lblPeriodo4.setBounds(581, 294, 155, 32);

        lblPeriodo5.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPeriodo5.setForeground(new java.awt.Color(0, 204, 0));
        lblPeriodo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPeriodo5.setText("1º Bimestre");
        add(lblPeriodo5);
        lblPeriodo5.setBounds(581, 344, 155, 32);

        lblPeriodo6.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPeriodo6.setForeground(new java.awt.Color(0, 204, 0));
        lblPeriodo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPeriodo6.setText("1º Bimestre");
        add(lblPeriodo6);
        lblPeriodo6.setBounds(581, 394, 155, 32);

        lblPeriodo7.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPeriodo7.setForeground(new java.awt.Color(0, 204, 0));
        lblPeriodo7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPeriodo7.setText("1º Bimestre");
        add(lblPeriodo7);
        lblPeriodo7.setBounds(581, 444, 155, 32);

        lblPeriodo8.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPeriodo8.setForeground(new java.awt.Color(0, 204, 0));
        lblPeriodo8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPeriodo8.setText("1º Bimestre");
        add(lblPeriodo8);
        lblPeriodo8.setBounds(581, 494, 155, 32);

        lblReset.setText("Reset");
        lblReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblResetActionPerformed(evt);
            }
        });
        add(lblReset);
        lblReset.setBounds(820, 560, 70, 23);

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Developed by Ricardo Vanni");
        add(jLabel5);
        jLabel5.setBounds(10, 570, 140, 14);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * FUNÇÕES DO BOTÃO CLOSE
     */
    private void lblCloseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseMoved
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/close_mouse.png")));
    }//GEN-LAST:event_lblCloseMouseMoved

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        telaRanking.dispose();
        telaPrinc.setVisible(true);
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

    // FUNÇÕES DO BOTÃO RESET
    private void lblResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblResetActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja resetar a lista de Ranking?", "Janela de Confirmação", JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            rkDAO.deletaRanking();

            for (int i = 0; i <= 35; i++) {
                label.get(i).setVisible(false);
            }
        }
    }//GEN-LAST:event_lblResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblAcertos;
    private javax.swing.JLabel lblAcertos1;
    private javax.swing.JLabel lblAcertos2;
    private javax.swing.JLabel lblAcertos3;
    private javax.swing.JLabel lblAcertos4;
    private javax.swing.JLabel lblAcertos5;
    private javax.swing.JLabel lblAcertos6;
    private javax.swing.JLabel lblAcertos7;
    private javax.swing.JLabel lblAcertos8;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMateria;
    private javax.swing.JLabel lblMateria1;
    private javax.swing.JLabel lblMateria2;
    private javax.swing.JLabel lblMateria3;
    private javax.swing.JLabel lblMateria4;
    private javax.swing.JLabel lblMateria5;
    private javax.swing.JLabel lblMateria6;
    private javax.swing.JLabel lblMateria7;
    private javax.swing.JLabel lblMateria8;
    private javax.swing.JLabel lblPeriodo;
    private javax.swing.JLabel lblPeriodo1;
    private javax.swing.JLabel lblPeriodo2;
    private javax.swing.JLabel lblPeriodo3;
    private javax.swing.JLabel lblPeriodo4;
    private javax.swing.JLabel lblPeriodo5;
    private javax.swing.JLabel lblPeriodo6;
    private javax.swing.JLabel lblPeriodo7;
    private javax.swing.JLabel lblPeriodo8;
    private javax.swing.JLabel lblPosicao;
    private javax.swing.JLabel lblPosicao1;
    private javax.swing.JLabel lblPosicao2;
    private javax.swing.JLabel lblPosicao3;
    private javax.swing.JLabel lblPosicao4;
    private javax.swing.JLabel lblPosicao5;
    private javax.swing.JLabel lblPosicao6;
    private javax.swing.JLabel lblPosicao7;
    private javax.swing.JLabel lblPosicao8;
    private javax.swing.JButton lblReset;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
