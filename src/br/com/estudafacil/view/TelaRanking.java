package br.com.estudafacil.view;


public class TelaRanking extends javax.swing.JDialog {

    TelaPrincipal telaPrincipal;
    
        
    public TelaRanking(java.awt.Frame parent, boolean modal, TelaPrincipal tp) {
        super(parent, modal);
        this.telaPrincipal = tp;
        
        initComponents();
        /**
         * OBS: A CRIAÇÃO DO OBJETO ABAIXO TEVE QUE SER COLOCADA APÓS A INICIALIZAÇÃO
         * DO METODO initComponents() POIS QUANDO COLOCADO ANTES EXIBE ERRO.
         */
        PanelRanking panel = new PanelRanking(telaPrincipal, this);
        this.pnPrincipal.add(panel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 590));
        setMinimumSize(new java.awt.Dimension(900, 590));
        setUndecorated(true);

        pnPrincipal.setMaximumSize(new java.awt.Dimension(900, 590));
        pnPrincipal.setMinimumSize(new java.awt.Dimension(900, 590));
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
