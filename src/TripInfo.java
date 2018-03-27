
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahate
 */
public class TripInfo extends javax.swing.JFrame {

    /**
     * Creates new form TripInfo
     */
    public TripInfo() {
        try {
            Tools.GetTicket(main.Tickets);
        } catch (IOException ex) {
            Logger.getLogger(TripInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Tools.GetTicket(main.Tickets);
        } catch (IOException ex) {
            Logger.getLogger(TripInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Tools.GetTrips(main.Trips);
        } catch (IOException ex) {
            Logger.getLogger(TripInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        int ticketnumber = main.Tickets.size()-1;
        int tripnumber = main.Trips.size()-1;
        Ticket t = main.Tickets.get(ticketnumber);
        Trip tr = main.Trips.get(tripnumber);
        Price.setText(t.getPrice().toString());
        TripType.setText(t.getType());
        TicketNo.setText(t.getTicketNumber());
        Departure.setText(t.getTimeOfDeparture());
        int i =Integer.parseInt(t.getSeat());
        String j = String.valueOf(i);
        Seat.setText(j);
        TripType.setText(tr.getType());
        From.setText(tr.getFrom());
        To.setText(tr.getTo());
        Number.setText(tr.getNumberOfStops());

        
        
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Seat = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Number = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        To = new javax.swing.JTextField();
        From = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TripType = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Departure = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TicketNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Seat.setEnabled(false);
        getContentPane().add(Seat, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 365, 238, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Seat no.:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 359, 118, 37));

        Number.setEnabled(false);
        getContentPane().add(Number, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 322, 238, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("No. of stops :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 316, -1, 37));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("To :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 259, 118, 37));

        To.setEnabled(false);
        getContentPane().add(To, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 265, 238, -1));

        From.setEnabled(false);
        getContentPane().add(From, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 214, 238, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("From :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 215, 118, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Trip type :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 159, 118, 37));

        TripType.setEnabled(false);
        getContentPane().add(TripType, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 165, 238, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Departure :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 112, 118, 37));

        Departure.setEnabled(false);
        Departure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartureActionPerformed(evt);
            }
        });
        getContentPane().add(Departure, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 118, 238, -1));

        jLabel2.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ticket");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 230, 43));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Price :");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 402, 118, 37));

        Price.setEnabled(false);
        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });
        getContentPane().add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 408, 238, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Ticket No. :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 69, 118, 37));

        TicketNo.setEnabled(false);
        TicketNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TicketNoActionPerformed(evt);
            }
        });
        getContentPane().add(TicketNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 75, 238, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DepartureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepartureActionPerformed

    private void TicketNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TicketNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TicketNoActionPerformed

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceActionPerformed

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
            java.util.logging.Logger.getLogger(TripInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TripInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TripInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TripInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TripInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Departure;
    private javax.swing.JTextField From;
    private javax.swing.JTextField Number;
    private javax.swing.JTextField Price;
    private javax.swing.JTextField Seat;
    private javax.swing.JTextField TicketNo;
    private javax.swing.JTextField To;
    private javax.swing.JTextField TripType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
