package br.com.estudafacil.view;

/**
 *  TELA 'SOBRE'
 * @author DES4
 */
public class TelaSobre extends javax.swing.JDialog {

    public TelaSobre(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        PanelSobre panel = new PanelSobre(this);
        this.pnPrincipal.add(panel);
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(320, 240));
        setMinimumSize(new java.awt.Dimension(320, 240));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(320, 240));

        pnPrincipal.setMaximumSize(new java.awt.Dimension(320, 240));
        pnPrincipal.setMinimumSize(new java.awt.Dimension(320, 240));
        pnPrincipal.setPreferredSize(new java.awt.Dimension(320, 240));
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
