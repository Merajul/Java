package JForms.Pages;

import JForms.InsertInfo.insertDonorInfo;
import JForms.ListsAndUpdates.donorList;
import JForms.SearchPage.DonorSearchPage;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class donorPage extends javax.swing.JFrame {

    /** Creates new form donorPage */
    public donorPage() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        DonorListButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        search_button = new javax.swing.JButton();
        newDonorButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setLayout(null);

        DonorListButton.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        DonorListButton.setText("DONOR LIST");
        DonorListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonorListButtonActionPerformed(evt);
            }
        });
        jPanel1.add(DonorListButton);
        DonorListButton.setBounds(70, 90, 190, 31);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(33, 20, 65, 29);

        search_button.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        search_button.setText("SEARCH");
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(search_button);
        search_button.setBounds(70, 260, 190, 31);

        newDonorButton.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        newDonorButton.setText("NEW DONOR");
        newDonorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newDonorButtonActionPerformed(evt);
            }
        });
        jPanel1.add(newDonorButton);
        newDonorButton.setBounds(70, 180, 190, 31);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/page.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-5, -3, 380, 360);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DonorListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonorListButtonActionPerformed
        JTable jTable1 = null;
        donorList window;
        window = new donorList();
        window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_DonorListButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        derbInfo window;
        window = new derbInfo();
        window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
        // TODO add your handling code here:
        DonorSearchPage window;
        window = new DonorSearchPage();
        window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_search_buttonActionPerformed

    private void newDonorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newDonorButtonActionPerformed
        // TODO add your handling code here:
        insertDonorInfo window;
        window = new insertDonorInfo();
        window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_newDonorButtonActionPerformed

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
            java.util.logging.Logger.getLogger(donorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(donorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(donorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(donorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new donorPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DonorListButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton newDonorButton;
    private javax.swing.JButton search_button;
    // End of variables declaration//GEN-END:variables

}
