/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import project.Select;
import java.sql.*;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.sql.*;
import project.*;

/**
 *
 * @author nisyaqanita
 */
public class totalTrue2 extends javax.swing.JFrame {

    /**
     * Creates new form totalTrue2
     */
    
    double fee ;
    String textPaid;
    double feePaid;

    
    
    public totalTrue2(String roomID) {
        initComponents();
        ResultSet rs=Select.getData("select *from booking where roomID='"+roomID+"'");
        
           try
           {
               if(rs.next()){
                   double fees = Double.parseDouble(rs.getString(4));
                   double days = Integer.parseInt(rs.getString(7));
                   fee = fees*days;
                   String fee_text = String.valueOf(fee);
                   
                   emount.setText("RM" + fee_text);
            
                   checkIn.setText(rs.getString(5));
         
                   checkOut.setText(rs.getString(6));
 
               }
           }
           catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
       /* ResultSet rs=Select.getData("select *from room where roomID='"+roomID+"'");
           try
           {
               if(rs.next()){
                   jTextField1.setEditable(false);
                   jTextField2.setText(rs.getString(2));
                   jTextField3.setText(rs.getString(3));
                   jComboBox1.setSelectedItem(rs.getString(4));
                   jTextField4.setText(rs.getString(5));
               }
           }
           catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
            */
        
    }

    private totalTrue2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        emount = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        checkIn = new javax.swing.JLabel();
        checkOut = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        payAmount = new javax.swing.JTextField();
        payNow = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Total:");

        emount.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setText("Booking period: ");

        jLabel4.setText("From");

        jLabel5.setText("To");

        checkIn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N

        checkOut.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel2.setText("Summary");

        jLabel6.setText("Amount to Pay:");

        payAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payAmountActionPerformed(evt);
            }
        });

        payNow.setText("Pay Now");
        payNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payNowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(248, 248, 248))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(emount, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(payAmount, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(checkIn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(45, 45, 45)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkOut, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(payNow)
                        .addGap(34, 34, 34))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emount, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(checkIn, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkOut, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(payAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(payNow)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void payNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payNowActionPerformed
        // TODO add your handling code here:
      
        textPaid = payAmount.getText();
        feePaid = Double.parseDouble(textPaid);
        
        ResultSet rs=Select.getData("select *from booking");
           try
           {
                if(rs.next()){  
                    int response = JOptionPane.showConfirmDialog(this, "Pay now?", "Alert", JOptionPane.YES_NO_OPTION);
                    if (response == JOptionPane.YES_OPTION) {
                        if (fee < feePaid || fee > feePaid)
                            JOptionPane.showMessageDialog(this, "payment unsuccessful\nplease try again");
                        else {
                            JOptionPane.showMessageDialog(this, "payment successful");
                            PreviewBill a = new PreviewBill(fee);
                            a.setVisible(true);
                            
                        }
                    }
                    else if (response == JOptionPane.NO_OPTION) {
                            
                    }
                    
                }
            }
           catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
           }
        
        /*int response = JOptionPane.showConfirmDialog(this, "Pay now?", "Alert", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            
            if (feeString.equalsIgnoreCase(textPaid)){
                JOptionPane.showMessageDialog(this, "payment successful");
                custHome homey = new custHome();
                homey.setVisible(true);
            
                dispose();
            }
            else {
                JOptionPane.showMessageDialog(this, "payment unsuccessful\nplease try again");
                
            
            }
        }
        else if (response == JOptionPane.NO_OPTION) {
            
        }*/
    }//GEN-LAST:event_payNowActionPerformed

    private void payAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payAmountActionPerformed

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
            java.util.logging.Logger.getLogger(totalTrue2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(totalTrue2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(totalTrue2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(totalTrue2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new totalTrue2().setVisible(true);
            }
        });
    }
    
    private javax.swing.JTextField roomId;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel checkIn;
    private javax.swing.JLabel checkOut;
    private javax.swing.JLabel emount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField payAmount;
    private javax.swing.JButton payNow;
    // End of variables declaration//GEN-END:variables
}
