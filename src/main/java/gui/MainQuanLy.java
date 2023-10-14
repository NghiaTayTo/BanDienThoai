package gui;

import component.welcome;
import entity.NhanVien;
import event.eventMenu;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;

public class MainQuanLy extends javax.swing.JFrame {

    public MainQuanLy() {
        initComponents();
        init();
        welcome wel = new welcome();
        wel.setSize(1180, 830);
        wel.setLocation(23, 5);

        content.removeAll();
        content.add(wel, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    private void init() {
        setBackground(new Color(0, 0, 0, 0));  //  Remove background

        menu1.addEventMenu(new eventMenu() {
            @Override
            public void menuIndexChange(int index) {
//                JOptionPane.showMessageDialog(null, index + "");
                switch (index) {
                    case 0:
                        welcome wel = new welcome();
                        wel.setSize(1180, 830);
                        wel.setLocation(23, 5);

                        content.removeAll();
                        content.add(wel, BorderLayout.CENTER);
                        content.revalidate();
                        content.repaint();
                        break;
                    case 1:
                        NhanVienUI nv = new NhanVienUI();
                        nv.setSize(1228, 690);
                        nv.setLocation(0, 0);

                        content.removeAll();
                        content.add(nv, BorderLayout.CENTER);
                        content.revalidate();
                        content.repaint();
                        break;

                    case 2:
                        KhachHangUI kh = new KhachHangUI();
                        kh.setSize(1228, 690);
                        kh.setLocation(0, 0);

                        content.removeAll();
                        content.add(kh, BorderLayout.CENTER);
                        content.revalidate();
                        content.repaint();
                        break;
                    case 3:
                        SanPhamUI sp = new SanPhamUI();
                        sp.setSize(1228, 690);
                        sp.setLocation(0, 0);

                        content.removeAll();
                        content.add(sp, BorderLayout.CENTER);
                        content.revalidate();
                        content.repaint();
                        break;
                    case 4:
                        BanHang bh = new BanHang();
                        bh.setSize(1228, 690);
                        bh.setLocation(0, 0);

                        content.removeAll();
                        content.add(bh, BorderLayout.CENTER);
                        content.revalidate();
                        content.repaint();
                        break;
                    case 5:
                        HoaDonUI hd = new HoaDonUI();
                        hd.setSize(1228, 690);
                        hd.setLocation(0, 0);

                        content.removeAll();
                        content.add(hd, BorderLayout.CENTER);
                        content.revalidate();
                        content.repaint();
                        break;
                    case 6:
                        GiamGia gg = new GiamGia();
                        gg.setSize(1228, 690);
                        gg.setLocation(0, 0);

                        content.removeAll();
                        content.add(gg, BorderLayout.CENTER);
                        content.revalidate();
                        content.repaint();
                        break;
                    default:
                        throw new AssertionError();
                }
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelborder1 = new swing.panelborder();
        jLabel1 = new javax.swing.JLabel();
        panelBorder21 = new swing.panelBorder2();
        menu1 = new component.menu();
        title1 = new component.title();
        content = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Phần mềm quản lý bán điện thoại TAYTO");

        javax.swing.GroupLayout title1Layout = new javax.swing.GroupLayout(title1);
        title1.setLayout(title1Layout);
        title1Layout.setHorizontalGroup(
            title1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1240, Short.MAX_VALUE)
        );
        title1Layout.setVerticalGroup(
            title1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );

        content.setOpaque(false);

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelBorder21Layout = new javax.swing.GroupLayout(panelBorder21);
        panelBorder21.setLayout(panelBorder21Layout);
        panelBorder21Layout.setHorizontalGroup(
            panelBorder21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder21Layout.createSequentialGroup()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelBorder21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBorder21Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        panelBorder21Layout.setVerticalGroup(
            panelBorder21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder21Layout.createSequentialGroup()
                .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
        );

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/remove.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelborder1Layout = new javax.swing.GroupLayout(panelborder1);
        panelborder1.setLayout(panelborder1Layout);
        panelborder1Layout.setHorizontalGroup(
            panelborder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelborder1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(panelborder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelborder1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelBorder21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelborder1Layout.setVerticalGroup(
            panelborder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelborder1Layout.createSequentialGroup()
                .addGroup(panelborder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelborder1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBorder21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelborder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelborder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainQuanLy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private component.menu menu1;
    private swing.panelBorder2 panelBorder21;
    private swing.panelborder panelborder1;
    private component.title title1;
    // End of variables declaration//GEN-END:variables
}
