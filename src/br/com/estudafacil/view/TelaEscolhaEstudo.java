package br.com.estudafacil.view;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * TELA DO PAINEL DE ESCOLHA DE MATERIA E PERIODO QUE DESEJA ESTUDAR
 * @author Ricardo Vanni
 */
public class TelaEscolhaEstudo extends javax.swing.JDialog {

    
    TelaPrincipal telaPrinc;
    private final Image img;
    
    public TelaEscolhaEstudo(java.awt.Frame parent, boolean modal, TelaPrincipal telaPrincipal) {
        super(parent, modal);
        this.telaPrinc = telaPrincipal;
        initComponents();
        
        PanelEscolhaEstuda painel = new PanelEscolhaEstuda(telaPrinc, this);
        pnPrincipal.add(painel);
        
        img = new ImageIcon(getClass().getResource("/Botoes/logotipo.png")).getImage();
        this.setIconImage(img);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(397, 198));
        setMinimumSize(new java.awt.Dimension(397, 198));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(397, 198));

        pnPrincipal.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnPrincipal;
    // End of variables declaration//GEN-END:variables
}
