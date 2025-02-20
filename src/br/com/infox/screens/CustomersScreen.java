package br.com.infox.screens;

import java.sql.*;
import br.com.infox.dal.ConnectionModule;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CustomersScreen extends javax.swing.JInternalFrame {
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public CustomersScreen() {
        initComponents();
        conexao = ConnectionModule.conector();
    }
    
    private void toAdd() {
        try {
            boolean fullNameExists = fieldExists("full_name", txtFullName.getText());
            boolean emailExists = fieldExists("email", txtEmail.getText());
            boolean phoneNumberExists = fieldExists("phone_number", txtPhoneNumber.getText());
            
            if (fullNameExists || emailExists || phoneNumberExists){
                String errorMessage = "Erro";
                if (fullNameExists) errorMessage += "Nome do cliente já cadastrado!";
                if (emailExists) errorMessage += "E-mail do cliente já cadastrdo!";
                if (phoneNumberExists) errorMessage += "Telefone do cliente já cadastrado!";
                JOptionPane.showMessageDialog(null, errorMessage);
                return;
            }
            
            String sql = "INSERT INTO customers(full_name, email, phone_number, address_line, city, state, postal_code, country) VALUES(?,?,?,?,?,?,?,?)";
            
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtFullName.getText());
            pst.setString(2, txtEmail.getText());
            pst.setString(3, txtPhoneNumber.getText());
            pst.setString(4, txtAddres.getText());
            pst.setString(5, txtCity.getText());
            pst.setString(6, txtState.getText());
            pst.setString(7, txtPostalCode.getText());
            pst.setString(8, txtCountry.getText());
            
            if (txtFullName.getText().isEmpty() || txtEmail.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
            } else {
                int added = pst.executeUpdate();
                if (added > 0){
                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                    clearFielnds();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private boolean fieldExists(String columnName, String value) {
        // Tratamento para não permitir inserção de dados duplicados.
        // columnName -> Insere dinamicamente o nome da coluna na consulta.
        String sql = "SELECT COUNT(*) FROM users_account WHERE " + columnName + " =?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, value); //Substitui o ? pelo valor real a ser verificado.
            rs = pst.executeQuery();
            System.out.println("Validação se usuário existe" + rs);
            if (rs.next() && rs.getInt(1) > 0) {
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Verificar "+ columnName +": "+ e.getMessage());
        }
        return false;
    }
    
    private void clearFielnds() {
        JTextField[] fields = {txtFullName, txtEmail, txtPhoneNumber, txtAddres, txtCity, txtState, txtPostalCode, txtCountry};
        for (JTextField field : fields) {
            field.setText(null);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtAddres = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtPostalCode = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        btnCustomersSearch = new javax.swing.JButton();
        btnCustomersCreate = new javax.swing.JButton();
        btnCustomersDelete = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Customers");
        setMinimumSize(new java.awt.Dimension(128, 40));
        setPreferredSize(new java.awt.Dimension(730, 470));

        jLabel1.setText("* Required Fields ");

        jLabel2.setText("Full Name");

        jLabel3.setText("Email");

        jLabel4.setText("Phone Number");

        jLabel5.setText("Addres");

        jLabel6.setText("City");

        jLabel7.setText("State");

        jLabel8.setText("Postal Code");

        jLabel9.setText("Country");

        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });

        txtState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStateActionPerformed(evt);
            }
        });

        btnCustomersSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icons/read.png"))); // NOI18N
        btnCustomersSearch.setToolTipText("Search");

        btnCustomersCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icons/create.png"))); // NOI18N
        btnCustomersCreate.setToolTipText("Create");
        btnCustomersCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomersCreateActionPerformed(evt);
            }
        });

        btnCustomersDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icons/delete.png"))); // NOI18N
        btnCustomersDelete.setToolTipText("Delete");

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
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFullName)
                            .addComponent(txtEmail)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtAddres))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(28, 28, 28)
                        .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCountry)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(btnCustomersCreate)
                .addGap(47, 47, 47)
                .addComponent(btnCustomersSearch)
                .addGap(54, 54, 54)
                .addComponent(btnCustomersDelete)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAddres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCustomersSearch)
                    .addComponent(btnCustomersCreate)
                    .addComponent(btnCustomersDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Customers");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void txtStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStateActionPerformed

    private void btnCustomersCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomersCreateActionPerformed
        // TODO add your handling code here:
        toAdd();
    }//GEN-LAST:event_btnCustomersCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomersCreate;
    private javax.swing.JButton btnCustomersDelete;
    private javax.swing.JButton btnCustomersSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAddres;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtPostalCode;
    private javax.swing.JTextField txtState;
    // End of variables declaration//GEN-END:variables

}
