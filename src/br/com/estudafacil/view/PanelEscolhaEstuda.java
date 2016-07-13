package br.com.estudafacil.view;

import br.com.estudafacil.controller.MateriasDAO;
import br.com.estudafacil.controller.PerguntasDAO;
import br.com.estudafacil.model.Materias;
import br.com.estudafacil.model.Perguntas;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * PAINEL DA TELA DE ESCOLHA DE MATERIA E PERIODO QUE DESEJA ESTUDAR
 * @author Ricardo Vanni
 */
public class PanelEscolhaEstuda extends javax.swing.JPanel {

    TelaPrincipal telaPrinc;
    TelaEscolhaEstudo telaEscolhaEstudo;

    private final Image fundoEscolhaEstuda;

    ArrayList<Materias> lista = new ArrayList<>();
    MateriasDAO dao = new MateriasDAO();

    public PanelEscolhaEstuda(TelaPrincipal telaPrincipal, TelaEscolhaEstudo telaEscolha) {

        this.telaEscolhaEstudo = telaEscolha;
        this.telaPrinc = telaPrincipal;

        initComponents();

        //Grupo de botões adicionando os botos de periodo
        rbPeriodo.add(rbPrimeiro);
        rbPeriodo.add(rbSegundo);
        rbPeriodo.add(rbTotal);

        rbPrimeiro.setActionCommand("primeiro");
        rbSegundo.setActionCommand("segundo");
        rbTotal.setActionCommand("total");

        fundoEscolhaEstuda = new ImageIcon(getClass().getResource("/Botoes/fundo_escolha_estuda.jpg")).getImage();
       
        lista = dao.carregaMaterias();

        for (Materias x : lista) {
            jcbListaMaterias.addItem(x.getMateria());
        }

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(fundoEscolhaEstuda, 0, 0, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbPeriodo = new javax.swing.ButtonGroup();
        lblMateria = new javax.swing.JLabel();
        jcbListaMaterias = new javax.swing.JComboBox<>();
        lblPeriodo = new javax.swing.JLabel();
        rbPrimeiro = new javax.swing.JRadioButton();
        rbSegundo = new javax.swing.JRadioButton();
        rbTotal = new javax.swing.JRadioButton();
        lblClose = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 255));
        setMaximumSize(new java.awt.Dimension(397, 198));
        setMinimumSize(new java.awt.Dimension(397, 198));
        setPreferredSize(new java.awt.Dimension(397, 198));

        lblMateria.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblMateria.setForeground(new java.awt.Color(255, 255, 255));
        lblMateria.setText("Escolha a Matéria:");

        jcbListaMaterias.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbListaMaterias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione..." }));
        jcbListaMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListaMateriasActionPerformed(evt);
            }
        });

        lblPeriodo.setBackground(new java.awt.Color(255, 255, 255));
        lblPeriodo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblPeriodo.setForeground(new java.awt.Color(255, 255, 255));
        lblPeriodo.setText("Escolha o Período que deseja estudar:");

        rbPrimeiro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbPrimeiro.setForeground(new java.awt.Color(255, 255, 255));
        rbPrimeiro.setText("1º Bimestre");

        rbSegundo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbSegundo.setForeground(new java.awt.Color(255, 255, 255));
        rbSegundo.setText("2º Bimestre");

        rbTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbTotal.setForeground(new java.awt.Color(255, 255, 255));
        rbTotal.setText("Semestral");

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

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbListaMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rbTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(lblPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblClose)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbListaMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbPrimeiro)
                    .addComponent(rbSegundo)
                    .addComponent(rbTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOK, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jcbListaMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaMateriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbListaMateriasActionPerformed

    /**
     * FUNÇÕES DO BOTÃO CLOSE
     */
    private void lblCloseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseMoved
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/close_mouse.png")));
    }//GEN-LAST:event_lblCloseMouseMoved

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked

        telaEscolhaEstudo.dispose();

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
     * FUNÇÕES DO BOTÃO OK
     */
    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed

        if (jcbListaMaterias.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Escolha a Matéria que deseja estudar.");
        } else if (!rbPrimeiro.isSelected() && !rbSegundo.isSelected() && !rbTotal.isSelected()) {
            JOptionPane.showMessageDialog(null, "Escolha o Perído que deseja estudar!");
        } else {
            /**
             * Lista de objetos para capturar materia e periodo
             */
            ArrayList<Perguntas> lista = new ArrayList<Perguntas>();
            PerguntasDAO objAskDAO = new PerguntasDAO();
            MateriasDAO matDAO = new MateriasDAO();
            Perguntas objAsk = new Perguntas();

            // VARIAVEIS PARA RECEBER MATERIA PERIODO
            String mat = (String) jcbListaMaterias.getSelectedItem();
            String prd = rbPeriodo.getSelection().getActionCommand();
            int periodo = 0;

            // VERFICA QUAL PERIODO ESCOLHIDO
            if (prd.equals("primeiro")) {
                periodo = 0;
            } else if (prd.equals("segundo")) {
                periodo = 1;
            } else {
                periodo = 3;
            }

            //ADICIONA A MATERIA E O PERIODO AO OBJETO 
            objAsk.setId_materia(matDAO.capturaID(mat));
            objAsk.setPeriodo(periodo);

            // VERIFICA SE O PERIODO É PRIMEIRO, SEGUNDO BIMESTRE OU SEMESTRAL E CARREGA A LISTA
            if (periodo == 3) {
                lista = objAskDAO.carregaListaEstudoSemestre(objAsk.getId_materia());
            } else {
                lista = objAskDAO.carregaListaEstudoBimestre(objAsk.getId_materia(), objAsk.getPeriodo());
            }

            if (lista.size() == 0) {
                JOptionPane.showMessageDialog(null, "A Matéria selecionada não possui questões cadastradas no período selecionado. \n"
                        + "Por favor escolha outra alternativa, ou cadastre novas questões no período desejado.", "ATENÇÃO!", HEIGHT);
            } else {
                telaEscolhaEstudo.dispose();
                this.telaPrinc.dispose();

                TelaEstudo telaEstudo = new TelaEstudo(telaPrinc, mat, periodo, lista);
                telaEstudo.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnOKActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JComboBox<String> jcbListaMaterias;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMateria;
    private javax.swing.JLabel lblPeriodo;
    private javax.swing.ButtonGroup rbPeriodo;
    private javax.swing.JRadioButton rbPrimeiro;
    private javax.swing.JRadioButton rbSegundo;
    private javax.swing.JRadioButton rbTotal;
    // End of variables declaration//GEN-END:variables
}
