package br.com.estudafacil.view;

import br.com.estudafacil.controller.MateriasDAO;
import br.com.estudafacil.controller.PerguntasDAO;
import br.com.estudafacil.model.Materias;
import br.com.estudafacil.model.Perguntas;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 * PAINEL DA TELA DE CADASTRO DE PERGUNTAS
 *
 * @author Ricardo Vanni
 */
public class PanelCadPerguntas extends javax.swing.JPanel {

    private final Image imagemFundo;

    int contador = 0;
    boolean novo = true;
    int indexAltera = -1;
    ArrayList<Perguntas> lista = new ArrayList<>();
    ArrayList<Materias> listaMaterias = new ArrayList<>();

    TelaCadPerguntas telaCadPerguntas;

    public PanelCadPerguntas(TelaCadPerguntas telaCad) {
        this.telaCadPerguntas = telaCad;
        initComponents();

        imagemFundo = new ImageIcon(getClass().getResource("/Botoes/BannerAzul.png")).getImage();

        txtPergunta.setVisible(false);
        txtResposta.setVisible(false);
        btgPeriodo.add(rbPrimeiro);
        btgPeriodo.add(rbSegundo);

        rbPrimeiro.setEnabled(false);
        rbSegundo.setEnabled(false);
        jcbMaterias.setEnabled(false);

        //CARREGA TODAS MATÉRIAS CADASTRADAS NO JCOMBOBOX
        MateriasDAO matDAO = new MateriasDAO();
        listaMaterias = matDAO.carregaMaterias();

        jcbMaterias.addItem("Selecione a Matéria");
        for (Materias x : listaMaterias) {
            jcbMaterias.addItem(x.getMateria());
        }

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(imagemFundo, 0, 0, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgPeriodo = new javax.swing.ButtonGroup();
        lblClose = new javax.swing.JLabel();
        rbSegundo = new javax.swing.JRadioButton();
        rbPrimeiro = new javax.swing.JRadioButton();
        jcbMaterias = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPergunta = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResposta = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        btnAltera = new javax.swing.JButton();
        btnDeleta = new javax.swing.JButton();
        lblNext = new javax.swing.JLabel();
        btnGravar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        setMaximumSize(new java.awt.Dimension(949, 560));
        setMinimumSize(new java.awt.Dimension(949, 560));
        setPreferredSize(new java.awt.Dimension(949, 560));
        setVerifyInputWhenFocusTarget(false);

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

        rbSegundo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbSegundo.setText("Segundo Bimestre");
        rbSegundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSegundoActionPerformed(evt);
            }
        });

        rbPrimeiro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbPrimeiro.setText("Primeiro Bimestre");
        rbPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPrimeiroActionPerformed(evt);
            }
        });

        jcbMaterias.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbMaterias.setToolTipText("");
        jcbMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMateriasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel2.setText("MATÉRIA:");

        jLabel3.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel3.setText("PERGUNTA:");

        txtPergunta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(txtPergunta);

        jLabel4.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel4.setText("RESPOSTA: ");

        txtResposta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(txtResposta);

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel5.setText("Developed by Ricardo Vanni");

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/left_normal.png"))); // NOI18N
        lblBack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblBack.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblBackMouseMoved(evt);
            }
        });
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBackMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBackMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBackMouseReleased(evt);
            }
        });

        btnAltera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/editar.png"))); // NOI18N
        btnAltera.setText("ALTERAR");
        btnAltera.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAltera.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAltera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlteraActionPerformed(evt);
            }
        });

        btnDeleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/lixo.png"))); // NOI18N
        btnDeleta.setText("EXCLUIR");
        btnDeleta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeleta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDeleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletaActionPerformed(evt);
            }
        });

        lblNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/right_normal.png"))); // NOI18N
        lblNext.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNext.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblNextMouseMoved(evt);
            }
        });
        lblNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNextMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNextMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblNextMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblNextMouseReleased(evt);
            }
        });

        btnGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/save.png"))); // NOI18N
        btnGravar.setText("NOVO");
        btnGravar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGravar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/titulo_cad_questoes.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(lblBack)
                        .addGap(4, 4, 4)
                        .addComponent(btnAltera, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(btnDeleta, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(lblNext)
                        .addGap(321, 321, 321)
                        .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jcbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(rbPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGravar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbPrimeiro)
                                    .addComponent(rbSegundo))))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblBack))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnAltera, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnDeleta, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblNext)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * FUNÇÕES DO BOTÃO CLOSE
     */
    private void lblCloseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseMoved
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/close_mouse.png")));
    }//GEN-LAST:event_lblCloseMouseMoved

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        telaCadPerguntas.dispose();
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

    private void rbSegundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSegundoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSegundoActionPerformed

    private void rbPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPrimeiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPrimeiroActionPerformed

    private void jcbMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMateriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbMateriasActionPerformed

    /**
     * FUNÇÕES DO BOTÇÃO DE VOLTAR DAS QUESTÕES
     */
    private void lblBackMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseMoved
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/left_mouse.png")));
    }//GEN-LAST:event_lblBackMouseMoved

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        PerguntasDAO objPergDAO = new PerguntasDAO();
        MateriasDAO objMatDAO = new MateriasDAO();
        lista = objPergDAO.carregaListaOrder();

        if (lista.size() > 0) {

            novo = true;
            btnGravar.setText("NOVO");
            jcbMaterias.setEnabled(true);
            rbPrimeiro.setEnabled(true);
            rbSegundo.setEnabled(true);

            txtPergunta.setVisible(true);
            txtResposta.setVisible(true);

            indexAltera--;
            if (indexAltera < lista.size() && indexAltera >= 0) {
                txtPergunta.setText(lista.get(indexAltera).getPergunta());
                txtResposta.setText(lista.get(indexAltera).getResposta());

                //Verifica se a PergunTa cadastrada é de Primeiro ou Segundo Bimestre
                if (lista.get(indexAltera).getPeriodo().equals(0)) {
                    rbPrimeiro.setSelected(true);
                } else {
                    rbSegundo.setSelected(true);
                }

                /**
                 * MODO DE CAPTURAR A MATÉRIA DA QUESTÃO SELECIONADA QUANDO
                 * CLICAR EM VOLTA
                 */
                String mat = objMatDAO.capturaMaterioaById(lista.get(indexAltera).getId_materia());
                int indiceMat = 0;
                for (int i = 0; i < jcbMaterias.getItemCount(); i++) {
                    if (jcbMaterias.getItemAt(i).equals(mat)) {
                        indiceMat = i;
                        break;
                    }
                }
                jcbMaterias.setSelectedIndex(indiceMat);

            } else {
                JOptionPane.showMessageDialog(null, "A lista chegou ao início.");
                indexAltera = 0;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não Existem Registros no Banco de Dados.", "Banco Vazio!", HEIGHT);
        }
    }//GEN-LAST:event_lblBackMouseClicked

    private void lblBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseExited
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/left_normal.png")));
    }//GEN-LAST:event_lblBackMouseExited

    private void lblBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMousePressed
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/left_clicado.png")));
    }//GEN-LAST:event_lblBackMousePressed

    private void lblBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseReleased
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/left_normal.png")));
    }//GEN-LAST:event_lblBackMouseReleased

    /**
     * FUNÇÕES DO BOTÃO DE ALTERAÇÃO DAS QUESTÕES
     */
    private void btnAlteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlteraActionPerformed
        if (txtPergunta.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Os Campos de Pergunta e Resposta estão Vazios!", "Mensagem de Erro", HEIGHT);
        } else if (jcbMaterias.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecione uma Matéria antes de Alterar.", "Mensagem de Erro", HEIGHT);
        } else {
            PerguntasDAO objAltera = new PerguntasDAO();

            int resposta = JOptionPane.showConfirmDialog(null, "Confirma a Alteração?", "Janela de Confirmação", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                Perguntas objPergunta = new Perguntas();

                //ADICIONA PERGUNTA E RESPOSTA AO OBJETO PERGUNTA
                objPergunta.setPergunta(txtPergunta.getText());
                objPergunta.setResposta(txtResposta.getText());
                objPergunta.setId(lista.get(indexAltera).getId());

                //ADICIONA O PERIODO AO OBJETO PERGUNTA
                if (rbPrimeiro.isSelected()) {
                    objPergunta.setPeriodo(0);
                } else {
                    objPergunta.setPeriodo(1);
                }
                //ADICIONA O ID DA MATERIA AO OBJETO PERGUNTA
                MateriasDAO objMatDAO = new MateriasDAO();
                String mat = (String) jcbMaterias.getSelectedItem();                
                int idMat = objMatDAO.capturaID(mat);                
                objPergunta.setId_materia(idMat);

                //EXECUTA O UPDATE
                objAltera.update(objPergunta);
            }
        }
    }//GEN-LAST:event_btnAlteraActionPerformed

    /**
     * FUNÇÕES DO BOTÃO DE DELETAR QUESTÕES
     */
    private void btnDeletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletaActionPerformed

        PerguntasDAO objDeleta = new PerguntasDAO();
        MateriasDAO objMatDAO = new MateriasDAO();

        if (txtPergunta.getText().equals(objDeleta.select(txtPergunta.getText()))) {
            if (txtPergunta.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Os Campos de Pergunta e Resposta estão Vazios!", "Mensagem de Erro", WIDTH);
            } else {
                int resposta = JOptionPane.showConfirmDialog(null, "Confirma a Exclusão?", "Janela de Confirmação", JOptionPane.YES_NO_OPTION);

                if (resposta == JOptionPane.YES_OPTION) {
                    objDeleta.delete(txtPergunta.getText());
                    lista = objDeleta.carregaListaOrder();

                    if (lista.size() > 0) {

                        if (indexAltera == lista.size()) {
                            indexAltera--;
                        }

                        txtPergunta.setText(lista.get(indexAltera).getPergunta());
                        txtResposta.setText(lista.get(indexAltera).getResposta());

                        //Verifica se a PergunTa cadastrada é de Primeiro ou Segundo Bimestre
                        if (lista.get(indexAltera).getPeriodo().equals(0)) {
                            rbPrimeiro.setSelected(true);
                        } else {
                            rbSegundo.setSelected(true);
                        }
                        /**
                         * MODO DE CAPTURAR A MATÉRIA DA QUESTÃO SELECIONADA
                         * QUANDO CLICAR EM AVANÇA
                         */
                        String mat = objMatDAO.capturaMaterioaById(lista.get(indexAltera).getId_materia());
                        int indiceMat = 0;
                        for (int i = 0; i < jcbMaterias.getItemCount(); i++) {
                            if (jcbMaterias.getItemAt(i).equals(mat)) {
                                indiceMat = i;
                                break;
                            }
                        }
                        jcbMaterias.setSelectedIndex(indiceMat);

//                        //Verifica a Matéria da Pergunta cadastrada.
//                        jcbMaterias.setSelectedIndex(lista.get(indexAltera).getId_materia() + 1); //A opção +1 é porque o indice zero começa com "Selecione..."
                    } else {
                        JOptionPane.showMessageDialog(null, "Não existem registros no Banco de Dados.", "Mensagem de Erro", WIDTH);
                        txtPergunta.setText("");
                        txtResposta.setText("");
                        jcbMaterias.setSelectedIndex(0);
                        rbPrimeiro.setSelected(false);
                        rbSegundo.setSelected(false);
                    }

                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Pergunta não encontrada no Banco de Dados!", "Mensagem de Erro", WIDTH);
            txtPergunta.setText("");
            txtResposta.setText("");
            txtPergunta.setVisible(false);
            txtResposta.setVisible(false);
        }
    }//GEN-LAST:event_btnDeletaActionPerformed

    /**
     * FUNÇÕES DO BOTÃO DE AVANÇÃR AS QUESTÕES
     */
    private void lblNextMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextMouseMoved
        lblNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/right_mouse.png")));
    }//GEN-LAST:event_lblNextMouseMoved

    private void lblNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextMouseClicked
        PerguntasDAO objPergDAO = new PerguntasDAO();
        MateriasDAO objMatDAO = new MateriasDAO();
        lista = objPergDAO.carregaListaOrder();

        if (lista.size() > 0) {

            novo = true;
            btnGravar.setText("NOVO");
            jcbMaterias.setEnabled(true);
            rbPrimeiro.setEnabled(true);
            rbSegundo.setEnabled(true);

            txtPergunta.setVisible(true);
            txtResposta.setVisible(true);

            indexAltera++;

            if (indexAltera < lista.size()) {
                txtPergunta.setText(lista.get(indexAltera).getPergunta());
                txtResposta.setText(lista.get(indexAltera).getResposta());

                //Verifica se a PergunTa cadastrada é de Primeiro ou Segundo Bimestre
                if (lista.get(indexAltera).getPeriodo().equals(0)) {
                    rbPrimeiro.setSelected(true);
                } else {
                    rbSegundo.setSelected(true);
                }

                /**
                 * MODO DE CAPTURAR A MATÉRIA DA QUESTÃO SELECIONADA QUANDO
                 * CLICAR EM AVANÇA
                 */
                String mat = objMatDAO.capturaMaterioaById(lista.get(indexAltera).getId_materia());
                int indiceMat = 0;
                for (int i = 0; i < jcbMaterias.getItemCount(); i++) {
                    if (jcbMaterias.getItemAt(i).equals(mat)) {
                        indiceMat = i;
                        break;
                    }
                }
                jcbMaterias.setSelectedIndex(indiceMat);

            } else {
                JOptionPane.showMessageDialog(null, "A lista chegou ao fim.");
                indexAltera = lista.size() - 1;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não Existem Registros no Banco de Dados.", "Banco Vazio!", HEIGHT);
        }
    }//GEN-LAST:event_lblNextMouseClicked

    private void lblNextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextMouseExited
        lblNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/right_normal.png")));
    }//GEN-LAST:event_lblNextMouseExited

    private void lblNextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextMousePressed
        lblNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/right_clicado.png")));
    }//GEN-LAST:event_lblNextMousePressed

    private void lblNextMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextMouseReleased
        lblNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/right_normal.png")));
    }//GEN-LAST:event_lblNextMouseReleased

    /**
     * FUNÇÕES DO BOTÃO DE GRAVAR NOVA QUESTÃO
     */
    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        txtPergunta.setVisible(true);
        txtResposta.setVisible(true);
        if (novo) {
            btnGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/save1.png")));
            rbPrimeiro.setEnabled(true);
            rbSegundo.setEnabled(true);
            jcbMaterias.setEnabled(true);

            btnGravar.setText("SALVAR");
            txtPergunta.setText("");
            txtResposta.setText("");
            txtPergunta.requestFocus();
            novo = false;

        } else if (txtPergunta.getText().equals("") || txtResposta.getText().equals("")) {  //Verifica se os Campos estão vazios antes de salvar
            JOptionPane.showMessageDialog(null, "Os campos Pergunta / Resposta devem ser preenchidos antes de salvar.");
        } else if (jcbMaterias.getSelectedIndex() == 0) {   //Verifica se a Matéria foi selecionada antes de salvar.
            JOptionPane.showMessageDialog(null, "Selecione a Matéria antes de Salvar.");
        } else if (!rbPrimeiro.isSelected() && !rbSegundo.isSelected()) { //Verifica se o Período foi selecionado antes de salvar.
            JOptionPane.showMessageDialog(null, "Selecione o Período: Primeiro ou Segundo Bimestre antes de Salvar.");
        } else {
            Perguntas objAsk = new Perguntas();
            MateriasDAO matDAO = new MateriasDAO();
            int periodo;

            // Atribui o Bimestre à materia selecionada
            if (rbPrimeiro.isSelected()) {
                periodo = 0;
            } else {
                periodo = 1;
            }

            // Adiciona Todos os dados da Tabela Materia no objeto objAsk
            objAsk.setPergunta(txtPergunta.getText());
            objAsk.setResposta(txtResposta.getText());
            objAsk.setPeriodo(periodo);

            // O método capturaID busca no BD a ID da matéria para cadastrar a Nova Pergunta posteriormente.
            objAsk.setId(matDAO.capturaID((String) jcbMaterias.getSelectedItem()));
            PerguntasDAO objCommit = new PerguntasDAO();

            int resposta = JOptionPane.showConfirmDialog(null, "Deseja adicionar essa pergunta ao BD?", "Janela de Confirmação", JOptionPane.YES_NO_OPTION);
            // Salva os Dados no Banco de Dados
            if (resposta == JOptionPane.YES_OPTION) {
                objCommit.insert(objAsk.getId(), objAsk.getPeriodo(), objAsk.getPergunta(), objAsk.getResposta());
                JOptionPane.showMessageDialog(null, "Nova pergunta adicionada ao BD.");
            }

            resposta = JOptionPane.showConfirmDialog(null, "Cadastrar NOVA Pergunta?", "Janela de Confirmação", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                txtPergunta.setText("");
                txtResposta.setText("");
                txtPergunta.requestFocus();
            } else {
                rbPrimeiro.setEnabled(false);
                rbSegundo.setEnabled(false);
                jcbMaterias.setEnabled(false);

                btnGravar.setText("NOVO");
                btnGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/save.png")));
                txtPergunta.setText("");
                txtResposta.setText("");
                txtPergunta.setVisible(false);
                txtResposta.setVisible(false);
                txtPergunta.requestFocus();
                novo = true;
            }
        }
    }//GEN-LAST:event_btnGravarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.ButtonGroup btgPeriodo;
    javax.swing.JButton btnAltera;
    javax.swing.JButton btnDeleta;
    javax.swing.JButton btnGravar;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel5;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JScrollPane jScrollPane2;
    javax.swing.JComboBox<String> jcbMaterias;
    javax.swing.JLabel lblBack;
    javax.swing.JLabel lblClose;
    javax.swing.JLabel lblNext;
    javax.swing.JLabel lblTitulo;
    javax.swing.JRadioButton rbPrimeiro;
    javax.swing.JRadioButton rbSegundo;
    javax.swing.JTextPane txtPergunta;
    javax.swing.JTextPane txtResposta;
    // End of variables declaration//GEN-END:variables
}
