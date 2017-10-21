package local.model;

import local.util.LabelButtonAnimationMouseListener;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TemplateDosPaineis {

    JPanel painel;

    public TemplateDosPaineis(JPanel painelBotoes) {
        this.painel = painelBotoes;
        botoesMouseListener();
    }

    private void botoesMouseListener() {
        for (int i = 0; i < this.painel.getComponentCount(); i++) {
            Component tempComp = this.painel.getComponent(i);
            try {
                if (tempComp.getName().equals("botao")) {
                    tempComp.addMouseListener(new LabelButtonAnimationMouseListener((JLabel) tempComp));
                }
            } catch (Exception e) {
            }
        }
    }

}
