/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author vuongluis
 */
public class FrMain extends javax.swing.JFrame {

    /**
     * Creates new form FrMain
     */
    
    public FrMain() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ImageIcon image = new ImageIcon(getClass().getResource("/images/icon.png"));
        this.setTitle("Ứng Dụng Quản Lý");
        this.setIconImage(image.getImage());
        this.btDanhMucTin.setBackground(Color.decode("#f9f5e9"));
        this.btDanhMucTin.setForeground(Color.decode("#03503f"));
        
        this.btNguoiDung.setBackground(Color.decode("#f9f5e9"));
        this.btNguoiDung.setForeground(Color.decode("#03503f"));
        
        this.btTinTuc.setBackground(Color.decode("#f4f6f5"));
        this.btTinTuc.setForeground(Color.decode("#03503f"));
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        First = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btDanhMucTin = new javax.swing.JButton();
        btTinTuc = new javax.swing.JButton();
        btNguoiDung = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbMsg = new javax.swing.JLabel();
        pnCenter = new javax.swing.JPanel();
        Last = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NewsApp");

        First.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.GridLayout(1, 3, 10, 0));

        btDanhMucTin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btDanhMucTin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/qlcat.png"))); // NOI18N
        btDanhMucTin.setText("<html> \n<p style=\"text-align:center\">Quản lý<br> Danh mục tin </p>\n</html>");
        btDanhMucTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDanhMucTinActionPerformed(evt);
            }
        });
        jPanel2.add(btDanhMucTin);

        btTinTuc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btTinTuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/qlnews.png"))); // NOI18N
        btTinTuc.setText("<html> Quản lý<br> Tin Tức </html>");
        btTinTuc.setActionCommand("<html> Quản lý<br>Tin tức </html>");
        btTinTuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTinTucActionPerformed(evt);
            }
        });
        jPanel2.add(btTinTuc);

        btNguoiDung.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btNguoiDung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/qluser.png"))); // NOI18N
        btNguoiDung.setText("<html>\nQuản lý<br> Người dùng\n</html>");
        btNguoiDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNguoiDungActionPerformed(evt);
            }
        });
        jPanel2.add(btNguoiDung);

        First.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        lbMsg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbMsg.setText(":: NewsApp ::");
        jPanel1.add(lbMsg);

        First.add(jPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(First, java.awt.BorderLayout.PAGE_START);

        pnCenter.setLayout(new java.awt.BorderLayout());
        getContentPane().add(pnCenter, java.awt.BorderLayout.CENTER);

        Last.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("<html>\nCopyright by @ VinaEnter Edu\n</html>");
        Last.add(jLabel1);

        getContentPane().add(Last, java.awt.BorderLayout.PAGE_END);

        jMenu1.setText("Hướng dẫn");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tác giả");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Thoát");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btTinTucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTinTucActionPerformed
        pnCenter.removeAll();
        lbMsg.setText("<html><p style=\"color:red;\">Quản Lý Tin Tức</p></html>");
        pnCenter.add(new pnNew(),BorderLayout.CENTER);
        pnCenter.revalidate(); // update again
    }//GEN-LAST:event_btTinTucActionPerformed

    private void btDanhMucTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDanhMucTinActionPerformed
        lbMsg.setText("<html><p style=\"color:red;\">Quản Lý Danh Mục Tin</p></html>");
        pnCenter.removeAll();
        pnCenter.add(new pnCat(),BorderLayout.CENTER);
        pnCenter.revalidate(); // update again
    }//GEN-LAST:event_btDanhMucTinActionPerformed

    private void btNguoiDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNguoiDungActionPerformed
        pnCenter.removeAll();
        lbMsg.setText("<html><p style=\"color:red;\">Quản Lý Người Dùng</p></html>");
        pnCenter.add(new pnUser(),BorderLayout.CENTER);
        pnCenter.revalidate();
    }//GEN-LAST:event_btNguoiDungActionPerformed

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
            java.util.logging.Logger.getLogger(FrMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel First;
    private javax.swing.JPanel Last;
    private javax.swing.JButton btDanhMucTin;
    private javax.swing.JButton btNguoiDung;
    private javax.swing.JButton btTinTuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbMsg;
    private javax.swing.JPanel pnCenter;
    // End of variables declaration//GEN-END:variables
}
