package local.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import local.controller.Sistema;
import local.model.database.Avioes;
import local.view.PanelVoos;

public class VoosGraphics {

    private PanelVoos voos;
    private Sistema sistema;
    private List<Avioes> avioesCadastrados;

    public VoosGraphics(PanelVoos voos, Sistema sistema) {
        this.voos = voos;
        this.sistema = sistema;
        timer.start();
        avioesCadastrados = sistema.select(new Avioes());
    }

    public void updateAvioesList() {
        avioesCadastrados = sistema.select(new Avioes());
    }

    ActionListener update = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JLabel[] labelAviao = {voos.getjLabelAviao(), voos.getjLabelAviao1(), voos.getjLabelAviao2(), voos.getjLabelAviao3()};
            JLabel[] labelAviaoLine = {voos.getjLabelAviaoLine(), voos.getjLabelAviaoLine1(), voos.getjLabelAviaoLine2(), voos.getjLabelAviaoLine3()};
            JPanel[] panelLAviao = {voos.getjPanelLAviao(), voos.getjPanelLAviao1(), voos.getjPanelLAviao2(), voos.getjPanelLAviao3()};
            JPanel[] panelRAviao = {voos.getjPanelRAviao(), voos.getjPanelRAviao1(), voos.getjPanelRAviao2(), voos.getjPanelRAviao3()};
            
            for (int i = 0; i < 4; i++) {
                double distanciaAteFinalPX = labelAviao[i].getLocation().x - panelRAviao[i].getLocation().x;
                System.out.println(distanciaAteFinalPX);
                int velocidade = 0;
                try {
                    velocidade = avioesCadastrados.get(i).getVelocidade();
                } catch (Exception ex) {
                }
                labelAviao[i].setLocation(labelAviao[i].getLocation().x + 2, labelAviao[i].getLocation().y);
                labelAviaoLine[i].setSize(labelAviaoLine[i].getWidth() - 2, labelAviaoLine[i].getHeight());
                labelAviaoLine[i].setLocation(labelAviaoLine[i].getLocation().x + 2, labelAviaoLine[i].getLocation().y);
            }
        }
    };

    Timer timer = new Timer(50, update);

}
