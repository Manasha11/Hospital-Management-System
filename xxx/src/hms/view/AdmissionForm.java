/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.view;

import hms.controller.AdmissionController;
import hms.controller.DoctorController;
import hms.controller.WardController;
import hms.model.Admission;
import hms.model.Doctor;
import hms.model.Ward;
import hms.other.IDGenerator;
import static hms.view.Home.homePanel;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Manasha
 */
public class AdmissionForm extends javax.swing.JPanel {

    /**
     * Creates new form Admission
     */
    public AdmissionForm() {
        initComponents();
        try {
            fillAdmissionId();
            fillLeadingCombo();
            fillWardIdCombo();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AdmissionForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        setDate();
        
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        patientIdText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        nicText = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        admissionIdText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dateText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        recommendedByText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        confirmedByText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        leadingIdText = new javax.swing.JTextField();
        leadingCombo = new javax.swing.JComboBox<>();
        wardIdCombo = new javax.swing.JComboBox<>();
        admitButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Cuprum", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(36, 208, 124));
        jLabel1.setText("Admission");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cuprum", 1, 18), new java.awt.Color(57, 67, 92))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(57, 67, 92));

        jLabel2.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(57, 67, 92));
        jLabel2.setText("Patient ID: ");

        patientIdText.setEditable(false);
        patientIdText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        patientIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientIdTextActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(57, 67, 92));
        jLabel10.setText("Name: ");

        nameText.setEditable(false);
        nameText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(57, 67, 92));
        jLabel19.setText("NIC: ");

        nicText.setEditable(false);
        nicText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel2)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nicText, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(patientIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nicText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addContainerGap(299, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Admission Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cuprum", 1, 18), new java.awt.Color(57, 67, 92))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(57, 67, 92));
        jLabel3.setText("Admission ID: ");

        admissionIdText.setEditable(false);
        admissionIdText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        admissionIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admissionIdTextActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(57, 67, 92));
        jLabel4.setText("Ward ID: ");

        jLabel5.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(57, 67, 92));
        jLabel5.setText("Date: ");

        dateText.setEditable(false);
        dateText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        dateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTextActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(57, 67, 92));
        jLabel6.setText("Recommended by: ");

        recommendedByText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        recommendedByText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recommendedByTextActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(57, 67, 92));
        jLabel7.setText("Confirmed by: ");

        confirmedByText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        confirmedByText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmedByTextActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(57, 67, 92));
        jLabel8.setText("Leading consultant: ");

        jLabel9.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(57, 67, 92));
        jLabel9.setText("Leading consultant ID: ");

        leadingIdText.setEditable(false);
        leadingIdText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        leadingIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leadingIdTextActionPerformed(evt);
            }
        });

        leadingCombo.setEditable(true);
        leadingCombo.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        leadingCombo.setBorder(null);
        leadingCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                leadingComboItemStateChanged(evt);
            }
        });
        leadingCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leadingComboActionPerformed(evt);
            }
        });

        wardIdCombo.setEditable(true);
        wardIdCombo.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        wardIdCombo.setBorder(null);
        wardIdCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                wardIdComboItemStateChanged(evt);
            }
        });
        wardIdCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wardIdComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(admissionIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(174, 174, 174))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(recommendedByText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(wardIdCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dateText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)))
                                .addContainerGap())))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(leadingIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmedByText)
                            .addComponent(leadingCombo, 0, 230, Short.MAX_VALUE))
                        .addGap(97, 97, 97))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(admissionIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(wardIdCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(recommendedByText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(confirmedByText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(leadingCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(leadingIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        admitButton.setBackground(new java.awt.Color(36, 208, 124));
        admitButton.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        admitButton.setForeground(new java.awt.Color(255, 255, 255));
        admitButton.setText("Admit");
        admitButton.setBorder(null);
        admitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(admitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(admitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void admitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admitButtonActionPerformed
        String admissionId = admissionIdText.getText();
        String patientId = patientIdText.getText();
        String wardId = (String) wardIdCombo.getSelectedItem();
        String date = dateText.getText();
        String recommemdedBy = recommendedByText.getText();
        String confirmedBy = confirmedByText.getText();
        String leading = (String) leadingCombo.getSelectedItem();
        String leadingId = leadingIdText.getText();

        Admission admission = new Admission(admissionId, patientId, wardId, date, recommemdedBy, confirmedBy, leading, leadingId);
        try {
            boolean addAdmission = AdmissionController.addAdmission(admission);
            if (addAdmission) {
                JOptionPane.showMessageDialog(this, "Successfull");
                patientIdText.setText("");
//                wardIdText.setText("");
                recommendedByText.setText("");
                confirmedByText.setText("");
                //leadingCombo.setText("");
                leadingIdText.setText("");

                PatientDetails patientDetails = new PatientDetails();
                patientDetails.setVisible(true);
                homePanel.setLayout(new BorderLayout());
                homePanel.removeAll();
                homePanel.add(patientDetails);
                homePanel.validate();
                homePanel.repaint();
            } else {
                JOptionPane.showMessageDialog(this, "Failed");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdmissionForm.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_admitButtonActionPerformed

    private void patientIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientIdTextActionPerformed

    private void admissionIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admissionIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admissionIdTextActionPerformed

    private void dateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTextActionPerformed

    private void recommendedByTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recommendedByTextActionPerformed
        confirmedByText.requestFocus();
    }//GEN-LAST:event_recommendedByTextActionPerformed

    private void confirmedByTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmedByTextActionPerformed
        leadingCombo.requestFocus();
    }//GEN-LAST:event_confirmedByTextActionPerformed

    private void leadingIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leadingIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leadingIdTextActionPerformed

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed

    private void leadingComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leadingComboActionPerformed
        
    }//GEN-LAST:event_leadingComboActionPerformed

    private void leadingComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_leadingComboItemStateChanged
        String name = (String) leadingCombo.getSelectedItem();
        String[] names = name.split(" ");
//        System.out.println(names[0]);
//        System.out.println(names[1]);
        try {
            String doctorId = DoctorController.getDoctorId(names[0], names[1]);
            leadingIdText.setText(doctorId);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdmissionForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_leadingComboItemStateChanged

    private void wardIdComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_wardIdComboItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_wardIdComboItemStateChanged

    private void wardIdComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wardIdComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wardIdComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField admissionIdText;
    private javax.swing.JButton admitButton;
    private javax.swing.JTextField confirmedByText;
    private javax.swing.JTextField dateText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> leadingCombo;
    private javax.swing.JTextField leadingIdText;
    public static javax.swing.JTextField nameText;
    public static javax.swing.JTextField nicText;
    public static javax.swing.JTextField patientIdText;
    private javax.swing.JTextField recommendedByText;
    private javax.swing.JComboBox<String> wardIdCombo;
    // End of variables declaration//GEN-END:variables

    private void fillAdmissionId() throws SQLException, ClassNotFoundException {
        String newId = IDGenerator.getNewId("Admission", "AdmissionID", "A");
        admissionIdText.setText(newId);
    }

    private void setDate() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formatedDate = dateFormat.format(date);
        dateText.setText(formatedDate);
    }

    private void fillLeadingCombo() throws ClassNotFoundException, SQLException {
        ArrayList<Doctor> allDoctors = DoctorController.getAllDoctors();
        for (Doctor doctor : allDoctors) {
            leadingCombo.addItem(doctor.getFirstName()+ " " + doctor.getLastName());
        }
    }

    private void fillWardIdCombo() throws SQLException, ClassNotFoundException {
        ArrayList<Ward> allWards = WardController.getAllWards();
        wardIdCombo.addItem("");
        for (Ward ward : allWards) {
            wardIdCombo.addItem(ward.getWardId());
        }
    }
}
