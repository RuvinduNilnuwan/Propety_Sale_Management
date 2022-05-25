/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.addController;
import Control.updateController;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import Control.DeleteControl;
import Model.DBSearch;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class User extends javax.swing.JInternalFrame {

    /**
     * Creates new form User
     */
    public User() {
        initComponents();
        
       
        loadUsers();
        createUserID();
        
        String UserRole=Home1.UserRole;
        String UserID=Home1.UserID;
        System.out.println(UserRole);
        
        disable(UserRole);
        
        txtUserIDEdit.setEditable(false);
        txtUserID.setEditable(false);
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlUserManagement = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAvailableUsers = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlNewUser = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtUserID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbUserRole = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnUserAdd = new javax.swing.JButton();
        btnClearCustomer = new javax.swing.JButton();
        pnlEditUser = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtUserNameEdit = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cmbUserRoleEdit = new javax.swing.JComboBox<>();
        txtUserIDEdit = new javax.swing.JTextField();
        btnUserUpdate = new javax.swing.JButton();
        btnUserRemove = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setMaximumSize(null);
        setPreferredSize(new java.awt.Dimension(1050, 530));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        pnlUserManagement.setBackground(new java.awt.Color(255, 255, 255));
        pnlUserManagement.setMaximumSize(null);
        pnlUserManagement.setPreferredSize(new java.awt.Dimension(1050, 530));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("User Management");

        tblAvailableUsers.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblAvailableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CustomerID", "Name", "Role"
            }
        ));
        tblAvailableUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblAvailableUsers.setGridColor(new java.awt.Color(0, 0, 0));
        tblAvailableUsers.setName("tblCustomer"); // NOI18N
        tblAvailableUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAvailableUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAvailableUsers);

        jTabbedPane1.setBackground(new java.awt.Color(204, 255, 204));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        pnlNewUser.setBackground(new java.awt.Color(255, 255, 255));
        pnlNewUser.setName("pnlAddCustomer"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add A New User");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtUserID.setName("txtUserID"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("User ID : ");

        txtUserName.setName("txtUserName"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Name : ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("User Role :  ");

        cmbUserRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin", " " }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Password :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtUserID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbUserRole, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassword))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbUserRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(23, 23, 23))
        );

        btnUserAdd.setBackground(new java.awt.Color(0, 102, 102));
        btnUserAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUserAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnUserAdd.setText("ADD");
        btnUserAdd.setName("btnUserAdd"); // NOI18N
        btnUserAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserAddActionPerformed(evt);
            }
        });

        btnClearCustomer.setBackground(new java.awt.Color(0, 102, 102));
        btnClearCustomer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClearCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnClearCustomer.setText("CLEAR");
        btnClearCustomer.setName("btnClearCustomer"); // NOI18N
        btnClearCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNewUserLayout = new javax.swing.GroupLayout(pnlNewUser);
        pnlNewUser.setLayout(pnlNewUserLayout);
        pnlNewUserLayout.setHorizontalGroup(
            pnlNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNewUserLayout.createSequentialGroup()
                .addGroup(pnlNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNewUserLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlNewUserLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(pnlNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlNewUserLayout.createSequentialGroup()
                                .addComponent(btnUserAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClearCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        pnlNewUserLayout.setVerticalGroup(
            pnlNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNewUserLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnlNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClearCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUserAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("  +NEW  ", pnlNewUser);

        pnlEditUser.setBackground(new java.awt.Color(255, 255, 255));
        pnlEditUser.setName("pnlAddCustomer"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Edit User");

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("User ID : ");

        txtUserNameEdit.setName("txtUserName"); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Name : ");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("User Role :  ");

        cmbUserRoleEdit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin", " " }));

        txtUserIDEdit.setName("txtUserName"); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUserNameEdit)
                    .addComponent(cmbUserRoleEdit, 0, 248, Short.MAX_VALUE)
                    .addComponent(txtUserIDEdit))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtUserIDEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtUserNameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cmbUserRoleEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btnUserUpdate.setBackground(new java.awt.Color(0, 102, 102));
        btnUserUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUserUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUserUpdate.setText("UPDATE");
        btnUserUpdate.setName("btnCustomerAdd"); // NOI18N
        btnUserUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserUpdateActionPerformed(evt);
            }
        });

        btnUserRemove.setBackground(new java.awt.Color(0, 102, 102));
        btnUserRemove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUserRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnUserRemove.setText("REMOVE");
        btnUserRemove.setName("btnClearCustomer"); // NOI18N
        btnUserRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEditUserLayout = new javax.swing.GroupLayout(pnlEditUser);
        pnlEditUser.setLayout(pnlEditUserLayout);
        pnlEditUserLayout.setHorizontalGroup(
            pnlEditUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditUserLayout.createSequentialGroup()
                .addGroup(pnlEditUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditUserLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEditUserLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(pnlEditUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlEditUserLayout.createSequentialGroup()
                                .addComponent(btnUserUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUserRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        pnlEditUserLayout.setVerticalGroup(
            pnlEditUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditUserLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(pnlEditUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUserRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUserUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("UPDATE", pnlEditUser);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUserManagementLayout = new javax.swing.GroupLayout(pnlUserManagement);
        pnlUserManagement.setLayout(pnlUserManagementLayout);
        pnlUserManagementLayout.setHorizontalGroup(
            pnlUserManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserManagementLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(pnlUserManagementLayout.createSequentialGroup()
                .addGap(402, 402, 402)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        pnlUserManagementLayout.setVerticalGroup(
            pnlUserManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserManagementLayout.createSequentialGroup()
                .addGroup(pnlUserManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserManagementLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1))
                    .addGroup(pnlUserManagementLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addGap(75, 75, 75)
                .addGroup(pnlUserManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlUserManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 1047, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlUserManagement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 150, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblAvailableUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAvailableUsersMouseClicked
        int i = tblAvailableUsers.getSelectedRow();
        TableModel model=tblAvailableUsers.getModel();

        txtUserIDEdit.setText(model.getValueAt(i,0).toString());
        txtUserNameEdit.setText(model.getValueAt(i,1).toString());
        cmbUserRoleEdit.setSelectedItem(model.getValueAt(i,2).toString());
        
    }//GEN-LAST:event_tblAvailableUsersMouseClicked

    private void btnUserAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserAddActionPerformed

        String UserID=this.txtUserID.getText();
        String UserName=this.txtUserName.getText();
        String UserRole=(String)this.cmbUserRole.getSelectedItem();
        String Password=this.txtPassword.getText();

        if(UserID.isEmpty()||UserName.isEmpty()||Password.isEmpty()){

            JOptionPane.showMessageDialog(null, "Enter Valid Details.");
        }
        else{
           try{
                //Add to the DB.
                addController obj=new addController();
                obj.addNewUser(UserID,UserName,UserRole,Password);
                loadUsers();

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"Enter Valid Details.");
                System.out.println("error"+e.toString());

            }

        }

    }//GEN-LAST:event_btnUserAddActionPerformed

    private void btnClearCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearCustomerActionPerformed
        txtUserID.setText("");
        txtUserName.setText("");
        //txtNIC.setText("");

    }//GEN-LAST:event_btnClearCustomerActionPerformed

    private void btnUserUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserUpdateActionPerformed
        String UserID=(String)this.txtUserIDEdit.getText();
        String UserName=this.txtUserNameEdit.getText();
        String UserRole=(String)this.cmbUserRoleEdit.getSelectedItem();

        if(UserID.isEmpty()||UserName.isEmpty()){

            JOptionPane.showMessageDialog(null, "Select a user");
        }
        else{
            try{
                //Add to the DB.
                updateController obj=new updateController();
                obj.updateUser(UserID,UserName,UserRole);
                loadUsers();

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"Enter Valid Details.");
                System.out.println("error"+e.toString());

            }
        }
    }//GEN-LAST:event_btnUserUpdateActionPerformed

    private void btnUserRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserRemoveActionPerformed

         String UserID=(String)this.txtUserIDEdit.getText();
        
        if(UserID.isEmpty()){
            
        }
        else{
            int option=JOptionPane.showConfirmDialog(null, "Do you want to delete this user?", "Delete", JOptionPane.YES_NO_OPTION);

            if(option==0){
                DeleteControl obj=new DeleteControl();
                obj.deleteUser(UserID);
                loadUsers();
            }
            else{
                loadUsers();
            }
        }
        
    }//GEN-LAST:event_btnUserRemoveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearCustomer;
    private javax.swing.JButton btnUserAdd;
    private javax.swing.JButton btnUserRemove;
    private javax.swing.JButton btnUserUpdate;
    private javax.swing.JComboBox<String> cmbUserRole;
    private javax.swing.JComboBox<String> cmbUserRoleEdit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnlEditUser;
    private javax.swing.JPanel pnlNewUser;
    private javax.swing.JPanel pnlUserManagement;
    private javax.swing.JTable tblAvailableUsers;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserID;
    private javax.swing.JTextField txtUserIDEdit;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtUserNameEdit;
    // End of variables declaration//GEN-END:variables

    private void loadUsers() {
        
        DBSearch obj=new DBSearch();
        ResultSet rs=obj.loadAvailableUsers();
        
        DefaultTableModel dtm=(DefaultTableModel)tblAvailableUsers.getModel();
        dtm.setRowCount(0);
        
        Vector v; 
        try{
            while(rs.next()){
                System.out.println("3");
                v=new Vector();
                v.add(rs.getString("UserID"));
                v.add(rs.getString("Name"));
                v.add(rs.getString("UserRole"));
                
                
                dtm.addRow(v);  
            }
        }
        catch(Exception k){
            System.out.println("Error"+k.toString());
        }
    }
    public void disable(String UserRole){
        if(UserRole.equals("User")){
            System.out.println("Equals");
            btnUserRemove.setEnabled(false);
            btnUserAdd.setEnabled(false);
            btnUserUpdate.setEnabled(false);
        }
    }
    public void createUserID(){
        DBSearch obj=new DBSearch();
        ResultSet rs=obj.loadAvailableUsers();
        
        try{
            
            while(rs.next()){
                String UserID=(String)rs.getString("UserID");
                txtUserID.setText(UserID);
                
            }
            
            String UserID = this.txtUserID.getText();
            
            char[] id=UserID.toCharArray();
            String uid="";
            
            for(int x=1;x<UserID.length();x++){
                uid=uid+id[x];
            }
            
            int userid=Integer.parseInt(uid);
            userid++;
            
            uid="U"+Integer.toString(userid);
            
            txtUserID.setText(uid);
        }
        catch(Exception k){
            System.out.println("Error"+k.toString());
        }
        
    }
}

