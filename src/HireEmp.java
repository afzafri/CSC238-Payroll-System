
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class HireEmp extends javax.swing.JFrame {

    public HireEmp() throws FileNotFoundException {
        initComponents();
        

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhoneNo = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtJob = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        butClear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hire Employee");
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID           :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name       :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Address    :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Phone no  :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email        :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Job          :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 110, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hire Employee");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 250, 40));

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 293, 30));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 293, 30));

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 293, 30));

        txtPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNoActionPerformed(evt);
            }
        });
        getContentPane().add(txtPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 293, 30));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 293, 30));

        txtJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJobActionPerformed(evt);
            }
        });
        getContentPane().add(txtJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 293, 30));

        jButton1.setText("Back");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, -1, -1));

        jButton2.setText("Save");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, -1, -1));

        butClear.setText("Clear");
        butClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butClearActionPerformed(evt);
            }
        });
        getContentPane().add(butClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 810, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Choose pilih = new Choose();
       pilih.setVisible(true);
       hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJobActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PrintWriter output = null;
        FileWriter out;
        File info = new File("Info.txt");
        
        try {
            out = new FileWriter(info,true);
            output = new PrintWriter(out);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CalculateSalary.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HireEmp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        output.println(txtID.getText() + ";" + txtName.getText() + ";" + txtAddress.getText() + ";" + txtPhoneNo.getText() + ";" + txtEmail.getText() + ";" + txtJob.getText());
       
        
       
        output.close();
        
        JOptionPane.showMessageDialog (null, "Done");
        
        txtID.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtPhoneNo.setText("");
        txtEmail.setText("");
        txtJob.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void butClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butClearActionPerformed
        txtID.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtPhoneNo.setText("");
        txtEmail.setText("");
        txtJob.setText("");
        
    }//GEN-LAST:event_butClearActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

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
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Choose().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butClear;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtJob;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNo;
    // End of variables declaration//GEN-END:variables
}
