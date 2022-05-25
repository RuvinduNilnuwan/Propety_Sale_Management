/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.DeleteControl;
import Control.EditControl;
import Control.ProjectControl;
import Model.DBCon;
import Model.DBSearch;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author pc
 */
public class Project extends javax.swing.JInternalFrame {

    /**
     * Creates new form User
     */
    public Project() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        lName = new javax.swing.JLabel();
        pnlBase = new javax.swing.JPanel();
        lblLandManagement = new javax.swing.JLabel();
        tbpProject = new javax.swing.JTabbedPane();
        pnlProject = new javax.swing.JPanel();
        pnlNewLand = new javax.swing.JPanel();
        lblAddLand = new javax.swing.JLabel();
        lblLandId = new javax.swing.JLabel();
        txtLandId = new javax.swing.JTextField();
        lblLocation = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        lblSize = new javax.swing.JLabel();
        txtSize = new javax.swing.JTextField();
        txtCost = new javax.swing.JTextField();
        lblEstValue = new javax.swing.JLabel();
        txtEstValue = new javax.swing.JTextField();
        lblNumBlocks = new javax.swing.JLabel();
        txtNumBlocks = new javax.swing.JTextField();
        lblAvailability = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUndo = new javax.swing.JButton();
        lblCost = new javax.swing.JLabel();
        cmbUnit = new javax.swing.JComboBox<>();
        cmbStatus = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLand = new javax.swing.JTable();
        btnTempDis = new javax.swing.JButton();
        pnlEditProject = new javax.swing.JPanel();
        pnlNewLand1 = new javax.swing.JPanel();
        lblAddLand2 = new javax.swing.JLabel();
        lblLandId2 = new javax.swing.JLabel();
        txtEditLandId = new javax.swing.JTextField();
        lblLocation2 = new javax.swing.JLabel();
        txtEditLocation = new javax.swing.JTextField();
        lblSize2 = new javax.swing.JLabel();
        txtEditSize = new javax.swing.JTextField();
        txtEditCost = new javax.swing.JTextField();
        lblEstValue2 = new javax.swing.JLabel();
        txtEditEstValue = new javax.swing.JTextField();
        lblNumBlocks2 = new javax.swing.JLabel();
        txtEditNumBlocks = new javax.swing.JTextField();
        lblAvailability2 = new javax.swing.JLabel();
        btnAdd2 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblCost2 = new javax.swing.JLabel();
        cmbUnit2 = new javax.swing.JComboBox<>();
        cmbEditStatus = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEditLand = new javax.swing.JTable();
        btnTemp = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1316, 609));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lName.setText("Name");

        pnlBase.setPreferredSize(new java.awt.Dimension(985, 582));

        lblLandManagement.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblLandManagement.setText("Manage Project");

        tbpProject.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        pnlProject.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblAddLand.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAddLand.setText("Add A New Project");

        lblLandId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLandId.setText("Project Id");

        lblLocation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLocation.setText("Location");

        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });

        lblSize.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSize.setText("Size");

        txtSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSizeActionPerformed(evt);
            }
        });

        txtCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostActionPerformed(evt);
            }
        });

        lblEstValue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEstValue.setText("Estimated Value");

        txtEstValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstValueActionPerformed(evt);
            }
        });

        lblNumBlocks.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNumBlocks.setText("Number of Blocks");

        lblAvailability.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAvailability.setText("Availability");

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUndo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUndo.setText("Clear");
        btnUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUndoActionPerformed(evt);
            }
        });

        lblCost.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCost.setText("Cost");

        cmbUnit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acres", "Roods", "Perches" }));
        cmbUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUnitActionPerformed(evt);
            }
        });

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        cmbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNewLandLayout = new javax.swing.GroupLayout(pnlNewLand);
        pnlNewLand.setLayout(pnlNewLandLayout);
        pnlNewLandLayout.setHorizontalGroup(
            pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNewLandLayout.createSequentialGroup()
                .addGroup(pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNewLandLayout.createSequentialGroup()
                        .addGroup(pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlNewLandLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLandId)
                                    .addComponent(lblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlNewLandLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblSize, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlNewLandLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblEstValue, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlNewLandLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblNumBlocks, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlNewLandLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlNewLandLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblCost, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)
                        .addGroup(pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlNewLandLayout.createSequentialGroup()
                                .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEstValue, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtLocation)
                                .addComponent(txtLandId)
                                .addComponent(btnUndo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNumBlocks)
                                .addComponent(cmbStatus, 0, 193, Short.MAX_VALUE))))
                    .addGroup(pnlNewLandLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlNewLandLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(lblAddLand)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pnlNewLandLayout.setVerticalGroup(
            pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNewLandLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblAddLand)
                .addGap(18, 18, 18)
                .addGroup(pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLandId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLandId))
                .addGap(18, 18, 18)
                .addGroup(pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLocation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLocation))
                .addGap(18, 18, 18)
                .addGroup(pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSize)
                    .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCost)
                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstValue)
                    .addComponent(txtEstValue, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNumBlocks)
                    .addComponent(txtNumBlocks, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvailability)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUndo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        tblLand.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Land ID", "Location", "Size", "Cost", "Estimated Value", "Number of Blocks", "Availability"
            }
        ));
        jScrollPane1.setViewportView(tblLand);

        btnTempDis.setText("temp");
        btnTempDis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTempDisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlProjectLayout = new javax.swing.GroupLayout(pnlProject);
        pnlProject.setLayout(pnlProjectLayout);
        pnlProjectLayout.setHorizontalGroup(
            pnlProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProjectLayout.createSequentialGroup()
                .addComponent(pnlNewLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProjectLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProjectLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 387, Short.MAX_VALUE)
                        .addComponent(btnTempDis)
                        .addGap(416, 416, 416))))
        );
        pnlProjectLayout.setVerticalGroup(
            pnlProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProjectLayout.createSequentialGroup()
                .addComponent(pnlNewLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlProjectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnTempDis)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbpProject.addTab("+New", pnlProject);

        pnlEditProject.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblAddLand2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAddLand2.setText("Edit A Project");

        lblLandId2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLandId2.setText("Project Id");

        txtEditLandId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditLandIdActionPerformed(evt);
            }
        });

        lblLocation2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLocation2.setText("Location");

        txtEditLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditLocationActionPerformed(evt);
            }
        });

        lblSize2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSize2.setText("Size");

        txtEditSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditSizeActionPerformed(evt);
            }
        });

        txtEditCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditCostActionPerformed(evt);
            }
        });

        lblEstValue2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEstValue2.setText("Estimated Value");

        txtEditEstValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditEstValueActionPerformed(evt);
            }
        });

        lblNumBlocks2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNumBlocks2.setText("Number of Blocks");

        lblAvailability2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAvailability2.setText("Availability");

        btnAdd2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdd2.setText("Update");
        btnAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd2ActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblCost2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCost2.setText("Cost");

        cmbUnit2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acres", "Roods", "Perches" }));
        cmbUnit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUnit2ActionPerformed(evt);
            }
        });

        cmbEditStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        cmbEditStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEditStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNewLand1Layout = new javax.swing.GroupLayout(pnlNewLand1);
        pnlNewLand1.setLayout(pnlNewLand1Layout);
        pnlNewLand1Layout.setHorizontalGroup(
            pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNewLand1Layout.createSequentialGroup()
                .addGroup(pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNewLand1Layout.createSequentialGroup()
                        .addGroup(pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlNewLand1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLandId2)
                                    .addComponent(lblLocation2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlNewLand1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblSize2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlNewLand1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblCost2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlNewLand1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblEstValue2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlNewLand1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblNumBlocks2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlNewLand1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblAvailability2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)
                        .addGroup(pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbEditStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEditCost)
                            .addGroup(pnlNewLand1Layout.createSequentialGroup()
                                .addComponent(txtEditSize, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbUnit2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEditEstValue)
                            .addComponent(txtEditLocation)
                            .addComponent(txtEditLandId)
                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEditNumBlocks, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(pnlNewLand1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlNewLand1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(lblAddLand2)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pnlNewLand1Layout.setVerticalGroup(
            pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNewLand1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblAddLand2)
                .addGap(18, 18, 18)
                .addGroup(pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEditLandId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLandId2))
                .addGap(18, 18, 18)
                .addGroup(pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEditLocation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLocation2))
                .addGap(18, 18, 18)
                .addGroup(pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSize2)
                    .addComponent(txtEditSize, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbUnit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCost2)
                    .addComponent(txtEditCost, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstValue2)
                    .addComponent(txtEditEstValue, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNumBlocks2)
                    .addComponent(txtEditNumBlocks, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvailability2)
                    .addComponent(cmbEditStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        tblEditLand.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Land ID", "Location", "Size", "Cost", "Estimated Value", "Number of Blocks", "Availability"
            }
        ));
        tblEditLand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEditLandDisplayMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblEditLand);

        btnTemp.setText("temp");
        btnTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTempActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEditProjectLayout = new javax.swing.GroupLayout(pnlEditProject);
        pnlEditProject.setLayout(pnlEditProjectLayout);
        pnlEditProjectLayout.setHorizontalGroup(
            pnlEditProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditProjectLayout.createSequentialGroup()
                .addComponent(pnlNewLand1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlEditProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditProjectLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditProjectLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTemp)
                        .addGap(430, 430, 430))))
        );
        pnlEditProjectLayout.setVerticalGroup(
            pnlEditProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditProjectLayout.createSequentialGroup()
                .addComponent(pnlNewLand1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlEditProjectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTemp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbpProject.addTab("Update", pnlEditProject);

        javax.swing.GroupLayout pnlBaseLayout = new javax.swing.GroupLayout(pnlBase);
        pnlBase.setLayout(pnlBaseLayout);
        pnlBaseLayout.setHorizontalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbpProject))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLandManagement)
                .addGap(557, 557, 557))
        );
        pnlBaseLayout.setVerticalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLandManagement)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbpProject, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(389, 389, 389))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(951, Short.MAX_VALUE)
                .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jButton1)
                .addGap(72, 72, 72))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(538, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(pnlBase, javax.swing.GroupLayout.PREFERRED_SIZE, 591, Short.MAX_VALUE)
                    .addContainerGap()))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

    private void txtSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSizeActionPerformed

    private void txtCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostActionPerformed

    private void txtEstValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstValueActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // Get data from fields
        String ProjectID= txtLandId.getText().toString();
        String Location= txtLocation.getText().toString();
        String Size= txtSize.getText().toString();
        String Cost= txtCost.getText().toString();
        String EstValue= txtEstValue.getText().toString();
        String NoOfBlocks= txtNumBlocks.getText().toString();

        if(ProjectID.equals("")){
            JOptionPane.showMessageDialog(null,"Project ID is Mandetory");
        }
        if(Location.equals("")){
            JOptionPane.showMessageDialog(null,"Location is Mandetory");
        }
        if(Size.equals("")){
            JOptionPane.showMessageDialog(null,"Size is Mandetory");
        }
        if(Cost.equals("")){
            JOptionPane.showMessageDialog(null,"Cost is Required");
        }
        if(EstValue.equals("")){
            JOptionPane.showMessageDialog(null,"Estimated Value is Required");
        }
        if(NoOfBlocks.equals("")){
            JOptionPane.showMessageDialog(null,"Number Of Blocks is Mandetory");
        }
        else
        {

            //String Unit = cmbUnit.getSelectedItem().toString();
            String Status = cmbStatus.getSelectedItem().toString();

            ProjectControl.addProjects(txtLandId.getText(),txtLocation.getText(),txtSize.getText(),txtCost.getText(),txtEstValue.getText(),txtNumBlocks.getText(),Status);

        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUndoActionPerformed
        // TODO add your handling code here:
        //To clear fields
        txtLandId.setText("  ");
        txtLocation.setText("  ");
        txtSize.setText("  ");
        txtCost.setText("  ");
        txtEstValue.setText("  ");
        txtNumBlocks.setText("  ");
    }//GEN-LAST:event_btnUndoActionPerformed

    private void cmbUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbUnitActionPerformed

    private void cmbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbStatusActionPerformed

    private void btnTempDisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTempDisActionPerformed
        // TODO add your handling code here:
        //To load existing data to table
        ResultSet rs=new DBSearch().searchprojects();
        DefaultTableModel dtm=(DefaultTableModel)tblLand.getModel();
        dtm.setRowCount(0);
        try
        {
            Vector v=null;
            while(rs.next())
            {
                v=new Vector();
                v.add(rs.getString("LandID"));
                v.add(rs.getString("LandLocation"));
                v.add(rs.getString("LandSize"));
                v.add(rs.getString("LandCost"));
                v.add(rs.getString("LandEstimatedValue"));
                v.add(rs.getString("NumberOfBlocks"));
                v.add(rs.getString("LandAvailability"));
                dtm.addRow(v);

            }
            DBCon.closeCon();

        }
        catch(Exception k)
        {

        }
    }//GEN-LAST:event_btnTempDisActionPerformed

    private void txtEditLandIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditLandIdActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtEditLandIdActionPerformed

    private void txtEditLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditLocationActionPerformed

    private void txtEditSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditSizeActionPerformed

    private void txtEditCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditCostActionPerformed

    private void txtEditEstValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditEstValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditEstValueActionPerformed

    private void btnAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd2ActionPerformed
        //Update button events
        String Status = cmbEditStatus.getSelectedItem().toString();

        EditControl.editProject(txtEditLandId.getText(),txtEditLocation.getText(),txtEditSize.getText(),txtEditCost.getText(),txtEditEstValue.getText(),txtEditNumBlocks.getText(),Status);

    }//GEN-LAST:event_btnAdd2ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String ProjectID=this.txtEditLandId.getText();
        
        if(ProjectID.isEmpty()){
            JOptionPane.showMessageDialog(null, "Select a project");
        }
        else{
            int des = JOptionPane.showConfirmDialog(null,"Are you sure you want to delete this project?","Delete", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(des==0){
                //Delete record
                //DeleteControl.deleteProject(txtEditLandId.getText());
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void cmbUnit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUnit2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbUnit2ActionPerformed

    private void cmbEditStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEditStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEditStatusActionPerformed

    private void tblEditLandDisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEditLandDisplayMouseClicked
        // TODO add your handling code here:
        //show selected row data on form
        int i = tblEditLand.getSelectedRow();
        TableModel model=tblEditLand.getModel();
        txtEditLandId.setText(model.getValueAt(i,0).toString());
        txtEditLocation.setText(model.getValueAt(i,1).toString());
        txtEditSize.setText(model.getValueAt(i,2).toString());
        txtEditCost.setText(model.getValueAt(i,3).toString());
        txtEditEstValue.setText(model.getValueAt(i,4).toString());
        txtEditNumBlocks.setText(model.getValueAt(i,5).toString());
        String status=model.getValueAt(i,6).toString();
        switch (status) {
            case "Yes":
            cmbEditStatus.setSelectedIndex(0);
            break;
            case "No":
            cmbEditStatus.setSelectedIndex(1);
            break;
        }

    }//GEN-LAST:event_tblEditLandDisplayMouseClicked

    private void btnTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTempActionPerformed
        // TODO add your handling code here:
        //To load existing data to table
        ResultSet rs=new DBSearch().searchprojects();
        DefaultTableModel dtm=(DefaultTableModel)tblEditLand.getModel();
        dtm.setRowCount(0);
        try
        {
            Vector v=null;
            while(rs.next())
            {
                v=new Vector();
                v.add(rs.getString("LandID"));
                v.add(rs.getString("LandLocation"));
                v.add(rs.getString("LandSize"));
                v.add(rs.getString("LandCost"));
                v.add(rs.getString("LandEstimatedValue"));
                v.add(rs.getString("NumberOfBlocks"));
                v.add(rs.getString("LandAvailability"));
                dtm.addRow(v);

            }
            DBCon.closeCon();

        }
        catch(Exception k)
        {

        }

    }//GEN-LAST:event_btnTempActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAdd2;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnTemp;
    private javax.swing.JButton btnTempDis;
    private javax.swing.JButton btnUndo;
    private javax.swing.JComboBox<String> cmbEditStatus;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JComboBox<String> cmbUnit;
    private javax.swing.JComboBox<String> cmbUnit2;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lName;
    private javax.swing.JLabel lblAddLand;
    private javax.swing.JLabel lblAddLand2;
    private javax.swing.JLabel lblAvailability;
    private javax.swing.JLabel lblAvailability2;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblCost2;
    private javax.swing.JLabel lblEstValue;
    private javax.swing.JLabel lblEstValue2;
    private javax.swing.JLabel lblLandId;
    private javax.swing.JLabel lblLandId2;
    private javax.swing.JLabel lblLandManagement;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblLocation2;
    private javax.swing.JLabel lblNumBlocks;
    private javax.swing.JLabel lblNumBlocks2;
    private javax.swing.JLabel lblSize;
    private javax.swing.JLabel lblSize2;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JPanel pnlEditProject;
    private javax.swing.JPanel pnlNewLand;
    private javax.swing.JPanel pnlNewLand1;
    private javax.swing.JPanel pnlProject;
    private javax.swing.JTable tblEditLand;
    private javax.swing.JTable tblLand;
    private javax.swing.JTabbedPane tbpProject;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtEditCost;
    private javax.swing.JTextField txtEditEstValue;
    private javax.swing.JTextField txtEditLandId;
    private javax.swing.JTextField txtEditLocation;
    private javax.swing.JTextField txtEditNumBlocks;
    private javax.swing.JTextField txtEditSize;
    private javax.swing.JTextField txtEstValue;
    private javax.swing.JTextField txtLandId;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtNumBlocks;
    private javax.swing.JTextField txtSize;
    // End of variables declaration//GEN-END:variables
}
