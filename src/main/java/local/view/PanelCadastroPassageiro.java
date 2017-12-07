package local.view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import local.controller.Sistema;
import local.model.TemplateDosPaineis;
import local.model.database.Clientes;
import local.model.database.Destino;

public class PanelCadastroPassageiro extends javax.swing.JPanel {

    private Sistema sist;
    private DefaultTableModel tm;

    public PanelCadastroPassageiro(Sistema sist) {
        initComponents();
        this.sist = sist;
        Object[] colums = {"ID", "Nome", "RG", "Passageiro", "Passaporte"};
        this.tm = new DefaultTableModel(colums, 0);
        this.jTableClientes.setModel(tm);
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = jTableClientes.rowAtPoint(evt.getPoint());
                int col = jTableClientes.columnAtPoint(evt.getPoint());
                if (row >= 0 && col >= 0) {
                    selectRow();
                }
            }
        });
        new TemplateDosPaineis(this.jPanelBackground);
        updateList();
    }

    private void selectRow() {
        String id = jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 0).toString();
        String nome = jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 1).toString();
        String rg = jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 2).toString();
        String passageiro = jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 3).toString();
        jTextFieldNome.setText(nome);
        jTextFieldRG.setText(rg);
        if (passageiro.equals("sim")) {
            String passaporte = jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 4).toString();
            jTextFieldPassaporte.setText(passaporte);
            jCheckBoxPassageiro.setSelected(true);
        } else {
            jCheckBoxPassageiro.setSelected(false);
            jTextFieldPassaporte.setText("");
        }
        jTextFieldID.setText(id);
    }

    /**
     *
     * @param id
     * @return retorna um novo aviao se o argumento for um valor != de -1.
     * retorna um aviao do banco de dados se o argumento for o id
     */
    private Clientes newClientes(int id) {
        try {
            //pega os valores que estao nas caixas de texto da view
            String nome = jTextFieldNome.getText();
            String rg = jTextFieldRG.getText();
            String passageiro = "";
            String passaporte = "";
            if (jCheckBoxPassageiro.isSelected()) {
                passageiro = "sim";
                passaporte = jTextFieldPassaporte.getText();
            }else{
                passageiro = "nao";
            }
            //cria uma entidade cliente com os valores
            Clientes cliente;
            if (id != -1) {
                Integer id2 = Integer.valueOf(jTextFieldID.getText());
                cliente = new Clientes(id2, nome, rg, passageiro, passaporte);
            } else {
                cliente = new Clientes(null, nome, rg, passageiro, passaporte);
            }
            return cliente;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor(es) incorreto(s).");
            return null;
        }
    }

    private void cadastrar() {
        try {
            sist.cadastrar(newClientes(-1));
            updateList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro ao cadastrar cliente");
        }
    }

    private void updateList() {
        List x = sist.select(new Clientes());
        tm.setRowCount(0);
        for (int i = 0; i < x.size(); i++) {
            Clientes cliente = (Clientes) x.get(i);

            Object[] row = {cliente.getId(), cliente.getNome(), cliente.getRg(), cliente.getPassageiro(), cliente.getPassaporte()};
            tm.addRow(row);
        }
    }

    private void remover() {
        try {
            int selected = jTableClientes.getSelectedRow();
            if (selected != -1) {
                Integer id = (Integer) jTableClientes.getValueAt(selected, 0);
                sist.getJpaClientes().destroy(id);
                updateList();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro ao remover cliente");
        }
    }

    private void alterar() {
        try {
            int selected = jTableClientes.getSelectedRow();
            if (selected != -1) {
                Integer id = (Integer) jTableClientes.getValueAt(selected, 0);
                sist.getJpaClientes().edit(newClientes(Integer.parseInt(jTextFieldID.getText())));
//                JOptionPane.showMessageDialog(null, "Clientes (cód." + id + ") alterado.");
                updateList();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro ao alterar cliente");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        jLabelCadastro16 = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelLogo1 = new javax.swing.JLabel();
        jLabelCadastro12 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldRG = new javax.swing.JTextField();
        jLabelCadastro17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelCadastro18 = new javax.swing.JLabel();
        jLabelCadastro19 = new javax.swing.JLabel();
        jLabelCadastrar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jLabelCancelar1 = new javax.swing.JLabel();
        jLabelCancelar2 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldPassaporte = new javax.swing.JTextField();
        jCheckBoxPassageiro = new javax.swing.JCheckBox();

        jPanelBackground.setBackground(new java.awt.Color(36, 89, 133));

        jLabelCadastro16.setBackground(new java.awt.Color(44, 102, 152));
        jLabelCadastro16.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabelCadastro16.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCadastro16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastro16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelLogo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelLogo.setForeground(new java.awt.Color(255, 153, 51));
        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Passport_25px.png"))); // NOI18N
        jLabelLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabelLogo1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelLogo1.setForeground(new java.awt.Color(255, 153, 51));
        jLabelLogo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Client_Management_25px.png"))); // NOI18N
        jLabelLogo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelLogo1.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabelCadastro12.setBackground(new java.awt.Color(44, 102, 152));
        jLabelCadastro12.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabelCadastro12.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCadastro12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastro12.setText("Cadastro/Alteração - Clientes");
        jLabelCadastro12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextFieldNome.setBackground(new java.awt.Color(10, 59, 102));
        jTextFieldNome.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNome.setBorder(null);

        jTextFieldRG.setBackground(new java.awt.Color(10, 59, 102));
        jTextFieldRG.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldRG.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldRG.setBorder(null);

        jLabelCadastro17.setBackground(new java.awt.Color(44, 102, 152));
        jLabelCadastro17.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabelCadastro17.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCadastro17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastro17.setText("Nome");
        jLabelCadastro17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("cód:");

        jLabelCadastro18.setBackground(new java.awt.Color(44, 102, 152));
        jLabelCadastro18.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabelCadastro18.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCadastro18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastro18.setText("Passaporte");
        jLabelCadastro18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelCadastro19.setBackground(new java.awt.Color(44, 102, 152));
        jLabelCadastro19.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabelCadastro19.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCadastro19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastro19.setText("RG");
        jLabelCadastro19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelCadastrar.setBackground(new java.awt.Color(61, 113, 160));
        jLabelCadastrar.setFont(new java.awt.Font("Gisha", 0, 18)); // NOI18N
        jLabelCadastrar.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCadastrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastrar.setText("Cadastrar Novo");
        jLabelCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 89, 133), 1, true));
        jLabelCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCadastrar.setName("botao"); // NOI18N
        jLabelCadastrar.setOpaque(true);
        jLabelCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCadastrarMouseClicked(evt);
            }
        });

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableClientes);

        jLabelCancelar1.setBackground(new java.awt.Color(61, 113, 160));
        jLabelCancelar1.setFont(new java.awt.Font("Gisha", 0, 18)); // NOI18N
        jLabelCancelar1.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCancelar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCancelar1.setText("Salvar Alteração");
        jLabelCancelar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 89, 133), 1, true));
        jLabelCancelar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCancelar1.setName("botao"); // NOI18N
        jLabelCancelar1.setOpaque(true);
        jLabelCancelar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCancelar1MouseClicked(evt);
            }
        });

        jLabelCancelar2.setBackground(new java.awt.Color(61, 113, 160));
        jLabelCancelar2.setFont(new java.awt.Font("Gisha", 0, 18)); // NOI18N
        jLabelCancelar2.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCancelar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCancelar2.setText("Remover Selecionado");
        jLabelCancelar2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 89, 133), 1, true));
        jLabelCancelar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCancelar2.setName("botao"); // NOI18N
        jLabelCancelar2.setOpaque(true);
        jLabelCancelar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCancelar2MouseClicked(evt);
            }
        });

        jTextFieldID.setEditable(false);
        jTextFieldID.setBackground(new java.awt.Color(10, 59, 102));
        jTextFieldID.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldID.setText("ID");
        jTextFieldID.setBorder(null);

        jTextFieldPassaporte.setEditable(false);
        jTextFieldPassaporte.setBackground(new java.awt.Color(10, 59, 102));
        jTextFieldPassaporte.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldPassaporte.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPassaporte.setBorder(null);

        jCheckBoxPassageiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBoxPassageiro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jCheckBoxPassageiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxPassageiroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabelCancelar1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCancelar2, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBackgroundLayout.createSequentialGroup()
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNome)
                                    .addComponent(jLabelCadastro17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(9, 9, 9)
                                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldRG, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                    .addComponent(jLabelCadastro19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(3, 3, 3))
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addComponent(jLabelLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelCadastro12)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(3, 3, 3)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBoxPassageiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldPassaporte, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                    .addComponent(jLabelCadastro18, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabelCadastrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCadastro16)
                .addContainerGap())
        );

        jPanelBackgroundLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextFieldPassaporte, jTextFieldRG});

        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addContainerGap(146, Short.MAX_VALUE)
                        .addComponent(jLabelCadastro16)
                        .addGap(196, 196, 196))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabelCadastro12))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addComponent(jCheckBoxPassageiro)
                                .addGap(4, 4, 4)
                                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldPassaporte, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelCadastro17)
                                    .addComponent(jLabelCadastro19))
                                .addComponent(jLabelCadastro18, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCancelar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCancelar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jLabelCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCadastrarMouseClicked
        cadastrar();
    }//GEN-LAST:event_jLabelCadastrarMouseClicked

    private void jLabelCancelar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCancelar1MouseClicked
        alterar();
    }//GEN-LAST:event_jLabelCancelar1MouseClicked

    private void jLabelCancelar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCancelar2MouseClicked
        remover();
    }//GEN-LAST:event_jLabelCancelar2MouseClicked

    private void jCheckBoxPassageiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxPassageiroMouseClicked
        if (this.jCheckBoxPassageiro.isSelected()) {
            this.jTextFieldPassaporte.setEditable(true);
        }else{
            this.jTextFieldPassaporte.setEditable(false);
            this.jTextFieldPassaporte.setText("");
        }
    }//GEN-LAST:event_jCheckBoxPassageiroMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBoxPassageiro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCadastrar;
    private javax.swing.JLabel jLabelCadastro12;
    private javax.swing.JLabel jLabelCadastro16;
    private javax.swing.JLabel jLabelCadastro17;
    private javax.swing.JLabel jLabelCadastro18;
    private javax.swing.JLabel jLabelCadastro19;
    private javax.swing.JLabel jLabelCancelar1;
    private javax.swing.JLabel jLabelCancelar2;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelLogo1;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPassaporte;
    private javax.swing.JTextField jTextFieldRG;
    // End of variables declaration//GEN-END:variables
}
