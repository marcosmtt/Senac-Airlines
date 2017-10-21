/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local.model;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Yuri
 */
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
