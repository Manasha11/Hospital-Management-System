/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.view;

/**
 *
 * @author Manasha
 */
public class Discharge extends javax.swing.JPanel {

    /**
     * Creates new form Discharge
     */
    public Discharge() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        patientIdText1 = new javax.swing.JTextField();
        patientIdText2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        patientIdText3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        patientIdText4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        patientIdText5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        patientIdText6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        patientIdText7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        patientIdText8 = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Cuprum", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(36, 208, 124));
        jLabel1.setText("Discharge");

        jLabel3.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(57, 67, 92));
        jLabel3.setText("Admission ID: ");

        patientIdText1.setEditable(false);
        patientIdText1.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        patientIdText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientIdText1ActionPerformed(evt);
            }
        });

        patientIdText2.setEditable(false);
        patientIdText2.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        patientIdText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientIdText2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(57, 67, 92));
        jLabel4.setText("Payment ID: ");

        patientIdText3.setEditable(false);
        patientIdText3.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        patientIdText3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientIdText3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(57, 67, 92));
        jLabel5.setText("Patient ID: ");

        jLabel6.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(57, 67, 92));
        jLabel6.setText("Date: ");

        patientIdText4.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        patientIdText4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientIdText4ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(57, 67, 92));
        jLabel7.setText("Charges: ");

        patientIdText5.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        patientIdText5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientIdText5ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(57, 67, 92));
        jLabel8.setText("Charges: ");

        patientIdText6.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        patientIdText6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientIdText6ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(57, 67, 92));
        jLabel9.setText("Charges: ");

        patientIdText7.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        patientIdText7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientIdText7ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(57, 67, 92));
        jLabel10.setText("Full amount: ");

        patientIdText8.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        patientIdText8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientIdText8ActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(36, 208, 124));
        updateButton.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Print Bill");
        updateButton.setBorder(null);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientIdText8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(patientIdText4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(patientIdText3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(patientIdText1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(105, 105, 105)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(patientIdText2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientIdText7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(patientIdText6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(patientIdText5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(399, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(patientIdText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(patientIdText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(patientIdText3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(patientIdText4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(patientIdText6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientIdText5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientIdText7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientIdText8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void patientIdText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientIdText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientIdText1ActionPerformed

    private void patientIdText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientIdText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientIdText2ActionPerformed

    private void patientIdText3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientIdText3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientIdText3ActionPerformed

    private void patientIdText4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientIdText4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientIdText4ActionPerformed

    private void patientIdText5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientIdText5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientIdText5ActionPerformed

    private void patientIdText6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientIdText6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientIdText6ActionPerformed

    private void patientIdText7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientIdText7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientIdText7ActionPerformed

    private void patientIdText8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientIdText8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientIdText8ActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

    }//GEN-LAST:event_updateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField patientIdText1;
    private javax.swing.JTextField patientIdText2;
    private javax.swing.JTextField patientIdText3;
    private javax.swing.JTextField patientIdText4;
    private javax.swing.JTextField patientIdText5;
    private javax.swing.JTextField patientIdText6;
    private javax.swing.JTextField patientIdText7;
    private javax.swing.JTextField patientIdText8;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
