/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package careplusapp.gui;

import careplusapp.dao.AppointmentDao;
import careplusapp.dao.PatientDao;
import careplusapp.pojo.AppointmentPojo;
import careplusapp.utility.Sender;
import careplusapp.utility.SmsSender;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author hardi
 */
public class ConfirmAppointmentFrame extends javax.swing.JFrame {
    private AppointmentPojo app;
    private String Mno, DoctorName, PatientName, PatientId;
    public ConfirmAppointmentFrame() {
        UIManager.put( "TextComponent.arc", 10 );
        UIManager.put( "Component.arc", 10 );
        UIManager.put( "CheckBox.arc", 10 );
        UIManager.put( "ProgressBar.arc", 10 );
        FlatMacLightLaf.setup();
        initComponents();         
    }
    public ConfirmAppointmentFrame(AppointmentPojo app){
        this();
        this.app = app;    
        showPatientInfo();
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
        txtPatientName = new javax.swing.JTextField();
        txtAppointmentDate = new javax.swing.JTextField();
        txtPatientId = new javax.swing.JTextField();
        txtOpd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        AddBtn = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        txtPatientName.setEditable(false);
        txtPatientName.setBackground(new java.awt.Color(255, 255, 255));
        txtPatientName.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jPanel1.add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 320, 70));

        txtAppointmentDate.setEditable(false);
        txtAppointmentDate.setBackground(new java.awt.Color(255, 255, 255));
        txtAppointmentDate.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jPanel1.add(txtAppointmentDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 320, 70));

        txtPatientId.setEditable(false);
        txtPatientId.setBackground(new java.awt.Color(255, 255, 255));
        txtPatientId.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jPanel1.add(txtPatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 320, 70));

        txtOpd.setEditable(false);
        txtOpd.setBackground(new java.awt.Color(255, 255, 255));
        txtOpd.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jPanel1.add(txtOpd, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 320, 70));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("Appointment Scheduled");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 300, 50));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Patient Id");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 200, 50));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setText("Patient Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 200, 50));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setText("Opd");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 200, 50));

        jSpinner1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerDateModel());
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 720, 70));

        AddBtn.setBackground(new java.awt.Color(0, 110, 220));
        AddBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("CONFIRM");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        jPanel1.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, 350, 80));

        btnClear.setBackground(new java.awt.Color(208, 208, 208));
        btnClear.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnClear.setText("CANCEL");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 350, 80));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setText("Appointment Date");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 200, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new AppointmentRequestFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        java.util.Date spinnerDate = (java.util.Date) jSpinner1.getValue();
        LocalDateTime ldt = LocalDateTime.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss zzz yyyy");
        LocalDateTime dateTime = LocalDateTime.parse(jSpinner1.getValue().toString(), formatter);

        LocalDateTime currentDateTime = LocalDateTime.now();

        if (!dateTime.isAfter(currentDateTime)) {
            JOptionPane.showMessageDialog(null,"Entered date is not in the future","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Sender send = new SmsSender();
        boolean otpSent = false;
        try {
            otpSent = send.send(Mno, "Hey "+PatientName+",\nYour Appointment is scheduled at "+jSpinner1.getValue().toString()+"by Doctor "+DoctorName);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if(!otpSent){
            try {
                app.setStatus("CONFIRMED");
                app.setAppointmentDate(jSpinner1.getValue().toString());
                AppointmentDao.updateStatus(app);
                PatientDao.updateStatus(PatientId);
            } catch (SQLException ex) {
                Logger.getLogger(ConfirmAppointmentFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
          JOptionPane.showMessageDialog(null, "Appointment Confirmed!");
          new DoctorOptionsFrame().setVisible(true);
          this.dispose();
          return;
        }
    }//GEN-LAST:event_AddBtnActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        new DoctorOptionsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnClearActionPerformed

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
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton btnClear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField txtAppointmentDate;
    private javax.swing.JTextField txtOpd;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    // End of variables declaration//GEN-END:variables

    private void showPatientInfo() {
        txtPatientId.setText(app.getPatientId());
        txtPatientName.setText(app.getPatientName());
        txtOpd.setText(app.getOpd());
        txtAppointmentDate.setText(app.getAppointmentDate());
        PatientName = app.getPatientName();
        DoctorName = app.getDoctorName();
        Mno = app.getMobileNo();
        PatientId = app.getPatientId();
    }


}
