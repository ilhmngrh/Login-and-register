/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package miniproject;

/**
 *
 * @author ROG
 */

import java.sql.Connection;
import javax.swing.JOptionPane;
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_submit = new javax.swing.JButton();
        txt_nim = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        btn_cancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel1.setText("NIM");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(66, 86, 77, 16);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(66, 144, 77, 16);

        btn_submit.setBackground(new java.awt.Color(208, 4, 226));
        btn_submit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_submit.setForeground(new java.awt.Color(255, 255, 255));
        btn_submit.setText("Submit");
        btn_submit.setBorderPainted(false);
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_submit);
        btn_submit.setBounds(170, 232, 97, 28);

        txt_nim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nimActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nim);
        txt_nim.setBounds(66, 109, 201, 30);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel3.setText("Register");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(125, 28, 68, 30);
        getContentPane().add(txt_pass);
        txt_pass.setBounds(66, 167, 201, 30);

        btn_cancel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_cancel.setText("Cancel");
        btn_cancel.setBorderPainted(false);
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancel);
        btn_cancel.setBounds(61, 232, 97, 28);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon("E:\\Kuliah koding\\img\\photo-1579546929518-9e396f3cc809.jpeg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(320, 0, 290, 340);

        setSize(new java.awt.Dimension(621, 344));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
            
       try{
       String sql = "INSERT INTO akun VALUES ('"
               +txt_nim.getText()+"','"
               +txt_pass.getText()+ "')";
       
       java.sql.Connection conn = (Connection)Config.configDB();
       java.sql.PreparedStatement pst = conn.prepareStatement(sql);
       pst.execute();
       
       JOptionPane.showMessageDialog(null, "Register Data Berhasil");
       this.setVisible(false);
       new Login().setVisible(true);
           
       }catch (Exception e){
        JOptionPane.showMessageDialog(this, e.getMessage());
       } 
    }//GEN-LAST:event_btn_submitActionPerformed

    private void txt_nimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nimActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btn_cancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_submit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_nim;
    private javax.swing.JPasswordField txt_pass;
    // End of variables declaration//GEN-END:variables
}
