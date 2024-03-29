import javax.swing.JOptionPane;

public class RollerCoaster extends javax.swing.JFrame {

    /**
     * Creates new form RollerCoaster
     */
    public RollerCoaster() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        enterButton = new javax.swing.JButton();
        responseLabel = new javax.swing.JLabel();
        heightInput = new com.toedter.components.JSpinField();
        coasterGFX = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterButton.setBackground(new java.awt.Color(255, 255, 255));
        enterButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enterButton.setForeground(new java.awt.Color(215, 80, 41));
        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });
        getContentPane().add(enterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, -1));

        responseLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        responseLabel.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(responseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        heightInput.setAutoscrolls(true);
        heightInput.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        heightInput.setMinimum(0);
        heightInput.setValue(50);
        getContentPane().add(heightInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 70, 30));

        coasterGFX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rollerCoasterGFX.png"))); // NOI18N
        getContentPane().add(coasterGFX, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 450));

        pack();
    }// </editor-fold>                        

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        //clear response
        responseLabel.setText("");

        //ask user if they have heart and/or back trouble
        int yesOrNo = JOptionPane.showConfirmDialog(null,
                "Do you have back and/or heart trouble?",
                "Please answer the following question:",
                JOptionPane.YES_NO_OPTION);

        //tell the user they can't ride if yes
        if (yesOrNo == 0) {
            responseLabel.setText("Sorry, it is unsafe for you to ride.");

        } else {
            //intitialize and get the user's height
            int height = heightInput.getValue();

            //check if the user meets height requirements
            if ((height >= 122) && (height <= 188)) {
                responseLabel.setText("It is safe for you to ride. Enjoy!");
            } else {
                responseLabel.setText("Sorry, it is unsafe for you to ride.");
            }
        }
    }                                           

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
            java.util.logging.Logger.getLogger(RollerCoaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RollerCoaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RollerCoaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RollerCoaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RollerCoaster().setVisible(true);
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel coasterGFX;
    private javax.swing.JButton enterButton;
    private com.toedter.components.JSpinField heightInput;
    private javax.swing.JLabel responseLabel;
    // End of variables declaration                   
}
