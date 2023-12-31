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
public class Admin3SearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form Admin3SearchJPanel
     */
    JPanel right;

    Admin2List admin2list;
    
      
    public Admin3SearchJPanel(JPanel right, Admin2List admin2list) {
        initComponents();
         this.right = right;
        this.admin2list = admin2list;
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

        jLabel1 = new javax.swing.JLabel();
        btnGo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtsrch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsearch = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Search for a person");

        btnGo.setBackground(new java.awt.Color(255, 102, 51));
        btnGo.setText("Go");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });

        jLabel2.setText("Search by NUID");

        tblsearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "User Id", "NU ID", "Email ID", "Mobile number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblsearch);
        if (tblsearch.getColumnModel().getColumnCount() > 0) {
            tblsearch.getColumnModel().getColumn(0).setResizable(false);
            tblsearch.getColumnModel().getColumn(1).setResizable(false);
            tblsearch.getColumnModel().getColumn(2).setResizable(false);
            tblsearch.getColumnModel().getColumn(3).setResizable(false);
        }

        btnBack.setBackground(new java.awt.Color(255, 102, 51));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 102, 51));
        jButton1.setText("Show All");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnBack)
                        .addGap(88, 88, 88)
                        .addComponent(jLabel2)
                        .addGap(116, 116, 116)
                        .addComponent(txtsrch, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1)
                            .addComponent(btnGo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(308, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtsrch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnGo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jButton1)
                .addGap(156, 156, 156))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        // TODO add your handling code here:
        
        if(txtsrch.getText().equals(""))
        {
                 JOptionPane.showMessageDialog(null, "Please enter NUID");
                 return;
            }
        if(!(txtsrch.getText().chars().allMatch(Character::isDigit))){
                JOptionPane.showMessageDialog(null, "NUID should only be digits!");
                return;
            }
        
        
        
        

        Admin1Add searchResult = admin2list.searchAccount(txtsrch.getText());
        if(searchResult == null){
            JOptionPane.showMessageDialog(null, "NEU ID you entered doesn't exist!", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else{
            DefaultTableModel model = (DefaultTableModel) tblsearch.getModel();
            model.setRowCount(0);
            Object[] row = new Object[4];
            //row[0] = searchResult;
            row[0] = searchResult.getUserId();
            row[1] = searchResult.getNuId();            
            row[2] = searchResult.getEmailId();
            row[3] = searchResult.getMobileNumber();
            //row[4] = "user"; // handle enable functionality

            model.addRow(row);
}
    }//GEN-LAST:event_btnGoActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        right.remove(this);
        CardLayout layout = (CardLayout) right.getLayout();
        layout.previous(right);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblsearch;
    private javax.swing.JTextField txtsrch;
    // End of variables declaration//GEN-END:variables

private void populateTable() {
        
    DefaultTableModel model = (DefaultTableModel) tblsearch.getModel();
    model.setRowCount(0);
    
    for(Admin1Add vs : admin2list.getPersonList()){
        Object[] row = new Object[4];
        //row[0] = vs;
        row[0] = vs.getUserId();
        row[1] = vs.getNuId();
        row[2] = vs.getEmailId();
        row[3] = vs.getMobileNumber();
        
       model.addRow(row);
        
      }
    
    }

}
