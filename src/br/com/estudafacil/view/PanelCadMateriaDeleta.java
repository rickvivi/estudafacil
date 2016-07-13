package br.com.estudafacil.view;

import br.com.estudafacil.controller.MateriasDAO;
import br.com.estudafacil.model.Materias;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * PAINEL PARA DELETAR MATÉRIAS DA TELA 'CADASTRO DE MATERIAS'
 * @author Ricardo Vanni
 */
public class PanelCadMateriaDeleta extends javax.swing.JPanel {

    private final Image imagem;
    ArrayList<Materias> lista = new ArrayList<>();
    
    public PanelCadMateriaDeleta() {
        initComponents();

        imagem = new ImageIcon(getClass().getResource("/Botoes/boneco_apagando.JPG")).getImage();

        /**
         * CARREGA LISTA DE MATÉRIAS CADASTRADAS
         */
        MateriasDAO dao = new MateriasDAO();

        lista.clear();
        jcbMaterias.removeAllItems();
        lista = dao.carregaMaterias();
        jcbMaterias.addItem("Selecione...");

        for (Materias x : lista) {
            jcbMaterias.addItem(x.getMateria());
        }

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
        btnDeletar = new javax.swing.JButton();
        jcbMaterias = new javax.swing.JComboBox<>();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setMaximumSize(new java.awt.Dimension(456, 185));
        setMinimumSize(new java.awt.Dimension(456, 185));
        setPreferredSize(new java.awt.Dimension(456, 185));

        lblMateria.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        lblMateria.setText("Matéria:");

        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/lixo.png"))); // NOI18N
        btnDeletar.setText("EXCLUIR");
        btnDeletar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeletar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbMaterias, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed

        if (jcbMaterias.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecione uma Matéria antes de clicar em 'Deletar'.");
        } else {
            MateriasDAO dao = new MateriasDAO();
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja Excluir a Matéria: '" + jcbMaterias.getSelectedItem() + "'?", "Janela de Confirmação", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                dao.deletaMateria((String) jcbMaterias.getSelectedItem());
                lista.clear();
                jcbMaterias.removeAllItems();

                jcbMaterias.addItem("Selecione...");
                lista = dao.carregaMaterias();

                for (Materias x : lista) {
                    jcbMaterias.addItem(x.getMateria());
                }
            }

        }


    }//GEN-LAST:event_btnDeletarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    public javax.swing.JComboBox<String> jcbMaterias;
    private javax.swing.JLabel lblMateria;
    // End of variables declaration//GEN-END:variables
}
