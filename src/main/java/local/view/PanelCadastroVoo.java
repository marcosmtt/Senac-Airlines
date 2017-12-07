package local.view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import local.controller.Sistema;
import local.model.TemplateDosPaineis;
import local.model.database.Avioes;
import local.model.database.Bagagenslist;
import local.model.database.Clientes;
import local.model.database.Destino;
import local.model.database.Passageiroslist;
import local.model.database.Voos;

public class PanelCadastroVoo extends javax.swing.JPanel {

    private Sistema sist;

    private DefaultTableModel tmVoos;
    private DefaultTableModel tmPassageiros;
    private DefaultTableModel tmBagagens;
    private List<Passageiroslist> tempPasList = new ArrayList<>();
    private List<Bagagenslist> tempBagList = new ArrayList<>();
    int[] comboBoxAvioesID;
    int[] comboBoxDestinosID;

    private PanelDialogPassageiros telaPassageiros;

    public PanelCadastroVoo(Sistema sist) {
        initComponents();
        this.sist = sist;
        telaPassageiros = new PanelDialogPassageiros(sist.getTelaInicial(), true, sist);
        new TemplateDosPaineis(this.jPanelBackground);
        telaPassageiros.setVisible(false);
        this.telaPassageiros.updateContent(-1);
        initTablesAndComboBox();
    }

    private void initTablesAndComboBox() {
        //TABLES
        //Voos
        Object[] colums = {"ID", "DESTINO", "NUM PASSAGEIRO", "NUM BAGAGENS", "DECOLAGEM", "AVIAO", "STATUS"};
        this.tmVoos = new DefaultTableModel(colums, 0);
        this.jTableVoos.setModel(tmVoos);
        jTableVoos.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = jTableVoos.rowAtPoint(evt.getPoint());
                int col = jTableVoos.columnAtPoint(evt.getPoint());
                if (row >= 0 && col >= 0) {
                    selectRowVoos();
                }
            }
        });
        //Passageiros
        Object[] colums2 = {"ClienteID", "Nome", "Passaporte"};
        this.tmPassageiros = new DefaultTableModel(colums2, 0);
        this.jTablePassageiros.setModel(tmPassageiros);
        jTablePassageiros.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = jTablePassageiros.rowAtPoint(evt.getPoint());
                int col = jTablePassageiros.columnAtPoint(evt.getPoint());
                if (row >= 0 && col >= 0) {
//                    selectRow();
                }
            }
        });
        //Bagagens
        Object[] colums3 = {"ID", "CLIENTE", "PESO"};
        this.tmBagagens = new DefaultTableModel(colums3, 0);
        this.jTableBagagens.setModel(tmBagagens);
        jTableBagagens.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = jTableBagagens.rowAtPoint(evt.getPoint());
                int col = jTableBagagens.columnAtPoint(evt.getPoint());
                if (row >= 0 && col >= 0) {
//                    selectRow();
                }
            }
        });
        updateList();
    }

    private void selectRowVoos() {
        updateList();
        try {

            String id = jTableVoos.getValueAt(jTableVoos.getSelectedRow(), 0).toString();
            String decolagem = jTableVoos.getValueAt(jTableVoos.getSelectedRow(), 4).toString();
            jTextFieldDecolagem.setText(decolagem);
            jTextFieldID.setText(id);
            int x = sist.getJpaVoos().findVoos(Integer.parseInt(id)).getAviaoID();
            for (int i = 0; i < comboBoxAvioesID.length; i++) {
                if (comboBoxAvioesID[i] == x) {
                    jComboBoxAviao.setSelectedIndex(i);
                }
            }
            for (int i = 0; i < comboBoxDestinosID.length; i++) {
                if (comboBoxDestinosID[i] == sist.getJpaVoos().findVoos(Integer.parseInt(id)).getAeroportoDestinoID()) {
                    jComboBoxDestino.setSelectedIndex(i);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getStackTrace());
        }
        try {
            this.telaPassageiros.updateContent(Integer.parseInt(this.jTextFieldID.getText()));
        } catch (Exception e) {
            System.out.println("ERRO cadastroVoo selectRowVoos");
        }
    }

    /**
     *
     * @param id
     * @return retorna um novo aviao se o argumento for um valor != de -1.
     * retorna um aviao do banco de dados se o argumento for o id
     */
    private Voos newVoo(int id) {
        try {
            //pega os valores que estao nas caixas de texto da view
            int destino = comboBoxDestinosID[jComboBoxDestino.getSelectedIndex()];
            List<Passageiroslist> todosPassageiros = sist.getJpaPassageiroList().findPassageiroslistEntities();
            List<Passageiroslist> passageirosTelaPassageiros = telaPassageiros.getPasList();
            //cria uma entidade voo com os valores
            Voos voo;
            if (id != -1) {//ALTERA O INDEX DO BANCO
                //remove todos os passageiros do voo selecionado
                for (int i = 0; i < todosPassageiros.size(); i++) {
                    if (todosPassageiros.get(i).getVooId() == id) {
                        sist.getJpaPassageiroList().destroy(todosPassageiros.get(i).getId());
                    }
                }
                for (int i = 0; i < passageirosTelaPassageiros.size(); i++) {
                    passageirosTelaPassageiros.get(i).setVooId(id);
                    sist.getJpaPassageiroList().create(passageirosTelaPassageiros.get(i));
                }
//                telaPassageiros.updateContent(id);
                voo = new Voos(id, destino, jTextFieldDecolagem.getText(), comboBoxAvioesID[jComboBoxAviao.getSelectedIndex()], sist.getJpaVoos().findVoos(id).getStatus());
            } else {//NOVO INDEX PRO BANCO
                List<Voos> test = sist.getJpaVoos().findVoosEntities();
                int newID;
                if (test.size() == 0) {
                    newID  = 1;
                }else{
                    newID  = (test.get(test.size() - 1).getId() + 1);
                }
                for (int i = 0; i < passageirosTelaPassageiros.size(); i++) {
                    passageirosTelaPassageiros.get(i).setVooId(newID);
                    sist.getJpaPassageiroList().create(passageirosTelaPassageiros.get(i));
                }
                voo = new Voos(newID, destino, jTextFieldDecolagem.getText(), comboBoxAvioesID[jComboBoxAviao.getSelectedIndex()], "decolou");
            }
            return voo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor(es) incorreto(s).");
            JOptionPane.showMessageDialog(null, e.getStackTrace());
            return null;
        }
    }

    private void cadastrar() {
        try {
            //chama a classe sistema e manda esse aviao pra la como argumento no metodo cadastrar
            sist.cadastrar(newVoo(-1));
            updateList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro ao cadastrar avião");
        }
    }

    private void updateList() {
        try {
            //COMBO
            //Destino
            jComboBoxDestino.removeAllItems();
            List<Destino> destinos = sist.getJpaDestino().findDestinoEntities();
            comboBoxDestinosID = new int[(destinos.size() + 1)];
            for (int i = 0; i < destinos.size(); i++) {
                comboBoxDestinosID[i] = destinos.get(i).getId().intValue();
                jComboBoxDestino.addItem(destinos.get(i).getNome() + "  Distancia:" + destinos.get(i).getDistancia() + "km");
            }
            //Aviao
            jComboBoxAviao.removeAllItems();
            List<Avioes> avioes = sist.getJpaAvioes().findAvioesEntities();
            comboBoxAvioesID = new int[(avioes.size() + 1)];
            for (int i = 0; i < avioes.size(); i++) {
                comboBoxAvioesID[i] = avioes.get(i).getId();
                jComboBoxAviao.addItem(avioes.get(i).getModelo() + "   vel:" + avioes.get(i).getVelocidade() + "km/h");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getStackTrace());
        }
        try {
            List voosList = sist.select(new Voos());
            int selectedIndex = jTableVoos.getSelectedRow();
            tmVoos.setRowCount(0);
            tempPasList.clear();
            for (int i = 0; i < voosList.size(); i++) {
                Voos voo = (Voos) voosList.get(i);
                List<Passageiroslist> passageiros = sist.getJpaPassageiroList().findPassageiroslistEntities();
                List<Bagagenslist> bagagens = sist.getJpaBagagensList().findBagagenslistEntities();
                for (int j = 0; j < passageiros.size(); j++) {
                    if (passageiros.get(j).getVooId() == voo.getId()) {
                        tempPasList.add(passageiros.get(j));
                    } else {
                        passageiros.remove(j);
                        j--;
                    }
                    for (int k = 0; k < bagagens.size(); k++) {
                        if (bagagens.get(k).getVooId() != voo.getId()) {
                            bagagens.remove(k);
                        }
                    }
                }
                String destinoNome = sist.getJpaDestino().findDestino((long) voo.getAeroportoDestinoID()).getNome();
                Object[] row = {voo.getId(), destinoNome, passageiros.size(), bagagens.size(), voo.getHoraDecolagem(), sist.getJpaAvioes().findAvioes(voo.getAviaoID()).getModelo() + " vel:" + sist.getJpaAvioes().findAvioes(voo.getAviaoID()).getVelocidade(), sist.getJpaVoos().findVoos(voo.getId()).getStatus()};
                tmVoos.addRow(row);
            }
            jTableVoos.setRowSelectionInterval(selectedIndex, selectedIndex);

//            List<Clientes> passageiros = sist.select(new Clientes());
//            tmPassageiros.setRowCount(0);
//            for (int i = 0; i < passageiros.size(); i++) {
//                Clientes passageiro = (Clientes) passageiros.get(i);
//                for (int j = 0; j < passageiros.size(); j++) {
//                    if (passageiros.get(j).getPassageiro().equals("não")) {
//                        passageiros.remove(j);
//                    }
//                }
//                Object[] row = {passageiro.getId(), passageiro.getNome(), passageiro.getPassaporte()};
//                tmPassageiros.addRow(row);
//            }
//            List<Bagagenslist> bagagensList = sist.select(new Bagagenslist());
//            tmBagagens.setRowCount(0);
//            for (int i = 0; i < bagagensList.size(); i++) {
//                if (bagagensList.get(i).getVooId() != Integer.parseInt(jTextFieldID.getText())) {
//                    voosList.remove(i);
//                }
//            }
//            for (int i = 0; i < bagagensList.size(); i++) {
//                Object[] row = {bagagensList.get(i).getBagagemId(), sist.getJpaClientes().findClientes(sist.getJpaBagagensDAO().findBagagens(i).getClienteId()).getNome(), sist.getJpaBagagensDAO().findBagagens(i).getPeso()};
//                tmVoos.addRow(row);
//            }
        } catch (Exception e) {
            if (e instanceof NumberFormatException) {

            } else {
//                JOptionPane.showMessageDialog(null, e.getStackTrace());
            }
        }
    }

    private void dialogPassageiros() {
        this.telaPassageiros.setVisible(true);
    }

    private void remover() {
        try {
            int selected = jTableVoos.getSelectedRow();
            if (selected != -1) {
                int id = (int) jTableVoos.getValueAt(selected, 0);
                sist.getJpaVoos().destroy(id);
                updateList();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro ao remover voo");
        }
    }

    private void alterar() {
        try {
            int id = Integer.parseInt(jTextFieldID.getText());
            if (id != -1) {
                sist.getJpaVoos().edit(newVoo(id));
                JOptionPane.showMessageDialog(null, "Voo (cód." + id + ") alterado.");
                updateList();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro ao alterar voo");
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
        jLabelCadastro12 = new javax.swing.JLabel();
        jLabelCadastrar = new javax.swing.JLabel();
        jLabelCadastro18 = new javax.swing.JLabel();
        jLabelCadastro14 = new javax.swing.JLabel();
        jTextFieldDecolagem = new javax.swing.JTextField();
        jLabelCancelar1 = new javax.swing.JLabel();
        jLabelCancelar2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jComboBoxDestino = new javax.swing.JComboBox<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableVoos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePassageiros = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableBagagens = new javax.swing.JTable();
        jTextFieldID = new javax.swing.JTextField();
        jComboBoxAviao = new javax.swing.JComboBox<>();
        jLabelCadastro13 = new javax.swing.JLabel();
        jLabelAddPassageiros = new javax.swing.JLabel();
        jLabelAddBagagens = new javax.swing.JLabel();

        jPanelBackground.setBackground(new java.awt.Color(36, 89, 133));

        jLabelCadastro12.setBackground(new java.awt.Color(44, 102, 152));
        jLabelCadastro12.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabelCadastro12.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCadastro12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastro12.setText("Destino");
        jLabelCadastro12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        jLabelCadastro18.setBackground(new java.awt.Color(44, 102, 152));
        jLabelCadastro18.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabelCadastro18.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCadastro18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastro18.setText("Cadastro/Alteração - Voos");
        jLabelCadastro18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelCadastro14.setBackground(new java.awt.Color(44, 102, 152));
        jLabelCadastro14.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabelCadastro14.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCadastro14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastro14.setText("Decolagem");
        jLabelCadastro14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextFieldDecolagem.setBackground(new java.awt.Color(10, 59, 102));
        jTextFieldDecolagem.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldDecolagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldDecolagem.setText("05:55");
        jTextFieldDecolagem.setBorder(null);

        jLabelCancelar1.setBackground(new java.awt.Color(61, 113, 160));
        jLabelCancelar1.setFont(new java.awt.Font("Gisha", 0, 18)); // NOI18N
        jLabelCancelar1.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCancelar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCancelar1.setText("Salvar Alteração");
        jLabelCancelar1.setAutoscrolls(true);
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
        jLabelCancelar2.setText("Remover Voo Selecionado");
        jLabelCancelar2.setAutoscrolls(true);
        jLabelCancelar2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 89, 133), 1, true));
        jLabelCancelar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCancelar2.setName("botao"); // NOI18N
        jLabelCancelar2.setOpaque(true);
        jLabelCancelar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCancelar2MouseClicked(evt);
            }
        });

        jLabel1.setText("cód:");

        jLabelLogo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelLogo.setForeground(new java.awt.Color(255, 153, 51));
        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Location_25px_1.png"))); // NOI18N
        jLabelLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setPreferredSize(new java.awt.Dimension(200, 100));

        jComboBoxDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTableVoos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableVoos);

        jTabbedPane1.addTab("Selecione o Voo para alterar/remover", jScrollPane2);

        jTablePassageiros.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTablePassageiros);

        jTabbedPane1.addTab("Passageiros", jScrollPane3);

        jTableBagagens.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTableBagagens);

        jTabbedPane1.addTab("Bagagens", jScrollPane4);

        jTextFieldID.setEditable(false);
        jTextFieldID.setBackground(new java.awt.Color(10, 59, 102));
        jTextFieldID.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldID.setText("ID");
        jTextFieldID.setBorder(null);
        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });

        jComboBoxAviao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelCadastro13.setBackground(new java.awt.Color(44, 102, 152));
        jLabelCadastro13.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabelCadastro13.setForeground(new java.awt.Color(232, 233, 232));
        jLabelCadastro13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastro13.setText("Aviao");
        jLabelCadastro13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelAddPassageiros.setBackground(new java.awt.Color(61, 113, 160));
        jLabelAddPassageiros.setFont(new java.awt.Font("Gisha", 0, 18)); // NOI18N
        jLabelAddPassageiros.setForeground(new java.awt.Color(232, 233, 232));
        jLabelAddPassageiros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAddPassageiros.setText("Passageiros");
        jLabelAddPassageiros.setAutoscrolls(true);
        jLabelAddPassageiros.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 89, 133), 1, true));
        jLabelAddPassageiros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAddPassageiros.setName("botao"); // NOI18N
        jLabelAddPassageiros.setOpaque(true);
        jLabelAddPassageiros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAddPassageirosMouseClicked(evt);
            }
        });

        jLabelAddBagagens.setBackground(new java.awt.Color(61, 113, 160));
        jLabelAddBagagens.setFont(new java.awt.Font("Gisha", 0, 18)); // NOI18N
        jLabelAddBagagens.setForeground(new java.awt.Color(232, 233, 232));
        jLabelAddBagagens.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAddBagagens.setText("Bagagens");
        jLabelAddBagagens.setAutoscrolls(true);
        jLabelAddBagagens.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 89, 133), 1, true));
        jLabelAddBagagens.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAddBagagens.setName("botao"); // NOI18N
        jLabelAddBagagens.setOpaque(true);
        jLabelAddBagagens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAddBagagensMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addComponent(jLabelCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addComponent(jLabelCancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelCadastro18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundLayout.createSequentialGroup()
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCadastro12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelAddPassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelAddBagagens, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCadastro13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxAviao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelCadastro14, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(jTextFieldDecolagem))))
                        .addContainerGap())))
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelCadastro18)
                                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(10, 10, 10)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCadastro14)
                            .addComponent(jLabelCadastro13))
                        .addGap(32, 32, 32))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabelCadastro12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAddPassageiros)
                            .addComponent(jLabelAddBagagens)
                            .addComponent(jComboBoxAviao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDecolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(1, 1, 1)
                .addComponent(jLabelCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCancelar1)
                    .addComponent(jLabelCancelar2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCadastrarMouseClicked
        cadastrar();
    }//GEN-LAST:event_jLabelCadastrarMouseClicked

    private void jLabelCancelar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCancelar2MouseClicked
        remover();
    }//GEN-LAST:event_jLabelCancelar2MouseClicked

    private void jLabelCancelar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCancelar1MouseClicked
        alterar();
    }//GEN-LAST:event_jLabelCancelar1MouseClicked

    private void jLabelAddPassageirosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddPassageirosMouseClicked
        dialogPassageiros();
    }//GEN-LAST:event_jLabelAddPassageirosMouseClicked

    private void jLabelAddBagagensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddBagagensMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelAddBagagensMouseClicked

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxAviao;
    private javax.swing.JComboBox<String> jComboBoxDestino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAddBagagens;
    private javax.swing.JLabel jLabelAddPassageiros;
    private javax.swing.JLabel jLabelCadastrar;
    private javax.swing.JLabel jLabelCadastro12;
    private javax.swing.JLabel jLabelCadastro13;
    private javax.swing.JLabel jLabelCadastro14;
    private javax.swing.JLabel jLabelCadastro18;
    private javax.swing.JLabel jLabelCancelar1;
    private javax.swing.JLabel jLabelCancelar2;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableBagagens;
    private javax.swing.JTable jTablePassageiros;
    private javax.swing.JTable jTableVoos;
    private javax.swing.JTextField jTextFieldDecolagem;
    private javax.swing.JTextField jTextFieldID;
    // End of variables declaration//GEN-END:variables
}
