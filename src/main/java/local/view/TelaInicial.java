package local.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import local.model.LabelButtonAnimationMouseListener;

/**
 *
 * @author Yuri
 */
public class TelaInicial extends javax.swing.JFrame {

    private boolean isMaximized;
    private int frameSizeInitialSize;

    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    private JPanel currentJPanel;
    private PanelCadastro cadastroPanel;

    private enum EnumPanel {
        HOME, CADASTRO, REGISTROS
    }
    private EnumPanel enumCurrentPanel;

    public TelaInicial() {
        initComponents();
//        for (int i = 0; i < this.jPanelBackground.getComponentCount(); i++) {
//            try {
//                if (this.jPanelBackground.getComponent(i).getName().equals("botao")) {
//                    this.jPanelBackground.getComponent(i).addMouseListener(new LabelButtonAnimationMouseListener((JLabel) this.jPanelBackground.getComponent(i)));
//                }
//            } catch (Exception e) {
//            }
//        }
//        //PAINEIS DA TELA INICIAL
//        this.jPanelDesktop.setLayout(new BorderLayout());
//        cadastroPanel = new PanelCadastro(this);
//        this.cadastroPanel.setVisible(false);
//
//        this.jPanelDesktop.add(cadastroPanel, BorderLayout.CENTER);
//        //--
//        this.frameSizeInitialSize = getState();
////        this.setBounds(new Rectangle(screenSize));
//        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        isMaximized = true;
//
//        this.enumCurrentPanel = EnumPanel.HOME;
//        this.currentJPanel = cadastroPanel;
//        this.paintComponents(this.getGraphics());
    }
//
//    private void changePanel(EnumPanel panelName) {
//
//        if (panelName == EnumPanel.CADASTRO) {
//            this.enumCurrentPanel = EnumPanel.CADASTRO;
//            refreshPanels();
//            System.out.println("ka");
//        }
//
//    }
//
//    private void refreshPanels() {
//        this.currentJPanel.setVisible(false);
//
//        if (enumCurrentPanel == EnumPanel.CADASTRO) {
//            this.currentJPanel = cadastroPanel;
//        }
//
//        this.currentJPanel.setVisible(true);
//    }
//
//    private void maximize() {
//        if (isMaximized) {
//            this.setExtendedState(frameSizeInitialSize);
////             this.setBounds(new Rectangle(700, 700));
//            isMaximized = false;
//        } else {
//            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
//            isMaximized = true;
//        }
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        jLabelDesktopTitle = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanelDesktop = new javax.swing.JPanel();
        jLabelVoos = new javax.swing.JLabel();
        jLabelHome = new javax.swing.JLabel();
        jLabelRegistros = new javax.swing.JLabel();
        jLabelCadastro = new javax.swing.JLabel();
        jLabelSEMFUNCAO = new javax.swing.JLabel();
        jLabelExit = new javax.swing.JLabel();
        jLabelMaximize = new javax.swing.JLabel();
        jLabelMinimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBackground.setBackground(new java.awt.Color(3, 54, 99));

        jLabelDesktopTitle.setBackground(new java.awt.Color(44, 102, 152));
        jLabelDesktopTitle.setFont(new java.awt.Font("Gisha", 1, 22)); // NOI18N
        jLabelDesktopTitle.setForeground(new java.awt.Color(232, 233, 232));
        jLabelDesktopTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDesktopTitle.setText("HOME");
        jLabelDesktopTitle.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setPreferredSize(new java.awt.Dimension(200, 100));

        jPanelDesktop.setBackground(new java.awt.Color(44, 102, 152));

        javax.swing.GroupLayout jPanelDesktopLayout = new javax.swing.GroupLayout(jPanelDesktop);
        jPanelDesktop.setLayout(jPanelDesktopLayout);
        jPanelDesktopLayout.setHorizontalGroup(
            jPanelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelDesktopLayout.setVerticalGroup(
            jPanelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabelVoos.setBackground(new java.awt.Color(44, 102, 152));
        jLabelVoos.setFont(new java.awt.Font("Gisha", 1, 22)); // NOI18N
        jLabelVoos.setForeground(new java.awt.Color(232, 233, 232));
        jLabelVoos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVoos.setText("VOOS");
        jLabelVoos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelVoos.setName("botao"); // NOI18N
        jLabelVoos.setOpaque(true);

        jLabelHome.setBackground(new java.awt.Color(44, 102, 152));
        jLabelHome.setFont(new java.awt.Font("Gisha", 1, 22)); // NOI18N
        jLabelHome.setForeground(new java.awt.Color(232, 233, 232));
        jLabelHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHome.setText("HOME");
        jLabelHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHome.setName("botao"); // NOI18N
        jLabelHome.setOpaque(true);
        jLabelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelHomeMouseEntered(evt);
            }
        });

        jLabelRegistros.setBackground(new java.awt.Color(44, 102, 152));
        jLabelRegistros.setFont(new java.awt.Font("Gisha", 1, 22)); // NOI18N
        jLabelRegistros.setForeground(new java.awt.Color(232, 233, 232));
        jLabelRegistros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistros.setText("REGISTROS");
        jLabelRegistros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegistros.setName("botao"); // NOI18N
        jLabelRegistros.setOpaque(true);

        jLabelCadastro.setBackground(new java.awt.Color(44, 102, 152));
        jLabelCadastro.setFont(new java.awt.Font("Gisha", 1, 22)); // NOI18N
        jLabelCadastro.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastro.setText("CADASTRO");
        jLabelCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCadastro.setName("botao"); // NOI18N
        jLabelCadastro.setOpaque(true);
        jLabelCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCadastroMouseClicked(evt);
            }
        });

        jLabelSEMFUNCAO.setBackground(new java.awt.Color(44, 102, 152));
        jLabelSEMFUNCAO.setFont(new java.awt.Font("Gisha", 1, 22)); // NOI18N
        jLabelSEMFUNCAO.setForeground(new java.awt.Color(232, 233, 232));
        jLabelSEMFUNCAO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSEMFUNCAO.setText("CADASTRO");
        jLabelSEMFUNCAO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSEMFUNCAO.setName("botao"); // NOI18N
        jLabelSEMFUNCAO.setOpaque(true);

        jLabelExit.setBackground(new java.awt.Color(232, 233, 232));
        jLabelExit.setFont(new java.awt.Font("Gisha", 1, 12)); // NOI18N
        jLabelExit.setForeground(new java.awt.Color(3, 54, 99));
        jLabelExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExit.setText("X");
        jLabelExit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelExit.setOpaque(true);
        jLabelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelExitMouseClicked(evt);
            }
        });

        jLabelMaximize.setBackground(new java.awt.Color(3, 54, 99));
        jLabelMaximize.setFont(new java.awt.Font("Gisha", 1, 12)); // NOI18N
        jLabelMaximize.setForeground(new java.awt.Color(232, 233, 232));
        jLabelMaximize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMaximize.setText("[ ]");
        jLabelMaximize.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelMaximize.setOpaque(true);
        jLabelMaximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMaximizeMouseClicked(evt);
            }
        });

        jLabelMinimize.setBackground(new java.awt.Color(3, 54, 99));
        jLabelMinimize.setFont(new java.awt.Font("Gisha", 1, 12)); // NOI18N
        jLabelMinimize.setForeground(new java.awt.Color(232, 233, 232));
        jLabelMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMinimize.setText("....");
        jLabelMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelMinimize.setOpaque(true);
        jLabelMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelVoos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSEMFUNCAO, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDesktopTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                    .addComponent(jPanelDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMaximize, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelExit)
                    .addComponent(jLabelMaximize)
                    .addComponent(jLabelMinimize))
                .addGap(15, 15, 15)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabelDesktopTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabelVoos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabelRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabelSEMFUNCAO, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelBackground, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseEntered

    }//GEN-LAST:event_jLabelHomeMouseEntered

    private void jLabelCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCadastroMouseClicked
        changePanel(EnumPanel.CADASTRO);
    }//GEN-LAST:event_jLabelCadastroMouseClicked

    private void jLabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelExitMouseClicked

    private void jLabelMaximizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMaximizeMouseClicked
        // TODO add your handling code here:
        maximize();
    }//GEN-LAST:event_jLabelMaximizeMouseClicked

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizeMouseClicked

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCadastro;
    private javax.swing.JLabel jLabelDesktopTitle;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelMaximize;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelRegistros;
    private javax.swing.JLabel jLabelSEMFUNCAO;
    private javax.swing.JLabel jLabelVoos;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelDesktop;
    // End of variables declaration//GEN-END:variables
}
