/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.view.admin;

import hms.controller.AccountController;
import hms.controller.EmployeeController;
import hms.model.Account;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Manasha
 */
public class AddAccount extends javax.swing.JPanel {

    /**
     * Creates new form AddAccount
     */
    public AddAccount() {
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
        jLabel20 = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        passwordText1 = new javax.swing.JPasswordField();
        passwordText2 = new javax.swing.JPasswordField();
        jLabel22 = new javax.swing.JLabel();
        employeeIdText = new javax.swing.JPasswordField();
        jLabel23 = new javax.swing.JLabel();
        typeCombo = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Cuprum", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(36, 208, 124));
        jLabel1.setText("Add Doctor");

        jLabel20.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(57, 67, 92));
        jLabel20.setText("Username: ");

        usernameText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        usernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(57, 67, 92));
        jLabel19.setText("Password: ");

        jLabel21.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(57, 67, 92));
        jLabel21.setText("Confirm password: ");

        addButton.setBackground(new java.awt.Color(36, 208, 124));
        addButton.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Create Account");
        addButton.setBorder(null);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        passwordText1.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N

        passwordText2.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(57, 67, 92));
        jLabel22.setText("Type: ");

        employeeIdText.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(57, 67, 92));
        jLabel23.setText("Employee ID: ");

        typeCombo.setFont(new java.awt.Font("Cuprum", 0, 16)); // NOI18N
        typeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Doctor", "Nurse", "Pharmacist", "Maintenance staff" }));
        typeCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                typeComboItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(typeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(employeeIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passwordText1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addComponent(passwordText2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(usernameText))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(jLabel23)
                        .addComponent(employeeIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(typeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(passwordText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(passwordText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String username = usernameText.getText();
        String password1 = passwordText1.getText();
        String password2 = passwordText2.getText();
        
        try {
            Account account = AccountController.searchAccount(username);
            if(account.getUsername().equals(username)){
                JOptionPane.showMessageDialog(this, "The entered username already exists! Please try again!");
                return;
            }else if(!password1.equals(password2)){
                JOptionPane.showMessageDialog(this, "Passwords don't match!");
                return;
            }else{
                Account account1 = new Account(username, password1);
                boolean addAccount = AccountController.addAccount(account1);
                if(addAccount){
                    JOptionPane.showMessageDialog(this, "Successfull!");
                }else{
                    JOptionPane.showMessageDialog(this, "Failed!");
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void typeComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_typeComboItemStateChanged
        String type = (String) typeCombo.getSelectedItem();
        String employeeId = EmployeeController.getEmployeeId();
    }//GEN-LAST:event_typeComboItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPasswordField employeeIdText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPasswordField passwordText1;
    private javax.swing.JPasswordField passwordText2;
    private javax.swing.JComboBox<String> typeCombo;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}
