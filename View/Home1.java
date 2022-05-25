/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.DeleteControl;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;



/**
 *
 * @author pc
 */
public class Home1 extends javax.swing.JFrame {

  public static String UserName;
  public static String UserID;
  public static String UserRole;

  
    public Home1() {
        initComponents();
        
        
        dt();
        times(); 
        //setResizable(false);
        
    }
      public Home1(String UserName, String UserID,String UserRole) {
        initComponents();
        
        dt();
        times();
        lblName.setText("Welcome "+ UserName);
       
        
        Home1.UserName=UserName;
        Home1.UserID=UserID;
        Home1.UserRole=UserRole;
        
        if(UserRole.equals("User")){
            lblPrevilage.setText("User Panel");
        }
        else{
            lblPrevilage.setText("Admin Panel");
        }
        
        active();
        
        
       
    }
  
    
    //slider bar
    public void nonactive(){
         menuPanel.setVisible(false);
         menuPanel.setEnabled(false);
         
         menu.setVisible(true);
         menu.setEnabled(true);
         
         menu2.setVisible(false);
         menu2.setEnabled(false);
         
    }
    
     public void active(){
         menuPanel.setVisible(true);
         menuPanel.setEnabled(true);
         
         menu.setVisible(false);
         menu.setEnabled(false);
         
         menu2.setVisible(true);
         menu2.setEnabled(true);
         
    }
     ///
    

    //for create current date
    public void dt(){
        
     Date d = new Date();
     SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MMM-dd");
        String dd = sdf.format(d);
        l_date.setText(dd);
    }
    
    //time
     Timer t;
     SimpleDateFormat st;
     
    public void times(){
      
       t = new Timer(0,new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
             Date dt = new Date();
             st= new SimpleDateFormat("hh:mm:ss a");
             
             String tt= st.format(dt);
             l_time.setText(tt);
           
           }
        });
       t.start();
        
    }
    
    
    
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homePanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        menu2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnBlockManagement = new javax.swing.JButton();
        btnProjectManagement = new javax.swing.JButton();
        btnUserManagement = new javax.swing.JButton();
        btnCustomerrManagement = new javax.swing.JButton();
        lblPrevilage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnTransactionManagement1 = new javax.swing.JButton();
        sldmng1 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        dateTimePanel = new javax.swing.JPanel();
        l_time = new javax.swing.JLabel();
        l_date = new javax.swing.JLabel();
        menu = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jDesktopPane = new javax.swing.JDesktopPane();
        copyrightLable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMaximumSize(null);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setSize(new java.awt.Dimension(1920, 1080));

        homePanel.setBackground(new java.awt.Color(255, 255, 255));
        homePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPanel.setBackground(new java.awt.Color(0, 173, 153));
        menuPanel.setPreferredSize(new java.awt.Dimension(260, 680));
        menuPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPanelMouseClicked(evt);
            }
        });

        menu2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        menu2.setForeground(new java.awt.Color(255, 255, 255));
        menu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu2.setText("X");
        menu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu2MouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("Log Out");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnBlockManagement.setBackground(new java.awt.Color(204, 204, 204));
        btnBlockManagement.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBlockManagement.setForeground(new java.awt.Color(0, 102, 102));
        btnBlockManagement.setText("Block Management");
        btnBlockManagement.setBorder(null);
        btnBlockManagement.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBlockManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlockManagementActionPerformed(evt);
            }
        });

        btnProjectManagement.setBackground(new java.awt.Color(204, 204, 204));
        btnProjectManagement.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnProjectManagement.setForeground(new java.awt.Color(0, 102, 102));
        btnProjectManagement.setText("Project Management");
        btnProjectManagement.setBorder(null);
        btnProjectManagement.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProjectManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProjectManagementActionPerformed(evt);
            }
        });

        btnUserManagement.setBackground(new java.awt.Color(204, 204, 204));
        btnUserManagement.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUserManagement.setForeground(new java.awt.Color(0, 102, 102));
        btnUserManagement.setText("User Management");
        btnUserManagement.setBorder(null);
        btnUserManagement.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUserManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserManagementActionPerformed(evt);
            }
        });

        btnCustomerrManagement.setBackground(new java.awt.Color(204, 204, 204));
        btnCustomerrManagement.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCustomerrManagement.setForeground(new java.awt.Color(0, 102, 102));
        btnCustomerrManagement.setText("Customer Management");
        btnCustomerrManagement.setBorder(null);
        btnCustomerrManagement.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCustomerrManagement.setMaximumSize(null);
        btnCustomerrManagement.setMinimumSize(null);
        btnCustomerrManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerrManagementActionPerformed(evt);
            }
        });

        lblPrevilage.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblPrevilage.setForeground(new java.awt.Color(255, 255, 255));
        lblPrevilage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrevilage.setText("Applications");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/billicon.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setPreferredSize(new java.awt.Dimension(130, 120));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/customericon.png"))); // NOI18N
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setPreferredSize(new java.awt.Dimension(40, 20));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/landiconn.png"))); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setPreferredSize(new java.awt.Dimension(130, 120));

        btnTransactionManagement1.setBackground(new java.awt.Color(204, 204, 204));
        btnTransactionManagement1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTransactionManagement1.setForeground(new java.awt.Color(0, 102, 102));
        btnTransactionManagement1.setText("Transaction Management");
        btnTransactionManagement1.setBorder(null);
        btnTransactionManagement1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransactionManagement1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransactionManagement1ActionPerformed(evt);
            }
        });

        sldmng1.setBackground(new java.awt.Color(204, 204, 204));
        sldmng1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sldmng1.setForeground(new java.awt.Color(0, 102, 102));
        sldmng1.setText("Sold Blocks");
        sldmng1.setBorder(null);
        sldmng1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sldmng1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sldmng1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPrevilage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4)
                    .addComponent(jSeparator1)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menuPanelLayout.createSequentialGroup()
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnProjectManagement, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBlockManagement, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCustomerrManagement, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUserManagement, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(sldmng1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTransactionManagement1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3))
                .addContainerGap())
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addComponent(menu2)
                .addGap(11, 11, 11)
                .addComponent(lblPrevilage)
                .addGap(14, 14, 14)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addComponent(btnCustomerrManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUserManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addComponent(btnProjectManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnBlockManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addComponent(btnTransactionManagement1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sldmng1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        homePanel.add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 450, 940));

        dateTimePanel.setBackground(new java.awt.Color(0, 102, 102));

        l_time.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_time.setForeground(new java.awt.Color(204, 255, 255));
        l_time.setText("0");

        l_date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_date.setForeground(new java.awt.Color(204, 255, 255));
        l_date.setText("0");

        menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Menu_40px.png"))); // NOI18N
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout dateTimePanelLayout = new javax.swing.GroupLayout(dateTimePanel);
        dateTimePanel.setLayout(dateTimePanelLayout);
        dateTimePanelLayout.setHorizontalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dateTimePanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_date, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_time, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );
        dateTimePanelLayout.setVerticalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dateTimePanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(l_date, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(l_time, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dateTimePanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );

        homePanel.add(dateTimePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 80));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(" SJ Property");

        lblName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Username");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(317, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 528, Short.MAX_VALUE)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName)))
        );

        homePanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 1750, 80));

        jDesktopPane.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane.setMaximumSize(null);

        copyrightLable.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        copyrightLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        copyrightLable.setText("@ Copyright 2021 sj_property All Right Reserverd - iZUUS Tech");

        jDesktopPane.setLayer(copyrightLable, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPaneLayout.createSequentialGroup()
                .addContainerGap(851, Short.MAX_VALUE)
                .addComponent(copyrightLable, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPaneLayout.createSequentialGroup()
                .addContainerGap(915, Short.MAX_VALUE)
                .addComponent(copyrightLable, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        homePanel.add(jDesktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 2010, 940));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 2214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        active();
    }//GEN-LAST:event_menuMouseClicked

    private void menu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu2MouseClicked
        nonactive();
    }//GEN-LAST:event_menu2MouseClicked

    private void menuPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPanelMouseClicked
        //nonactive();
    }//GEN-LAST:event_menuPanelMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int option=JOptionPane.showConfirmDialog(null, "Do you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);

            if(option==0){                
                dispose();
                Login log = new Login();
                log.show();
            }
            else{
                
            }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBlockManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlockManagementActionPerformed
        nonactive();
        jDesktopPane.removeAll();
        jDesktopPane.repaint();

        Block1 blockk = new Block1();
        jDesktopPane.add(blockk);
        blockk.setVisible(true);
    }//GEN-LAST:event_btnBlockManagementActionPerformed

    private void btnProjectManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProjectManagementActionPerformed
        nonactive();
          jDesktopPane.removeAll();
          jDesktopPane.repaint();
         
          Project1 pro = new Project1();
          jDesktopPane.add(pro);
          pro.setVisible(true);
    }//GEN-LAST:event_btnProjectManagementActionPerformed

    private void btnUserManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserManagementActionPerformed
        nonactive();
         jDesktopPane.removeAll();
         jDesktopPane.repaint();
         
         User user = new User();
         jDesktopPane.add(user);
         user.setVisible(true);
    }//GEN-LAST:event_btnUserManagementActionPerformed

    private void btnCustomerrManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerrManagementActionPerformed
        nonactive();
        jDesktopPane.removeAll();
        jDesktopPane.repaint();
        
        Customer cus = new Customer();
        jDesktopPane.add(cus);
        cus.setVisible(true);
    }//GEN-LAST:event_btnCustomerrManagementActionPerformed

    private void btnTransactionManagement1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransactionManagement1ActionPerformed
        // TODO add your handling code here:
        nonactive();
        jDesktopPane.removeAll();
        jDesktopPane.repaint();
        
        Transactions trans = new Transactions();
        jDesktopPane.add(trans);
        trans.setVisible(true);
    }//GEN-LAST:event_btnTransactionManagement1ActionPerformed

    private void sldmng1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sldmng1ActionPerformed
        // TODO add your handling code here:
        nonactive();
        jDesktopPane.removeAll();
        jDesktopPane.repaint();
        
        soldbl sl = new soldbl();
        jDesktopPane.add(sl);
        sl.setVisible(true);
    }//GEN-LAST:event_sldmng1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBlockManagement;
    private javax.swing.JButton btnCustomerrManagement;
    private javax.swing.JButton btnProjectManagement;
    private javax.swing.JButton btnTransactionManagement1;
    private javax.swing.JButton btnUserManagement;
    private javax.swing.JLabel copyrightLable;
    private javax.swing.JPanel dateTimePanel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel l_date;
    private javax.swing.JLabel l_time;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrevilage;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel menu2;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton sldmng1;
    // End of variables declaration//GEN-END:variables

   
   
}
