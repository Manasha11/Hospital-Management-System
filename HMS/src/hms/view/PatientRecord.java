/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.view;

import hms.controller.AdmissionController;
import hms.controller.PatientController;
import hms.model.Admission;
import hms.model.Patient;
import static hms.view.Home.homePanel;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Manasha
 */
public class PatientRecord extends javax.swing.JPanel {

    /**
     * Creates new form PatientRecord
     */
    public PatientRecord() {
        initComponents();
        try {
            fillNameCombo();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PatientRecord.class.getName()).log(Level.SEVERE, null, ex);
        }

        AutoCompleteDecorator.decorate(nameCombo);
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
        jLabel20 = new javax.swing.JLabel();
        nameCombo = new javax.swing.JComboBox<>();
        updateButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        admissionDetailTable = new org.jdesktop.swingx.JXTable();
        jLabel9 = new javax.swing.JLabel();
        patientIdText = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Cuprum", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(36, 208, 124));
        jLabel1.setText("Patient Record");

        jLabel20.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(57, 67, 92));
        jLabel20.setText("Name: ");

        nameCombo.setEditable(true);
        nameCombo.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        nameCombo.setBorder(null);
        nameCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nameComboItemStateChanged(evt);
            }
        });
        nameCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameComboActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(36, 208, 124));
        updateButton.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("View Details");
        updateButton.setBorder(null);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        admissionDetailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Admission ID", "Ward ID", "Date admitted", "Date discharged", "Leading consultant"
            }
        ));
        admissionDetailTable.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        admissionDetailTable.setGridColor(new java.awt.Color(255, 255, 255));
        admissionDetailTable.setRowHeight(40);
        admissionDetailTable.setSelectionBackground(new java.awt.Color(36, 208, 124));
        admissionDetailTable.setVisibleRowCount(8);
        jScrollPane1.setViewportView(admissionDetailTable);

        jLabel9.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(57, 67, 92));
        jLabel9.setText("Patient ID: ");

        patientIdText.setEditable(false);
        patientIdText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        patientIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientIdTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(nameCombo, 0, 302, Short.MAX_VALUE)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel9)
                                .addGap(22, 22, 22)
                                .addComponent(patientIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)
                                .addComponent(jLabel1)))))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel20)
                    .addComponent(nameCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(patientIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nameComboItemStateChanged
        DefaultTableModel dtm = (DefaultTableModel) admissionDetailTable.getModel();

        DefaultComboBoxModel model = (DefaultComboBoxModel) nameCombo.getModel();
        if (model.getIndexOf(nameCombo.getSelectedItem()) != -1) {

            if (!nameCombo.getSelectedItem().equals("")) {
                String name = (String) nameCombo.getSelectedItem();
                String[] names = name.split(" ");

                String patientId;
                try {
                    patientId = PatientController.getPatientId(names[0], names[1]);
                    patientIdText.setText(patientId);
                    ArrayList<Admission> admissionList = AdmissionController.getAllAdmissions(patientId);
                    dtm.setRowCount(0);

                    for (Admission admission : admissionList) {
                        Object[] rowData = {admission.getAdmissionId(), admission.getWardId(), admission.getDate(), "", admission.getLeadingConsultant()};
                        dtm.addRow(rowData);
                    }
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(PatientRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                dtm.setRowCount(0);
                patientIdText.setText("");
            }
        }
    }//GEN-LAST:event_nameComboItemStateChanged

    private void nameComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameComboActionPerformed

    }//GEN-LAST:event_nameComboActionPerformed

    private void patientIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientIdTextActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String patientId = patientIdText.getText();
        PatientDetails patientDetails = new PatientDetails();
        patientDetails.setVisible(true);
        homePanel.setLayout(new BorderLayout());
        homePanel.removeAll();
        homePanel.add(patientDetails);
        homePanel.validate();
        homePanel.repaint();
        PatientDetails.patientIdText.setText(patientId);
        PatientDetails.searchButton.doClick();
    }//GEN-LAST:event_updateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXTable admissionDetailTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> nameCombo;
    private javax.swing.JTextField patientIdText;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    private void fillNameCombo() throws SQLException, ClassNotFoundException {
        ArrayList<Patient> allPatients = PatientController.getAllPatients();
        nameCombo.addItem("");
        for (Patient patient : allPatients) {
            nameCombo.addItem(patient.getFirstName() + " " + patient.getLastName());
        }
    }
}
