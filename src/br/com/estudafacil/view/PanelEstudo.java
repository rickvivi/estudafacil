package br.com.estudafacil.view;

import br.com.estudafacil.controller.MateriasDAO;
import br.com.estudafacil.controller.RankingDAO;
import br.com.estudafacil.model.Perguntas;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

/**
 * PAINEL PARA TELA DE ESTUDOS
 * @author Ricardo Vanni
 */
public class PanelEstudo extends javax.swing.JPanel {

    TelaEstudo telaEstudo;
    TelaPrincipal telaprinc;
    private final Image img, img2;

    /**
     * VARIÁVEIS PARA RECEBER OS PARÂMETROS DA MATÉRIA A SER ESTUDADA.
     */
    private String materia;
    private int periodo;
    private ArrayList<Perguntas> lista;
    private ArrayList<Perguntas> listaBkp = new ArrayList<>();
    private String prdSelecionado;

    /**
     * VARIÁVEIS NECESSÁRIAS PARA O JOGO DO ESTUDO
     */
    private ArrayList<Perguntas> listaErros = new ArrayList<>();
    private int indicePerguntas = 0;  // ÍNDICE PARA PERCORRER A LISTA DE PERGUNTAS
    private int respCertas = 0; // SOMATÓRIA DAS RESPOSTAS CERTAS
    private int respErradas = 0; // SOMATÓRIA DAS RESPOSTAS ERRADAS
    private String periodoSelecionado; // EXIBE PERIODO
    private boolean btConfere = true; // VARÍAVEL DO BOTÃO - CONFERE / PROXIMO
    private boolean isLast = false; // VARIÁVEL PARA ULTIMA PERGUNTA
    private boolean isFirst = true; // VARIÁVEL PARA SABER SE NÃO SÃO PERGUNTAS REPETIDAS A FIM DE GRAVAR NO RANKING

    private int totalPerguntas = 0; // RECEBE O TOTAL DE PERGUNTAS DA MATÉRIA SELECIONADA
    private int indexAsk = 0; // RECEBE O INDICE DE PERGUNTAS

    public PanelEstudo(TelaEstudo telaEst, TelaPrincipal telaPrincipal, String mat, int prd, ArrayList<Perguntas> list) {
        this.lista = list;
        this.telaEstudo = telaEst;
        this.telaprinc = telaPrincipal;
        this.materia = mat;
        this.periodo = prd;

        img = new ImageIcon(getClass().getResource("/Botoes/fundo_topo.png")).getImage();
        img2 = new ImageIcon(getClass().getResource("/Botoes/pergunta.jpeg")).getImage();

        initComponents();
 

        lblMateriaSelecionada.setText(materia); // EXIBE A MATERIA SELECIONADA NO PAINEL
        // EXIBE O PERIODO SELECIONADO NO PAINEL
        switch (periodo) {
            case 0:
                periodoSelecionado = "Conteúdo do 1º Bimestre";
                break;
            case 1:
                periodoSelecionado = "Conteúdo do 2º Bimestre";
                break;
            default:
                periodoSelecionado = "Conteúdo do Semestre";
                break;
        }
        lblPeriodoSelecionado.setText(periodoSelecionado);

        // FAZ UM SORT NA LISTA DE PERGUNTAS PARA APRESENTAR ALTERNADAMENTE
        Collections.shuffle(lista);

        // COLOCA A PRIMEIRA PERGUNTA PARA SER RESPONDIDA E INICIALIZA RESP. CERTAS E ERRADAS
        txtPergunta.setText(lista.get(indicePerguntas).getPergunta());
        lblCertas.setText(Integer.toString(respCertas));
        lblErradas.setText(Integer.toString(respErradas));

        // FAZ O BACKUP DA LISTA COMPLETA PARA O CASO DE POSTERIORMENTE SEJA
        // NECESSÁRIO ESTUDAR A LISTA NOVAMENTE.
        listaBkp = (ArrayList<Perguntas>) lista.clone();

        // ATRIBUI O TOTAL DE PERGUNTAS A VARIAVEL E EXIBE NA TELA
        totalPerguntas = lista.size();
        lblQuantidade.setText("Questão " + ++indexAsk + " de " + totalPerguntas);
        
        txtResposta.requestFocus();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, this);
        g.drawImage(img2, 795, 335, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblClose = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblMateriaSelecionada = new javax.swing.JLabel();
        lblPergunta = new javax.swing.JLabel();
        lblRespCorreta = new javax.swing.JLabel();
        lblResposta = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtRespCorreta = new javax.swing.JTextPane();
        lblPeriodoSelecionado = new javax.swing.JLabel();
        lblCertas = new javax.swing.JLabel();
        lblIconCertas = new javax.swing.JLabel();
        lblIconErradas = new javax.swing.JLabel();
        lblErradas = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        lblBtnConfere = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResposta = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPergunta = new javax.swing.JTextPane();

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
        lblMateriaSelecionada.setText("Engenharia de Software");

        lblPergunta.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPergunta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/lblPergunta.png"))); // NOI18N
        lblPergunta.setText(" ");

        lblRespCorreta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblRespCorreta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRespCorreta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/lblRespCorreta.png"))); // NOI18N
        lblRespCorreta.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lblResposta.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/lblResponda.png"))); // NOI18N

        txtRespCorreta.setEditable(false);
        txtRespCorreta.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtRespCorreta.setForeground(new java.awt.Color(0, 102, 0));
        txtRespCorreta.setMaximumSize(new java.awt.Dimension(4, 26));
        txtRespCorreta.setMinimumSize(new java.awt.Dimension(4, 26));
        txtRespCorreta.setPreferredSize(new java.awt.Dimension(4, 26));
        jScrollPane3.setViewportView(txtRespCorreta);

        lblPeriodoSelecionado.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 24)); // NOI18N
        lblPeriodoSelecionado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPeriodoSelecionado.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblCertas.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N

        lblIconCertas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconCertas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/certo1.png"))); // NOI18N
        lblIconCertas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblIconErradas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconErradas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/errado1.png"))); // NOI18N
        lblIconErradas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblErradas.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N

        lblQuantidade.setFont(new java.awt.Font("Tempus Sans ITC", 1, 22)); // NOI18N
        lblQuantidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblBtnConfere.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnConfere.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/btConfere.png"))); // NOI18N
        lblBtnConfere.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblBtnConfereMouseMoved(evt);
            }
        });
        lblBtnConfere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnConfereMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnConfereMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBtnConfereMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBtnConfereMouseReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel5.setText("Developed by Ricardo Vanni");

        txtResposta.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 255), new java.awt.Color(0, 102, 255)));
        txtResposta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtResposta.setForeground(new java.awt.Color(0, 0, 204));
        jScrollPane2.setViewportView(txtResposta);

        txtPergunta.setEditable(false);
        txtPergunta.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 255), new java.awt.Color(51, 102, 255)));
        txtPergunta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(txtPergunta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 585, Short.MAX_VALUE)
                .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResposta)
                    .addComponent(lblPergunta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMateriaSelecionada, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPeriodoSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 58, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblIconCertas, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblIconErradas, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblErradas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCertas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblRespCorreta)
                        .addGap(204, 204, 204)
                        .addComponent(lblBtnConfere, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185))))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPeriodoSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblClose)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblResposta, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCertas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIconCertas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIconErradas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblErradas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(117, 117, 117)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBtnConfere, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRespCorreta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * FUNÇÕES DO BOTÃO CLOSE
     */
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

    /**
     * FUNÇÕES DO BOTÃO CONFERE, IMPLEMENTAÇÃO DAS IMAGENS DO BOTÃO
     */
    private void lblBtnConfereMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnConfereMouseMoved
        if (btConfere) {
            lblBtnConfere.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/btConfereMouse.png")));
        } else {
            lblBtnConfere.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/btProximaMouse.png")));
        }
    }//GEN-LAST:event_lblBtnConfereMouseMoved

    private void lblBtnConfereMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnConfereMouseExited
        if (btConfere) {
            lblBtnConfere.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/btConfere.png")));
        } else {
            lblBtnConfere.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/btProxima.png")));
        }
    }//GEN-LAST:event_lblBtnConfereMouseExited

    private void lblBtnConfereMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnConfereMousePressed
        if (btConfere) {
            lblBtnConfere.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/btConferePressed.png")));
        } else {
            lblBtnConfere.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/btProximaPressed.png")));
        }
    }//GEN-LAST:event_lblBtnConfereMousePressed

    private void lblBtnConfereMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnConfereMouseReleased
        if (btConfere) {
            lblBtnConfere.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/btProximaMouse.png")));
        } else {
            lblBtnConfere.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/btConfereMouse.png")));
        }
    }//GEN-LAST:event_lblBtnConfereMouseReleased

    /**
     * IMPLEMENTAÇÃO DAS FUNÇÕES DO BOTÃO CONFERE
     */
    private void lblBtnConfereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnConfereMouseClicked
        if (isFirst) {

            if (btConfere) {
                /**
                 * VERIFICA SE ESTÁ NO ÚLTIMO INDICE DA LISTA E FAZ A ÚTIMA
                 * ETAPA PERGUNTANDO SE DESEJA NO FINAL TREINAR AS RESPOSTAS
                 * ERRADAS.
                 */
                if (lista.size() == 1) {
                    // APRESENTA A RESPOSTA CORRETA
                    txtRespCorreta.setText(lista.get(indicePerguntas).getResposta());

                    // JANELA DE CONFIRMAÇÃO SE A RESPOSTA FOI ACERTADA OU ERRADA
                    int resposta = JOptionPane.showConfirmDialog(null, "Você acertou a resposta?", "Janela de Confirmação", JOptionPane.YES_NO_OPTION);
                    if (resposta == JOptionPane.YES_OPTION) {
                        lblCertas.setText(Integer.toString(++respCertas));
                    } else {
                        lblErradas.setText(Integer.toString(++respErradas));
                        listaErros.add(lista.get(indicePerguntas));     // ADICIONA QUESTÃO ERRADA NA LISTA DE RESPOSTAS ERRADAS
                    }
                    lista.remove(indicePerguntas); // REMOVE A PERGUNTA DA LISTA DEPOIS DE RESPONDIDA
                    isLast = true; // MARCA ESTA PERGUNTA COMO SENDO A ULTIMA.

                    /**
                     * AQUI TERMINOU A RODADA DE PERGUNTAS, ENTÃO O SISTEMA
                     * REGISTRA NO RANKING A PERFORMANCE ALCANÇADA NO JOGO DE
                     * PERGUNTAS.
                     */
                    int ranking = (respCertas * 100) / listaBkp.size();
                    int rk_mat, rk_prd;

                    RankingDAO rkDAO = new RankingDAO();
                    MateriasDAO matDAO = new MateriasDAO();

                    rk_mat = matDAO.capturaID(materia);        
                    rk_prd = periodo;
                 
                    rkDAO.gravaRanking(rk_mat, rk_prd, ranking);

                    // MUDA A VARIÁVEL PARA NAO CLASSIFICAR QUANDO TREINAR ERROS
                    isFirst = false;

                } else if (lista.size() > 1) {
                    /**
                     * SE NÃO FOR O ULTIMO INDICE DA LISTA FAZ O PROCESSO NORMAL
                     * PASSANDO DE INDICE EM INDICE.
                     */
                    // APRESENTA A RESPOSTA CORRETA
                    txtRespCorreta.setText(lista.get(indicePerguntas).getResposta());

                    // JANELA DE CONFIRMAÇÃO SE A RESPOSTA FOI ACERTADA OU ERRADA
                    int resposta = JOptionPane.showConfirmDialog(null, "Você acertou a resposta?", "Janela de Confirmação", JOptionPane.YES_NO_OPTION);
                    if (resposta == JOptionPane.YES_OPTION) {
                        lblCertas.setText(Integer.toString(++respCertas));
                    } else {
                        lblErradas.setText(Integer.toString(++respErradas));
                        listaErros.add(lista.get(indicePerguntas));     // ADICIONA QUESTÃO ERRADA NA LISTA DE RESPOSTAS ERRADAS
                    }
                    // REMOVE A PERGUNTA DA LISTA DEPOIS DE RESPONDIDA
                    lista.remove(indicePerguntas);

                }

                // MUDA A FUNCIONALIDADE DO BOTÃO
                btConfere = false;

            } else if (isLast) {
                /**
                 * AQUI O SISTEMA IDENTIFICA QUE O ESTUDO ACABOU E NÃO EXISTEM
                 * ERROS PARA SEREM ESTUDADOS ENTÃO O SISTEMA PERGUNTA SE QUER
                 * ESTUDAR O MESMO CONTEÚDO NOVAMENTE, SENÃO ELE FECHA.
                 */
                if (listaErros.size() == 0) {
                    int resposta = JOptionPane.showConfirmDialog(null, "O Estudo Terminou... Deseja Estudar ("
                            + materia + " - " + periodoSelecionado + ") Novamente?", "Janela de Confirmação", JOptionPane.YES_NO_OPTION);
                    if (resposta == JOptionPane.YES_OPTION) {
                        indexAsk = 0;
                        totalPerguntas = listaBkp.size();
                        lista.clear();
                        for (Perguntas x : listaBkp) {
                            lista.add(x);
                        }
                        Collections.shuffle(lista);

                        // ZERA TODOS OS INDICES PARA REINICIAR O ESTUDO
                        indicePerguntas = 0;
                        respCertas = 0;
                        respErradas = 0;
                        lblCertas.setText(Integer.toString(respCertas));
                        lblErradas.setText(Integer.toString(respErradas));

                        //ZERA OS CAMPOS E PASSA PARA PROXIMA PERGUNTA.
                        lblQuantidade.setText("Questão " + ++indexAsk + " de " + totalPerguntas);
                        txtPergunta.setText(lista.get(indicePerguntas).getPergunta());
                        txtResposta.setText("");
                        txtRespCorreta.setText("");
                        txtResposta.requestFocus();

                        // MUDA A FUNCIONALIDADE DO BOTÃO
                        btConfere = true;
                        
                    } else {
                        // AQUI, SE O USUARIO NAO DESEJA ESTUDAR MAIS A TELA É FINALIZADA.
                        telaEstudo.dispose();
                        telaprinc.setVisible(true);
                    }
                } else {
                    /**
                     * AQUI O JOGO DE PERGUNTAS JÁ TERMINOU,MAS AINDA EXISTEM
                     * ERROS ENTÃO O PROGRAMA PERGUNTA SE O USUÁRIO DESEJA
                     * TREINAR APENAS AS QUESTÕES QUE FORAM RESPONDIDAS ERRADAS.
                     */
                    int resposta = JOptionPane.showConfirmDialog(null, "As questões terminaram. Deseja estudar apenas as "
                            + "questões que você errou?", "Janela de Confirmação", JOptionPane.YES_NO_OPTION);
                    if (resposta == JOptionPane.YES_OPTION) {
                        // PASSA A LISTA DE ERRADAS PARA A LISTA DO JOGO E ZERA OS INDICES
                        indexAsk = 0;
                        totalPerguntas = listaErros.size();
                        lista.clear();
                        for (Perguntas x : listaErros) {
                            lista.add(x);
                        }
                        listaErros.clear();
                        Collections.shuffle(lista);
                        indicePerguntas = 0;
                        respCertas = 0;
                        respErradas = 0;
                        lblCertas.setText(Integer.toString(respCertas));
                        lblErradas.setText(Integer.toString(respErradas));

                        // ZERA OS CAMPOS E PASSA PARA A PROXIMA PERGUNTA
                        lblQuantidade.setText("Questão " + ++indexAsk + " de " + totalPerguntas);
                        txtPergunta.setText(lista.get(indicePerguntas).getPergunta());
                        txtResposta.setText("");
                        txtRespCorreta.setText("");
                        txtResposta.requestFocus();

                        // MUDA A FUNCIONALIDADE DO BOTÃO
                        btConfere = true;
                    } else {
                        /**
                         * AQUI SE A RESPOSTA FOR NÃO DESEJA ESTUDAR AS
                         * ERRADAS... ENTÃO FECHA A TELA DE ESTUDOS.
                         */
                        telaEstudo.dispose();
                        telaprinc.setVisible(true);
                    }

                }
                isLast = false;
            } else {
                // ZERA OS CAMPOS E PASSA PARA A PROXIMA PERGUNTA
                txtPergunta.setText(lista.get(indicePerguntas).getPergunta());
                txtResposta.setText("");
                txtRespCorreta.setText("");
                txtResposta.requestFocus();
                lblQuantidade.setText("Questão " + ++indexAsk + " de " + totalPerguntas);

                // MUDA A FUNCIONALIDADE DO BOTÃO
                btConfere = true;
            }
        } else {
            /**
             * AQUI ESTÁ FORA DA CLASSIFICAÇÃO, ESTA PARTE DO SISTEMA É USADA
             * QUANDO ESTÁ APENAS ESTUDANDO OS ERROS
             */
            
            if (btConfere) {
                /**
                 * VERIFICA SE ESTÁ NO ÚLTIMO INDICE DA LISTA E FAZ A ÚTIMA
                 * ETAPA PERGUNTANDO SE DESEJA NO FINAL TREINAR AS RESPOSTAS
                 * ERRADAS.
                 */
                if (lista.size() == 1) {
                    // APRESENTA A RESPOSTA CORRETA
                    txtRespCorreta.setText(lista.get(indicePerguntas).getResposta());

                    // JANELA DE CONFIRMAÇÃO SE A RESPOSTA FOI ACERTADA OU ERRADA
                    int resposta = JOptionPane.showConfirmDialog(null, "Você acertou a resposta?", "Janela de Confirmação", JOptionPane.YES_NO_OPTION);
                    if (resposta == JOptionPane.YES_OPTION) {
                        lblCertas.setText(Integer.toString(++respCertas));
                    } else {
                        lblErradas.setText(Integer.toString(++respErradas));
                        listaErros.add(lista.get(indicePerguntas));     // ADICIONA QUESTÃO ERRADA NA LISTA DE RESPOSTAS ERRADAS
                    }
                    lista.remove(indicePerguntas); // REMOVE A PERGUNTA DA LISTA DEPOIS DE RESPONDIDA
                    isLast = true; // MARCA ESTA PERGUNTA COMO SENDO A ULTIMA.
                                  

                } else if (lista.size() > 1) {
                    /**
                     * SE NÃO FOR O ULTIMO INDICE DA LISTA FAZ O PROCESSO NORMAL
                     * PASSANDO DE INDICE EM INDICE.
                     */
                    // APRESENTA A RESPOSTA CORRETA
                    txtRespCorreta.setText(lista.get(indicePerguntas).getResposta());

                    // JANELA DE CONFIRMAÇÃO SE A RESPOSTA FOI ACERTADA OU ERRADA
                    int resposta = JOptionPane.showConfirmDialog(null, "Você acertou a resposta?", "Janela de Confirmação", JOptionPane.YES_NO_OPTION);
                    if (resposta == JOptionPane.YES_OPTION) {
                        lblCertas.setText(Integer.toString(++respCertas));
                    } else {
                        lblErradas.setText(Integer.toString(++respErradas));
                        listaErros.add(lista.get(indicePerguntas));     // ADICIONA QUESTÃO ERRADA NA LISTA DE RESPOSTAS ERRADAS
                    }
                    // REMOVE A PERGUNTA DA LISTA DEPOIS DE RESPONDIDA
                    lista.remove(indicePerguntas);

                }

                // MUDA A FUNCIONALIDADE DO BOTÃO
                btConfere = false;

            } else if (isLast) {
                /**
                 * AQUI O SISTEMA IDENTIFICA QUE O ESTUDO ACABOU E NÃO EXISTEM
                 * ERROS PARA SEREM ESTUDADOS ENTÃO O SISTEMA PERGUNTA SE QUER
                 * ESTUDAR O MESMO CONTEÚDO NOVAMENTE, SENÃO ELE FECHA.
                 */
                if (listaErros.size() == 0) {
                    int resposta = JOptionPane.showConfirmDialog(null, "O Estudo Terminou... Deseja Estudar ("
                            + materia + " - " + periodoSelecionado + ") Novamente?", "Janela de Confirmação", JOptionPane.YES_NO_OPTION);
                    if (resposta == JOptionPane.YES_OPTION) {
                        indexAsk = 0;
                        totalPerguntas = listaBkp.size();
                        lista.clear();
                        for (Perguntas x : listaBkp) {
                            lista.add(x);
                        }
                        Collections.shuffle(lista);

                        // ZERA TODOS OS INDICES PARA REINICIAR O ESTUDO
                        indicePerguntas = 0;
                        respCertas = 0;
                        respErradas = 0;
                        lblCertas.setText(Integer.toString(respCertas));
                        lblErradas.setText(Integer.toString(respErradas));

                        //ZERA OS CAMPOS E PASSA PARA PROXIMA PERGUNTA.
                        lblQuantidade.setText("Questão " + ++indexAsk + " de " + totalPerguntas);
                        txtPergunta.setText(lista.get(indicePerguntas).getPergunta());
                        txtResposta.setText("");
                        txtRespCorreta.setText("");
                        txtResposta.requestFocus();

                        // MUDA A FUNCIONALIDADE DO BOTÃO
                        btConfere = true;
                        
                        isFirst = true;
                        
                    } else {
                        // AQUI, SE O USUARIO NAO DESEJA ESTUDAR MAIS A TELA É FINALIZADA.
                        telaEstudo.dispose();
                        telaprinc.setVisible(true);
                    }
                } else {
                    /**
                     * AQUI O JOGO DE PERGUNTAS JÁ TERMINOU,MAS AINDA EXISTEM
                     * ERROS ENTÃO O PROGRAMA PERGUNTA SE O USUÁRIO DESEJA
                     * TREINAR APENAS AS QUESTÕES QUE FORAM RESPONDIDAS ERRADAS.
                     */
                    int resposta = JOptionPane.showConfirmDialog(null, "As questões terminaram. Deseja estudar apenas as "
                            + "questões que você errou?", "Janela de Confirmação", JOptionPane.YES_NO_OPTION);
                    if (resposta == JOptionPane.YES_OPTION) {
                        // PASSA A LISTA DE ERRADAS PARA A LISTA DO JOGO E ZERA OS INDICES
                        indexAsk = 0;
                        totalPerguntas = listaErros.size();
                        lista.clear();
                        for (Perguntas x : listaErros) {
                            lista.add(x);
                        }
                        listaErros.clear();
                        Collections.shuffle(lista);
                        indicePerguntas = 0;
                        respCertas = 0;
                        respErradas = 0;
                        lblCertas.setText(Integer.toString(respCertas));
                        lblErradas.setText(Integer.toString(respErradas));

                        // ZERA OS CAMPOS E PASSA PARA A PROXIMA PERGUNTA
                        lblQuantidade.setText("Questão " + ++indexAsk + " de " + totalPerguntas);
                        txtPergunta.setText(lista.get(indicePerguntas).getPergunta());
                        txtResposta.setText("");
                        txtRespCorreta.setText("");
                        txtResposta.requestFocus();

                        // MUDA A FUNCIONALIDADE DO BOTÃO
                        btConfere = true;
                    } else {
                        /**
                         * AQUI SE A RESPOSTA FOR NÃO DESEJA ESTUDAR AS
                         * ERRADAS... ENTÃO FECHA A TELA DE ESTUDOS.
                         */
                        telaEstudo.dispose();
                        telaprinc.setVisible(true);
                    }

                }
                isLast = false;
            } else {
                // ZERA OS CAMPOS E PASSA PARA A PROXIMA PERGUNTA
                txtPergunta.setText(lista.get(indicePerguntas).getPergunta());
                txtResposta.setText("");
                txtRespCorreta.setText("");
                txtResposta.requestFocus();
                lblQuantidade.setText("Questão " + ++indexAsk + " de " + totalPerguntas);

                // MUDA A FUNCIONALIDADE DO BOTÃO
                btConfere = true;
            }
        }
    }//GEN-LAST:event_lblBtnConfereMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBtnConfere;
    private javax.swing.JLabel lblCertas;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblErradas;
    private javax.swing.JLabel lblIconCertas;
    private javax.swing.JLabel lblIconErradas;
    private javax.swing.JLabel lblMateriaSelecionada;
    private javax.swing.JLabel lblPergunta;
    private javax.swing.JLabel lblPeriodoSelecionado;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblRespCorreta;
    private javax.swing.JLabel lblResposta;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextPane txtPergunta;
    private javax.swing.JTextPane txtRespCorreta;
    private javax.swing.JTextPane txtResposta;
    // End of variables declaration//GEN-END:variables
}
