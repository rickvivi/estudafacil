package br.com.estudafacil.view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * TELA PRINCIPAL DO SISTEMA
 *
 * @author Ricardo Vanni
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private final Image img;

    public TelaPrincipal() {
        initComponents();
        this.setResizable(false); //Impossibilita de alterar o tamanho do Frame
        this.setTitle("EstudaFacil - Academic Training 1.0");

        img = new ImageIcon(getClass().getResource("/Botoes/logotipo.png")).getImage();
        this.setIconImage(img);

        PanelPrincipal painel = new PanelPrincipal(this);
        pnPrincipal.add(painel);
        

    }

    public void recebePainel(JPanel pn) {
        pnPrincipal.removeAll();
        pnPrincipal.add(pn);
        pnPrincipal.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPrincipal = new javax.swing.JPanel();
        mnMenu = new javax.swing.JMenuBar();
        imnSair = new javax.swing.JMenu();
        imnAjuda = new javax.swing.JMenu();
        imnSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(925, 560));
        setMinimumSize(new java.awt.Dimension(925, 560));
        setSize(new java.awt.Dimension(925, 560));

        pnPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnPrincipal.setMaximumSize(new java.awt.Dimension(925, 560));
        pnPrincipal.setMinimumSize(new java.awt.Dimension(925, 560));
        pnPrincipal.setPreferredSize(new java.awt.Dimension(925, 560));
        pnPrincipal.setRequestFocusEnabled(false);
        pnPrincipal.setLayout(new java.awt.BorderLayout());

        imnSair.setText("Sair");
        imnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imnSairMouseClicked(evt);
            }
        });
        mnMenu.add(imnSair);

        imnAjuda.setText("Informações");

        imnSobre.setText("Sobre");
        imnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnSobreActionPerformed(evt);
            }
        });
        imnAjuda.add(imnSobre);

        mnMenu.add(imnAjuda);

        setJMenuBar(mnMenu);

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

    private void imnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imnSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_imnSairMouseClicked

    private void imnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnSobreActionPerformed
        TelaSobre tela = new TelaSobre(this, true);
        tela.setVisible(true);
    }//GEN-LAST:event_imnSobreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu imnAjuda;
    private javax.swing.JMenu imnSair;
    private javax.swing.JMenuItem imnSobre;
    private javax.swing.JMenuBar mnMenu;
    private javax.swing.JPanel pnPrincipal;
    // End of variables declaration//GEN-END:variables

}
