/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JForms.ListsAndUpdates;

import JForms.Pages.donorPage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class UpdateRecipientList extends javax.swing.JFrame {

    /**
     * Creates new form UpdateDonorInfo
     */
    public UpdateRecipientList() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_area = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        txt_gender = new javax.swing.JTextField();
        txt_blood = new javax.swing.JTextField();
        txt_phone = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_age = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_Dno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAME:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(36, 122, 145, 22);

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("AREA:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(36, 161, 145, 22);

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(36, 213, 145, 22);

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Gender");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(36, 259, 145, 22);

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("BLOOD GROUP:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(36, 305, 145, 22);

        jLabel7.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("PHONE:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(36, 351, 145, 22);

        txt_id.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jPanel1.add(txt_id);
        txt_id.setBounds(333, 73, 206, 28);

        txt_name.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jPanel1.add(txt_name);
        txt_name.setBounds(333, 119, 206, 28);

        txt_area.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jPanel1.add(txt_area);
        txt_area.setBounds(333, 158, 206, 28);

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID: ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(36, 76, 145, 22);

        txt_address.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jPanel1.add(txt_address);
        txt_address.setBounds(333, 210, 206, 28);

        txt_gender.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jPanel1.add(txt_gender);
        txt_gender.setBounds(333, 256, 206, 28);

        txt_blood.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jPanel1.add(txt_blood);
        txt_blood.setBounds(333, 302, 206, 28);

        txt_phone.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jPanel1.add(txt_phone);
        txt_phone.setBounds(333, 348, 206, 28);

        jButton1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(36, 520, 93, 31);

        btn_update.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update);
        btn_update.setBounds(333, 520, 206, 31);

        jLabel8.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Age:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(36, 397, 37, 22);

        txt_age.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jPanel1.add(txt_age);
        txt_age.setBounds(333, 394, 206, 28);

        jLabel9.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Donation Number:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(36, 454, 224, 22);

        txt_Dno.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jPanel1.add(txt_Dno);
        txt_Dno.setBounds(333, 451, 206, 28);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.jpg"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 0, 570, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        try{
            
            /*RecipientID int identity(2000,1) not null primary key,
      RecipientName varchar(100),
      RecipientAge int,
      RecipientGender varchar(10),
      RecipientBloodGroup varchar(10),
      RecipientAddress varchar(2000),
      RecipientArea varchar(500),
      RecipientPhoneNumber int,
      DonationNumber int foreign key references DonationDetails(DonationNumber)*/
            
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             Connection connection = DriverManager.getConnection( "jdbc:sqlserver://localhost:1433;user=sa;password=12345;" +
            "databaseName=BloodBank;");
            
            Statement statement = connection.createStatement();  
            String ID = txt_id.getText().toString();
            int iDnumber = Integer.parseInt(ID);
            String phoneNumber = txt_phone.getText().toString();
            int PhoneNum = Integer.parseInt(phoneNumber);
            //String query= "update donor set DonorName='"+txt_name.getText().toString()+"',DonorArea='"+txt_area.getText().toString()+"', DonorAddress='"+txt_address.getText().toString()+"', DonorGender= '"+txt_gender.getText().toString()+"' ,DonorBloodGroup='"+txt_blood.getText().toString()+"',DonorPhoneNumber="+PhoneNum+" where DonorID="+iDnumber;
            String query1="update Recipient set RecipientName='"+txt_name.getText().toString()+"',RecipientAge='"+txt_age.getText().toString()+"',RecipientArea='"+txt_area.getText().toString()+"', RecipientAddress='"+txt_address.getText().toString()+"', RecipientGender= '"+txt_gender.getText().toString()+"' ,RecipientBloodGroup='"+txt_blood.getText().toString()+"',RecipientPhoneNumber='"+phoneNumber+"' where RecipientID ='"+ID+"';";
            statement.execute(query1);
            JOptionPane.showMessageDialog(null, "Update Successful!");
              
              recipientList window;
              window = new recipientList();
             window.setVisible(true);
             this.setVisible(false);
              
        }catch (Exception e) {  
             e.printStackTrace();
             JOptionPane.showMessageDialog(null, "exception");
         }
        
        
    }//GEN-LAST:event_btn_updateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        donorList window;
        window = new donorList();
        window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateRecipientList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateRecipientList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateRecipientList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateRecipientList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateRecipientList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_update;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txt_Dno;
    public javax.swing.JTextField txt_address;
    public javax.swing.JTextField txt_age;
    public javax.swing.JTextField txt_area;
    public javax.swing.JTextField txt_blood;
    public javax.swing.JTextField txt_gender;
    public javax.swing.JTextField txt_id;
    public javax.swing.JTextField txt_name;
    public javax.swing.JTextField txt_phone;
    // End of variables declaration//GEN-END:variables
}