/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;



/**
 *
 * @author pc
 */
public class Home extends javax.swing.JFrame {

  
    public Home() {
        initComponents();
        dt();
        times(); 
        //setSize(1250,650);
        setResizable(false);
         nonactive();
    }
    
    //slider bar
    public void nonactive(){
         menuPanel.setVisible(false);
         menuPanel.setEnabled(false);
         
         menu.setVisible(true);
         menu.setEnabled(true);
    }
    
     public void active(){
         menuPanel.setVisible(true);
         menuPanel.setEnabled(true);
         
         menu.setVisible(false);
         menu.setEnabled(false);
    }
     ///
     
    
    public Home(String Uname) {
        initComponents();
        dt();
        times();
        
    }

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
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homePanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        btnCustomerManagement = new javax.swing.JButton();
        btnLandManagement = new javax.swing.JButton();
        btnBillingSystem = new javax.swing.JButton();
        btnUserManagement = new javax.swing.JButton();
        menu2 = new javax.swing.JLabel();
        dateTimePanel = new javax.swing.JPanel();
        l_time = new javax.swing.JLabel();
        l_date = new javax.swing.JLabel();
        menu = new javax.swing.JLabel();
        copyrightLable = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        homePanel.setBackground(new java.awt.Color(255, 255, 255));
        homePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPanel.setBackground(new java.awt.Color(0, 102, 102));
        menuPanel.setPreferredSize(new java.awt.Dimension(260, 680));
        menuPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPanelMouseClicked(evt);
            }
        });

        btnCustomerManagement.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCustomerManagement.setText("Custome");
        btnCustomerManagement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomerManagementMouseClicked(evt);
            }
        });
        btnCustomerManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerManagementActionPerformed(evt);
            }
        });

        btnLandManagement.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLandManagement.setText("Project");
        btnLandManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLandManagementActionPerformed(evt);
            }
        });

        btnBillingSystem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBillingSystem.setText("Account");
        btnBillingSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBillingSystemActionPerformed(evt);
            }
        });

        btnUserManagement.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUserManagement.setText("User ");
        btnUserManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserManagementActionPerformed(evt);
            }
        });

        menu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Scroll_Up_35px_1.png"))); // NOI18N
        menu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCustomerManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBillingSystem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUserManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLandManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(menu2)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(menu2)
                .addGap(81, 81, 81)
                .addComponent(btnCustomerManagement)
                .addGap(35, 35, 35)
                .addComponent(btnUserManagement)
                .addGap(36, 36, 36)
                .addComponent(btnLandManagement)
                .addGap(29, 29, 29)
                .addComponent(btnBillingSystem)
                .addContainerGap(255, Short.MAX_VALUE))
        );

        homePanel.add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 260, 600));

        dateTimePanel.setBackground(new java.awt.Color(0, 51, 51));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dateTimePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(l_date, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(l_time, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        homePanel.add(dateTimePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 80));

        copyrightLable.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        copyrightLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        copyrightLable.setText("@ Copyright 2021 sj_property All Right Reserverd - iZUUS Tech");
        homePanel.add(copyrightLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 660, 1040, 20));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 153, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Land Sale");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(317, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        homePanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 1040, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCustomerManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerManagementActionPerformed
        //jTabbedPane1.setSelectedIndex(0); //call to jTabblePanel
    }//GEN-LAST:event_btnCustomerManagementActionPerformed

    private void btnLandManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLandManagementActionPerformed
        //jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btnLandManagementActionPerformed

    private void btnBillingSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBillingSystemActionPerformed
       // jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_btnBillingSystemActionPerformed

    private void btnUserManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserManagementActionPerformed
        //jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_btnUserManagementActionPerformed

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        active();
    }//GEN-LAST:event_menuMouseClicked

    private void menu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu2MouseClicked
        nonactive();
    }//GEN-LAST:event_menu2MouseClicked

    private void menuPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPanelMouseClicked
        nonactive();
    }//GEN-LAST:event_menuPanelMouseClicked

    private void btnCustomerManagementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerManagementMouseClicked
        // TODO add your handling code here:
         nonactive();
    }//GEN-LAST:event_btnCustomerManagementMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBillingSystem;
    private javax.swing.JButton btnCustomerManagement;
    private javax.swing.JButton btnLandManagement;
    private javax.swing.JButton btnUserManagement;
    private javax.swing.JLabel copyrightLable;
    private javax.swing.JPanel dateTimePanel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l_date;
    private javax.swing.JLabel l_time;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel menu2;
    private javax.swing.JPanel menuPanel;
    // End of variables declaration//GEN-END:variables

   
}
