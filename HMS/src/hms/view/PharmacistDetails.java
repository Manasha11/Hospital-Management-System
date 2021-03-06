/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.view;

import hms.controller.PharmacistController;
import hms.model.Pharmacist;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Manasha
 */
public class PharmacistDetails extends javax.swing.JPanel {

    /**
     * Creates new form AddPharmacist
     */
    public PharmacistDetails() {
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
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        pharmacistIdText = new javax.swing.JTextField();
        lastNameText = new javax.swing.JTextField();
        firstNameText = new javax.swing.JTextField();
        nicText = new javax.swing.JTextField();
        dobText = new javax.swing.JTextField();
        genderText = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        contactNoText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        cityText = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        codeText = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        streetText = new javax.swing.JTextField();
        districtText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Cuprum", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(36, 208, 124));
        jLabel1.setText("Pharmacist Details");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cuprum", 0, 18), new java.awt.Color(57, 67, 92))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(57, 67, 92));

        jLabel16.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(57, 67, 92));
        jLabel16.setText("Gender");

        jLabel17.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(57, 67, 92));
        jLabel17.setText("Date of birth: ");

        jLabel18.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(57, 67, 92));
        jLabel18.setText("Last name: ");

        jLabel19.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(57, 67, 92));
        jLabel19.setText("NIC: ");

        jLabel20.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(57, 67, 92));
        jLabel20.setText("First name: ");

        jLabel21.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(57, 67, 92));
        jLabel21.setText("Pharmacist ID: ");

        pharmacistIdText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        pharmacistIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmacistIdTextActionPerformed(evt);
            }
        });

        lastNameText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N

        firstNameText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N

        nicText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N

        dobText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        dobText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobTextActionPerformed(evt);
            }
        });

        genderText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        genderText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel19)
                    .addComponent(jLabel17))
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pharmacistIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nicText, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(firstNameText)
                    .addComponent(dobText))
                .addGap(99, 99, 99)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderText, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(pharmacistIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(nicText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(genderText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(dobText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cuprum", 0, 18), new java.awt.Color(57, 67, 92))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(57, 67, 92));

        jLabel8.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(57, 67, 92));
        jLabel8.setText("Email:");

        jLabel9.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(57, 67, 92));
        jLabel9.setText("Address:");

        jLabel11.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(57, 67, 92));
        jLabel11.setText("Contact number:");

        contactNoText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        contactNoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNoTextActionPerformed(evt);
            }
        });

        emailText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextActionPerformed(evt);
            }
        });

        cityText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        cityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTextActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(57, 67, 92));
        jLabel15.setText("City:");

        jLabel24.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(57, 67, 92));
        jLabel24.setText("Postal Code:");

        codeText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        codeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeTextActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(57, 67, 92));
        jLabel13.setText("Street:");

        streetText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        streetText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetTextActionPerformed(evt);
            }
        });

        districtText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        districtText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                districtTextActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(57, 67, 92));
        jLabel10.setText("Discrict:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contactNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(50, 50, 50)
                        .addComponent(cityText))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codeText, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(56, 56, 56)
                        .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel10))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(streetText)
                            .addComponent(districtText))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(codeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(cityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(streetText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(districtText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pharmacist-slider-trans_2.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(jLabel2))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void contactNoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactNoTextActionPerformed

    private void emailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextActionPerformed

    private void cityTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTextActionPerformed

    private void codeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeTextActionPerformed

    private void streetTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streetTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_streetTextActionPerformed

    private void districtTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_districtTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_districtTextActionPerformed

    private void dobTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobTextActionPerformed

    private void genderTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderTextActionPerformed

    private void pharmacistIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmacistIdTextActionPerformed
        String pharmacistId = pharmacistIdText.getText();
        Pharmacist pharmacist;
        
        try {
            pharmacist = PharmacistController.searchPharmacist(pharmacistId);
            if (pharmacist != null) {
                firstNameText.setText(pharmacist.getFirstName());
                lastNameText.setText(pharmacist.getLastName());
                nicText.setText(pharmacist.getNic());
                dobText.setText(pharmacist.getDob());
                genderText.setText(pharmacist.getGender());
                contactNoText.setText(pharmacist.getContatctNo());
                codeText.setText(pharmacist.getPostalCode());
                streetText.setText(pharmacist.getStreet());
                cityText.setText(pharmacist.getCity());
                districtText.setText(pharmacist.getDistrict());
                emailText.setText(pharmacist.getEmail());
            } else {
                JOptionPane.showMessageDialog(this, "No pharmacist found!");
                firstNameText.setText("");
                lastNameText.setText("");
                dobText.setText("");
                nicText.setText("");
                genderText.setText("");
                contactNoText.setText("");
                emailText.setText("");
                codeText.setText("");
                streetText.setText("");
                cityText.setText("");
                districtText.setText("");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PharmacistDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }//GEN-LAST:event_pharmacistIdTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cityText;
    private javax.swing.JTextField codeText;
    private javax.swing.JTextField contactNoText;
    private javax.swing.JTextField districtText;
    private javax.swing.JTextField dobText;
    private javax.swing.JTextField emailText;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JTextField genderText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JTextField nicText;
    private javax.swing.JTextField pharmacistIdText;
    private javax.swing.JTextField streetText;
    // End of variables declaration//GEN-END:variables

    
}
