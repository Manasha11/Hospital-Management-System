/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.view;

import hms.controller.AccountController;
import hms.model.Account;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Manasha
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        loginPanel = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        img = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        passwordText = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(57, 67, 92));
        setResizable(false);

        loginPanel.setBackground(new java.awt.Color(57, 67, 92));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginLabel.setFont(new java.awt.Font("Cuprum", 0, 24)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(255, 255, 255));
        loginLabel.setText("Login");
        loginPanel.add(loginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, -1, 30));

        jTextField1.setBackground(new java.awt.Color(57, 67, 92));
        jTextField1.setFont(new java.awt.Font("Cuprum", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Username");
        jTextField1.setToolTipText("");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        loginPanel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 102, 20));
        loginPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 271, 10));
        loginPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 236, 271, 10));

        jTextField2.setBackground(new java.awt.Color(57, 67, 92));
        jTextField2.setFont(new java.awt.Font("Cuprum", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Password");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        loginPanel.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, 20));

        jButton1.setBackground(new java.awt.Color(36, 208, 124));
        jButton1.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jButton1.setText("Login");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        loginPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 271, 40));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stethoscope-in-the-hands-of-a-doctor_1232-644.jpg"))); // NOI18N
        loginPanel.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 530));

        usernameText.setBackground(new java.awt.Color(57, 67, 92));
        usernameText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        usernameText.setForeground(new java.awt.Color(255, 255, 255));
        usernameText.setBorder(null);
        loginPanel.add(usernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 270, -1));

        passwordText.setBackground(new java.awt.Color(57, 67, 92));
        passwordText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        passwordText.setForeground(new java.awt.Color(255, 255, 255));
        passwordText.setBorder(null);
        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });
        loginPanel.add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 270, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String username = usernameText.getText();
        String password = passwordText.getText();
        try {
            Account account = AccountController.searchAccount(username);
            if (account != null) {
                if (account.getUsername().equals(username) && account.getPassword().equals(password)) {
                    Login.this.setVisible(false);
                    new Home().setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(this, "Password is incorrect!");
                }
            }else{
                JOptionPane.showMessageDialog(this, "No such user!");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextActionPerformed

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
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Login().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}
