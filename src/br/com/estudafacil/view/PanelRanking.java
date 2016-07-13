package br.com.estudafacil.view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JLabel;

public class PanelRanking extends javax.swing.JPanel {

    TelaPrincipal telaPrinc;
    TelaRanking telaRanking;
    
    BufferedImage img;
    
    private ArrayList<JLabel> label = new ArrayList<>();
    
    
    public PanelRanking(TelaPrincipal tp, TelaRanking telaRk) {
        this.telaPrinc = tp;
        this.telaRanking = telaRk;
        
        initComponents();
        
        try {
            this.img = ImageIO.read(new File("src/botoes/fundo_ranking.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(PanelRanking.class.getName()).log(Level.SEVERE, null, ex);
        }      
        
        addLabels();
        
        for (int i = 0; i <= 35; i++){
            label.get(i).setVisible(false);
        }
        
        for (int i = 0; i <= 35; i++){
            label.get(i).setVisible(true);
        }

        
    }
    
    private void addLabels(){
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
    
    public void paintComponent(Graphics g){
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

        setMaximumSize(new java.awt.Dimension(900, 590));
        setMinimumSize(new java.awt.Dimension(900, 590));

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

        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/rk_performance.png"))); // NOI18N

        lblPosicao.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPosicao.setForeground(new java.awt.Color(0, 0, 204));
        lblPosicao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPosicao.setText("Posição");

        lblMateria.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblMateria.setForeground(new java.awt.Color(0, 0, 204));
        lblMateria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMateria.setText("Matéria");

        lblAcertos.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblAcertos.setForeground(new java.awt.Color(0, 0, 204));
        lblAcertos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcertos.setText("Acertos");

        lblPosicao1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPosicao1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPosicao1.setText("1º");

        lblPosicao2.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPosicao2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPosicao2.setText("2º");

        lblPosicao3.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPosicao3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPosicao3.setText("3º");

        lblPosicao4.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPosicao4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPosicao4.setText("4º");

        lblPosicao5.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPosicao5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPosicao5.setText("5º");

        lblPosicao6.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPosicao6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPosicao6.setText("6º");

        lblPosicao7.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPosicao7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPosicao7.setText("7º");

        lblPosicao8.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPosicao8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPosicao8.setText("8º");

        lblMateria1.setFont(new java.awt.Font("Segoe Print", 1, 20)); // NOI18N
        lblMateria1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMateria1.setText("Engenharia de Software");

        lblMateria2.setFont(new java.awt.Font("Segoe Print", 1, 20)); // NOI18N
        lblMateria2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMateria2.setText("Qualidade de Software");

        lblMateria3.setFont(new java.awt.Font("Segoe Print", 1, 20)); // NOI18N
        lblMateria3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMateria3.setText("Desenv. de Sist. Distribuidos");

        lblMateria4.setFont(new java.awt.Font("Segoe Print", 1, 20)); // NOI18N
        lblMateria4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMateria4.setText("Matéria Selecionada");

        lblMateria5.setFont(new java.awt.Font("Segoe Print", 1, 20)); // NOI18N
        lblMateria5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMateria5.setText("Matéria Selecionada");

        lblMateria6.setFont(new java.awt.Font("Segoe Print", 1, 20)); // NOI18N
        lblMateria6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMateria6.setText("Matéria Selecionada");

        lblMateria7.setFont(new java.awt.Font("Segoe Print", 1, 20)); // NOI18N
        lblMateria7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMateria7.setText("Matéria Selecionada");

        lblMateria8.setFont(new java.awt.Font("Segoe Print", 1, 20)); // NOI18N
        lblMateria8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMateria8.setText("Matéria Selecionada");

        lblAcertos1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblAcertos1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAcertos1.setText("10%");

        lblAcertos2.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblAcertos2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAcertos2.setText("10%");

        lblAcertos3.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblAcertos3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAcertos3.setText("10%");

        lblAcertos4.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblAcertos4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAcertos4.setText("10%");

        lblAcertos5.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblAcertos5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAcertos5.setText("10%");

        lblAcertos6.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblAcertos6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAcertos6.setText("10%");

        lblAcertos7.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblAcertos7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAcertos7.setText("10%");

        lblAcertos8.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblAcertos8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAcertos8.setText("10%");

        lblPeriodo.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPeriodo.setForeground(new java.awt.Color(0, 0, 204));
        lblPeriodo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPeriodo.setText("Período");

        lblPeriodo1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPeriodo1.setForeground(new java.awt.Color(0, 204, 0));
        lblPeriodo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPeriodo1.setText("1º Bimestre");

        lblPeriodo2.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPeriodo2.setForeground(new java.awt.Color(0, 204, 0));
        lblPeriodo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPeriodo2.setText("Semestral");

        lblPeriodo3.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPeriodo3.setForeground(new java.awt.Color(0, 204, 0));
        lblPeriodo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPeriodo3.setText("1º Bimestre");

        lblPeriodo4.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPeriodo4.setForeground(new java.awt.Color(0, 204, 0));
        lblPeriodo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPeriodo4.setText("1º Bimestre");

        lblPeriodo5.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPeriodo5.setForeground(new java.awt.Color(0, 204, 0));
        lblPeriodo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPeriodo5.setText("1º Bimestre");

        lblPeriodo6.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPeriodo6.setForeground(new java.awt.Color(0, 204, 0));
        lblPeriodo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPeriodo6.setText("1º Bimestre");

        lblPeriodo7.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPeriodo7.setForeground(new java.awt.Color(0, 204, 0));
        lblPeriodo7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPeriodo7.setText("1º Bimestre");

        lblPeriodo8.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lblPeriodo8.setForeground(new java.awt.Color(0, 204, 0));
        lblPeriodo8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPeriodo8.setText("1º Bimestre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(lblTitulo)
                .addGap(6, 6, 6)
                .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPosicao1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPosicao2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPosicao3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPosicao4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPosicao5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPosicao6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPosicao7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPosicao8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMateria2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMateria3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMateria4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMateria5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMateria6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMateria7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMateria8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMateria1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(lblMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPeriodo1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPeriodo2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPeriodo3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPeriodo4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPeriodo5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPeriodo6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPeriodo7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPeriodo8, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAcertos, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAcertos2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAcertos1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAcertos3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAcertos4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAcertos5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAcertos6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAcertos8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAcertos7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAcertos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMateria1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPeriodo1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(356, 356, 356))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPosicao1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPosicao2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMateria2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPeriodo2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPosicao3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMateria3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPeriodo3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPosicao4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMateria4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPeriodo4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPosicao5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMateria5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPeriodo5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPosicao6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMateria6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPeriodo6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPosicao7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMateria7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPeriodo7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPosicao8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMateria8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPeriodo8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAcertos1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblAcertos2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblAcertos3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblAcertos4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblAcertos5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblAcertos6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblAcertos7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblAcertos8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
    }// </editor-fold>//GEN-END:initComponents

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
