/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.view;

import java.awt.BorderLayout;

/**
 *
 * @author Manasha
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        //setExtendedState(MAXIMIZED_BOTH);
        Dashboard d = new Dashboard();
        d.setVisible(true);
        homePanel.setLayout(new BorderLayout());
        homePanel.removeAll();
        homePanel.add(d);
        homePanel.validate();
        homePanel.repaint();

        //dash d = new dash();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        navBar = new javax.swing.JPanel();
        departmentButton = new javax.swing.JButton();
        doctorButton = new javax.swing.JButton();
        dashboardButton = new javax.swing.JButton();
        nurseButton = new javax.swing.JButton();
        pharmacistButton = new javax.swing.JButton();
        mStaffButton = new javax.swing.JButton();
        reportButton = new javax.swing.JButton();
        patientButton = new javax.swing.JButton();
        admissionButton = new javax.swing.JButton();
        homePanel = new javax.swing.JPanel();
        green = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setMinimumSize(new java.awt.Dimension(1350, 740));
        background.setPreferredSize(new java.awt.Dimension(1350, 740));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(57, 67, 92));

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 60));

        navBar.setBackground(new java.awt.Color(57, 67, 92));
        navBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        departmentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/departmentDefault.png"))); // NOI18N
        departmentButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        departmentButton.setPreferredSize(new java.awt.Dimension(250, 40));
        departmentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                departmentButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                departmentButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                departmentButtonMouseExited(evt);
            }
        });
        departmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentButtonActionPerformed(evt);
            }
        });
        navBar.add(departmentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 250, 40));

        doctorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doctorDefault.png"))); // NOI18N
        doctorButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        doctorButton.setPreferredSize(new java.awt.Dimension(250, 40));
        doctorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctorButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                doctorButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                doctorButtonMouseExited(evt);
            }
        });
        doctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorButtonActionPerformed(evt);
            }
        });
        navBar.add(doctorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 250, 40));

        dashboardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dashboardDefault.png"))); // NOI18N
        dashboardButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        dashboardButton.setPreferredSize(new java.awt.Dimension(250, 40));
        dashboardButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardButtonMouseExited(evt);
            }
        });
        dashboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardButtonActionPerformed(evt);
            }
        });
        navBar.add(dashboardButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 250, 40));

        nurseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NurseDefault.png"))); // NOI18N
        nurseButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        nurseButton.setPreferredSize(new java.awt.Dimension(250, 40));
        nurseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nurseButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nurseButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nurseButtonMouseExited(evt);
            }
        });
        nurseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nurseButtonActionPerformed(evt);
            }
        });
        navBar.add(nurseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 250, 40));

        pharmacistButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PharmacistDefault.png"))); // NOI18N
        pharmacistButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pharmacistButton.setPreferredSize(new java.awt.Dimension(250, 40));
        pharmacistButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pharmacistButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pharmacistButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pharmacistButtonMouseExited(evt);
            }
        });
        pharmacistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmacistButtonActionPerformed(evt);
            }
        });
        navBar.add(pharmacistButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 250, 40));

        mStaffButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MstaffDefault.png"))); // NOI18N
        mStaffButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mStaffButton.setPreferredSize(new java.awt.Dimension(250, 40));
        mStaffButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mStaffButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mStaffButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mStaffButtonMouseExited(evt);
            }
        });
        mStaffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mStaffButtonActionPerformed(evt);
            }
        });
        navBar.add(mStaffButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 250, 40));

        reportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TestReportDefault.png"))); // NOI18N
        reportButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        reportButton.setPreferredSize(new java.awt.Dimension(250, 40));
        reportButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportButtonMouseExited(evt);
            }
        });
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });
        navBar.add(reportButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 250, 40));

        patientButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PatientDefault.png"))); // NOI18N
        patientButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        patientButton.setPreferredSize(new java.awt.Dimension(250, 40));
        patientButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                patientButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                patientButtonMouseExited(evt);
            }
        });
        patientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientButtonActionPerformed(evt);
            }
        });
        navBar.add(patientButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 250, 40));

        admissionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AdmissionDefault.png"))); // NOI18N
        admissionButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        admissionButton.setPreferredSize(new java.awt.Dimension(250, 40));
        admissionButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admissionButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                admissionButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                admissionButtonMouseExited(evt);
            }
        });
        admissionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admissionButtonActionPerformed(evt);
            }
        });
        navBar.add(admissionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 250, 40));

        background.add(navBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 250, 690));

        homePanel.setBackground(new java.awt.Color(255, 255, 255));
        homePanel.setMaximumSize(new java.awt.Dimension(1350, 740));
        homePanel.setPreferredSize(new java.awt.Dimension(1350, 740));

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        background.add(homePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 1070, 600));

        green.setBackground(new java.awt.Color(36, 208, 124));

        javax.swing.GroupLayout greenLayout = new javax.swing.GroupLayout(green);
        green.setLayout(greenLayout);
        greenLayout.setHorizontalGroup(
            greenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
        );
        greenLayout.setVerticalGroup(
            greenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        background.add(green, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1370, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 1318, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 670, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void departmentButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departmentButtonMouseEntered
        departmentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/departmentClicked.png")));
        
    }//GEN-LAST:event_departmentButtonMouseEntered

    private void departmentButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departmentButtonMouseExited
        departmentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/departmentDefault.png")));
    }//GEN-LAST:event_departmentButtonMouseExited

    private void departmentButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departmentButtonMouseClicked
        //dashboardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jbuttoncli.png")));
    }//GEN-LAST:event_departmentButtonMouseClicked

    private void doctorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorButtonMouseClicked

    private void doctorButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorButtonMouseEntered
        doctorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doctorClicked.png")));
    }//GEN-LAST:event_doctorButtonMouseEntered

    private void doctorButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorButtonMouseExited
        doctorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doctorDefault.png")));
    }//GEN-LAST:event_doctorButtonMouseExited

    private void dashboardButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dashboardButtonMouseClicked

    private void dashboardButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardButtonMouseEntered
        dashboardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dashboardClicked.png")));
    }//GEN-LAST:event_dashboardButtonMouseEntered

    private void dashboardButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardButtonMouseExited
        dashboardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dashboardDefault.png")));
    }//GEN-LAST:event_dashboardButtonMouseExited

    private void departmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentButtonActionPerformed

    private void dashboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardButtonActionPerformed
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
        homePanel.setLayout(new BorderLayout());
        homePanel.removeAll();
        homePanel.add(dashboard);
        homePanel.validate();
        homePanel.repaint();
    }//GEN-LAST:event_dashboardButtonActionPerformed

    private void nurseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nurseButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nurseButtonMouseClicked

    private void nurseButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nurseButtonMouseEntered
        nurseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NurseClicked.png")));
    }//GEN-LAST:event_nurseButtonMouseEntered

    private void nurseButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nurseButtonMouseExited
        nurseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NurseDefault.png")));
    }//GEN-LAST:event_nurseButtonMouseExited

    private void nurseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nurseButtonActionPerformed
        NurseDetails nurseDetails = new NurseDetails();
        nurseDetails.setVisible(true);
        homePanel.setLayout(new BorderLayout());
        homePanel.removeAll();
        homePanel.add(nurseDetails);
        homePanel.validate();
        homePanel.repaint();
    }//GEN-LAST:event_nurseButtonActionPerformed

    private void doctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorButtonActionPerformed
        DoctorDetails doctorDetails = new DoctorDetails();
        doctorDetails.setVisible(true);
        homePanel.setLayout(new BorderLayout());
        homePanel.removeAll();
        homePanel.add(doctorDetails);
        homePanel.validate();
        homePanel.repaint();
    }//GEN-LAST:event_doctorButtonActionPerformed

    private void pharmacistButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pharmacistButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pharmacistButtonMouseClicked

    private void pharmacistButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pharmacistButtonMouseEntered
        pharmacistButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PharmacistClicked.png")));
    }//GEN-LAST:event_pharmacistButtonMouseEntered

    private void pharmacistButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pharmacistButtonMouseExited
        pharmacistButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PharmacistDefault.png")));
    }//GEN-LAST:event_pharmacistButtonMouseExited

    private void pharmacistButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmacistButtonActionPerformed
        PharmacistDetails pharmacistDetails = new PharmacistDetails();
        pharmacistDetails.setVisible(true);
        homePanel.setLayout(new BorderLayout());
        homePanel.removeAll();
        homePanel.add(pharmacistDetails);
        homePanel.validate();
        homePanel.repaint();
    }//GEN-LAST:event_pharmacistButtonActionPerformed

    private void mStaffButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mStaffButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mStaffButtonMouseClicked

    private void mStaffButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mStaffButtonMouseEntered
        mStaffButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MstaffClicked.png")));
    }//GEN-LAST:event_mStaffButtonMouseEntered

    private void mStaffButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mStaffButtonMouseExited
        mStaffButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MstaffDefault.png")));
    }//GEN-LAST:event_mStaffButtonMouseExited

    private void mStaffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mStaffButtonActionPerformed
        MaintenanceStaffDetails staffDetails = new MaintenanceStaffDetails();
        staffDetails.setVisible(true);
        homePanel.setLayout(new BorderLayout());
        homePanel.removeAll();
        homePanel.add(staffDetails);
        homePanel.validate();
        homePanel.repaint();
    }//GEN-LAST:event_mStaffButtonActionPerformed

    private void reportButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_reportButtonMouseClicked

    private void reportButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportButtonMouseEntered
        reportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TestReportClicked.png")));
    }//GEN-LAST:event_reportButtonMouseEntered

    private void reportButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportButtonMouseExited
        reportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TestReportDefault.png")));
    }//GEN-LAST:event_reportButtonMouseExited

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportButtonActionPerformed
        ViewTestResults testResults = new ViewTestResults();
        testResults.setVisible(true);
        homePanel.setLayout(new BorderLayout());
        homePanel.removeAll();
        homePanel.add(testResults);
        homePanel.validate();
        homePanel.repaint();
    }//GEN-LAST:event_reportButtonActionPerformed

    private void patientButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_patientButtonMouseClicked

    private void patientButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientButtonMouseEntered
        patientButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/patientClicked.png")));
    }//GEN-LAST:event_patientButtonMouseEntered

    private void patientButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientButtonMouseExited
        patientButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/patientDefault.png")));
    }//GEN-LAST:event_patientButtonMouseExited

    private void patientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientButtonActionPerformed
        PatientDetails patientDetails = new PatientDetails();
        patientDetails.setVisible(true);
        homePanel.setLayout(new BorderLayout());
        homePanel.removeAll();
        homePanel.add(patientDetails);
        homePanel.validate();
        homePanel.repaint();
    }//GEN-LAST:event_patientButtonActionPerformed

    private void admissionButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admissionButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_admissionButtonMouseClicked

    private void admissionButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admissionButtonMouseEntered
        admissionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AdmissionClicked.png")));
    }//GEN-LAST:event_admissionButtonMouseEntered

    private void admissionButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admissionButtonMouseExited
        admissionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AdmissionDefault.png")));
    }//GEN-LAST:event_admissionButtonMouseExited

    private void admissionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admissionButtonActionPerformed
        PatientDetails patientDetails = new PatientDetails();
        patientDetails.setVisible(true);
        homePanel.setLayout(new BorderLayout());
        homePanel.removeAll();
        homePanel.add(patientDetails);
        homePanel.validate();
        homePanel.repaint();
    }//GEN-LAST:event_admissionButtonActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Home().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admissionButton;
    private javax.swing.JPanel background;
    private javax.swing.JButton dashboardButton;
    private javax.swing.JButton departmentButton;
    private javax.swing.JButton doctorButton;
    private javax.swing.JPanel green;
    private javax.swing.JPanel header;
    public static javax.swing.JPanel homePanel;
    private javax.swing.JButton mStaffButton;
    private javax.swing.JPanel navBar;
    private javax.swing.JButton nurseButton;
    private javax.swing.JButton patientButton;
    private javax.swing.JButton pharmacistButton;
    private javax.swing.JButton reportButton;
    // End of variables declaration//GEN-END:variables
}
