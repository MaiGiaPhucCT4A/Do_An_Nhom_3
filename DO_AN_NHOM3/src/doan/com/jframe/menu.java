/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan.com.jframe;

import javax.swing.ImageIcon;

/**
 *
 * @author LaptopDT
 */
public class menu extends javax.swing.JFrame {

    private QuanLySVPanel qlsPanel;

    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButton5 = new javax.swing.JButton();
        tplMainBoard = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_Thoat = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menu_QuanLySV = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        menu_TimKiem = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LaptopDT\\Downloads\\iconset4\\Actions-edit-delete-icon-16.png")); // NOI18N
        jButton1.setText("Thoát");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator2);

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\LaptopDT\\Downloads\\iconset4\\10207-man-student-light-skin-tone-icon-32.png")); // NOI18N
        jButton2.setText("Quản Lý Sinh Viên");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\LaptopDT\\Downloads\\iconset4\\gpa-icon-32.png")); // NOI18N
        jButton3.setText("Quản Lý Điểm");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton3);
        jToolBar1.add(jSeparator3);

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\LaptopDT\\Downloads\\iconset4\\search-icon-24.png")); // NOI18N
        jButton5.setText("Tìm kiếm");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        tplMainBoard.setBackground(new java.awt.Color(90, 90, 90));

        jMenu1.setText("Hệ Thống");

        menu_Thoat.setIcon(new javax.swing.ImageIcon("C:\\Users\\LaptopDT\\Downloads\\iconset4\\Button-Close-icon-16.png")); // NOI18N
        menu_Thoat.setText("Thoát");
        menu_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ThoatActionPerformed(evt);
            }
        });
        jMenu1.add(menu_Thoat);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản Lý");

        menu_QuanLySV.setIcon(new javax.swing.ImageIcon("C:\\Users\\LaptopDT\\Downloads\\iconset4\\10207-man-student-light-skin-tone-icon-16.png")); // NOI18N
        menu_QuanLySV.setText("Quản Lý Sinh Viên");
        menu_QuanLySV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_QuanLySVActionPerformed(evt);
            }
        });
        jMenu2.add(menu_QuanLySV);
        jMenu2.add(jSeparator6);

        jMenuItem9.setIcon(new javax.swing.ImageIcon("C:\\Users\\LaptopDT\\Downloads\\iconset4\\gpa-icon.png")); // NOI18N
        jMenuItem9.setText("Quản Lý Điểm");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);
        jMenu2.add(jSeparator4);

        menu_TimKiem.setIcon(new javax.swing.ImageIcon("C:\\Users\\LaptopDT\\Downloads\\iconset4\\search-icon-16.png")); // NOI18N
        menu_TimKiem.setText("Tìm kiếm");
        jMenu2.add(menu_TimKiem);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Trợ Gíup");

        jMenuItem6.setIcon(new javax.swing.ImageIcon("C:\\Users\\LaptopDT\\Downloads\\iconset4\\Actions-help-about-icon-16.png")); // NOI18N
        jMenuItem6.setText("Danh sách môn học");
        jMenu4.add(jMenuItem6);
        jMenu4.add(jSeparator1);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tplMainBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tplMainBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ThoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menu_ThoatActionPerformed

    private void menu_QuanLySVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_QuanLySVActionPerformed
        if (qlsPanel == null) {
            qlsPanel = new QuanLySVPanel();
            ImageIcon icon = new ImageIcon(getClass()
                    .getResource("/doan/com/icon/10207-man-student-light-skin-tone-icon-16.png"));
            tplMainBoard.addTab("Quản Lý Sinh Viên", icon, qlsPanel, "Quản lý sinh viên");

        }
        tplMainBoard.setSelectedComponent(qlsPanel);
    }//GEN-LAST:event_menu_QuanLySVActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem menu_QuanLySV;
    private javax.swing.JMenuItem menu_Thoat;
    private javax.swing.JMenuItem menu_TimKiem;
    private javax.swing.JTabbedPane tplMainBoard;
    // End of variables declaration//GEN-END:variables
}
