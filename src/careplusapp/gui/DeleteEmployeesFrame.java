/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package careplusapp.gui;

import careplusapp.dao.EmpDao;
import careplusapp.pojo.EmpPojo;
import careplusapp.pojo.UserProfile;
import com.formdev.flatlaf.FlatLaf;
import static com.formdev.flatlaf.FlatLaf.setGlobalExtraDefaults;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.UIManager;

/**
 *
 * @author hardi
 */
public class DeleteEmployeesFrame extends javax.swing.JFrame {

    private String empName;
    public DeleteEmployeesFrame() {
        UIManager.put( "TextComponent.arc", 10 );
        UIManager.put( "Component.arc", 10 );
        UIManager.put( "CheckBox.arc", 10 );
        UIManager.put( "ProgressBar.arc", 10 );
        FlatMacLightLaf.setup();
        initComponents();
        loadEmpId();
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
        jLabel1 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        txtEmpName = new javax.swing.JTextField();
        txtEmpJob = new javax.swing.JTextField();
        jcEmpId = new javax.swing.JComboBox<>();
        lblEmpJob = new javax.swing.JLabel();
        lblEmpName = new javax.swing.JLabel();
        lblEmpID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 675));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        btnDelete.setBackground(new java.awt.Color(234, 58, 78));
        btnDelete.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE EMPLOYEE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 620, 80));

        txtEmpName.setEditable(false);
        txtEmpName.setBackground(new java.awt.Color(224, 224, 224));
        txtEmpName.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtEmpName.setText("Employee name");
        jPanel1.add(txtEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 300, 60));

        txtEmpJob.setEditable(false);
        txtEmpJob.setBackground(new java.awt.Color(224, 224, 224));
        txtEmpJob.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtEmpJob.setText("Employee job");
        jPanel1.add(txtEmpJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 300, 60));

        jcEmpId.setBackground(new java.awt.Color(242, 242, 242));
        jcEmpId.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jcEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEmpIdActionPerformed(evt);
            }
        });
        jPanel1.add(jcEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 300, 60));

        lblEmpJob.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblEmpJob.setText("Department");
        jPanel1.add(lblEmpJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 300, 60));

        lblEmpName.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblEmpName.setText("Employee Name");
        jPanel1.add(lblEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 300, 60));

        lblEmpID.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblEmpID.setText("Employee ID");
        jPanel1.add(lblEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 300, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
     //make this an extra function and add a confirm dialog     
    int confirmation=JOptionPane.showConfirmDialog(null, "Do you want to delete this record?", "Delete Confirmation", YES_NO_OPTION);
//     JOptionPane.showConfirmDialog(rootPane, empName, empName, WIDTH, HEIGHT, icon)
    if(confirmation==JOptionPane.YES_OPTION){
        delete();
        new ManageEmployeeFrame().setVisible(true);
        this.dispose();
    }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jcEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEmpIdActionPerformed
        try{
            String empId=jcEmpId.getSelectedItem().toString();
            EmpPojo emp=EmpDao.getEmployeeDetails(empId);
            txtEmpName.setText(emp.getEmpName());
            txtEmpJob.setText(emp.getEmpDept().toUpperCase());
        }
        catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Error In DB"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
        }
    }//GEN-LAST:event_jcEmpIdActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        ManageEmployeeFrame manageEmpFrame=new ManageEmployeeFrame();
        manageEmpFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcEmpId;
    private javax.swing.JLabel lblEmpID;
    private javax.swing.JLabel lblEmpJob;
    private javax.swing.JLabel lblEmpName;
    private javax.swing.JTextField txtEmpJob;
    private javax.swing.JTextField txtEmpName;
    // End of variables declaration//GEN-END:variables

    private void loadEmpId() {
        try{
            List<String>empIdList=EmpDao.getAllemployeeId();
            for(String id:empIdList){
                jcEmpId.addItem(id);
            }
        }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Error In DB"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
        }
    }
    
    private void delete(){      
        try{
          EmpPojo emp=new EmpPojo();
          emp.setEmpId(jcEmpId.getSelectedItem().toString());
          emp.setEmpDept(txtEmpJob.getText());
          emp.setEmpName(empName);
          String empUserID=emp.getEmpId();
          boolean result=EmpDao.deleteEmployee(emp);
          if(result){
              JOptionPane.showMessageDialog(null,"Record deleted successfully!","Success",JOptionPane.INFORMATION_MESSAGE);
              if(UserProfile.getUserId().equalsIgnoreCase(empUserID)){
                  JOptionPane.showMessageDialog(null,"Current user deleted!\nRedirecting to Login screen.","Error",JOptionPane.ERROR_MESSAGE);
                  new LoginFrame().setVisible(true);
                  this.dispose();
              }
              return;
              
          }
          JOptionPane.showMessageDialog(null,"Record not updated!","Failure!",JOptionPane.ERROR_MESSAGE);
      }
      catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Error In DB"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
        }
    }



}
