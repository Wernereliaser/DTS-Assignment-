/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTS_Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mr Imms
 */
public class TheStudents extends javax.swing.JFrame {

    /**
     * Creates new form TheStudents
     */
    public TheStudents() {
       
       
        initComponents();
         
    }
//   public ArrayList<User> userList(){
//       ArrayList <User> userList = new ArrayList<>();
//         try{
//         String url = "jdbc:derby://localhost:1527/ITSYSTEM";
//        String user = "Imms";
//        String pass = "imms";
//        Connection con = (Connection) DriverManager.getConnection(url, user, pass);
//        
//        String query = "Select * from lecturers";
//        Statement st  = con.createStatement();
//        ResultSet re = st.executeQuery(query);
//        User users;
//   while(re.next()){
//       //String name, String surname, int office, String email, String cellPhone, String status, String freetime, String message
//       users = new User(re.getString("Firstname"),re.getString("Lastname"),re.getInt("officenumber"),re.getString("email"),re.getString("Cellphone"),re.getString("status"),re.getString("Freetime"),re.getString("message"));
//            userList.add(users);
//        }
//   
//          }catch(SQLException e){
//             JOptionPane.showMessageDialog(rootPane, e);   
//                
//                }
//         return userList;
//   }
//   public void showLecturers(){
//       ArrayList<User> list =  userList();
//       DefaultTableModel model = (DefaultTableModel)Datatable.getModel();
//       Object [] row = new Object[8];
//       for (int i = 0; i < list.size(); i++) {
//           row[0] = list.get(i).getName();
//           row[1] =list.get(i).getSurname();
//           row[2] = list.get(i).getOffice();
//           row[3] = list.get(i).getEmail();
//           row[4] = list.get(i).getCellPhone();
//           row[5] = list.get(i).getStatus();
//           row[6] = list.get(i).getFreetime();
//           row[7] = list.get(i).getMessage();
//          model.addRow(row);
//           
//           
//       }
       
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        studentNumberSD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pwdPasswoSD = new javax.swing.JPasswordField();
        studentDLogIn = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(234, 224, 224));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        studentNumberSD.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Student Number");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Password\n");

        pwdPasswoSD.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        pwdPasswoSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdPasswoSDActionPerformed(evt);
            }
        });

        studentDLogIn.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        studentDLogIn.setText("Login");
        studentDLogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentDLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentDLogInActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        clearButton.setText("Clear");
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("StudentDetails");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel1))
                                    .addComponent(studentDLogIn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(clearButton))
                            .addComponent(studentNumberSD, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pwdPasswoSD, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(142, 142, 142))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentNumberSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwdPasswoSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentDLogIn)
                    .addComponent(clearButton))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentDLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentDLogInActionPerformed
        String password = new String(pwdPasswoSD.getPassword());
       
        if (UtilizeUtility.validating(this.studentNumberSD.getText(), password)) {
            JOptionPane.showMessageDialog(rootPane, "____________________\n"
                    + "__Login Successful____\n"
                    + "____________________");
            
//            try{
//         String url = "jdbc:derby://localhost:1527/ITSYSTEM";
//        String user = "Imms";
//        String pass = "imms";
//        Connection con = (Connection) DriverManager.getConnection(url, user, pass);
//        Statement st = con.createStatement();
//        
//        String quer = "select * from lecturers";
//        ResultSet re = st.executeQuery(quer);
//        
//        if(re.next()){
//            
          new LecturerInfor().setVisible(true);  
           dispose(); 
        
        
//            }catch(SQLException e){
//             JOptionPane.showMessageDialog(rootPane, e);   
//                
//                }
            
       
         //new LecturerInfor(firstname, lastname, cellphoneNumber, email, status, freetime, message).setVisible(true);
    }                                         
 else {
            JOptionPane.showMessageDialog(rootPane, "LogIn Incorrect!!");
        }
    }//GEN-LAST:event_studentDLogInActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
studentNumberSD.setText(null);
pwdPasswoSD.setText(null);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void pwdPasswoSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdPasswoSDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdPasswoSDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dispose();
new Menu().setVisible(true);
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
            java.util.logging.Logger.getLogger(TheStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TheStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TheStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TheStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TheStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pwdPasswoSD;
    private javax.swing.JButton studentDLogIn;
    private javax.swing.JTextField studentNumberSD;
    // End of variables declaration//GEN-END:variables
}
