package br.com.infox.screens;

import java.sql.*;
import br.com.infox.dal.ConnectionModule;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class UserScreen extends javax.swing.JInternalFrame {
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public UserScreen() {
        initComponents();
        conexao = ConnectionModule.conector();
    }
    
    private void consult(){
        String sql = "SELECT * FROM users_account WHERE user_id = ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1,txtUsersId.getText());
            rs = pst.executeQuery();
            
            if (rs.next()) {
                txtUsersUsername.setText(rs.getString(2));
                txtUsersPhone.setText(rs.getString(3));
                txtUsersLogin.setText(rs.getString(4));
                txtUsersPassword.setText(rs.getString(5));
                //refere ao combobox
                txtUsersProfile.setSelectedItem(rs.getString(8));
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não cadastrado");
                clearFielnds();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void clearFielnds() {
        JTextField[] fields = {txtUsersUsername, txtUsersPhone, txtUsersLogin, txtUsersPassword};
        for (JTextField field : fields) {
            field.setText(null);
        }
        txtUsersProfile.setSelectedItem(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtUsersId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtUsersUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUsersLogin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtUsersPassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtUsersProfile = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtUsersPhone = new javax.swing.JTextField();
        btnUsersRead = new javax.swing.JButton();
        btnUsersUpdate = new javax.swing.JButton();
        txtUsersDelete = new javax.swing.JButton();
        btnUsersCreate = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Users");
        setPreferredSize(new java.awt.Dimension(775, 0));

        jLabel1.setText("User_id");

        txtUsersId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsersIdActionPerformed(evt);
            }
        });

        jLabel2.setText("Username");

        txtUsersUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsersUsernameActionPerformed(evt);
            }
        });

        jLabel3.setText("Login_name");

        txtUsersLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsersLoginActionPerformed(evt);
            }
        });

        jLabel4.setText("Password_hash");

        txtUsersPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsersPasswordActionPerformed(evt);
            }
        });

        jLabel5.setText("User_profile");

        txtUsersProfile.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "user" }));

        jLabel6.setText("Phone_number");

        txtUsersPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsersPhoneActionPerformed(evt);
            }
        });

        btnUsersRead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icons/read.png"))); // NOI18N
        btnUsersRead.setToolTipText("Read");
        btnUsersRead.setPreferredSize(new java.awt.Dimension(80, 80));
        btnUsersRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsersReadActionPerformed(evt);
            }
        });

        btnUsersUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icons/update.png"))); // NOI18N
        btnUsersUpdate.setToolTipText("Update");
        btnUsersUpdate.setPreferredSize(new java.awt.Dimension(80, 80));

        txtUsersDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icons/delete.png"))); // NOI18N
        txtUsersDelete.setToolTipText("Delete");
        txtUsersDelete.setPreferredSize(new java.awt.Dimension(80, 80));

        btnUsersCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icons/create.png"))); // NOI18N
        btnUsersCreate.setToolTipText("Add");
        btnUsersCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsersCreate.setPreferredSize(new java.awt.Dimension(80, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtUsersUsername)
                                .addGap(76, 76, 76))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtUsersId, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnUsersCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtUsersPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtUsersPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtUsersProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtUsersLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUsersRead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(btnUsersUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                .addComponent(txtUsersDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(73, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsersId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsersUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtUsersPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtUsersLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtUsersProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtUsersPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUsersRead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsersUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsersDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsersCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        setBounds(0, 0, 720, 470);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsersIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsersIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsersIdActionPerformed

    private void txtUsersUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsersUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsersUsernameActionPerformed

    private void txtUsersLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsersLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsersLoginActionPerformed

    private void txtUsersPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsersPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsersPasswordActionPerformed

    private void txtUsersPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsersPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsersPhoneActionPerformed

    private void btnUsersReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsersReadActionPerformed
        // TODO add your handling code here:
        consult();
    }//GEN-LAST:event_btnUsersReadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUsersCreate;
    private javax.swing.JButton btnUsersRead;
    private javax.swing.JButton btnUsersUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton txtUsersDelete;
    private javax.swing.JTextField txtUsersId;
    private javax.swing.JTextField txtUsersLogin;
    private javax.swing.JTextField txtUsersPassword;
    private javax.swing.JTextField txtUsersPhone;
    private javax.swing.JComboBox<String> txtUsersProfile;
    private javax.swing.JTextField txtUsersUsername;
    // End of variables declaration//GEN-END:variables
}
