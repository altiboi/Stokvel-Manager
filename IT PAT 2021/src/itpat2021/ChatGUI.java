/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpat2021;


import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sims <your.name at your.org>
 */
public class ChatGUI extends javax.swing.JFrame {

    /**
     * Creates new form ChatGUI
     */
    
    public static StokvelMember User;
    
    public ChatGUI(StokvelMember sm) throws SQLException 
    {
        initComponents();
        User = sm;
        StokvelMemberManager ssm = new StokvelMemberManager();
        txaChat.setEditable(false);
        txaMemberList.setText(ssm.getStokvelMembers(User.getStokvel()));//Displays the stokvel member list
        txaMemberList.setEditable(false);
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txfType = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaChat = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaMemberList = new javax.swing.JTextArea();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chat");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txfType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txfType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfTypeActionPerformed(evt);
            }
        });
        getContentPane().add(txfType, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 200, 50));

        txaChat.setColumns(20);
        txaChat.setRows(5);
        txaChat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(txaChat);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 240, 170));

        btnSend.setText("Send");
        btnSend.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        getContentPane().add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 40, -1));

        btnClose.setText("Close");
        btnClose.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 45, -1));

        btnHelp.setText("Help");
        btnHelp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        getContentPane().add(btnHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 40, -1));

        txaMemberList.setColumns(20);
        txaMemberList.setRows(5);
        jScrollPane2.setViewportView(txaMemberList);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 140, 170));

        Background.setIcon(new javax.swing.ImageIcon("C:\\Users\\myboy\\Downloads\\Black sand wave.jpg")); // NOI18N
        Background.setText("jLabel1");
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfTypeActionPerformed
     
    }//GEN-LAST:event_txfTypeActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        new HomeGUI(User).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
      //Appends the chat text area to show the user's sent message  
        txaChat.append(User.getName() + " " + User.getSurname() + ": " + txfType.getText() + "\n");
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        new HelpGUI(User).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHelpActionPerformed

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
            java.util.logging.Logger.getLogger(ChatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ChatGUI(User).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ChatGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnSend;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txaChat;
    private javax.swing.JTextArea txaMemberList;
    private javax.swing.JTextField txfType;
    // End of variables declaration//GEN-END:variables
}
