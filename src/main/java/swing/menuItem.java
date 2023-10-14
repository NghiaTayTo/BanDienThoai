package swing;

import model.model_menu;
import java.awt.Color;

public class menuItem extends javax.swing.JPanel {

  private final model_menu data;

    public menuItem(model_menu data) {
        this.data = data;
        initComponents();
        setOpaque(false);
        if (data.getType() == model_menu.MenuType.MENU) {
            lblIcon.setIcon(data.toIcon());
            lblName.setText(data.getName());
        } else {
            lblName.setText(" ");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIcon = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(277, 40));

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblIcon)
                .addGap(29, 29, 29)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

     public void setSelected(boolean selected) {
        if (data.getType() == model_menu.MenuType.MENU) {
            if (selected) {
                lblIcon.setIcon(data.toIconSelected());
                lblName.setForeground(new Color(60, 60, 60));
            } else {
                lblIcon.setIcon(data.toIcon());
                lblName.setForeground(new Color(214, 217, 223));
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables
}
