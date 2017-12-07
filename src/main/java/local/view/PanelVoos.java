package local.view;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import local.controller.Sistema;
import local.model.VoosGraphics;

public class PanelVoos extends javax.swing.JPanel {

    private VoosGraphics graphics;
    private int numPagina;
    private int numTotal;

    public PanelVoos(Sistema sistema) {
        initComponents();
        graphics = new VoosGraphics(this, sistema);
        this.repaint();
        update();
    }

    public void update() {
        numPagina = graphics.getNumPagina();
        numTotal = graphics.getNumTotalPagina();
        this.jLabelHead.setText("Aviões -> " + numPagina + "/" + numTotal);
    }

    private void next() {
        if (numPagina < numTotal) {
            numPagina += 1;
            graphics.setNumPagina(numPagina);
            this.jLabelHead.setText("Aviões -> " + numPagina + "/" + numTotal);
        }
    }

    private void back() {
        if (numPagina > 1) {
            numPagina -= 1;
            graphics.setNumPagina(numPagina);
            this.jLabelHead.setText("Aviões -> " + numPagina + "/" + numTotal);
        }
    }

    public JLabel getjLabelAviao1() {
        return jLabelAviao1;
    }

    public JLabel getjLabelAviao2() {
        return jLabelAviao2;
    }

    public JLabel getjLabelAviao3() {
        return jLabelAviao3;
    }

    public JLabel getjLabelAviaoLine1() {
        return jLabelAviaoLine1;
    }

    public JLabel getjLabelAviaoLine2() {
        return jLabelAviaoLine2;
    }

    public JLabel getjLabelAviaoLine3() {
        return jLabelAviaoLine3;
    }

    public JPanel getjPanelRAviao1() {
        return jPanelRAviao1;
    }

    public JPanel getjPanelRAviao2() {
        return jPanelRAviao2;
    }

    public JPanel getjPanelRAviao3() {
        return jPanelRAviao3;
    }

    public JLabel getjLabelAviao4() {
        return jLabelAviao4;
    }

    public JLabel getjLabelAviaoLine4() {
        return jLabelAviaoLine4;
    }

    public JPanel getjPanelRAviao4() {
        return jPanelRAviao4;
    }

    public JLabel getjLabelDestino1() {
        return jLabelDestino1;
    }

    public JLabel getjLabelDestino2() {
        return jLabelDestino2;
    }

    public JLabel getjLabelDestino3() {
        return jLabelDestino3;
    }

    public JLabel getjLabelDestino4() {
        return jLabelDestino4;
    }

    public JLabel getjLabelModelo1() {
        return jLabelModelo1;
    }

    public JLabel getjLabelModelo2() {
        return jLabelModelo2;
    }

    public JLabel getjLabelModelo3() {
        return jLabelModelo3;
    }

    public JLabel getjLabelModelo4() {
        return jLabelModelo4;
    }

    public JLabel getjLabelStatus1() {
        return jLabelStatus1;
    }

    public JLabel getjLabelStatus2() {
        return jLabelStatus2;
    }

    public JLabel getjLabelStatus3() {
        return jLabelStatus3;
    }

    public JLabel getjLabelStatus4() {
        return jLabelStatus4;
    }

    public JLabel getjLabelTempo1() {
        return jLabelTempo1;
    }

    public JLabel getjLabelTempo2() {
        return jLabelTempo2;
    }

    public JLabel getjLabelTempo3() {
        return jLabelTempo3;
    }

    public JLabel getjLabelTempo4() {
        return jLabelTempo4;
    }

    public JLabel getjLabelVelocidade1() {
        return jLabelVelocidade1;
    }

    public JLabel getjLabelVelocidade2() {
        return jLabelVelocidade2;
    }

    public JLabel getjLabelVelocidade3() {
        return jLabelVelocidade3;
    }

    public JLabel getjLabelVelocidade4() {
        return jLabelVelocidade4;
    }

    public JLabel getjLabelVoo1() {
        return jLabelVoo1;
    }

    public JLabel getjLabelVoo2() {
        return jLabelVoo2;
    }

    public JLabel getjLabelVoo3() {
        return jLabelVoo3;
    }

    public JLabel getjLabelVoo4() {
        return jLabelVoo4;
    }

    public VoosGraphics getGraphicsX() {
        return graphics;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        jPanelDesktop = new javax.swing.JPanel();
        jLabelDesktopTitle = new javax.swing.JLabel();
        jLabelDesktopTitle5 = new javax.swing.JLabel();
        jLabelHead = new javax.swing.JLabel();
        jPanelExemplo = new javax.swing.JPanel();
        jLabelStatus1 = new javax.swing.JLabel();
        jLabelAviao1 = new javax.swing.JLabel();
        jLabelVoo1 = new javax.swing.JLabel();
        jLabelModelo1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabelAviaoLine1 = new javax.swing.JLabel();
        jPanelRAviao1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabelDestino1 = new javax.swing.JLabel();
        jLabelVelocidade1 = new javax.swing.JLabel();
        jLabelTempo1 = new javax.swing.JLabel();
        jPanelExemplo1 = new javax.swing.JPanel();
        jPanelRAviao2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabelDestino2 = new javax.swing.JLabel();
        jLabelVelocidade2 = new javax.swing.JLabel();
        jLabelTempo2 = new javax.swing.JLabel();
        jLabelAviaoLine2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabelVoo2 = new javax.swing.JLabel();
        jLabelStatus2 = new javax.swing.JLabel();
        jLabelModelo2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabelAviao2 = new javax.swing.JLabel();
        jPanelExemplo2 = new javax.swing.JPanel();
        jLabelAviao3 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabelStatus3 = new javax.swing.JLabel();
        jLabelVoo3 = new javax.swing.JLabel();
        jLabelModelo3 = new javax.swing.JLabel();
        jLabelAviaoLine3 = new javax.swing.JLabel();
        jPanelRAviao3 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabelDestino3 = new javax.swing.JLabel();
        jLabelVelocidade3 = new javax.swing.JLabel();
        jLabelTempo3 = new javax.swing.JLabel();
        jPanelExemplo3 = new javax.swing.JPanel();
        jLabelAviao4 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabelStatus4 = new javax.swing.JLabel();
        jLabelVoo4 = new javax.swing.JLabel();
        jLabelModelo4 = new javax.swing.JLabel();
        jLabelAviaoLine4 = new javax.swing.JLabel();
        jPanelRAviao4 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabelDestino4 = new javax.swing.JLabel();
        jLabelVelocidade4 = new javax.swing.JLabel();
        jLabelTempo4 = new javax.swing.JLabel();
        jButtonNext = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jButtonNext1 = new javax.swing.JButton();

        jPanelBackground.setBackground(new java.awt.Color(44, 102, 152));

        jPanelDesktop.setBackground(new java.awt.Color(23, 25, 26));

        jLabelDesktopTitle.setBackground(new java.awt.Color(0, 0, 0));
        jLabelDesktopTitle.setFont(new java.awt.Font("Gisha", 1, 17)); // NOI18N
        jLabelDesktopTitle.setForeground(new java.awt.Color(204, 204, 204));
        jLabelDesktopTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDesktopTitle.setText("MONITOR AVIOES");
        jLabelDesktopTitle.setOpaque(true);

        jLabelDesktopTitle5.setBackground(new java.awt.Color(0, 0, 0));
        jLabelDesktopTitle5.setFont(new java.awt.Font("Gisha", 1, 10)); // NOI18N
        jLabelDesktopTitle5.setForeground(new java.awt.Color(232, 233, 232));
        jLabelDesktopTitle5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDesktopTitle5.setOpaque(true);

        jLabelHead.setBackground(new java.awt.Color(19, 18, 18));
        jLabelHead.setFont(new java.awt.Font("Gisha", 1, 10)); // NOI18N
        jLabelHead.setForeground(new java.awt.Color(204, 204, 204));
        jLabelHead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHead.setText("Aviões -> 1/1");
        jLabelHead.setOpaque(true);

        jPanelExemplo.setBackground(new java.awt.Color(23, 25, 26));

        jLabelStatus1.setForeground(new java.awt.Color(0, 204, 0));
        jLabelStatus1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelStatus1.setText("em espera...");

        jLabelAviao1.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        jLabelAviao1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAviao1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelAviao1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Airplane_Mode_On_25px.png"))); // NOI18N
        jLabelAviao1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabelAviao1.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabelVoo1.setForeground(new java.awt.Color(204, 204, 204));
        jLabelVoo1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelVoo1.setText("xxxxx");

        jLabelModelo1.setForeground(new java.awt.Color(204, 204, 204));
        jLabelModelo1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelModelo1.setText("xxxxx");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Status:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Avião:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Voo:");

        jLabelAviaoLine1.setBackground(new java.awt.Color(255, 153, 0));
        jLabelAviaoLine1.setFont(new java.awt.Font("Gisha", 1, 10)); // NOI18N
        jLabelAviaoLine1.setForeground(new java.awt.Color(232, 233, 232));
        jLabelAviaoLine1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAviaoLine1.setOpaque(true);

        jPanelRAviao1.setBackground(new java.awt.Color(22, 25, 26));
        jPanelRAviao1.setPreferredSize(new java.awt.Dimension(250, 60));
        jPanelRAviao1.setRequestFocusEnabled(false);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Destino:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("Velocidade:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Tempo Rest.");

        jLabelDestino1.setForeground(new java.awt.Color(204, 204, 204));
        jLabelDestino1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDestino1.setText("xxxxx");

        jLabelVelocidade1.setForeground(new java.awt.Color(204, 204, 204));
        jLabelVelocidade1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVelocidade1.setText("XXXkm/h");

        jLabelTempo1.setForeground(new java.awt.Color(0, 204, 204));
        jLabelTempo1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTempo1.setText("xx:xx");

        javax.swing.GroupLayout jPanelRAviao1Layout = new javax.swing.GroupLayout(jPanelRAviao1);
        jPanelRAviao1.setLayout(jPanelRAviao1Layout);
        jPanelRAviao1Layout.setHorizontalGroup(
            jPanelRAviao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRAviao1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanelRAviao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRAviao1Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTempo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelRAviao1Layout.createSequentialGroup()
                        .addGroup(jPanelRAviao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addGroup(jPanelRAviao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRAviao1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabelDestino1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelRAviao1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabelVelocidade1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))))))
        );
        jPanelRAviao1Layout.setVerticalGroup(
            jPanelRAviao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRAviao1Layout.createSequentialGroup()
                .addGroup(jPanelRAviao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabelDestino1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRAviao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabelVelocidade1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRAviao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabelTempo1)))
        );

        javax.swing.GroupLayout jPanelExemploLayout = new javax.swing.GroupLayout(jPanelExemplo);
        jPanelExemplo.setLayout(jPanelExemploLayout);
        jPanelExemploLayout.setHorizontalGroup(
            jPanelExemploLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExemploLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelExemploLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelExemploLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelExemploLayout.createSequentialGroup()
                        .addGroup(jPanelExemploLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelExemploLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelVoo1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelModelo1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabelAviao1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabelAviaoLine1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(jPanelRAviao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelExemploLayout.setVerticalGroup(
            jPanelExemploLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExemploLayout.createSequentialGroup()
                .addGroup(jPanelExemploLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelExemploLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabelAviaoLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelRAviao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelExemploLayout.createSequentialGroup()
                        .addGroup(jPanelExemploLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabelModelo1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelExemploLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabelVoo1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelExemploLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabelStatus1)))
                    .addComponent(jLabelAviao1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        jPanelExemplo1.setBackground(new java.awt.Color(23, 25, 26));

        jPanelRAviao2.setBackground(new java.awt.Color(22, 25, 26));
        jPanelRAviao2.setPreferredSize(new java.awt.Dimension(250, 60));
        jPanelRAviao2.setRequestFocusEnabled(false);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("Destino:");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("Velocidade:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setText("Tempo Rest.");

        jLabelDestino2.setForeground(new java.awt.Color(204, 204, 204));
        jLabelDestino2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDestino2.setText("xxxxx");

        jLabelVelocidade2.setForeground(new java.awt.Color(204, 204, 204));
        jLabelVelocidade2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVelocidade2.setText("XXXkm/h");

        jLabelTempo2.setForeground(new java.awt.Color(0, 204, 204));
        jLabelTempo2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTempo2.setText("xx:xx");

        javax.swing.GroupLayout jPanelRAviao2Layout = new javax.swing.GroupLayout(jPanelRAviao2);
        jPanelRAviao2.setLayout(jPanelRAviao2Layout);
        jPanelRAviao2Layout.setHorizontalGroup(
            jPanelRAviao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRAviao2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanelRAviao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRAviao2Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTempo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelRAviao2Layout.createSequentialGroup()
                        .addGroup(jPanelRAviao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addGroup(jPanelRAviao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRAviao2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabelDestino2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelRAviao2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabelVelocidade2, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))))))
        );
        jPanelRAviao2Layout.setVerticalGroup(
            jPanelRAviao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRAviao2Layout.createSequentialGroup()
                .addGroup(jPanelRAviao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabelDestino2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRAviao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabelVelocidade2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRAviao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabelTempo2)))
        );

        jLabelAviaoLine2.setBackground(new java.awt.Color(255, 153, 0));
        jLabelAviaoLine2.setFont(new java.awt.Font("Gisha", 1, 10)); // NOI18N
        jLabelAviaoLine2.setForeground(new java.awt.Color(232, 233, 232));
        jLabelAviaoLine2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAviaoLine2.setOpaque(true);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Status:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Avião:");

        jLabelVoo2.setForeground(new java.awt.Color(204, 204, 204));
        jLabelVoo2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelVoo2.setText("xxxxx");

        jLabelStatus2.setForeground(new java.awt.Color(0, 204, 0));
        jLabelStatus2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelStatus2.setText("em espera...");

        jLabelModelo2.setForeground(new java.awt.Color(204, 204, 204));
        jLabelModelo2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelModelo2.setText("xxxxx");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Voo:");

        jLabelAviao2.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        jLabelAviao2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAviao2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelAviao2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Airplane_Mode_On_25px.png"))); // NOI18N
        jLabelAviao2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabelAviao2.setPreferredSize(new java.awt.Dimension(200, 100));

        javax.swing.GroupLayout jPanelExemplo1Layout = new javax.swing.GroupLayout(jPanelExemplo1);
        jPanelExemplo1.setLayout(jPanelExemplo1Layout);
        jPanelExemplo1Layout.setHorizontalGroup(
            jPanelExemplo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExemplo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelExemplo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelExemplo1Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelStatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelExemplo1Layout.createSequentialGroup()
                        .addGroup(jPanelExemplo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelExemplo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelVoo2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelModelo2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabelAviao2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabelAviaoLine2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(jPanelRAviao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelExemplo1Layout.setVerticalGroup(
            jPanelExemplo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExemplo1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabelAviaoLine2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanelRAviao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanelExemplo1Layout.createSequentialGroup()
                .addGroup(jPanelExemplo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabelModelo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelExemplo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabelVoo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelExemplo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabelStatus2)))
            .addComponent(jLabelAviao2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelExemplo2.setBackground(new java.awt.Color(23, 25, 26));

        jLabelAviao3.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        jLabelAviao3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAviao3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelAviao3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Airplane_Mode_On_25px.png"))); // NOI18N
        jLabelAviao3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabelAviao3.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setText("Avião:");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("Voo:");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setText("Status:");

        jLabelStatus3.setForeground(new java.awt.Color(0, 204, 0));
        jLabelStatus3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelStatus3.setText("em espera...");

        jLabelVoo3.setForeground(new java.awt.Color(204, 204, 204));
        jLabelVoo3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelVoo3.setText("xxxxx");

        jLabelModelo3.setForeground(new java.awt.Color(204, 204, 204));
        jLabelModelo3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelModelo3.setText("xxxxx");

        jLabelAviaoLine3.setBackground(new java.awt.Color(255, 153, 0));
        jLabelAviaoLine3.setFont(new java.awt.Font("Gisha", 1, 10)); // NOI18N
        jLabelAviaoLine3.setForeground(new java.awt.Color(232, 233, 232));
        jLabelAviaoLine3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAviaoLine3.setOpaque(true);

        jPanelRAviao3.setBackground(new java.awt.Color(22, 25, 26));
        jPanelRAviao3.setPreferredSize(new java.awt.Dimension(250, 60));
        jPanelRAviao3.setRequestFocusEnabled(false);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(204, 204, 204));
        jLabel34.setText("Destino:");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 204, 204));
        jLabel35.setText("Velocidade:");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 204, 204));
        jLabel36.setText("Tempo Rest.");

        jLabelDestino3.setForeground(new java.awt.Color(204, 204, 204));
        jLabelDestino3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDestino3.setText("xxxxx");

        jLabelVelocidade3.setForeground(new java.awt.Color(204, 204, 204));
        jLabelVelocidade3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVelocidade3.setText("XXXkm/h");

        jLabelTempo3.setForeground(new java.awt.Color(0, 204, 204));
        jLabelTempo3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTempo3.setText("xx:xx");

        javax.swing.GroupLayout jPanelRAviao3Layout = new javax.swing.GroupLayout(jPanelRAviao3);
        jPanelRAviao3.setLayout(jPanelRAviao3Layout);
        jPanelRAviao3Layout.setHorizontalGroup(
            jPanelRAviao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRAviao3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanelRAviao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRAviao3Layout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTempo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelRAviao3Layout.createSequentialGroup()
                        .addGroup(jPanelRAviao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35))
                        .addGroup(jPanelRAviao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRAviao3Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabelDestino3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelRAviao3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabelVelocidade3, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))))))
        );
        jPanelRAviao3Layout.setVerticalGroup(
            jPanelRAviao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRAviao3Layout.createSequentialGroup()
                .addGroup(jPanelRAviao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabelDestino3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRAviao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jLabelVelocidade3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRAviao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jLabelTempo3)))
        );

        javax.swing.GroupLayout jPanelExemplo2Layout = new javax.swing.GroupLayout(jPanelExemplo2);
        jPanelExemplo2.setLayout(jPanelExemplo2Layout);
        jPanelExemplo2Layout.setHorizontalGroup(
            jPanelExemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExemplo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelExemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelExemplo2Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelStatus3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelExemplo2Layout.createSequentialGroup()
                        .addGroup(jPanelExemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelExemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelVoo3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelModelo3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabelAviao3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAviaoLine3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(jPanelRAviao3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelExemplo2Layout.setVerticalGroup(
            jPanelExemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExemplo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelExemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelExemplo2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabelAviaoLine3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelRAviao3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelExemplo2Layout.createSequentialGroup()
                        .addGroup(jPanelExemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(jLabelModelo3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelExemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jLabelVoo3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelExemplo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(jLabelStatus3)))
                    .addComponent(jLabelAviao3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelExemplo3.setBackground(new java.awt.Color(23, 25, 26));

        jLabelAviao4.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        jLabelAviao4.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAviao4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelAviao4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Airplane_Mode_On_25px.png"))); // NOI18N
        jLabelAviao4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabelAviao4.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(204, 204, 204));
        jLabel37.setText("Avião:");

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(204, 204, 204));
        jLabel53.setText("Voo:");

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(204, 204, 204));
        jLabel54.setText("Status:");

        jLabelStatus4.setForeground(new java.awt.Color(0, 204, 0));
        jLabelStatus4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelStatus4.setText("em espera...");

        jLabelVoo4.setForeground(new java.awt.Color(204, 204, 204));
        jLabelVoo4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelVoo4.setText("xxxxx");

        jLabelModelo4.setForeground(new java.awt.Color(204, 204, 204));
        jLabelModelo4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelModelo4.setText("xxxxx");

        jLabelAviaoLine4.setBackground(new java.awt.Color(255, 153, 0));
        jLabelAviaoLine4.setFont(new java.awt.Font("Gisha", 1, 10)); // NOI18N
        jLabelAviaoLine4.setForeground(new java.awt.Color(232, 233, 232));
        jLabelAviaoLine4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAviaoLine4.setOpaque(true);

        jPanelRAviao4.setBackground(new java.awt.Color(22, 25, 26));
        jPanelRAviao4.setPreferredSize(new java.awt.Dimension(250, 60));
        jPanelRAviao4.setRequestFocusEnabled(false);

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(204, 204, 204));
        jLabel58.setText("Destino:");

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(204, 204, 204));
        jLabel59.setText("Velocidade:");

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(204, 204, 204));
        jLabel60.setText("Tempo Rest.");

        jLabelDestino4.setForeground(new java.awt.Color(204, 204, 204));
        jLabelDestino4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDestino4.setText("xxxxx");

        jLabelVelocidade4.setForeground(new java.awt.Color(204, 204, 204));
        jLabelVelocidade4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVelocidade4.setText("XXXkm/h");

        jLabelTempo4.setForeground(new java.awt.Color(0, 204, 204));
        jLabelTempo4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTempo4.setText("xx:xx");

        javax.swing.GroupLayout jPanelRAviao4Layout = new javax.swing.GroupLayout(jPanelRAviao4);
        jPanelRAviao4.setLayout(jPanelRAviao4Layout);
        jPanelRAviao4Layout.setHorizontalGroup(
            jPanelRAviao4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRAviao4Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanelRAviao4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRAviao4Layout.createSequentialGroup()
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTempo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelRAviao4Layout.createSequentialGroup()
                        .addGroup(jPanelRAviao4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel58)
                            .addComponent(jLabel59))
                        .addGroup(jPanelRAviao4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRAviao4Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabelDestino4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelRAviao4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabelVelocidade4, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))))))
        );
        jPanelRAviao4Layout.setVerticalGroup(
            jPanelRAviao4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRAviao4Layout.createSequentialGroup()
                .addGroup(jPanelRAviao4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(jLabelDestino4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRAviao4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jLabelVelocidade4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRAviao4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(jLabelTempo4)))
        );

        javax.swing.GroupLayout jPanelExemplo3Layout = new javax.swing.GroupLayout(jPanelExemplo3);
        jPanelExemplo3.setLayout(jPanelExemplo3Layout);
        jPanelExemplo3Layout.setHorizontalGroup(
            jPanelExemplo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExemplo3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelExemplo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelExemplo3Layout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelStatus4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelExemplo3Layout.createSequentialGroup()
                        .addGroup(jPanelExemplo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addComponent(jLabel53))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelExemplo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelVoo4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelModelo4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabelAviao4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAviaoLine4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(jPanelRAviao4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelExemplo3Layout.setVerticalGroup(
            jPanelExemplo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExemplo3Layout.createSequentialGroup()
                .addGroup(jPanelExemplo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelExemplo3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabelAviaoLine4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelRAviao4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelExemplo3Layout.createSequentialGroup()
                        .addGroup(jPanelExemplo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(jLabelModelo4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelExemplo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53)
                            .addComponent(jLabelVoo4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelExemplo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel54)
                            .addComponent(jLabelStatus4)))
                    .addComponent(jLabelAviao4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        jButtonNext.setBackground(new java.awt.Color(0, 0, 0));
        jButtonNext.setForeground(new java.awt.Color(255, 153, 0));
        jButtonNext.setText(">");
        jButtonNext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonNextMouseClicked(evt);
            }
        });

        jButtonBack.setBackground(new java.awt.Color(0, 0, 0));
        jButtonBack.setForeground(new java.awt.Color(255, 153, 0));
        jButtonBack.setText("<");
        jButtonBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBackMouseClicked(evt);
            }
        });

        jButtonNext1.setBackground(new java.awt.Color(0, 0, 0));
        jButtonNext1.setForeground(new java.awt.Color(255, 153, 0));
        jButtonNext1.setText("reset");
        jButtonNext1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonNext1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonNext1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelDesktopLayout = new javax.swing.GroupLayout(jPanelDesktop);
        jPanelDesktop.setLayout(jPanelDesktopLayout);
        jPanelDesktopLayout.setHorizontalGroup(
            jPanelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDesktopLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelDesktopTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(jPanelDesktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelDesktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelExemplo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelDesktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelExemplo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelDesktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelExemplo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDesktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelExemplo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelDesktopLayout.createSequentialGroup()
                .addContainerGap(259, Short.MAX_VALUE)
                .addComponent(jButtonBack)
                .addGap(89, 89, 89)
                .addComponent(jButtonNext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(jButtonNext1)
                .addContainerGap())
            .addComponent(jLabelDesktopTitle5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelDesktopLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonBack, jButtonNext, jButtonNext1});

        jPanelDesktopLayout.setVerticalGroup(
            jPanelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDesktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDesktopTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelHead, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelExemplo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelExemplo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelExemplo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelExemplo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDesktopTitle5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
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
                .addComponent(jPanelDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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

    private void jButtonNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNextMouseClicked
        next();
    }//GEN-LAST:event_jButtonNextMouseClicked

    private void jButtonBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBackMouseClicked
        back();
    }//GEN-LAST:event_jButtonBackMouseClicked

    private void jButtonNext1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNext1MouseClicked
        graphics.reset();
    }//GEN-LAST:event_jButtonNext1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButtonNext1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabelAviao1;
    private javax.swing.JLabel jLabelAviao2;
    private javax.swing.JLabel jLabelAviao3;
    private javax.swing.JLabel jLabelAviao4;
    private javax.swing.JLabel jLabelAviaoLine1;
    private javax.swing.JLabel jLabelAviaoLine2;
    private javax.swing.JLabel jLabelAviaoLine3;
    private javax.swing.JLabel jLabelAviaoLine4;
    private javax.swing.JLabel jLabelDesktopTitle;
    private javax.swing.JLabel jLabelDesktopTitle5;
    private javax.swing.JLabel jLabelDestino1;
    private javax.swing.JLabel jLabelDestino2;
    private javax.swing.JLabel jLabelDestino3;
    private javax.swing.JLabel jLabelDestino4;
    private javax.swing.JLabel jLabelHead;
    private javax.swing.JLabel jLabelModelo1;
    private javax.swing.JLabel jLabelModelo2;
    private javax.swing.JLabel jLabelModelo3;
    private javax.swing.JLabel jLabelModelo4;
    private javax.swing.JLabel jLabelStatus1;
    private javax.swing.JLabel jLabelStatus2;
    private javax.swing.JLabel jLabelStatus3;
    private javax.swing.JLabel jLabelStatus4;
    private javax.swing.JLabel jLabelTempo1;
    private javax.swing.JLabel jLabelTempo2;
    private javax.swing.JLabel jLabelTempo3;
    private javax.swing.JLabel jLabelTempo4;
    private javax.swing.JLabel jLabelVelocidade1;
    private javax.swing.JLabel jLabelVelocidade2;
    private javax.swing.JLabel jLabelVelocidade3;
    private javax.swing.JLabel jLabelVelocidade4;
    private javax.swing.JLabel jLabelVoo1;
    private javax.swing.JLabel jLabelVoo2;
    private javax.swing.JLabel jLabelVoo3;
    private javax.swing.JLabel jLabelVoo4;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelDesktop;
    private javax.swing.JPanel jPanelExemplo;
    private javax.swing.JPanel jPanelExemplo1;
    private javax.swing.JPanel jPanelExemplo2;
    private javax.swing.JPanel jPanelExemplo3;
    private javax.swing.JPanel jPanelRAviao1;
    private javax.swing.JPanel jPanelRAviao2;
    private javax.swing.JPanel jPanelRAviao3;
    private javax.swing.JPanel jPanelRAviao4;
    // End of variables declaration//GEN-END:variables
}
