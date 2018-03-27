

public class App extends javax.swing.JFrame {

    public App() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Passenger = new javax.swing.JButton();
        Employee = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(250, 360));
        setPreferredSize(new java.awt.Dimension(330, 250));
        setSize(new java.awt.Dimension(290, 330));
        getContentPane().setLayout(null);

        Passenger.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Passenger.setText("Passenger");
        Passenger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassengerActionPerformed(evt);
            }
        });
        getContentPane().add(Passenger);
        Passenger.setBounds(180, 260, 95, 25);

        Employee.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Employee.setText("Employee");
        Employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeActionPerformed(evt);
            }
        });
        getContentPane().add(Employee);
        Employee.setBounds(40, 260, 93, 25);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Choose type of user :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 220, 148, 17);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adham ELGazar\\Desktop\\Webp.net-resizeimage (1).jpg")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 520, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PassengerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassengerActionPerformed
        PassengerWindow passwindow= new PassengerWindow();
        passwindow.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_PassengerActionPerformed

    private void EmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeActionPerformed
        EmployeeLogin employeemwindow= new EmployeeLogin();
        employeemwindow.setVisible(true);
                this.setVisible(false);

        
    }//GEN-LAST:event_EmployeeActionPerformed

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Employee;
    private javax.swing.JButton Passenger;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}//haha
