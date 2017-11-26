/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ghost;

import javax.swing.ImageIcon;

/**
 *
 * @author Ilham Bintang
 */
public class Tampil extends javax.swing.JFrame {
    
    ImageIcon bgPress = new ImageIcon("src/assets/ghostPressed.png");
    ImageIcon bg = new ImageIcon("src/assets/ghost.png");
    ImageIcon bgPressTopScore = new ImageIcon("src/assets/ghostTopScorePressed.png");
    
    public Tampil() {
        initComponents();
        initAwal();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        start = new javax.swing.JButton();
        topScore = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 510));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                startMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                startMouseReleased(evt);
            }
        });
        jPanel1.add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 180, 200));

        topScore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topScoreMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                topScoreMouseReleased(evt);
            }
        });
        jPanel1.add(topScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 362, 172, 120));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ghost.png"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startMousePressed
        background.setIcon(bgPress);
        new Play().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_startMousePressed

    private void startMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startMouseReleased
        background.setIcon(bg);
    }//GEN-LAST:event_startMouseReleased

    private void topScoreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topScoreMousePressed
        background.setIcon(bgPressTopScore);
    }//GEN-LAST:event_topScoreMousePressed

    private void topScoreMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topScoreMouseReleased
        background.setIcon(bg);

    }//GEN-LAST:event_topScoreMouseReleased

    public void initAwal() {
        start.setOpaque(false);
        start.setContentAreaFilled(false);
        start.setBorderPainted(false);
        topScore.setOpaque(false);
        topScore.setContentAreaFilled(false);
        topScore.setBorderPainted(false);
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
            java.util.logging.Logger.getLogger(Tampil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tampil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tampil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tampil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tampil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton start;
    private javax.swing.JButton topScore;
    // End of variables declaration//GEN-END:variables
}
