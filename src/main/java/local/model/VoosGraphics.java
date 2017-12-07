package local.model;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import local.controller.Sistema;
import local.model.database.Avioes;
import local.model.database.Destino;
import local.model.database.Voos;
import local.util.GetDateTime;
import local.view.PanelVoos;

public class VoosGraphics {

    private PanelVoos voosPanel;
    private Sistema sistema;
    private List<Avioes> avioesCadastrados;
    private List<Voos> voosList;
    private int numPagina = 1;
    private int numTotalPagina = 1;

    private double[] posicaoXinicialAvioes = new double[4];
    private int[] posicaoXfinalAvioes = new int[4];
    private double[] posicaoXinicialLines = new double[4];
    private double[] posicaoXfinalLines = new double[4];
    private int[] widthLine = new int[4];
    private JPanel[] jpanelR = new JPanel[4];

    private double[] kmPercorrido = new double[4];

    private JLabel[] labelAviao = new JLabel[4];
    private JLabel[] labelAviaoLine = new JLabel[4];

    private final JLabel[] labelModelo = new JLabel[4];
    private final JLabel[] labelVoo = new JLabel[4];
    private final JLabel[] labelStatus = new JLabel[4];

    private final JLabel[] labelDestino = new JLabel[4];
    private final JLabel[] labelVelocidade = new JLabel[4];
    private final JLabel[] labelTempoRest = new JLabel[4];

    public VoosGraphics(PanelVoos voos, Sistema sistema) {
        this.voosPanel = voos;
        this.sistema = sistema;
        timer.start();
        avioesCadastrados = sistema.select(new Avioes());
        voosList = sistema.getJpaVoos().findVoosEntities();

        labelAviao[0] = voosPanel.getjLabelAviao1();
        labelAviao[1] = voosPanel.getjLabelAviao2();
        labelAviao[2] = voosPanel.getjLabelAviao3();
        labelAviao[3] = voosPanel.getjLabelAviao4();

        labelAviaoLine[0] = voosPanel.getjLabelAviaoLine1();
        labelAviaoLine[1] = voosPanel.getjLabelAviaoLine2();
        labelAviaoLine[2] = voosPanel.getjLabelAviaoLine3();
        labelAviaoLine[3] = voosPanel.getjLabelAviaoLine4();

        labelModelo[0] = voosPanel.getjLabelModelo1();
        labelModelo[1] = voosPanel.getjLabelModelo2();
        labelModelo[2] = voosPanel.getjLabelModelo3();
        labelModelo[3] = voosPanel.getjLabelModelo4();

        labelVoo[0] = voosPanel.getjLabelVoo1();
        labelVoo[1] = voosPanel.getjLabelVoo2();
        labelVoo[2] = voosPanel.getjLabelVoo3();
        labelVoo[3] = voosPanel.getjLabelVoo4();

        labelStatus[0] = voosPanel.getjLabelStatus1();
        labelStatus[1] = voosPanel.getjLabelStatus2();
        labelStatus[2] = voosPanel.getjLabelStatus3();
        labelStatus[3] = voosPanel.getjLabelStatus4();

        labelDestino[0] = voosPanel.getjLabelDestino1();
        labelDestino[1] = voosPanel.getjLabelDestino2();
        labelDestino[2] = voosPanel.getjLabelDestino3();
        labelDestino[3] = voosPanel.getjLabelDestino4();

        labelVelocidade[0] = voosPanel.getjLabelVelocidade1();
        labelVelocidade[1] = voosPanel.getjLabelVelocidade2();
        labelVelocidade[2] = voosPanel.getjLabelVelocidade3();
        labelVelocidade[3] = voosPanel.getjLabelVelocidade4();

        labelTempoRest[0] = voosPanel.getjLabelTempo1();
        labelTempoRest[1] = voosPanel.getjLabelTempo2();
        labelTempoRest[2] = voosPanel.getjLabelTempo3();
        labelTempoRest[3] = voosPanel.getjLabelTempo4();

        jpanelR[0] = voosPanel.getjPanelRAviao1();
        jpanelR[1] = voosPanel.getjPanelRAviao2();
        jpanelR[2] = voosPanel.getjPanelRAviao3();
        jpanelR[3] = voosPanel.getjPanelRAviao4();

        voosPanel.setVisible(true);

        setOriginPositions();
    }

    public void setOriginPositions() {
        for (int i = 0; i < 4; i++) {
            posicaoXinicialLines[i] = labelAviaoLine[i].getLocation().getX();
            posicaoXinicialAvioes[i] = labelAviao[i].getLocation().getX();
            posicaoXfinalLines[i] = labelAviaoLine[i].getLocation().getX() + labelAviaoLine[i].getWidth();
            widthLine[i] = labelAviaoLine[i].getWidth();
        }
    }

    public void updateAvioesList() {
        avioesCadastrados = sistema.select(new Avioes());
    }
    public void reset() {
        List<Voos> voos = sistema.getJpaVoos().findVoosEntities();
        for (int i = 0; i < voos.size(); i++) {
            voos.get(i).setStatus("decolou");
            try {
                sistema.getJpaVoos().edit(voos.get(i));
            } catch (Exception ex) {
                System.out.println("erro reset");
            }
        }
    }

    ActionListener update = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            List<Voos> voosNaoFinalizados = sistema.getJpaVoos().findVoosEntities();
//            for (int i = 0; i < voosNaoFinalizados.size(); i++) {
//                if (voosNaoFinalizados.get(i).getStatus().equals("pousou")) {
//                    voosNaoFinalizados.remove(i);
//                    i--;
//                }
//            }
            numTotalPagina = (int) Math.round((voosNaoFinalizados.size() / 4) + 0.5);
            voosPanel.update();

            for (int i = 0; i < 4; i++) {
                try {
                    int id = i + ((numPagina - 1) * 4);
                    Voos voo = voosNaoFinalizados.get(id);
                    Destino destino = sistema.getJpaDestino().findDestino((long) voo.getAeroportoDestinoID());
                    Avioes aviao = sistema.getJpaAvioes().findAvioes(voo.getAviaoID());
                    if (voosNaoFinalizados.get(i).getStatus().equals("finalizado")) {
                        labelAviaoLine[i].setSize(1, labelAviaoLine[i].getHeight());
                        labelAviaoLine[i].setLocation((int) jpanelR[i].getX() - 10, labelAviaoLine[i].getLocation().y);
                        labelAviao[i].setLocation((int) labelAviaoLine[i].getX() - 20, labelAviao[i].getLocation().y);
                        updateInfo(i, aviao, voo, destino, kmPercorrido[i], voosNaoFinalizados);
                        sistema.getJpaVoos().edit(voo);
                    } else {
                        GetDateTime getTime = new GetDateTime();

                        int horaAtual = Integer.parseInt(getTime.getHoraAtual());
                        int minutoAtual = Integer.parseInt(getTime.getMinutoAtual());
                        String decolagem = voo.getHoraDecolagem();
                        String[] split = decolagem.split(":");
                        int horaDecolagem = Integer.parseInt(split[0]);
                        int minutoDecolagem = Integer.parseInt(split[1]);
                        if (horaAtual >= horaDecolagem) {
                            if (horaAtual == horaDecolagem && minutoAtual >= minutoDecolagem) {
                                voo.setStatus("decolou");
                            } else if (horaAtual > horaDecolagem) {
                                voo.setStatus("decolou");
                            }
                            sistema.getJpaVoos().edit(voo);
                        } else {
                            System.out.println("menor");
                            int horaRest = horaDecolagem - horaAtual;
                            int minRest = -(minutoDecolagem - minutoAtual);
                            voo.setStatus("decola em " + horaRest + "h" + minRest);
                            sistema.getJpaVoos().edit(voo);
                        }

                        double pixelDistanciaMaxima = widthLine[i];
                        double kmDistanciaMaxima = destino.getDistancia();
                        double kmPmilSeg = (aviao.getVelocidade() / 3600.0) / 10.0;

                        kmPercorrido[i] = kmPercorrido[i] + kmPmilSeg;
                        double pixelPkm = pixelDistanciaMaxima / kmDistanciaMaxima;

//                    for (int j = 0; j < 4; j++) {
//                        labelAviaoLine[j].setBackground(new Color(55, 153, 0));
//                    }
                        if (destino.getDistancia() <= kmPercorrido[i]) {
                            voo.setStatus("finalizado");
                            sistema.getJpaVoos().edit(voo);
                        } else if (voosNaoFinalizados.get(i).getStatus().equals("decolou")) {
                            widthLine[i] = jpanelR[i].getX() - 10 - (labelVoo[i].getX() + labelVoo[i].getWidth() + 50);

                            labelAviaoLine[i].setSize((int) (widthLine[i] - kmPercorrido[i] * pixelPkm), labelAviaoLine[i].getHeight());
                            labelAviaoLine[i].setLocation((int) (posicaoXinicialLines[i] + kmPercorrido[i] * pixelPkm), labelAviaoLine[i].getLocation().y);
                            labelAviaoLine[i].setSize(jpanelR[i].getX() - labelAviaoLine[i].getX() - 10, labelAviaoLine[i].getHeight());
                            labelAviao[i].setLocation((int) (posicaoXinicialAvioes[i] + kmPercorrido[i] * pixelPkm), labelAviao[i].getLocation().y);
                        }

                        updateInfo(i, aviao, voo, destino, kmPercorrido[i], voosNaoFinalizados);
                    }
                } catch (Exception ex) {
//                    JOptionPane.showMessageDialog(null, ex.getStackTrace());
                    reset(i);
                }
            }
        }
    };

    Timer timer = new Timer(100, update);

    private void updateInfo(int i, Avioes aviao, Voos voo, Destino destino, double kmPercorrido, List<Voos> voosNaoFinalizados) {
//        for (int j = 0; j < 4; j++) {
//            labelAviaoLine[j].setBackground(new Color(23, 25, 26));
//        }

        labelModelo[i].setText(aviao.getModelo());
        labelVoo[i].setText(String.valueOf(voo.getId()));
        labelStatus[i].setForeground(Color.GREEN);
        labelStatus[i].setText(voosNaoFinalizados.get(i + ((numPagina - 1) * 4)).getStatus());
        labelDestino[i].setText(destino.getNome());
        labelVelocidade[i].setText(String.valueOf(aviao.getVelocidade()) + "km/h");
        double minutes = (destino.getDistancia() - kmPercorrido) / aviao.getVelocidade() * 60;
        String text;
        if (destino.getDistancia() <= kmPercorrido) {
            text = "finalizado";
        } else if (voosNaoFinalizados.get(i + ((numPagina - 1) * 4)).getStatus().equals("decolou")) {
            if (((int) minutes) == 0) {
                text = "pousando em  segundos...";
            } else {
                text = String.valueOf((int) minutes + "min ");
            }
//        text = String.valueOf((int) minutes + "min " + String.format("%.2f", ((minutes - ((int) minutes)) * 60)) + "seg");
//        text = String.valueOf((int) minutes + "min " + (int) ((minutes - ((int) minutes)) * 60)) + "seg";
        } else {
            text = " - ";
        }
        labelTempoRest[i].setText(text);

    }

    private void reset(int i) {
        labelModelo[i].setText(" - ");
        labelVoo[i].setText(" - ");
        labelStatus[i].setForeground(Color.GREEN);
        labelStatus[i].setText(" - ");
        labelDestino[i].setText(" - ");
        labelVelocidade[i].setText(" - " + "km/h");
        labelTempoRest[i].setText(" - ");
    }

    public int getNumPagina() {
        return numPagina;
    }

    public void setNumPagina(int numPagina) {
        this.numPagina = numPagina;
    }

    public int getNumTotalPagina() {
        return numTotalPagina;
    }

    public void setNumTotalPagina(int numTotalPagina) {
        this.numTotalPagina = numTotalPagina;
    }

}
