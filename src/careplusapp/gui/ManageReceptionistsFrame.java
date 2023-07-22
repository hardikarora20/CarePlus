package careplusapp.gui;

import careplusapp.pojo.UserProfile;
import com.formdev.flatlaf.themes.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ManageReceptionistsFrame extends javax.swing.JFrame {

    public ManageReceptionistsFrame() {
        UIManager.put( "TextComponent.arc", 10 );
        UIManager.put( "Component.arc", 10 );
        UIManager.put( "CheckBox.arc", 10 );
        UIManager.put( "ProgressBar.arc", 10 );
        FlatMacLightLaf.setup();
        initComponents();
        nameLbl.setText(""+UserProfile.getUserName());
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
        nameLbl = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnAddEmp1 = new javax.swing.JButton();
        lblUsername2 = new javax.swing.JLabel();
        btnAddEmp = new javax.swing.JButton();
        btnViewEmp = new javax.swing.JButton();
        btnRemoveEmp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 675));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameLbl.setBackground(new java.awt.Color(102, 102, 102));
        nameLbl.setFont(new java.awt.Font("Century Gothic", 1, 52)); // NOI18N
        nameLbl.setForeground(new java.awt.Color(5, 25, 55));
        nameLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nameLbl.setText("Sachin");
        jPanel1.add(nameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 250, 110));

        btnLogin.setBackground(new java.awt.Color(0, 110, 220));
        btnLogin.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGOUT");
        btnLogin.setPreferredSize(new java.awt.Dimension(63, 70));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 40, 160, 50));

        btnAddEmp1.setBackground(new java.awt.Color(229, 229, 229));
        btnAddEmp1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnAddEmp1.setText("Add Receptionist");
        btnAddEmp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmp1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddEmp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 360, 80));

        lblUsername2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblUsername2.setForeground(new java.awt.Color(5, 25, 55));
        lblUsername2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername2.setText("Welcome");
        jPanel1.add(lblUsername2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        btnAddEmp.setBackground(new java.awt.Color(229, 229, 229));
        btnAddEmp.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnAddEmp.setText("Update Receptionist");
        btnAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmpActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 360, 80));

        btnViewEmp.setBackground(new java.awt.Color(229, 229, 229));
        btnViewEmp.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnViewEmp.setText("View Receptionists");
        btnViewEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEmpActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 360, 80));

        btnRemoveEmp.setBackground(new java.awt.Color(229, 229, 229));
        btnRemoveEmp.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnRemoveEmp.setText("Delete Receptionist");
        btnRemoveEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveEmpActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemoveEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 360, 80));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/careplusapp/icons/568174 (1).png"))); // NOI18N
        jLabel1.setText("BACK");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/careplusapp/icons/509.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, -20, 880, 1010));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmpActionPerformed
        new UpdateReceptionistFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddEmpActionPerformed

    private void btnViewEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEmpActionPerformed
        new ViewReceptionistsFrame().setVisible(true);
        this.dispose();      
    }//GEN-LAST:event_btnViewEmpActionPerformed

    private void btnRemoveEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveEmpActionPerformed
        new DeleteReceptionistsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRemoveEmpActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        AdminOptionsFrame adminEmpFrame=new AdminOptionsFrame();
        adminEmpFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        JOptionPane.showMessageDialog(null,"Thank you "+UserProfile.getUserName()+"! \nRedirecting to Login screen.");
        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnAddEmp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmp1ActionPerformed
        new AddReceptionistsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddEmp1ActionPerformed

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
            java.util.logging.Logger.getLogger(ManageReceptionistsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageReceptionistsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageReceptionistsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageReceptionistsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageReceptionistsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmp;
    private javax.swing.JButton btnAddEmp1;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRemoveEmp;
    private javax.swing.JButton btnViewEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUsername2;
    private javax.swing.JLabel nameLbl;
    // End of variables declaration//GEN-END:variables
}
