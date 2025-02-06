package br.com.infox.screens;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class MainScreen extends javax.swing.JFrame {
    public MainScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        menuRegister = new javax.swing.JMenu();
        menuRegisterCustomer = new javax.swing.JMenuItem();
        menuRegisterServiceOrder = new javax.swing.JMenuItem();
        menuRegisterUsers = new javax.swing.JMenuItem();
        menuReport = new javax.swing.JMenu();
        menuServiceReport = new javax.swing.JMenuItem();
        menuHelpOn = new javax.swing.JMenu();
        menuHelpAbout = new javax.swing.JMenuItem();
        menuOptions = new javax.swing.JMenu();
        menuOptionsExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Service Order Control");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icons/logo_java.png"))); // NOI18N

        userLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userLabel.setText("Usuário");

        dateLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dateLabel.setText("Data");

        menuRegister.setText("Register");

        menuRegisterCustomer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        menuRegisterCustomer.setText("Customer");
        menuRegisterCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegisterCustomerActionPerformed(evt);
            }
        });
        menuRegister.add(menuRegisterCustomer);

        menuRegisterServiceOrder.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        menuRegisterServiceOrder.setText("Service Order");
        menuRegister.add(menuRegisterServiceOrder);

        menuRegisterUsers.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        menuRegisterUsers.setText("Users");
        menuRegisterUsers.setEnabled(false);
        menuRegisterUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegisterUsersActionPerformed(evt);
            }
        });
        menuRegister.add(menuRegisterUsers);

        Menu.add(menuRegister);

        menuReport.setText("Report");

        menuServiceReport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        menuServiceReport.setText("Service Report");
        menuServiceReport.setEnabled(false);
        menuServiceReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuServiceReportActionPerformed(evt);
            }
        });
        menuReport.add(menuServiceReport);

        Menu.add(menuReport);

        menuHelpOn.setText("Help");

        menuHelpAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuHelpAbout.setText("On");
        menuHelpAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHelpAboutActionPerformed(evt);
            }
        });
        menuHelpOn.add(menuHelpAbout);

        Menu.add(menuHelpOn);

        menuOptions.setText("Options");

        menuOptionsExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuOptionsExit.setText("Exit");
        menuOptionsExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOptionsExitActionPerformed(evt);
            }
        });
        menuOptions.add(menuOptionsExit);

        Menu.add(menuOptions);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(dateLabel)
                    .addComponent(userLabel))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userLabel)
                        .addGap(30, 30, 30)
                        .addComponent(dateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(desktop))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(933, 570));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuRegisterCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegisterCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuRegisterCustomerActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // As linhas abaixo substituem a label lblData pela data atual do sistema ao iniciar o form
        Date date = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        dateLabel.setText(formatador.format(date));
    }//GEN-LAST:event_formWindowActivated

    private void menuOptionsExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOptionsExitActionPerformed
        //exibe uma caixa de dialogo
        int exit = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?", "Attention", JOptionPane.YES_NO_OPTION);
        if (exit == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_menuOptionsExitActionPerformed

    private void menuHelpAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHelpAboutActionPerformed
        ScreenOn on = new ScreenOn();
        on.setVisible(true);
    }//GEN-LAST:event_menuHelpAboutActionPerformed

    private void menuRegisterUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegisterUsersActionPerformed
        // As linhas abaixo irão abrir uma nova tela dentro do formulário desktop
        UserScreen user = new UserScreen();
        user.setVisible(true);
        desktop.add(user);
    }//GEN-LAST:event_menuRegisterUsersActionPerformed

    private void menuServiceReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuServiceReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuServiceReportActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem menuHelpAbout;
    private javax.swing.JMenu menuHelpOn;
    private javax.swing.JMenu menuOptions;
    private javax.swing.JMenuItem menuOptionsExit;
    private javax.swing.JMenu menuRegister;
    private javax.swing.JMenuItem menuRegisterCustomer;
    private javax.swing.JMenuItem menuRegisterServiceOrder;
    public static javax.swing.JMenuItem menuRegisterUsers;
    public javax.swing.JMenu menuReport;
    public static javax.swing.JMenuItem menuServiceReport;
    public static javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
