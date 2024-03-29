/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel.management.view;

/**
 *
 * @author Deshini
 */
public class MainPageView extends javax.swing.JFrame {

    /**
     * Creates new form MainPageView
     */
    public MainPageView() {
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

        imageLable = new javax.swing.JLabel();
        customerManagementSystem = new javax.swing.JButton();
        roomManagementSystem = new javax.swing.JButton();
        roomCatogoryManagementSystem = new javax.swing.JButton();
        reservationManagementSystem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        imageLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/mainPage.jpg"))); // NOI18N
        imageLable.setText("jLabel1");

        customerManagementSystem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        customerManagementSystem.setText("Customer Management System");
        customerManagementSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerManagementSystemActionPerformed(evt);
            }
        });

        roomManagementSystem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        roomManagementSystem.setText("Room Management System");
        roomManagementSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomManagementSystemActionPerformed(evt);
            }
        });

        roomCatogoryManagementSystem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        roomCatogoryManagementSystem.setText("Room Catogory Management System");
        roomCatogoryManagementSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomCatogoryManagementSystemActionPerformed(evt);
            }
        });

        reservationManagementSystem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        reservationManagementSystem.setText("Reservation Management System");
        reservationManagementSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationManagementSystemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageLable, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(customerManagementSystem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roomManagementSystem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roomCatogoryManagementSystem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reservationManagementSystem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imageLable, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(customerManagementSystem)
                        .addGap(36, 36, 36)
                        .addComponent(roomManagementSystem)
                        .addGap(37, 37, 37)
                        .addComponent(roomCatogoryManagementSystem)
                        .addGap(40, 40, 40)
                        .addComponent(reservationManagementSystem)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void customerManagementSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerManagementSystemActionPerformed
        customerManagementSystem();// TODO add your handling code here:
    }//GEN-LAST:event_customerManagementSystemActionPerformed

    private void roomManagementSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomManagementSystemActionPerformed
        roomManagementSystem();// TODO add your handling code here:
    }//GEN-LAST:event_roomManagementSystemActionPerformed

    private void roomCatogoryManagementSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomCatogoryManagementSystemActionPerformed
        roomCatogoryManagementSystem();// TODO add your handling code here:
    }//GEN-LAST:event_roomCatogoryManagementSystemActionPerformed

    private void reservationManagementSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationManagementSystemActionPerformed
        reservationManagementSystem();// TODO add your handling code here:
    }//GEN-LAST:event_reservationManagementSystemActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton customerManagementSystem;
    private javax.swing.JLabel imageLable;
    private javax.swing.JButton reservationManagementSystem;
    private javax.swing.JButton roomCatogoryManagementSystem;
    private javax.swing.JButton roomManagementSystem;
    // End of variables declaration//GEN-END:variables

    private void customerManagementSystem() {
        new CustomerView().setVisible(true);
    }

    private void roomManagementSystem() {
        new RoomView().setVisible(true);
    }

    private void roomCatogoryManagementSystem() {
        new RoomCatogoryView().setVisible(true);
    }

    private void reservationManagementSystem() {
        new ReservationView().setVisible(true);
    }
}
