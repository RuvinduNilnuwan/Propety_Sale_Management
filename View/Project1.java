package View;

import Control.DeleteControl;
import Control.EditControl1;
import Control.ProjectControl1;
import Model.DBCon;
import Model.DBSearch;
import Model.DeleteProject;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author pc
 */
public class Project1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form User
     */
    public Project1() {
        initComponents();
        
        String UserRole=Home1.UserRole;
        
        disable(UserRole);
        
        loadTable();
    }

    public void loadTable(){
    ResultSet rs=new DBSearch().searchprojects();
        DefaultTableModel dtm=(DefaultTableModel)tblLand.getModel();
        DefaultTableModel dtm1=(DefaultTableModel)tblEditLand.getModel();
        dtm.setRowCount(0);
        dtm1.setRowCount(0);
        try
        {
            Vector v=null;
            while(rs.next())
            {
                v=new Vector();
                v.add(rs.getString("LandID"));
                v.add(rs.getString("LandLocation"));
                v.add(rs.getString("LandSizeAcres"));
                v.add(rs.getString("LandSizeRoods"));
                v.add(rs.getString("LandSizePerches"));
                v.add(rs.getString("LandCost"));
                v.add(rs.getString("LandEstimatedValue"));
                v.add(rs.getString("NumberOfBlocks"));
                v.add(rs.getString("LandAvailability"));
                dtm.addRow(v);
                dtm1.addRow(v);
            }
             DBCon.closeCon();
            
        }
        catch(Exception k)
        {
            
        }   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        txtCost = new javax.swing.JTextField();
        lblEstValue = new javax.swing.JLabel();
        txtEstValue = new javax.swing.JTextField();
        lblNumBlocks = new javax.swing.JLabel();
        txtNumBlocks = new javax.swing.JTextField();
        lblAvailability = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        lblCost = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox<>();
        lblAcres = new javax.swing.JLabel();
        lblRoods = new javax.swing.JLabel();
        lblPerches = new javax.swing.JLabel();
        txtAcres = new javax.swing.JTextField();
        btnUndo = new javax.swing.JButton();
        txtRoods = new javax.swing.JTextField();
        txtPerches = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLand = new javax.swing.JTable();
        pnlEditProject = new javax.swing.JPanel();
        pnlNewLand1 = new javax.swing.JPanel();
        lblAddLand2 = new javax.swing.JLabel();
        lblLandId2 = new javax.swing.JLabel();
        txtEditLandId = new javax.swing.JTextField();
        lblLocation2 = new javax.swing.JLabel();
        txtEditLocation = new javax.swing.JTextField();
        lblSize2 = new javax.swing.JLabel();
        txtEditCost = new javax.swing.JTextField();
        lblEstValue2 = new javax.swing.JLabel();
        txtEditEstValue = new javax.swing.JTextField();
        lblNumBlocks2 = new javax.swing.JLabel();
        txtEditNumBlocks = new javax.swing.JTextField();
        lblAvailability2 = new javax.swing.JLabel();
        btnAdd2 = new javax.swing.JButton();
        btnUndoProject2 = new javax.swing.JButton();
        lblCost2 = new javax.swing.JLabel();
        cmbEditStatus = new javax.swing.JComboBox<>();
        lblAcres1 = new javax.swing.JLabel();
        txtAcres1 = new javax.swing.JTextField();
        lblRoods1 = new javax.swing.JLabel();
        lblPerches1 = new javax.swing.JLabel();
        txtRoods1 = new javax.swing.JTextField();
        txtPerches1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEditLand = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1316, 609));

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

        lblCost.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCost.setText("Cost");

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        cmbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStatusActionPerformed(evt);
            }
        });

        lblAcres.setText("Acres");

        lblRoods.setText("Roods");

        lblPerches.setText("Perches");

        txtAcres.setText("0");
        txtAcres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAcresMouseClicked(evt);
            }
        });
        txtAcres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcresActionPerformed(evt);
            }
        });

        btnUndo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUndo.setText("Clear");
        btnUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUndoActionPerformed(evt);
            }
        });

        txtRoods.setText("0");
        txtRoods.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRoodsMouseClicked(evt);
            }
        });
        txtRoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoodsActionPerformed(evt);
            }
        });

        txtPerches.setText("0");
        txtPerches.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPerchesMouseClicked(evt);
            }
        });
        txtPerches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerchesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNewLandLayout = new javax.swing.GroupLayout(pnlNewLand);
        pnlNewLand.setLayout(pnlNewLandLayout);
        pnlNewLandLayout.setHorizontalGroup(
            pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNewLandLayout.createSequentialGroup()
                .addGroup(pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNewLandLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlNewLandLayout.createSequentialGroup()
                                .addComponent(lblAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlNewLandLayout.createSequentialGroup()
                                .addComponent(lblCost, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNewLandLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlNewLandLayout.createSequentialGroup()
                                .addComponent(lblSize, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAcres)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlNewLandLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(lblRoods)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPerches)
                                .addGap(19, 19, 19))))
                    .addGroup(pnlNewLandLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(lblAddLand)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlNewLandLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUndo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlNewLandLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAcres, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNumBlocks, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblLandId)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlNewLandLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumBlocks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLandId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlNewLandLayout.createSequentialGroup()
                                .addComponent(txtRoods, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPerches, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNewLandLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblEstValue, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEstValue, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlNewLandLayout.setVerticalGroup(
            pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNewLandLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblAddLand)
                .addGap(18, 18, 18)
                .addGroup(pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLandId)
                    .addComponent(txtLandId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocation)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSize)
                    .addComponent(lblPerches)
                    .addComponent(lblRoods)
                    .addComponent(lblAcres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAcres, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRoods, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPerches, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCost)
                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstValue, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumBlocks, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumBlocks))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAvailability))
                .addGap(22, 22, 22)
                .addGroup(pnlNewLandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUndo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tblLand.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Land ID", "Location", "Acres", "Roods", "Perches", "Cost", "Estimated Value", "Number of Blocks", "Availability"
            }
        ));
        jScrollPane1.setViewportView(tblLand);

        javax.swing.GroupLayout pnlProjectLayout = new javax.swing.GroupLayout(pnlProject);
        pnlProject.setLayout(pnlProjectLayout);
        pnlProjectLayout.setHorizontalGroup(
            pnlProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProjectLayout.createSequentialGroup()
                .addComponent(pnlNewLand, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlProjectLayout.setVerticalGroup(
            pnlProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProjectLayout.createSequentialGroup()
                .addGroup(pnlProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlNewLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlProjectLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        tbpProject.addTab("+New", pnlProject);

        pnlEditProject.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        pnlNewLand1.setPreferredSize(new java.awt.Dimension(384, 471));

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

        btnUndoProject2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUndoProject2.setText("Delete");
        btnUndoProject2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUndoProject2ActionPerformed(evt);
            }
        });

        lblCost2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCost2.setText("Cost");

        cmbEditStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        cmbEditStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEditStatusActionPerformed(evt);
            }
        });

        lblAcres1.setText("Acres");

        txtAcres1.setText("0");
        txtAcres1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcres1ActionPerformed(evt);
            }
        });

        lblRoods1.setText("Roods");

        lblPerches1.setText("Perches");

        txtRoods1.setText("0");
        txtRoods1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoods1ActionPerformed(evt);
            }
        });

        txtPerches1.setText("0");
        txtPerches1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerches1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNewLand1Layout = new javax.swing.GroupLayout(pnlNewLand1);
        pnlNewLand1.setLayout(pnlNewLand1Layout);
        pnlNewLand1Layout.setHorizontalGroup(
            pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNewLand1Layout.createSequentialGroup()
                .addGroup(pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNewLand1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlNewLand1Layout.createSequentialGroup()
                                .addComponent(lblSize2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblAcres1))
                            .addGroup(pnlNewLand1Layout.createSequentialGroup()
                                .addGroup(pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlNewLand1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(lblCost2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAvailability2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNumBlocks2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLandId2)
                                    .addComponent(lblLocation2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlNewLand1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbEditStatus, 0, 193, Short.MAX_VALUE)
                                    .addComponent(txtEditCost)
                                    .addComponent(txtEditLocation)
                                    .addComponent(txtEditLandId)
                                    .addComponent(txtEditNumBlocks, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNewLand1Layout.createSequentialGroup()
                                        .addComponent(btnUndoProject2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8))))
                            .addGroup(pnlNewLand1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(lblRoods1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPerches1))))
                    .addGroup(pnlNewLand1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlNewLand1Layout.createSequentialGroup()
                                .addComponent(lblAddLand2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlNewLand1Layout.createSequentialGroup()
                                .addComponent(txtAcres1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRoods1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPerches1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNewLand1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblEstValue2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEditEstValue, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlNewLand1Layout.setVerticalGroup(
            pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNewLand1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblAddLand2)
                .addGap(18, 18, 18)
                .addGroup(pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLandId2)
                    .addComponent(txtEditLandId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEditLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLocation2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSize2)
                    .addComponent(lblAcres1)
                    .addComponent(lblRoods1)
                    .addComponent(lblPerches1))
                .addGap(18, 18, 18)
                .addGroup(pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAcres1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRoods1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPerches1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEditCost, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCost2))
                .addGap(18, 18, 18)
                .addGroup(pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEditEstValue, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstValue2))
                .addGap(18, 18, 18)
                .addGroup(pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEditNumBlocks, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumBlocks2))
                .addGap(18, 18, 18)
                .addGroup(pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbEditStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAvailability2))
                .addGap(18, 18, 18)
                .addGroup(pnlNewLand1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUndoProject2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 34, Short.MAX_VALUE))
        );

        tblEditLand.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Land ID", "Location", "Acres", "Roods", "Perches", "Cost", "Estimated Value", "Number of Blocks", "Availability"
            }
        ));
        tblEditLand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEditLandDisplayMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblEditLand);

        javax.swing.GroupLayout pnlEditProjectLayout = new javax.swing.GroupLayout(pnlEditProject);
        pnlEditProject.setLayout(pnlEditProjectLayout);
        pnlEditProjectLayout.setHorizontalGroup(
            pnlEditProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditProjectLayout.createSequentialGroup()
                .addComponent(pnlNewLand1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlEditProjectLayout.setVerticalGroup(
            pnlEditProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditProjectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEditProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlNewLand1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                    .addGroup(pnlEditProjectLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        tbpProject.addTab("Update", pnlEditProject);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBaseLayout = new javax.swing.GroupLayout(pnlBase);
        pnlBase.setLayout(pnlBaseLayout);
        pnlBaseLayout.setHorizontalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLandManagement)
                .addGap(471, 471, 471)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbpProject))
        );
        pnlBaseLayout.setVerticalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLandManagement)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbpProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(363, 363, 363))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, 1270, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBase, javax.swing.GroupLayout.PREFERRED_SIZE, 627, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

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
        String SizeAcres= txtAcres.getText().toString();
        String SizeRoods= txtRoods.getText().toString();
        String SizePerches= txtPerches.getText().toString();
        String Cost= txtCost.getText().toString();
        String EstValue= txtEstValue.getText().toString();
        String NoOfBlocks= txtNumBlocks.getText().toString();

        if(ProjectID.isEmpty()||Location.isEmpty()||Cost.isEmpty()||EstValue.isEmpty()||NoOfBlocks.isEmpty()){
            JOptionPane.showMessageDialog(null,"Enter Valid Details.");
        }
        
        else
        {
            String Status = cmbStatus.getSelectedItem().toString();

            ProjectControl1.addProjects1(ProjectID,Location,SizeAcres,SizeRoods,SizePerches,Cost,EstValue,NoOfBlocks,Status);
        }

        loadTable();
    }//GEN-LAST:event_btnAddActionPerformed

    private void cmbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbStatusActionPerformed

    private void txtAcresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAcresActionPerformed

    private void btnUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUndoActionPerformed
        // TODO add your handling code here:
          //To clear fields
        txtLandId.setText("  ");
        txtLocation.setText("  ");
        txtAcres.setText("0");
        txtRoods.setText("0");
        txtPerches.setText("0");
        txtCost.setText("  ");
        txtEstValue.setText("  ");
        txtNumBlocks.setText("  ");
    }//GEN-LAST:event_btnUndoActionPerformed

    private void txtRoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoodsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoodsActionPerformed

    private void txtPerchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerchesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerchesActionPerformed

    private void txtEditLandIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditLandIdActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtEditLandIdActionPerformed

    private void txtEditLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditLocationActionPerformed

    private void txtEditCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditCostActionPerformed

    private void txtEditEstValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditEstValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditEstValueActionPerformed

    private void btnAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd2ActionPerformed
        //Update button events
        String Status = cmbEditStatus.getSelectedItem().toString();

        EditControl1.editProject(txtEditLandId.getText(),txtEditLocation.getText(),txtAcres1.getText(),txtRoods1.getText(),txtPerches1.getText(),txtEditCost.getText(),txtEditEstValue.getText(),txtEditNumBlocks.getText(),Status);

        loadTable();
    }//GEN-LAST:event_btnAdd2ActionPerformed

    private void btnUndoProject2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUndoProject2ActionPerformed
        // TODO add your handling code here:
        String ProjectID=this.txtEditLandId.getText();
        
        if(ProjectID.isEmpty()){
            JOptionPane.showMessageDialog(null, "Select a project");
        }
        else{
            int des = JOptionPane.showConfirmDialog(null,"Selected project and related blocks will be deleted.\n Do you really want to delete this project?","Delete", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(des==0){
                //Delete record
                DeleteControl.deleteProject(txtEditLandId.getText());
            }
        }
        //Clear fields
        txtEditLandId.setText("");
        txtEditLocation.setText("");
        txtAcres1.setText("0");
        txtRoods1.setText("0");
        txtPerches1.setText("0");
        txtEditCost.setText("");
        txtEditEstValue.setText("");
        txtEditNumBlocks.setText("");
        
        loadTable();
    }//GEN-LAST:event_btnUndoProject2ActionPerformed

    private void cmbEditStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEditStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEditStatusActionPerformed

    private void txtAcres1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcres1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAcres1ActionPerformed

    private void txtRoods1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoods1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoods1ActionPerformed

    private void txtPerches1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerches1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerches1ActionPerformed

    private void tblEditLandDisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEditLandDisplayMouseClicked
        // TODO add your handling code here:
         //show selected row data on form
        int i = tblEditLand.getSelectedRow();
        TableModel model=tblEditLand.getModel();
        txtEditLandId.setText(model.getValueAt(i,0).toString());
        txtEditLocation.setText(model.getValueAt(i,1).toString());
        txtAcres1.setText(model.getValueAt(i,2).toString());
        txtRoods1.setText(model.getValueAt(i,3).toString());
        txtPerches1.setText(model.getValueAt(i,4).toString());
        txtEditCost.setText(model.getValueAt(i,5).toString());
        txtEditEstValue.setText(model.getValueAt(i,6).toString());
        txtEditNumBlocks.setText(model.getValueAt(i,7).toString());
        String status=model.getValueAt(i,8).toString();
        switch (status) {
            case "Yes":
            cmbEditStatus.setSelectedIndex(0);
            break;
            case "No":
            cmbEditStatus.setSelectedIndex(1);
            break;
        }
        
        

    }//GEN-LAST:event_tblEditLandDisplayMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAcresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAcresMouseClicked
        // TODO add your handling code here:
        txtAcres.setText("");
    }//GEN-LAST:event_txtAcresMouseClicked

    private void txtRoodsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRoodsMouseClicked
        // TODO add your handling code here:
        txtRoods.setText("");
    }//GEN-LAST:event_txtRoodsMouseClicked

    private void txtPerchesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPerchesMouseClicked
        // TODO add your handling code here:
        txtPerches.setText("");
    }//GEN-LAST:event_txtPerchesMouseClicked
    
    public void disable(String UserRole){
        if(UserRole.equals("User")){
            btnUndoProject2.setEnabled(false);
        }
        else{
            btnUndoProject2.setEnabled(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAdd2;
    private javax.swing.JButton btnUndo;
    private javax.swing.JButton btnUndoProject2;
    private javax.swing.JComboBox<String> cmbEditStatus;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAcres;
    private javax.swing.JLabel lblAcres1;
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
    private javax.swing.JLabel lblPerches;
    private javax.swing.JLabel lblPerches1;
    private javax.swing.JLabel lblRoods;
    private javax.swing.JLabel lblRoods1;
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
    private javax.swing.JTextField txtAcres;
    private javax.swing.JTextField txtAcres1;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtEditCost;
    private javax.swing.JTextField txtEditEstValue;
    private javax.swing.JTextField txtEditLandId;
    private javax.swing.JTextField txtEditLocation;
    private javax.swing.JTextField txtEditNumBlocks;
    private javax.swing.JTextField txtEstValue;
    private javax.swing.JTextField txtLandId;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtNumBlocks;
    private javax.swing.JTextField txtPerches;
    private javax.swing.JTextField txtPerches1;
    private javax.swing.JTextField txtRoods;
    private javax.swing.JTextField txtRoods1;
    // End of variables declaration//GEN-END:variables
}
