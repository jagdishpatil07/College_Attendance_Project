/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college_attendance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author JAGDISH PATIL
 */
public class studentreg extends javax.swing.JFrame {

    /**
     * Creates new form studentreg
     */
    public studentreg() {
        initComponents();
        autoID();
    }
    
    Connection con;
    PreparedStatement pst;
public void autoID(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/college","root","");
            java.sql.Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select Max(id) from student");
            rs.next();
            rs.getString("Max(id)");
            if(rs.getString("Max(id)")==null){
                txtauto.setText("S001");
            }
            else{
                long id = Long.parseLong(rs.getString("Max(id)").substring(2,rs.getString("Max(id)").length()));
                id++;
                  txtauto.setText("S"+ String.format("%03d", id));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(studentreg.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(studentreg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        txtlname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtdob = new com.toedter.calendar.JDateChooser();
        txtdiv = new javax.swing.JComboBox();
        txtclass = new javax.swing.JComboBox();
        txtauto = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 750));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student Registration");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 240, 40));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("Roll No");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 80, 30));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("First Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 110, 40));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 0));
        jLabel4.setText("Last Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 0));
        jLabel5.setText("Class");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, -1, -1));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 0));
        jLabel6.setText("Division");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, -1, 30));
        jPanel1.add(txtfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 170, 30));
        jPanel1.add(txtlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 170, 30));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 0));
        jLabel7.setText("Gender");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, -1, 20));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 0));
        jLabel8.setText("DOB");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 40, 30));
        jPanel1.add(txtdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 130, 30));

        txtdiv.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C" }));
        txtdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdivActionPerformed(evt);
            }
        });
        jPanel1.add(txtdiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, 50, 30));

        txtclass.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MCA", "BCA", "BBA", "MBA", "IMCA" }));
        txtclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclassActionPerformed(evt);
            }
        });
        jPanel1.add(txtclass, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 100, 30));

        txtauto.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtauto.setForeground(new java.awt.Color(255, 204, 0));
        txtauto.setText("jLabel9");
        jPanel1.add(txtauto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 80, 30));

        r1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        r1.setText("Male");
        jPanel1.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, 80, -1));

        r2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        r2.setText("Female");
        jPanel1.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, 80, -1));

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Georgia", 1, 13)); // NOI18N
        jButton1.setText("Register");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 570, 97, 43));

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setFont(new java.awt.Font("Georgia", 1, 13)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 570, 96, 43));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/college_attendance/College_projec_image/6.jpg"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1000, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdivActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtdivActionPerformed

    private void txtclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclassActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtclassActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String id = txtauto.getText();
         String fname = txtfname.getText();
         String lname = txtlname.getText();
        DateFormat da = new SimpleDateFormat("yyyy-MM-dd");
        String date = da.format(txtdob.getDate());
        
        String cls = txtclass.getSelectedItem().toString().trim(); 
        String divi = txtdiv.getSelectedItem().toString().trim();
        String gender;
        
        if(r1.isSelected())
        {
            gender = "Male";
        }
        else
        {
            gender = "FeMale";
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/college","root","");
            pst = con.prepareStatement("insert into student(id,fname,lname,dob,class,divi,gender)values(?,?,?,?,?,?,?)");
            
            pst.setString(1, id);
            pst.setString(2, fname);
            pst.setString(3, lname);
            pst.setString(4, date);
            pst.setString(5, cls);
            pst.setString(6, divi);
            pst.setString(7, gender);
          
           
            pst.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null,"Registration Successfully.........Thank you!");
            
            
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(studentreg.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(studentreg.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(studentreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentreg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JLabel txtauto;
    private javax.swing.JComboBox txtclass;
    private javax.swing.JComboBox txtdiv;
    private com.toedter.calendar.JDateChooser txtdob;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    // End of variables declaration//GEN-END:variables
}
