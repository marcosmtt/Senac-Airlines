package local.view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import local.model.TemplateDosPaineis;

public class PanelCadastro extends javax.swing.JPanel {

    private TelaInicial telaInicial;
    private JPanel currentJPanel;

    private PanelCadastroPassageiro cadastroPassageiro;
    private PanelCadastroAviao cadastroAviao;
    private PanelCadastroDestino cadastroDestino;

    private enum EnumPanel {
        PASSAGEIRO, AVIAO, VOOS, BAGAGEM, DESTINO
    }
    private EnumPanel enumCurrentPanel;

    public PanelCadastro(TelaInicial telaInicial) {
        initComponents();
        new TemplateDosPaineis(this.jPanelBackground);
        this.telaInicial = telaInicial;
        this.jPanelDesktop.setLayout(new BorderLayout());
        this.enumCurrentPanel = null;

        //PAINEIS DE CADASTRO
        cadastroPassageiro = new PanelCadastroPassageiro(telaInicial.getSist());
        cadastroAviao = new PanelCadastroAviao(telaInicial.getSist());
        cadastroDestino = new PanelCadastroDestino();

        this.cadastroPassageiro.setVisible(false);
        this.cadastroAviao.setVisible(false);
        this.cadastroDestino.setVisible(false);

        this.currentJPanel = cadastroPassageiro;
        //--
        this.paintComponents(this.getGraphics());
    }

    private void changePanel(EnumPanel panelName) {

        if (null != panelName) {
            switch (panelName) {
                case PASSAGEIRO:
                    this.enumCurrentPanel = EnumPanel.PASSAGEIRO;
                    telaInicial.setNavTxt("CADASTRO --> PASSAGEIRO");
                    break;
                case DESTINO:
                    this.enumCurrentPanel = EnumPanel.DESTINO;
                    telaInicial.setNavTxt("CADASTRO --> DESTINO");
                    break;
                case AVIAO:
                    this.enumCurrentPanel = EnumPanel.AVIAO;
                    telaInicial.setNavTxt("CADASTRO --> AVIAO");
                    break;
                default:
                    break;
            }
        }

        refreshPanels();
    }

    private void refreshPanels() {
        this.currentJPanel.setVisible(false);

        if (null != enumCurrentPanel) {
            switch (enumCurrentPanel) {
                case PASSAGEIRO:
                    this.currentJPanel = cadastroPassageiro;
                    this.jPanelDesktop.add(cadastroPassageiro, BorderLayout.CENTER);
                    break;
                case DESTINO:
                    this.currentJPanel = cadastroDestino;
                    this.jPanelDesktop.add(cadastroDestino, BorderLayout.CENTER);
                    break;
                case AVIAO:
                    this.currentJPanel = cadastroAviao;
                    this.jPanelDesktop.add(cadastroAviao, BorderLayout.CENTER);
                    break;
                default:
                    break;
            }
        }

        this.currentJPanel.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        jLabelPassageiro = new javax.swing.JLabel();
        jLabelDestino = new javax.swing.JLabel();
        jLabelBagagem = new javax.swing.JLabel();
        jPanelDesktop = new javax.swing.JPanel();
        jLabelAviao = new javax.swing.JLabel();

        jPanelBackground.setBackground(new java.awt.Color(44, 102, 152));

        jLabelPassageiro.setBackground(new java.awt.Color(61, 113, 160));
        jLabelPassageiro.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabelPassageiro.setForeground(new java.awt.Color(232, 233, 232));
        jLabelPassageiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPassageiro.setText("CLIENTE/PASSAGEIRO");
        jLabelPassageiro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 89, 133), 1, true));
        jLabelPassageiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelPassageiro.setName("botao"); // NOI18N
        jLabelPassageiro.setOpaque(true);
        jLabelPassageiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPassageiroMouseClicked(evt);
            }
        });

        jLabelDestino.setBackground(new java.awt.Color(61, 113, 160));
        jLabelDestino.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabelDestino.setForeground(new java.awt.Color(232, 233, 232));
        jLabelDestino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDestino.setText("DESTINO");
        jLabelDestino.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 89, 133), 1, true));
        jLabelDestino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelDestino.setName("botao"); // NOI18N
        jLabelDestino.setOpaque(true);
        jLabelDestino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDestinoMouseClicked(evt);
            }
        });

        jLabelBagagem.setBackground(new java.awt.Color(61, 113, 160));
        jLabelBagagem.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabelBagagem.setForeground(new java.awt.Color(232, 233, 232));
        jLabelBagagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBagagem.setText("BAGAGEM");
        jLabelBagagem.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 89, 133), 1, true));
        jLabelBagagem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelBagagem.setName("botao"); // NOI18N
        jLabelBagagem.setOpaque(true);

        jPanelDesktop.setBackground(new java.awt.Color(36, 89, 133));

        javax.swing.GroupLayout jPanelDesktopLayout = new javax.swing.GroupLayout(jPanelDesktop);
        jPanelDesktop.setLayout(jPanelDesktopLayout);
        jPanelDesktopLayout.setHorizontalGroup(
            jPanelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelDesktopLayout.setVerticalGroup(
            jPanelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        jLabelAviao.setBackground(new java.awt.Color(61, 113, 160));
        jLabelAviao.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabelAviao.setForeground(new java.awt.Color(232, 233, 232));
        jLabelAviao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAviao.setText("AVIAO");
        jLabelAviao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 89, 133), 1, true));
        jLabelAviao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAviao.setName("botao"); // NOI18N
        jLabelAviao.setOpaque(true);
        jLabelAviao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAviaoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabelPassageiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDestino, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelBagagem, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelAviao, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassageiro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBagagem, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAviao, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanelDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelPassageiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPassageiroMouseClicked
        changePanel(EnumPanel.PASSAGEIRO);
    }//GEN-LAST:event_jLabelPassageiroMouseClicked

    private void jLabelDestinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDestinoMouseClicked
        changePanel(EnumPanel.DESTINO);
    }//GEN-LAST:event_jLabelDestinoMouseClicked

    private void jLabelAviaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAviaoMouseClicked
        changePanel(EnumPanel.AVIAO);
    }//GEN-LAST:event_jLabelAviaoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAviao;
    private javax.swing.JLabel jLabelBagagem;
    private javax.swing.JLabel jLabelDestino;
    private javax.swing.JLabel jLabelPassageiro;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelDesktop;
    // End of variables declaration//GEN-END:variables
}
