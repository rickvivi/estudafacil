package br.com.estudafacil.view;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * TELA DE CADASTRO DE PERGUNTAS
 * @author Ricardo Vanni
 */
public class TelaCadPerguntas extends javax.swing.JDialog {

    private final Image img;
    
    public TelaCadPerguntas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        PanelCadPerguntas painel = new PanelCadPerguntas(this);
        pnPrincipal.add(painel);
        
        img = new ImageIcon(getClass().getResource("/Botoes/logotipo.png")).getImage();
        this.setIconImage(img);
    }
    
    public void fechaDialogo(){
        this.dispose();
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(949, 560));
        setMinimumSize(new java.awt.Dimension(949, 560));
        setUndecorated(true);

        pnPrincipal.setMaximumSize(new java.awt.Dimension(949, 560));
        pnPrincipal.setMinimumSize(new java.awt.Dimension(949, 560));
        pnPrincipal.setOpaque(false);
        pnPrincipal.setPreferredSize(new java.awt.Dimension(949, 560));
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
