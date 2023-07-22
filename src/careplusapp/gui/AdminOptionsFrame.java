/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package careplusapp.gui;

import careplusapp.pojo.UserProfile;
import com.formdev.flatlaf.themes.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author hardi
 */
public class AdminOptionsFrame extends javax.swing.JFrame {

    /**
     * Creates new form Demo
     */
    public AdminOptionsFrame() {
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
        manageEmp = new javax.swing.JButton();
        manageDr = new javax.swing.JButton();
        viewPatients = new javax.swing.JButton();
        manageRec = new javax.swing.JButton();
        lblUsername2 = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 675));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageEmp.setBackground(new java.awt.Color(229, 229, 229));
        manageEmp.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        manageEmp.setText("Manage Employees");
        manageEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmpActionPerformed(evt);
            }
        });
        jPanel1.add(manageEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 360, 80));

        manageDr.setBackground(new java.awt.Color(229, 229, 229));
        manageDr.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        manageDr.setText("Manage Doctors");
        manageDr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDrActionPerformed(evt);
            }
        });
        jPanel1.add(manageDr, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 360, 80));

        viewPatients.setBackground(new java.awt.Color(229, 229, 229));
        viewPatients.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        viewPatients.setText("View Patients");
        viewPatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientsActionPerformed(evt);
            }
        });
        jPanel1.add(viewPatients, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 360, 80));

        manageRec.setBackground(new java.awt.Color(229, 229, 229));
        manageRec.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        manageRec.setText("Manage Receptionists");
        manageRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRecActionPerformed(evt);
            }
        });
        jPanel1.add(manageRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 360, 80));

        lblUsername2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblUsername2.setForeground(new java.awt.Color(55, 55, 55));
        lblUsername2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername2.setText("Welcome");
        jPanel1.add(lblUsername2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        nameLbl.setBackground(new java.awt.Color(102, 102, 102));
        nameLbl.setFont(new java.awt.Font("Century Gothic", 1, 52)); // NOI18N
        nameLbl.setForeground(new java.awt.Color(55, 55, 55));
        nameLbl.setText("Sachin");
        jPanel1.add(nameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 250, 110));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/careplusapp/icons/image (2) (Custom).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 860, 670));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 680));

        setSize(new java.awt.Dimension(1218, 722));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void manageEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmpActionPerformed
        ManageEmployeeFrame manageEmpFrame=new ManageEmployeeFrame();
        manageEmpFrame.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_manageEmpActionPerformed

    private void manageDrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDrActionPerformed
                                 
        ManageDoctorsFrame managedrFrame=new ManageDoctorsFrame();
        managedrFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_manageDrActionPerformed

    private void viewPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientsActionPerformed
        new ViewPatientsAdminFrame().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_viewPatientsActionPerformed

    private void manageRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRecActionPerformed
        ManageReceptionistsFrame managedrFrame=new ManageReceptionistsFrame();
        managedrFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_manageRecActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        JOptionPane.showMessageDialog(null,"Thank you "+UserProfile.getUserName()+"! \nRedirecting to Login screen.");
        new LoginFrame().setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUsername2;
    private javax.swing.JButton manageDr;
    private javax.swing.JButton manageEmp;
    private javax.swing.JButton manageRec;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JButton viewPatients;
    // End of variables declaration//GEN-END:variables
}
