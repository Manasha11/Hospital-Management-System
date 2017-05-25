/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.view;

import hms.controller.DoctorController;
import hms.model.Doctor;
import hms.other.IDGenerator;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Manasha
 */
public class DoctorDetails extends javax.swing.JPanel {

    /**
     * Creates new form AddDoctor
     */
    public DoctorDetails() {
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
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        regNumText = new javax.swing.JTextField();
        specialtyText = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        titleText = new javax.swing.JTextField();
        degreesText = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        firstNameText = new javax.swing.JTextField();
        nicText = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lastNameText = new javax.swing.JTextField();
        doctorIdText = new javax.swing.JTextField();
        genderText = new javax.swing.JTextField();
        dobText = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
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
        jLabel1.setText("Doctor Details");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Professional Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cuprum", 0, 18), new java.awt.Color(57, 67, 92))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(57, 67, 92));

        jLabel16.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(57, 67, 92));
        jLabel16.setText("Registration number:");

        regNumText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        regNumText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regNumTextActionPerformed(evt);
            }
        });

        specialtyText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        specialtyText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specialtyTextActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(57, 67, 92));
        jLabel14.setText("Specialty:");

        jLabel12.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(57, 67, 92));
        jLabel12.setText("Title:");

        jLabel17.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(57, 67, 92));
        jLabel17.setText("Degrees:");

        titleText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        titleText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTextActionPerformed(evt);
            }
        });

        degreesText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        degreesText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreesTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel14))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(regNumText, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(specialtyText, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel17))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(degreesText, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 111, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(regNumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(titleText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(degreesText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(specialtyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personel Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cuprum", 0, 18), new java.awt.Color(57, 67, 92))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(57, 67, 92));

        jLabel18.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(57, 67, 92));
        jLabel18.setText("Gender:");

        jLabel19.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(57, 67, 92));
        jLabel19.setText("NIC:");

        jLabel20.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(57, 67, 92));
        jLabel20.setText("First name: ");

        jLabel21.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(57, 67, 92));
        jLabel21.setText("Doctor ID: ");

        firstNameText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        firstNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextActionPerformed(evt);
            }
        });

        nicText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        nicText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicTextActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(57, 67, 92));
        jLabel22.setText("Date of birth:");

        jLabel23.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(57, 67, 92));
        jLabel23.setText("Last name: ");

        lastNameText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        lastNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextActionPerformed(evt);
            }
        });

        doctorIdText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        doctorIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorIdTextActionPerformed(evt);
            }
        });

        genderText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        genderText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderTextActionPerformed(evt);
            }
        });

        dobText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        dobText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobTextActionPerformed(evt);
            }
        });

        searchButton.setText("jButton1");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel22))
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nicText, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel18))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderText, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dobText, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(doctorIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(searchButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(doctorIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(nicText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(genderText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(dobText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
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
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contactNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(50, 50, 50)
                        .addComponent(cityText))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codeText, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel13)
                    .addComponent(jLabel10))
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(districtText)
                    .addComponent(streetText)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(jLabel13)
                            .addComponent(streetText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(districtText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(codeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(cityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addDoc.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(109, 109, 109))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void specialtyTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specialtyTextActionPerformed
        degreesText.requestFocus();
    }//GEN-LAST:event_specialtyTextActionPerformed

    private void titleTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleTextActionPerformed
        specialtyText.requestFocus();
    }//GEN-LAST:event_titleTextActionPerformed

    private void regNumTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regNumTextActionPerformed
        titleText.requestFocus();
    }//GEN-LAST:event_regNumTextActionPerformed

    private void codeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeTextActionPerformed
        streetText.requestFocus();
    }//GEN-LAST:event_codeTextActionPerformed

    private void firstNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextActionPerformed
        lastNameText.requestFocus();
    }//GEN-LAST:event_firstNameTextActionPerformed

    private void nicTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicTextActionPerformed
        genderText.requestFocus();
    }//GEN-LAST:event_nicTextActionPerformed

    private void cityTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTextActionPerformed
        districtText.requestFocus();
    }//GEN-LAST:event_cityTextActionPerformed

    private void streetTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streetTextActionPerformed
        cityText.requestFocus();
    }//GEN-LAST:event_streetTextActionPerformed

    private void districtTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_districtTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_districtTextActionPerformed

    private void degreesTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreesTextActionPerformed
        contactNoText.requestFocus();
    }//GEN-LAST:event_degreesTextActionPerformed

    private void contactNoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNoTextActionPerformed
        emailText.requestFocus();
    }//GEN-LAST:event_contactNoTextActionPerformed

    private void emailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextActionPerformed
        codeText.requestFocus();
    }//GEN-LAST:event_emailTextActionPerformed

    private void lastNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTextActionPerformed
        nicText.requestFocus();
    }//GEN-LAST:event_lastNameTextActionPerformed

    private void doctorIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorIdTextActionPerformed
        searchButton.doClick();
        firstNameText.requestFocus();
    }//GEN-LAST:event_doctorIdTextActionPerformed

    private void genderTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderTextActionPerformed
        dobText.requestFocus();
    }//GEN-LAST:event_genderTextActionPerformed

    private void dobTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobTextActionPerformed
        regNumText.requestFocus();
    }//GEN-LAST:event_dobTextActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String doctorId = doctorIdText.getText();
        Doctor doctor;
        try {
            doctor = DoctorController.searchDoctor(doctorId);
            if (doctor != null) {
                firstNameText.setText(doctor.getFirstName());
                lastNameText.setText(doctor.getLastName());
                nicText.setText(doctor.getNic());
                dobText.setText(doctor.getDob());
                genderText.setText(doctor.getGender());
                specialtyText.setText(doctor.getSpecialty());
                degreesText.setText(doctor.getDegree());
                regNumText.setText(doctor.getRegNum());
                titleText.setText(doctor.getTitle());
                contactNoText.setText(doctor.getContactNo());
                codeText.setText(doctor.getPostalCode());
                streetText.setText(doctor.getStreet());
                cityText.setText(doctor.getCity());
                districtText.setText(doctor.getDistrict());
                emailText.setText(doctor.getEmail());
            } else {
                JOptionPane.showMessageDialog(this, "No doctor found!");
                firstNameText.setText("");
                lastNameText.setText("");
                nicText.setText("");
                dobText.setText("");
                genderText.setText("");
                specialtyText.setText("");
                degreesText.setText("");
                regNumText.setText("");
                titleText.setText("");
                contactNoText.setText("");
                codeText.setText("");
                streetText.setText("");
                cityText.setText("");
                districtText.setText("");
                emailText.setText("");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DoctorDetails.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_searchButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cityText;
    private javax.swing.JTextField codeText;
    private javax.swing.JTextField contactNoText;
    private javax.swing.JTextField degreesText;
    private javax.swing.JTextField districtText;
    private javax.swing.JTextField dobText;
    private javax.swing.JTextField doctorIdText;
    private javax.swing.JTextField emailText;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JTextField genderText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JTextField nicText;
    private javax.swing.JTextField regNumText;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField specialtyText;
    private javax.swing.JTextField streetText;
    private javax.swing.JTextField titleText;
    // End of variables declaration//GEN-END:variables

}
