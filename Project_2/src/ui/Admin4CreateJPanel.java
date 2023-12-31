/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.*;


/**
 *
 * @author HP
 */
public class Admin4CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form Admin4CreateJPanel
     */
    
      JPanel right;
      Admin2List admin2list;
      Admin1Add admin1add;
      Encrypt encrypt;
      
       
    public Admin4CreateJPanel(JPanel right, Admin2List admin2list, Admin1Add admin1add) {
        initComponents();
         
        this.right = right;
        this.admin2list = admin2list;
        this.admin1add = admin1add;
        this.encrypt =  new Encrypt(); 
        
        populateTable();
         
    }
//    private void populateTable(){
//
//         DefaultTableModel dtm=(DefaultTableModel)tblList.getModel();
//         dtm.setRowCount(0);
//         for(Admin1Add admin1add :admin1add .getPersonList()){
//
//             Object[]row = new Object[9];
//             row[0]=admin1add;
//             row[1]=admin1add.getUserId();
//             row[2]=admin1add.getNUID();
//             row[3]=admin1add.getEmailId();
//             row[4]=admin1add.getMobileNumber();
//             row[5]=admin1add.getEnabled();
//             row[6]=admin1add.getUserName();
//             row[7]=admin1add.getPassword();
//              
//             dtm.addRow(row);
//         }} 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        btnCreateUser = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCreate = new javax.swing.JTable();
        lblUserId = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnGo = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Create a new user");

        btnCreateUser.setBackground(new java.awt.Color(255, 102, 51));
        btnCreateUser.setText("Create user");
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 102, 51));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblCreate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "User Id", "NU ID", "Email ID", "Mobile number", "User name", "Password", "Enabled"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCreate);

        lblUserId.setText("User id");

        lblUserName.setText("Username");

        lblPassword.setText("Password");

        txtUserId.setEditable(false);
        txtUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserIdActionPerformed(evt);
            }
        });

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        btnGo.setBackground(new java.awt.Color(255, 102, 51));
        btnGo.setText("Go");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(221, 221, 221)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblUserName)
                                .addComponent(lblPassword)
                                .addComponent(lblUserId))
                            .addGap(89, 89, 89)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUserId)
                                .addComponent(txtUserName)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnBack)
                                    .addGap(455, 455, 455)
                                    .addComponent(btnCreateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(btnGo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserId)
                    .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnGo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        right.remove(this);
        CardLayout layout = (CardLayout) right.getLayout();
        layout.previous(right);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserIdActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        // TODO add your handling code here:
        Admin1Add person=(Admin1Add)tblCreate.getValueAt(tblCreate.getSelectedRow(), 0);

 

              for(Admin1Add p :admin2list.getPersonList()){
                 if(p.getNuId()== person.getNuId())
                 {
                //  person.setUserID( txtUserID.getText());
                // person.setNUID(txtUserNUID.getText());
                 // person.setUsername(txtUserName.getText());

                    person.setUserName(txtUserName.getText());
                    person.setPassword(txtPassword.getText());
                    person.getPasswordlist().add(this.encrypt.encryptPassword(txtPassword.getText()));
                    System.out.println("Encrypted Password : "+person.getPasswordlist());
                    person.setEnable(true);
                    
       JOptionPane.showMessageDialog(this, "User has been created");
       //System.out.println("USername"+person.getUserName());


                populateTable();

 

              txtUserId.setText("");
              txtUserName.setText("");
              txtPassword.setText("");
              

    }                                        
              } 
        
    }//GEN-LAST:event_btnGoActionPerformed

    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
        // TODO add your handling code here:
       int sri = tblCreate.getSelectedRow();
       if (sri < 0)
       {
           JOptionPane.showMessageDialog(this, "Please Select a row to Create");
           return;
       }
    DefaultTableModel model =(DefaultTableModel)tblCreate.getModel();
       Admin1Add sv = (Admin1Add)model.getValueAt(sri, 0);
      
       txtUserId.setText(sv.getUserId());

    }//GEN-LAST:event_btnCreateUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JButton btnGo;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserId;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTable tblCreate;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserId;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void populateTable() 
    {
            
    DefaultTableModel model = (DefaultTableModel)tblCreate.getModel();
    model.setRowCount(0);
    
    for(Admin1Add vs : admin2list.getPersonList())
    {
        Object[] row = new Object[7];
        row[0] = vs;
        row[1] = vs.getNuId();
        row[2] = vs.getEmailId();
        row[3] = vs.getMobileNumber();
        row[4]= vs.getUserName();
        row [5]= vs.getPassword();
        row[6] = vs.getEnable();
        
      
        model.addRow(row);
    }
        

        }
}
