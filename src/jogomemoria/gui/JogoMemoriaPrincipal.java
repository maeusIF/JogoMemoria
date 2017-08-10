/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomemoria.gui;

/**
 *
 * @author mathe
 */
public class JogoMemoriaPrincipal extends javax.swing.JPanel {

    /**
     * Creates new form JogoMemoriaPrincipal
     */
    public JogoMemoriaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sppPrincipal = new javax.swing.JSplitPane();
        pnlPrincipal = new javax.swing.JPanel();
        lblTempo = new javax.swing.JLabel();
        spnTempo = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        cnbNivel = new javax.swing.JComboBox<>();
        sppPrincipal2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        sppPrincipal.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        lblTempo.setText("Tempo Limite:");

        jLabel2.setText("Nivel:");

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        cnbNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Iniciante\t", "Intermediario", "Dificil", " " }));
        cnbNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnbNivelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTempo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spnTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cnbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnIniciar)
                .addGap(28, 28, 28))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTempo)
                    .addComponent(spnTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnIniciar)
                    .addComponent(cnbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sppPrincipal.setLeftComponent(pnlPrincipal);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jmPrincipal.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout sppPrincipal2Layout = new javax.swing.GroupLayout(sppPrincipal2);
        sppPrincipal2.setLayout(sppPrincipal2Layout);
        sppPrincipal2Layout.setHorizontalGroup(
            sppPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sppPrincipal2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sppPrincipal2Layout.setVerticalGroup(
            sppPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
        );

        sppPrincipal.setRightComponent(sppPrincipal2);

        add(sppPrincipal, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnIniciarActionPerformed

    private void cnbNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnbNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnbNivelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JComboBox<String> cnbNivel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblTempo;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JSpinner spnTempo;
    private javax.swing.JSplitPane sppPrincipal;
    private javax.swing.JPanel sppPrincipal2;
    // End of variables declaration//GEN-END:variables
}
