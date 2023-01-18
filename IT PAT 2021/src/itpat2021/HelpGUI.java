/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpat2021;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sims <your.name at your.org>
 */
public class HelpGUI extends javax.swing.JFrame {

    /**
     * Creates new form HelpGUI
     */
    
    public static StokvelMember User;
    
    public HelpGUI(StokvelMember sm) 
    {
        initComponents();
        User = sm;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txaHelp = new javax.swing.JTextArea();
        btnLogin = new javax.swing.JButton();
        btnSiignUp = new javax.swing.JButton();
        btnJoin = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnChat = new javax.swing.JButton();
        btnManageAccount = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Help");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txaHelp.setColumns(20);
        txaHelp.setRows(5);
        getContentPane().add(txaHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 248, 220));

        btnLogin.setText("Login");
        btnLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 46, 90, -1));

        btnSiignUp.setText("Sign Up");
        btnSiignUp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSiignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiignUpActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 83, 90, -1));

        btnJoin.setText("Join");
        btnJoin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJoinActionPerformed(evt);
            }
        });
        getContentPane().add(btnJoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 120, 90, -1));

        btnHome.setText("Home");
        btnHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 157, 90, -1));

        btnChat.setText("Chat");
        btnChat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChatActionPerformed(evt);
            }
        });
        getContentPane().add(btnChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 194, 90, -1));

        btnManageAccount.setText("Manage Account");
        btnManageAccount.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAccountActionPerformed(evt);
            }
        });
        getContentPane().add(btnManageAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 231, 90, -1));

        btnClose.setText("Close");
        btnClose.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 285, 40, -1));

        Background.setIcon(new javax.swing.ImageIcon("C:\\Users\\myboy\\Downloads\\Black sand wave.jpg")); // NOI18N
        Background.setText("jLabel1");
        Background.setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try {
            String desc = Tools.getHelpInfo("Login");
            String d [] = desc.split("-");
            String description = "";
            for (int i = 0; i < d.length - 1; i++) 
            {
              description += "- " + d[i] + "\n";
            }
            
            txaHelp.setText(description);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HelpGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnSiignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiignUpActionPerformed
        try {
            String desc = Tools.getHelpInfo("SignUp");
            String d [] = desc.split("-");
            String description = "";
            for (int i = 0; i < d.length - 1; i++) 
            {
              description += "- " + d[i] + "\n";
            }
            
            txaHelp.setText(description);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HelpGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSiignUpActionPerformed

    private void btnJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJoinActionPerformed
        try {
            String desc = Tools.getHelpInfo("JoinStokvel");
            String d [] = desc.split("-");
            String description = "";
            for (int i = 0; i < d.length - 1; i++) 
            {
              description += "- " + d[i] + "\n";
            }
            
            txaHelp.setText(description);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HelpGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnJoinActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
       try {
            String desc = Tools.getHelpInfo("Home");
            String d [] = desc.split("-");
            String description = "";
            for (int i = 0; i < d.length - 1; i++) 
            {
              description += "- " + d[i] + "\n";
            }
            
            txaHelp.setText(description);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HelpGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChatActionPerformed
        try {
            String desc = Tools.getHelpInfo("Chat");
            String d [] = desc.split("-");
            String description = "";
            for (int i = 0; i < d.length - 1; i++) 
            {
              description += "- " + d[i] + "\n";
            }
            
            txaHelp.setText(description);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HelpGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnChatActionPerformed

    private void btnManageAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAccountActionPerformed
        try {
            String desc = Tools.getHelpInfo("ManageAccount");
            String d [] = desc.split("-");
            String description = "";
            for (int i = 0; i < d.length - 1; i++) 
            {
              description += "- " + d[i] + "\n";
            }
            
            txaHelp.setText(description);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HelpGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnManageAccountActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        new HomeGUI(User).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HelpGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelpGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelpGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelpGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelpGUI(User).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton btnChat;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnJoin;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnManageAccount;
    private javax.swing.JButton btnSiignUp;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextArea txaHelp;
    // End of variables declaration//GEN-END:variables
}