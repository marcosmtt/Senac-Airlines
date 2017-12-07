package local.view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import local.controller.Sistema;
import local.model.VoosGraphics;

public class PanelVoos extends javax.swing.JPanel {

    VoosGraphics graphics;
    
    public PanelVoos(Sistema sistema) {
        initComponents();
        graphics = new VoosGraphics(this, sistema);
    }

    public JLabel getjLabelAviao() {
        return jLabelAviao;
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

    public JLabel getjLabelAviaoLine() {
        return jLabelAviaoLine;
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

    public JPanel getjPanelLAviao() {
        return jPanelLAviao;
    }

    public JPanel getjPanelLAviao1() {
        return jPanelLAviao1;
    }

    public JPanel getjPanelLAviao2() {
        return jPanelLAviao2;
    }

    public JPanel getjPanelLAviao3() {
        return jPanelLAviao3;
    }

    public JPanel getjPanelRAviao() {
        return jPanelRAviao;
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
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        jPanelDesktop = new javax.swing.JPanel();
        jLabelDesktopTitle = new javax.swing.JLabel();
        jLabelAviao = new javax.swing.JLabel();
        jLabelDesktopTitle5 = new javax.swing.JLabel();
        jPanelLAviao2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanelRAviao = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabelAviaoLine = new javax.swing.JLabel();
        jLabelAviao1 = new javax.swing.JLabel();
        jLabelAviaoLine1 = new javax.swing.JLabel();
        jLabelAviao2 = new javax.swing.JLabel();
        jLabelAviaoLine2 = new javax.swing.JLabel();
        jPanelLAviao = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanelLAviao1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanelRAviao2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanelRAviao1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabelDesktopTitle9 = new javax.swing.JLabel();
        jPanelRAviao3 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabelAviao3 = new javax.swing.JLabel();
        jLabelAviaoLine3 = new javax.swing.JLabel();
        jPanelLAviao3 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();

        jPanelBackground.setBackground(new java.awt.Color(44, 102, 152));

        jPanelDesktop.setBackground(new java.awt.Color(23, 25, 26));

        jLabelDesktopTitle.setBackground(new java.awt.Color(0, 0, 0));
        jLabelDesktopTitle.setFont(new java.awt.Font("Gisha", 1, 17)); // NOI18N
        jLabelDesktopTitle.setForeground(new java.awt.Color(204, 204, 204));
        jLabelDesktopTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDesktopTitle.setText("MONITOR AVIOES");
        jLabelDesktopTitle.setOpaque(true);

        jLabelAviao.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        jLabelAviao.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAviao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelAviao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Airplane_Mode_On_25px.png"))); // NOI18N
        jLabelAviao.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabelAviao.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabelDesktopTitle5.setBackground(new java.awt.Color(0, 0, 0));
        jLabelDesktopTitle5.setFont(new java.awt.Font("Gisha", 1, 10)); // NOI18N
        jLabelDesktopTitle5.setForeground(new java.awt.Color(232, 233, 232));
        jLabelDesktopTitle5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDesktopTitle5.setOpaque(true);

        jPanelLAviao2.setBackground(new java.awt.Color(22, 25, 26));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Avião:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Voo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Status:");

        jLabel7.setForeground(new java.awt.Color(0, 204, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("movendo-se");

        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("xxxxx");

        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("xxxxx");

        javax.swing.GroupLayout jPanelLAviao2Layout = new javax.swing.GroupLayout(jPanelLAviao2);
        jPanelLAviao2.setLayout(jPanelLAviao2Layout);
        jPanelLAviao2Layout.setHorizontalGroup(
            jPanelLAviao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLAviao2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
            .addGroup(jPanelLAviao2Layout.createSequentialGroup()
                .addGroup(jPanelLAviao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelLAviao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelLAviao2Layout.setVerticalGroup(
            jPanelLAviao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLAviao2Layout.createSequentialGroup()
                .addGroup(jPanelLAviao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLAviao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLAviao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)))
        );

        jPanelRAviao.setBackground(new java.awt.Color(22, 25, 26));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Destino:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Velocidade:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Tempo Rest.");

        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("xxxxx");

        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setText("XXXkm/h");

        jLabel34.setForeground(new java.awt.Color(0, 204, 204));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel34.setText("xx:xx");

        javax.swing.GroupLayout jPanelRAviaoLayout = new javax.swing.GroupLayout(jPanelRAviao);
        jPanelRAviao.setLayout(jPanelRAviaoLayout);
        jPanelRAviaoLayout.setHorizontalGroup(
            jPanelRAviaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRAviaoLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanelRAviaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRAviaoLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                    .addGroup(jPanelRAviaoLayout.createSequentialGroup()
                        .addGroup(jPanelRAviaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelRAviaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        jPanelRAviaoLayout.setVerticalGroup(
            jPanelRAviaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRAviaoLayout.createSequentialGroup()
                .addGroup(jPanelRAviaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRAviaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRAviaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel34)))
        );

        jLabelAviaoLine.setBackground(new java.awt.Color(255, 153, 0));
        jLabelAviaoLine.setFont(new java.awt.Font("Gisha", 1, 10)); // NOI18N
        jLabelAviaoLine.setForeground(new java.awt.Color(232, 233, 232));
        jLabelAviaoLine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAviaoLine.setOpaque(true);

        jLabelAviao1.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        jLabelAviao1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAviao1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelAviao1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Airplane_Mode_On_25px.png"))); // NOI18N
        jLabelAviao1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabelAviao1.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabelAviaoLine1.setBackground(new java.awt.Color(255, 153, 0));
        jLabelAviaoLine1.setFont(new java.awt.Font("Gisha", 1, 10)); // NOI18N
        jLabelAviaoLine1.setForeground(new java.awt.Color(232, 233, 232));
        jLabelAviaoLine1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAviaoLine1.setOpaque(true);

        jLabelAviao2.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        jLabelAviao2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAviao2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelAviao2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Airplane_Mode_On_25px.png"))); // NOI18N
        jLabelAviao2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabelAviao2.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabelAviaoLine2.setBackground(new java.awt.Color(255, 153, 0));
        jLabelAviaoLine2.setFont(new java.awt.Font("Gisha", 1, 10)); // NOI18N
        jLabelAviaoLine2.setForeground(new java.awt.Color(232, 233, 232));
        jLabelAviaoLine2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAviaoLine2.setOpaque(true);

        jPanelLAviao.setBackground(new java.awt.Color(22, 25, 26));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Avião:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Voo:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Status:");

        jLabel11.setForeground(new java.awt.Color(255, 51, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("aguardando...");

        jLabel33.setForeground(new java.awt.Color(204, 204, 204));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel33.setText("xxxxx");

        jLabel35.setForeground(new java.awt.Color(204, 204, 204));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel35.setText("xxxxx");

        javax.swing.GroupLayout jPanelLAviaoLayout = new javax.swing.GroupLayout(jPanelLAviao);
        jPanelLAviao.setLayout(jPanelLAviaoLayout);
        jPanelLAviaoLayout.setHorizontalGroup(
            jPanelLAviaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLAviaoLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
            .addGroup(jPanelLAviaoLayout.createSequentialGroup()
                .addGroup(jPanelLAviaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelLAviaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelLAviaoLayout.setVerticalGroup(
            jPanelLAviaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLAviaoLayout.createSequentialGroup()
                .addGroup(jPanelLAviaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLAviaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLAviaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)))
        );

        jPanelLAviao1.setBackground(new java.awt.Color(22, 25, 26));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Avião:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Voo:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Status:");

        jLabel19.setForeground(new java.awt.Color(0, 204, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("movendo-se");

        jLabel38.setForeground(new java.awt.Color(204, 204, 204));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel38.setText("xxxxx");

        jLabel39.setForeground(new java.awt.Color(204, 204, 204));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel39.setText("xxxxx");

        javax.swing.GroupLayout jPanelLAviao1Layout = new javax.swing.GroupLayout(jPanelLAviao1);
        jPanelLAviao1.setLayout(jPanelLAviao1Layout);
        jPanelLAviao1Layout.setHorizontalGroup(
            jPanelLAviao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLAviao1Layout.createSequentialGroup()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
            .addGroup(jPanelLAviao1Layout.createSequentialGroup()
                .addGroup(jPanelLAviao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelLAviao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelLAviao1Layout.setVerticalGroup(
            jPanelLAviao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLAviao1Layout.createSequentialGroup()
                .addGroup(jPanelLAviao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLAviao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLAviao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)))
        );

        jPanelRAviao2.setBackground(new java.awt.Color(22, 25, 26));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Destino:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Velocidade:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Tempo Rest.");

        jLabel40.setForeground(new java.awt.Color(204, 204, 204));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel40.setText("xxxxx");

        jLabel41.setForeground(new java.awt.Color(204, 204, 204));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel41.setText("XXXkm/h");

        jLabel42.setForeground(new java.awt.Color(0, 204, 204));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel42.setText("xx:xx");

        javax.swing.GroupLayout jPanelRAviao2Layout = new javax.swing.GroupLayout(jPanelRAviao2);
        jPanelRAviao2.setLayout(jPanelRAviao2Layout);
        jPanelRAviao2Layout.setHorizontalGroup(
            jPanelRAviao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRAviao2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanelRAviao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRAviao2Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                    .addGroup(jPanelRAviao2Layout.createSequentialGroup()
                        .addGroup(jPanelRAviao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGroup(jPanelRAviao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRAviao2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelRAviao2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanelRAviao2Layout.setVerticalGroup(
            jPanelRAviao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRAviao2Layout.createSequentialGroup()
                .addGroup(jPanelRAviao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRAviao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRAviao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel42)))
        );

        jPanelRAviao1.setBackground(new java.awt.Color(22, 25, 26));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Destino:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("Velocidade:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Tempo Rest.");

        jLabel43.setForeground(new java.awt.Color(204, 204, 204));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel43.setText("xxxxx");

        jLabel44.setForeground(new java.awt.Color(204, 204, 204));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel44.setText("XXXkm/h");

        jLabel45.setForeground(new java.awt.Color(0, 204, 204));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel45.setText("xx:xx");

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
                        .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                    .addGroup(jPanelRAviao1Layout.createSequentialGroup()
                        .addGroup(jPanelRAviao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addGroup(jPanelRAviao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRAviao1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelRAviao1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanelRAviao1Layout.setVerticalGroup(
            jPanelRAviao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRAviao1Layout.createSequentialGroup()
                .addGroup(jPanelRAviao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRAviao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRAviao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel45)))
        );

        jLabelDesktopTitle9.setBackground(new java.awt.Color(19, 18, 18));
        jLabelDesktopTitle9.setFont(new java.awt.Font("Gisha", 1, 10)); // NOI18N
        jLabelDesktopTitle9.setForeground(new java.awt.Color(204, 204, 204));
        jLabelDesktopTitle9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDesktopTitle9.setText("Aviões ON -> 2/4");
        jLabelDesktopTitle9.setOpaque(true);

        jPanelRAviao3.setBackground(new java.awt.Color(22, 25, 26));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("Destino:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("Velocidade:");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("Tempo Rest.");

        jLabel46.setForeground(new java.awt.Color(204, 204, 204));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel46.setText("xxxxx");

        jLabel47.setForeground(new java.awt.Color(204, 204, 204));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel47.setText("XXXkm/h");

        jLabel48.setForeground(new java.awt.Color(0, 204, 204));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel48.setText("xx:xx");

        javax.swing.GroupLayout jPanelRAviao3Layout = new javax.swing.GroupLayout(jPanelRAviao3);
        jPanelRAviao3.setLayout(jPanelRAviao3Layout);
        jPanelRAviao3Layout.setHorizontalGroup(
            jPanelRAviao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRAviao3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanelRAviao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRAviao3Layout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                    .addGroup(jPanelRAviao3Layout.createSequentialGroup()
                        .addGroup(jPanelRAviao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27))
                        .addGroup(jPanelRAviao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRAviao3Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelRAviao3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanelRAviao3Layout.setVerticalGroup(
            jPanelRAviao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRAviao3Layout.createSequentialGroup()
                .addGroup(jPanelRAviao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel46))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRAviao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRAviao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel48)))
        );

        jLabelAviao3.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        jLabelAviao3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAviao3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelAviao3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Airplane_Mode_On_25px.png"))); // NOI18N
        jLabelAviao3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabelAviao3.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabelAviaoLine3.setBackground(new java.awt.Color(255, 153, 0));
        jLabelAviaoLine3.setFont(new java.awt.Font("Gisha", 1, 10)); // NOI18N
        jLabelAviaoLine3.setForeground(new java.awt.Color(232, 233, 232));
        jLabelAviaoLine3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAviaoLine3.setOpaque(true);

        jPanelLAviao3.setBackground(new java.awt.Color(22, 25, 26));

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(204, 204, 204));
        jLabel49.setText("Avião:");

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(204, 204, 204));
        jLabel50.setText("Voo:");

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(204, 204, 204));
        jLabel51.setText("Status:");

        jLabel52.setForeground(new java.awt.Color(255, 51, 0));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("aguardando...");

        jLabel53.setForeground(new java.awt.Color(204, 204, 204));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel53.setText("xxxxx");

        jLabel54.setForeground(new java.awt.Color(204, 204, 204));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel54.setText("xxxxx");

        javax.swing.GroupLayout jPanelLAviao3Layout = new javax.swing.GroupLayout(jPanelLAviao3);
        jPanelLAviao3.setLayout(jPanelLAviao3Layout);
        jPanelLAviao3Layout.setHorizontalGroup(
            jPanelLAviao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLAviao3Layout.createSequentialGroup()
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
            .addGroup(jPanelLAviao3Layout.createSequentialGroup()
                .addGroup(jPanelLAviao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelLAviao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelLAviao3Layout.setVerticalGroup(
            jPanelLAviao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLAviao3Layout.createSequentialGroup()
                .addGroup(jPanelLAviao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jLabel54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLAviao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(jLabel53))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLAviao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(jLabel52)))
        );

        javax.swing.GroupLayout jPanelDesktopLayout = new javax.swing.GroupLayout(jPanelDesktop);
        jPanelDesktop.setLayout(jPanelDesktopLayout);
        jPanelDesktopLayout.setHorizontalGroup(
            jPanelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDesktopLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelDesktopTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addComponent(jLabelDesktopTitle5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelDesktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDesktopTitle9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDesktopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDesktopLayout.createSequentialGroup()
                        .addComponent(jPanelLAviao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelAviao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabelAviaoLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5)
                        .addComponent(jPanelRAviao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDesktopLayout.createSequentialGroup()
                        .addComponent(jPanelLAviao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(jLabelAviao1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabelAviaoLine1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                        .addGap(5, 5, 5)
                        .addComponent(jPanelRAviao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDesktopLayout.createSequentialGroup()
                        .addComponent(jPanelLAviao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabelAviao2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabelAviaoLine2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5)
                        .addComponent(jPanelRAviao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDesktopLayout.createSequentialGroup()
                        .addComponent(jPanelLAviao3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelAviao3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabelAviaoLine3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5)
                        .addComponent(jPanelRAviao3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanelDesktopLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanelLAviao2, jPanelRAviao});

        jPanelDesktopLayout.setVerticalGroup(
            jPanelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDesktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDesktopTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDesktopTitle9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelAviao, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanelRAviao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelDesktopLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabelAviaoLine, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelLAviao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAviao1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDesktopLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabelAviaoLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelLAviao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelRAviao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelRAviao2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelAviao2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanelDesktopLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabelAviaoLine2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelLAviao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelRAviao3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelAviao3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanelDesktopLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabelAviaoLine3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelLAviao3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelDesktopTitle5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAviao;
    private javax.swing.JLabel jLabelAviao1;
    private javax.swing.JLabel jLabelAviao2;
    private javax.swing.JLabel jLabelAviao3;
    private javax.swing.JLabel jLabelAviaoLine;
    private javax.swing.JLabel jLabelAviaoLine1;
    private javax.swing.JLabel jLabelAviaoLine2;
    private javax.swing.JLabel jLabelAviaoLine3;
    private javax.swing.JLabel jLabelDesktopTitle;
    private javax.swing.JLabel jLabelDesktopTitle5;
    private javax.swing.JLabel jLabelDesktopTitle9;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelDesktop;
    private javax.swing.JPanel jPanelLAviao;
    private javax.swing.JPanel jPanelLAviao1;
    private javax.swing.JPanel jPanelLAviao2;
    private javax.swing.JPanel jPanelLAviao3;
    private javax.swing.JPanel jPanelRAviao;
    private javax.swing.JPanel jPanelRAviao1;
    private javax.swing.JPanel jPanelRAviao2;
    private javax.swing.JPanel jPanelRAviao3;
    // End of variables declaration//GEN-END:variables
}
