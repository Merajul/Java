package JForms.ListsAndUpdates;

import JForms.Pages.donorPage;
import JForms.Pages.donorPage;
import JForms.Pages.employeePage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nnawa_000
 */
public class donorList extends javax.swing.JFrame {

    /**
     * Creates new form donarList
     */
    public donorList() {
        initComponents();
        try {  
           //  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
           //  Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=lab10;integratedSecurity=true");  
                  Class.forName("oracle.jdbc.driver.OracleDriver");
             Connection connection = DriverManager.getConnection( "jdbc:oracle:thin:@103.66.177.142:1521:orcl\",\"bloodbank\",\"bloodbank123");
            
   
               Statement statement = connection.createStatement();  
               
             ResultSet rs = statement.executeQuery("SELECT DonorID , DonorName ,DonorGender ,DonorAddress ,DonorBloodGroup , DonorArea , DonorPhoneNumber , Eligibility from donor");  
             ResultSetMetaData  rsmetadata = rs.getMetaData(); 
              int  columns = rsmetadata.getColumnCount();   
              DefaultTableModel dtm = new DefaultTableModel(); 
              Vector columns_name=new Vector();
              Vector data_rows=new Vector();
              for(int  i= 1; i < columns+1; i++)  
                {             
                        columns_name.addElement (rsmetadata.getColumnLabel(i));  
                }                 
              
              dtm.setColumnIdentifiers(columns_name);
                   while (rs.next())  
           {  
               data_rows = new Vector(); 
               for (int j = 1; j <columns+1; j++)  
               {  
                   data_rows.addElement(rs.getString(j)) ;
               }  
               dtm.addRow(data_rows);  
               
       }   
          donorTable.setModel(dtm); 
             
         } catch (Exception e) {  
             e.printStackTrace();  
         }
    }
    
    UpdateDonorInfo jtRowData = new UpdateDonorInfo();
    
    public donorList(String value) {
         initComponents();
        try {  
           //  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
           //  Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=lab10;integratedSecurity=true");  
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             Connection connection = DriverManager.getConnection( "jdbc:sqlserver://localhost:1433;user=sa;password=12345;" +
            "databaseName=BloodBank;");
            
   
               Statement statement = connection.createStatement();  
               
             ResultSet rs = statement.executeQuery("SELECT  * from donor where DonorBloodGroup = '"+value+"'"+"or DonorName = '"+value+"'"+"or DonorArea = '"+value+"'"
                                                    +"or Eligibility = '"+value+"'");  
             ResultSetMetaData  rsmetadata = rs.getMetaData(); 
              int  columns = rsmetadata.getColumnCount();   
              DefaultTableModel dtm = new DefaultTableModel(); 
              Vector columns_name=new Vector();
              Vector data_rows=new Vector();
              for(int  i= 1; i < columns+1; i++)  
                {             
                        columns_name.addElement (rsmetadata.getColumnLabel(i));  
                }                 
              
              dtm.setColumnIdentifiers(columns_name);
                   while (rs.next())  
           {  
               data_rows = new Vector(); 
               for (int j = 1; j <columns+1; j++)  
               {  
                   data_rows.addElement(rs.getString(j)) ;
               }  
               dtm.addRow(data_rows);  
               
       }   
          donorTable.setModel(dtm); 
             
         } catch (Exception e) {  
             e.printStackTrace();  
         }
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
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        donorTable = new javax.swing.JTable();
        btn_BACK = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Cambria Math", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DONOR LIST");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(242, 54, 166, 29);

        donorTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        donorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Gender", "Blood Group", "Address", "Area", "Eligibility", "Phone No"
            }
        ));
        jScrollPane1.setViewportView(donorTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(15, 115, 822, 427);

        btn_BACK.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        btn_BACK.setText("BACK");
        btn_BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BACKActionPerformed(evt);
            }
        });
        jPanel1.add(btn_BACK);
        btn_BACK.setBounds(15, 58, 67, 27);

        btn_update.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update);
        btn_update.setBounds(512, 53, 125, 31);

        btn_delete.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_delete);
        btn_delete.setBounds(713, 53, 124, 31);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/list.jpeg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 870, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BACKActionPerformed
        donorPage window;
        window = new donorPage();
        window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_BACKActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        int row = donorTable.getSelectedRow();
        int col = 0;
        Object id = donorTable.getValueAt( row, col );
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             Connection connection = DriverManager.getConnection( "jdbc:sqlserver://localhost:1433;user=sa;password=12345;" +
            "databaseName=BloodBank;");
            
            Statement statement = connection.createStatement();  
            String query="delete from donor where DonorId="+id;
             statement.execute(query);
              JOptionPane.showMessageDialog(null, "Delete Successful!");
              
        }catch (Exception e) {  
             e.printStackTrace();  
         }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
     
      
        
        
        int index = donorTable.getSelectedRow();
        TableModel model = donorTable.getModel();
       
       
         String id = model.getValueAt(index, 0).toString();
          String name = model.getValueAt(index, 1).toString();
         String gender = model.getValueAt(index, 2).toString();
          String address = model.getValueAt(index, 3).toString();
          String bloodgroup = model.getValueAt(index, 4).toString();
         
        String area = model.getValueAt(index, 5).toString();
        String phone = model.getValueAt(index, 6).toString();
        
         jtRowData.setVisible(true);
         jtRowData.pack();
         jtRowData.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         this.setVisible(false);
         
        jtRowData.txt_id.setText(id);
        jtRowData.txt_name.setText(name);
        jtRowData.txt_area.setText(area);
        jtRowData.txt_address.setText(address); 
        jtRowData.txt_gender.setText(gender);
        jtRowData.txt_blood.setText(bloodgroup);
        jtRowData.txt_phone.setText(phone);
               
             
            
    }//GEN-LAST:event_btn_updateActionPerformed

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
            java.util.logging.Logger.getLogger(donorList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(donorList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(donorList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(donorList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new donorList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_BACK;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_update;
    private javax.swing.JTable donorTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}