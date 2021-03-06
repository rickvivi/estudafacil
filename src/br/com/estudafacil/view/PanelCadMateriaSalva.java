/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estudafacil.view;

import br.com.estudafacil.controller.MateriasDAO;
import br.com.estudafacil.model.Materias;
import java.awt.Graphics;
import java.awt.Image;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Rick-Note
 */
public class PanelCadMateriaSalva extends javax.swing.JPanel {

    private final Image imagem;

    private JComboBox<String> jcbLista = new JComboBox<>();

    /**
     * PAINEL DE CADASTRO DE MATÉRIAS, UTILIZADO NA OPÇÃO 'SALVAR'
     */
    public PanelCadMateriaSalva() {
        initComponents();

        imagem = new ImageIcon(getClass().getResource("/Botoes/boneco-mostrando-o-livro1.jpg")).getImage();
        
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagem, 0, 0, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMateria = new javax.swing.JLabel();
        txtMateria = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setMaximumSize(new java.awt.Dimension(456, 185));
        setMinimumSize(new java.awt.Dimension(456, 185));
        setPreferredSize(new java.awt.Dimension(456, 185));

        lblMateria.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        lblMateria.setText("Matéria:");

        txtMateria.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/save1.png"))); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvar)
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        //Verifica se os campos de texto estão vazios antes de salvar.
        if (txtMateria.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo ''Mátéria'' antes de Salvar.");
            txtMateria.requestFocus();
        } else {

            ArrayList<Materias> lista = new ArrayList<>();
            MateriasDAO dao = new MateriasDAO();
            lista = dao.carregaMaterias();
            boolean existe = false;

            /**
             * Método para ignorar acentos na comparação das Strings
             */
            Collator collator = Collator.getInstance(new Locale("pt", "BR"));
            collator.setStrength(Collator.PRIMARY);

            for (Materias x : lista) {
                if (x.getMateria().equalsIgnoreCase(txtMateria.getText()) || collator.compare(x.getMateria(), txtMateria.getText()) == 0) {
                    existe = true;
                }
            }

            if (existe) {
                JOptionPane.showMessageDialog(null, "A Matéria digitada já está cadastrada no Banco de Dados.");
                txtMateria.setText("");
                txtMateria.requestFocus();
            } else {

                int resposta = JOptionPane.showConfirmDialog(null, "Deseja Salvar a Matéria: '" + txtMateria.getText() + "'?", "Janela de Confirmação", JOptionPane.YES_NO_OPTION);

                if (resposta == JOptionPane.YES_OPTION) {
                    dao.salvaMateria(txtMateria.getText());

                }
                txtMateria.setText("");
                txtMateria.requestFocus();
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    public JComboBox<String> getJcbLista() {
        return jcbLista;
    }

    public void setJcbLista(JComboBox<String> jcbLista) {
        this.jcbLista = jcbLista;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblMateria;
    private javax.swing.JTextField txtMateria;
    // End of variables declaration//GEN-END:variables
}
