package local.view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import local.model.TemplateDosPaineis;

/**
 *
 * @author Yuri
 */
public class PanelVoos extends javax.swing.JPanel {

    private TelaInicial telaInicial;
    private JPanel currentJPanel;
    private PanelCadastroPassageiro cadastroPassageiro;

    private enum EnumPanel {
        PASSAGEIRO, AVIAO, VOOS, BAGAGEM
    }
    private EnumPanel enumCurrentPanel;

    public PanelVoos(TelaInicial telaInicial) {
        initComponents();
        new TemplateDosPaineis(this.jPanelBackground);
        this.telaInicial = telaInicial;
        cadastroPassageiro = new PanelCadastroPassageiro();
        this.jPanelDesktop.add(cadastroPassageiro);

        this.jPanelDesktop.setLayout(new BorderLayout());
        this.enumCurrentPanel = null;

        //PAINEIS DA TELA INICIAL
        cadastroPassageiro = new PanelCadastroPassageiro();

        this.jPanelDesktop.add(cadastroPassageiro, BorderLayout.CENTER);
        this.cadastroPassageiro.setVisible(false);

        this.currentJPanel = cadastroPassageiro;
        //--
        this.paintComponents(this.getGraphics());
    }

    private void changePanel(EnumPanel panelName) {

        if (panelName == EnumPanel.PASSAGEIRO) {
            this.enumCurrentPanel = EnumPanel.PASSAGEIRO;
            refreshPanels();
        }

    }

    private void refreshPanels() {
        this.currentJPanel.setVisible(false);

        if (enumCurrentPanel == EnumPanel.PASSAGEIRO) {
            this.currentJPanel = cadastroPassageiro;
        }

        this.currentJPanel.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        jPanelDesktop = new javax.swing.JPanel();

        jPanelBackground.setBackground(new java.awt.Color(44, 102, 152));

        jPanelDesktop.setBackground(new java.awt.Color(49, 65, 99));

        javax.swing.GroupLayout jPanelDesktopLayout = new javax.swing.GroupLayout(jPanelDesktop);
        jPanelDesktop.setLayout(jPanelDesktopLayout);
        jPanelDesktopLayout.setHorizontalGroup(
            jPanelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
        );
        jPanelDesktopLayout.setVerticalGroup(
            jPanelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelDesktop;
    // End of variables declaration//GEN-END:variables
}
