/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.*;
/**
 *
 * @author HP
 */
public class UserUpdateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateJPanel
     */JPanel right;
     Admin2List admin2list;
      Admin1Add admin1add;
      Encrypt encrypt;
     
        
    public UserUpdateJPanel(JPanel right, Admin2List admin2List,  Admin1Add admin1add) {
        initComponents();
        this.right = right;
        this.admin2list = admin2List;
         this.admin1add = admin1add;
         this.encrypt =  new Encrypt();
         
         populateTable();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEmailId = new javax.swing.JTextField();
        lblUserName = new javax.swing.JLabel();
        txtMobileNumber = new javax.swing.JTextField();
        lblEmailId = new javax.swing.JLabel();
        lblNuId = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lblMobileNumber = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        txtNuId = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));

        lblUserName.setText("User name");

        lblEmailId.setText("Email id");

        lblNuId.setText("NU id");

        btnSave.setBackground(new java.awt.Color(255, 102, 51));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblMobileNumber.setText("Mobile number");

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Update User details");

        lblPassword.setText("Password");

        btnBack.setBackground(new java.awt.Color(255, 102, 51));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        txtNuId.setEditable(false);
        txtNuId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblEmailId)
                        .addComponent(lblPassword)
                        .addComponent(lblNuId, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblUserName)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addComponent(lblMobileNumber))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(btnSave))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUserName)
                                .addComponent(txtEmailId)
                                .addComponent(txtMobileNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                .addComponent(txtPassword)
                                .addComponent(txtNuId)))))
                .addGap(245, 245, 245))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblEmailId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblNuId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtNuId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblMobileNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(124, 124, 124))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

//          Admin1Add person=(Admin1Add)tblUpdate.getValueAt(tblUpdate.getSelectedRow(), 0);
//
// 
//
//              for(Admin1Add p :admin2list.getPersonList()){
//                 if(p.getNuId()== person.getNuId())
//                 {
//                //  person.setUserID( txtUserID.getText());
//                // person.setNUID(txtUserNUID.getText());
//                 // person.setUsername(txtUserName.getText());
//
                    admin1add.setUserName(txtUserName.getText());
//                    admin1add.setPassword(txtPassword.getText());
//                    admin1add.getPasswordlist().add(this.encrypt.encryptPassword(txtPassword.getText()));
//                   System.out.println("Encrypted Password : "+admin1add.getPasswordlist());
                   
                    admin1add.setEmailId(txtEmailId.getText());
                    admin1add.setMobileNumber(txtMobileNumber.getText());
                    
                    
                if((!(admin1add.getPasswordlist().get(admin1add.getPasswordlist().size()-1).equals(this.encrypt.encryptPassword(txtPassword.getText())))) && (!txtPassword.getText().equals("")))
                {
                admin1add.setPassword(txtPassword.getText());
                admin1add.getPasswordlist().add(this.encrypt.encryptPassword(txtPassword.getText()));
                System.out.println("Encrypted Password : "+admin1add.getPasswordlist());
                JOptionPane.showMessageDialog(this, "Your details have been updated"); 
                return;
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Please use different password");
                }
                //JOptionPane.showMessageDialog(this, "User details has been updated");   
                    
       
//                 
//                    
                  
//       System.out.println("USername"+person.getUserName());
//
//
//                populateTable();
//
// 
//              txtUserName.setText("");
//              txtPassword.setText("");
//              txtNuId.setText("");
//              txtMobileNumber.setText("");
//              
//              
//
//    }                                        
//              }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         right.remove(this);
        CardLayout layout = (CardLayout) right.getLayout();
        layout.previous(right);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtNuIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuIdActionPerformed


    
    
    private void populateTable() 
    {
        txtUserName.setText(admin1add.getUserName());
//        txtPassword.setText(admin1add.getPassword());
        txtEmailId.setText(admin1add.getEmailId());
        txtMobileNumber.setText(admin1add.getMobileNumber());
        txtNuId.setText(admin1add.getNuId());
    
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEmailId;
    private javax.swing.JLabel lblMobileNumber;
    private javax.swing.JLabel lblNuId;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtNuId;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
