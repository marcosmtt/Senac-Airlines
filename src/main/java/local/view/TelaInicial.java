package local.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import local.controller.Sistema;
import local.model.TemplateDosPaineis;

public class TelaInicial extends javax.swing.JFrame {

    private Sistema sistema;
    private boolean isMaximized;
    private final int frameSizeInitialSize;

    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    private JPanel currentJPanel;

    private PanelCadastro cadastroPanel;
    private PanelVoos voosPanel;

    private enum EnumPanel {
        HOME, VOOS, CADASTRO, GERENCIADOR, REGISTROS
    }
    private EnumPanel enumCurrentPanel;

    public TelaInicial() {
        initComponents();
        new TemplateDosPaineis(this.jPanelBackground);
        this.jPanelDesktop.setLayout(new BorderLayout());
        sistema = new Sistema(this);
        //PAINEIS DA TELA INICIAL
        cadastroPanel = new PanelCadastro(this);
        voosPanel = new PanelVoos(sistema);

        //--
        this.frameSizeInitialSize = getState();
//        this.setBounds(new Rectangle(screenSize));
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        isMaximized = true;

        this.enumCurrentPanel = EnumPanel.CADASTRO;
        this.currentJPanel = cadastroPanel;
        this.paintComponents(this.getGraphics());
    }

    public void changePanel(EnumPanel panelName) {

        if (null != panelName) {
            switch (panelName) {
                case HOME:
                    this.enumCurrentPanel = EnumPanel.HOME;
                    break;
                case VOOS:
                    this.enumCurrentPanel = EnumPanel.VOOS;
                    break;
                case CADASTRO:
                    this.enumCurrentPanel = EnumPanel.CADASTRO;
                    break;
                case GERENCIADOR:
                    this.enumCurrentPanel = EnumPanel.GERENCIADOR;
                    break;
                case REGISTROS:
                    this.enumCurrentPanel = EnumPanel.REGISTROS;
                    break;
                default:
                    break;
            }
        }

        refreshPanels();
    }

    public void setNavTxt(String txt) {
        this.jLabelDesktopTitle.setText(txt);
    }

    private void refreshPanels() {
        this.currentJPanel.setVisible(false);
        this.jPanelDesktop.removeAll();

        if (null != enumCurrentPanel) {
            switch (enumCurrentPanel) {
                case HOME:
                    //            this.currentJPanel = voosPanel;
                    setNavTxt("HOME");
                    this.jLabelDesktopTitle.setIcon(this.jLabelHome.getIcon());
                    break;
                case VOOS:
                    this.currentJPanel = voosPanel;
                    setNavTxt("VOOS");
                    this.jLabelDesktopTitle.setIcon(this.jLabelVoos.getIcon());
                    this.jPanelDesktop.add(voosPanel, BorderLayout.CENTER);
                    break;
                case CADASTRO:
                    this.currentJPanel = cadastroPanel;
                    setNavTxt("CADASTRO");
                    this.jLabelDesktopTitle.setIcon(this.jLabelCadastro.getIcon());
                    this.jPanelDesktop.add(cadastroPanel, BorderLayout.CENTER);
                    break;
                case GERENCIADOR:
                    //            this.currentJPanel = voosPanel;
                    setNavTxt("GERENCIADOR");
                    this.jLabelDesktopTitle.setIcon(this.jLabelGerenciador.getIcon());
                    break;
                case REGISTROS:
                    //            this.currentJPanel = voosPanel;
                    this.jLabelDesktopTitle.setText("REGISTROS");
                    this.jLabelDesktopTitle.setIcon(this.jLabelRegistros.getIcon());
                    break;
                default:
                    break;
            }
        }

        this.currentJPanel.setVisible(true);
        this.jPanelDesktop.paintComponents(this.jPanelDesktop.getGraphics());

        voosPanel.getGraphicsX().setOriginPositions();
    }

    private void maximize() {
        if (isMaximized) {
            this.dispose();
            this.setUndecorated(false);
            this.setResizable(true);
            this.pack();
            setVisible(true);
            this.setExtendedState(frameSizeInitialSize);
            this.setLocationRelativeTo(null);
//             this.setBounds(new Rectangle(700, 700));
            this.jLabelExit.setVisible(false);
            this.jLabelMinimize.setVisible(false);
            isMaximized = false;
        } else {
            this.dispose();
            this.setUndecorated(true);
            this.setResizable(false);
            this.pack();
            setVisible(true);
            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            this.jLabelExit.setVisible(true);
            this.jLabelMinimize.setVisible(true);
            isMaximized = true;
        }
    }

    public EnumPanel getEnumCurrentPanel() {
        return enumCurrentPanel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        jLabelDesktopTitle = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jPanelDesktop = new javax.swing.JPanel();
        jLabelVoos = new javax.swing.JLabel();
        jLabelHome = new javax.swing.JLabel();
        jLabelGerenciador = new javax.swing.JLabel();
        jLabelCadastro = new javax.swing.JLabel();
        jLabelRegistros = new javax.swing.JLabel();
        jLabelExit = new javax.swing.JLabel();
        jLabelMaximize = new javax.swing.JLabel();
        jLabelMinimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SENAC - Airlines");
        setUndecorated(true);
        setResizable(false);

        jPanelBackground.setBackground(new java.awt.Color(3, 54, 99));

        jLabelDesktopTitle.setBackground(new java.awt.Color(44, 102, 152));
        jLabelDesktopTitle.setFont(new java.awt.Font("Gisha", 1, 17)); // NOI18N
        jLabelDesktopTitle.setForeground(new java.awt.Color(232, 233, 232));
        jLabelDesktopTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDesktopTitle.setText("HOME");
        jLabelDesktopTitle.setOpaque(true);

        jLabelLogo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelLogo.setForeground(new java.awt.Color(255, 153, 51));
        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        jLabelLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setPreferredSize(new java.awt.Dimension(200, 100));

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
        jLabelVoos.setFont(new java.awt.Font("Gisha", 1, 17)); // NOI18N
        jLabelVoos.setForeground(new java.awt.Color(232, 233, 232));
        jLabelVoos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVoos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Runway_25px.png"))); // NOI18N
        jLabelVoos.setText("VOOS");
        jLabelVoos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelVoos.setName("botao"); // NOI18N
        jLabelVoos.setOpaque(true);
        jLabelVoos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelVoosMouseClicked(evt);
            }
        });

        jLabelHome.setBackground(new java.awt.Color(44, 102, 152));
        jLabelHome.setFont(new java.awt.Font("Gisha", 1, 17)); // NOI18N
        jLabelHome.setForeground(new java.awt.Color(232, 233, 232));
        jLabelHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Airplane_Take_Off_25px.png"))); // NOI18N
        jLabelHome.setText("HOME");
        jLabelHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHome.setName("botao"); // NOI18N
        jLabelHome.setOpaque(true);
        jLabelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelHomeMouseEntered(evt);
            }
        });

        jLabelGerenciador.setBackground(new java.awt.Color(44, 102, 152));
        jLabelGerenciador.setFont(new java.awt.Font("Gisha", 1, 17)); // NOI18N
        jLabelGerenciador.setForeground(new java.awt.Color(232, 233, 232));
        jLabelGerenciador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGerenciador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Autopilot_25px.png"))); // NOI18N
        jLabelGerenciador.setText("GERENCIADOR");
        jLabelGerenciador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelGerenciador.setName("botao"); // NOI18N
        jLabelGerenciador.setOpaque(true);
        jLabelGerenciador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelGerenciadorMouseClicked(evt);
            }
        });

        jLabelCadastro.setBackground(new java.awt.Color(44, 102, 152));
        jLabelCadastro.setFont(new java.awt.Font("Gisha", 1, 17)); // NOI18N
        jLabelCadastro.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Form_25px.png"))); // NOI18N
        jLabelCadastro.setText("CADASTRO");
        jLabelCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCadastro.setName("botao"); // NOI18N
        jLabelCadastro.setOpaque(true);
        jLabelCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCadastroMouseClicked(evt);
            }
        });

        jLabelRegistros.setBackground(new java.awt.Color(44, 102, 152));
        jLabelRegistros.setFont(new java.awt.Font("Gisha", 1, 17)); // NOI18N
        jLabelRegistros.setForeground(new java.awt.Color(232, 233, 232));
        jLabelRegistros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Filing_Cabinet_25px.png"))); // NOI18N
        jLabelRegistros.setText("REGISTROS");
        jLabelRegistros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegistros.setName("botao"); // NOI18N
        jLabelRegistros.setOpaque(true);
        jLabelRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegistrosMouseClicked(evt);
            }
        });

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
                    .addComponent(jLabelGerenciador, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jLabelGerenciador, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabelRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelBackground, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
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
        maximize();
        maximize();
    }//GEN-LAST:event_jLabelMaximizeMouseClicked

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizeMouseClicked

    private void jLabelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseClicked
        changePanel(EnumPanel.HOME);
    }//GEN-LAST:event_jLabelHomeMouseClicked

    private void jLabelVoosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVoosMouseClicked
        changePanel(EnumPanel.VOOS);
    }//GEN-LAST:event_jLabelVoosMouseClicked

    private void jLabelGerenciadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelGerenciadorMouseClicked
        changePanel(EnumPanel.GERENCIADOR);
    }//GEN-LAST:event_jLabelGerenciadorMouseClicked

    private void jLabelRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistrosMouseClicked
        changePanel(EnumPanel.REGISTROS);
    }//GEN-LAST:event_jLabelRegistrosMouseClicked

    public Sistema getSist() {
        return sistema;
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
    private javax.swing.JLabel jLabelCadastro;
    private javax.swing.JLabel jLabelDesktopTitle;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelGerenciador;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelMaximize;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelRegistros;
    private javax.swing.JLabel jLabelVoos;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelDesktop;
    // End of variables declaration//GEN-END:variables
}
