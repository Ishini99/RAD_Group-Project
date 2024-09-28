/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.internal;

import controller.Tools;
import controller.UserController;
import javax.swing.JOptionPane;

/**
 *
 * @author sandakelum
 */
public class ChangePassword extends javax.swing.JInternalFrame {

    /**
     * Creates new form ChangePassword
     */
    public ChangePassword() {
        initComponents();
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
        ptxtOld = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        ptxtNew = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        ptxtCnew = new javax.swing.JPasswordField();
        btnChange = new javax.swing.JButton();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(31, 161, 240), 1, true));
        setClosable(true);
        setTitle("Change Password");

        jLabel1.setText("Old Password");

        jLabel2.setText("New Password");

        jLabel3.setText("Confirm New Password");

        btnChange.setBackground(new java.awt.Color(1, 84, 254));
        btnChange.setForeground(java.awt.Color.white);
        btnChange.setText("Change");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ptxtOld)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 160, Short.MAX_VALUE))
                    .addComponent(ptxtNew)
                    .addComponent(ptxtCnew)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ptxtOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(ptxtNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(ptxtCnew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnChange)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void clearPtxt(){
        ptxtCnew.setText("");
        ptxtNew.setText("");
        ptxtOld.setText("");
    }
    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        Tools tools = new Tools();
        UserController uc = new UserController();
        if (ptxtNew.getText().equals(ptxtCnew.getText())) {
            if (uc.updatePassword(ptxtOld.getText(), ptxtNew.getText())) {
                JOptionPane.showMessageDialog(tools.getVisibleContent(), "Password change successful", "Info", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } else {
                clearPtxt();
                JOptionPane.showMessageDialog(tools.getVisibleContent(), "Error in Change password, Please try again", "Error", JOptionPane.ERROR_MESSAGE);

            }
        } else {
            clearPtxt();
            JOptionPane.showMessageDialog(tools.getVisibleContent(), "Error in Change password, Please try again", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnChangeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChange;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField ptxtCnew;
    private javax.swing.JPasswordField ptxtNew;
    private javax.swing.JPasswordField ptxtOld;
    // End of variables declaration//GEN-END:variables
}
