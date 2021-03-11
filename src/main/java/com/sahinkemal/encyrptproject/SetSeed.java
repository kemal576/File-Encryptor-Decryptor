package com.sahinkemal.encyrptproject;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SetSeed extends javax.swing.JFrame {
    public SetSeed() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        initComponents();
        ImageIcon gearIcon = new ImageIcon("icon/gear2.png");
        setIconImage(gearIcon.getImage());
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        setLocationRelativeTo(null);
        lblSeed.setText(Form.s1);
        txtSeedInput.setEnabled(false);
        btnOK.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        currentSeed = new javax.swing.JLabel();
        lblSeed = new javax.swing.JLabel();
        btnSetSeed = new javax.swing.JButton();
        txtSeedInput = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();

        setTitle("Gelişmiş Ayarlar");

        currentSeed.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        currentSeed.setText("Current Seed Value:");

        lblSeed.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblSeed.setText("jLabel2");

        btnSetSeed.setText("CHANGE SEED VALUE");
        btnSetSeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetSeedActionPerformed(evt);
            }
        });

        btnOK.setText("APPROVE");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(currentSeed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSeed, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtSeedInput, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSetSeed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentSeed, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSeed, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSetSeed, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSeedInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSetSeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetSeedActionPerformed
        btnSetSeed.setEnabled(false);
        txtSeedInput.setEnabled(true);
        btnOK.setEnabled(true);
        JOptionPane.showMessageDialog(null,
        "Don't forget to enter a 16 character long value!",
        "WARNING",
        JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnSetSeedActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        if (txtSeedInput.getText().length() == 16) {
            Form.s1 = txtSeedInput.getText();
            lblSeed.setText(Form.s1);
            txtSeedInput.setEnabled(false);
            btnOK.setEnabled(false);
            btnSetSeed.setEnabled(true);
        }
        else{
            JOptionPane.showMessageDialog(null,
            "Incorrect seed value! Please enter a 16 character seed value!",
            "ERROR",
            JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnOKActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnSetSeed;
    private javax.swing.JLabel currentSeed;
    private javax.swing.JLabel lblSeed;
    private javax.swing.JTextField txtSeedInput;
    // End of variables declaration//GEN-END:variables
}
