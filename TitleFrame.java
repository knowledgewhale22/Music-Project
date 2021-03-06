/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypackage;

/**
 *
 * @author Michael
 */
public class TitleFrame extends javax.swing.JFrame {

    /**
     * Creates new form TitleFrame
     */
    public TitleFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        //Create Title screen

        jLayeredPane1 = new javax.swing.JLayeredPane();
        newFileButton = new javax.swing.JButton();
        mainLabel = new java.awt.Label();
        savedFileButton = new javax.swing.JButton();

        //allow exit
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        newFileButton.setText("New File");
        newFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileButtonActionPerformed(evt);
            }
        });

        //aesthetics
        mainLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        mainLabel.setForeground(new java.awt.Color(5, 0, 0));
        mainLabel.setText("Music Transposer V.1");

        savedFileButton.setText("Saved File");
        savedFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savedFileButtonActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(newFileButton, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(mainLabel, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(savedFileButton, javax.swing.JLayeredPane.PALETTE_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
                jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(newFileButton)
                                .addGap(49, 49, 49)
                                .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(savedFileButton)
                                .addContainerGap(147, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
                jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                .addContainerGap(176, Short.MAX_VALUE)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(newFileButton)
                                        .addComponent(savedFileButton)
                                        .addComponent(mainLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(174, 174, 174))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>

    private void savedFileButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void newFileButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        dispose();
        EditorFrame f = new EditorFrame();
        f.setVisible(true);
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
            java.util.logging.Logger.getLogger(TitleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TitleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TitleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TitleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TitleFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLayeredPane jLayeredPane1;
    private java.awt.Label mainLabel;
    private javax.swing.JButton newFileButton;
    private javax.swing.JButton savedFileButton;
    // End of variables declaration
}
