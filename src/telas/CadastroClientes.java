package telas;

import java.sql.Connection;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Clientes;
import modelos.ClientesDAO;

public class CadastroClientes extends javax.swing.JFrame {

    private TelaVenda telavenda;
    private Clientes clientes;
    //private Connection conn;

    public CadastroClientes() {
        initComponents();
        this.PreencherTbl();
    }

    private void PreencherTbl() {
        ClientesDAO dao = new ClientesDAO();
        //Clientes clientes;
        List<Clientes> lista = dao.getCliente();
        DefaultTableModel tblClientes = (DefaultTableModel) tabelaClientes.getModel();
        //tabelaClientes.setRowSorter(new TableRowSorter(tblClientes));
        tblClientes.setNumRows(0);
        for (Clientes c : lista) {
            Object[] object = new Object[]{
                c.getId(),
                c.getNome(),
                c.getEndereco(),
                c.getTelefone(),
                c.getCpf(),
                c.getRg(),};
            tblClientes.addRow(object);
        }
    }

    public void MostrarTela(TelaVenda obj, int id) {
        this.telavenda = obj;
        setVisible(true);
    }

    public void Limpar() {
        txtNome.setText("");
        txtEndereco.setText("");
        txtCpf.setText("");
        txtRg.setText("");
        txtTelefone.setText("");
        txtNome.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField7 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField12 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        txtRg = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        btExcluir = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Marca / Modelo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Ano Fab / Ano Mod:");

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Valor Compra:");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Valor Venda:");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton1.setText("Cadastrar");

        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("telaClientes");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Cadastro Clientes");

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNome.setToolTipText("Preencha com nome");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Nome:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Endereço:");

        txtEndereco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEndereco.setToolTipText("Preencha com endereço");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Cpf:");

        txtCpf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCpf.setToolTipText("Preencha com cpf");

        txtRg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtRg.setToolTipText("Preencha com rg");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Rg:");

        btCadastrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Tefefone:");

        txtTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTelefone.setToolTipText("Preencha com telefone");

        btExcluir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setToolTipText("Excluir cliente");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btAtualizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.setToolTipText("Excluir cliente");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRg))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btCadastrar)
                                .addGap(110, 110, 110)
                                .addComponent(btAtualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btExcluir))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(102, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(201, 201, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(0, 34, Short.MAX_VALUE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btExcluir)
                    .addComponent(btAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addComponent(jLabel4)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel5)
                    .addContainerGap(140, Short.MAX_VALUE)))
        );

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Endereço", "telefone", "Cpf", "Rg"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaClientes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        clientes = new Clientes(null, null, null, null, null);
        ClientesDAO dao = new ClientesDAO();

        if (txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o nome:");
        } else {
            String n = txtNome.getText();
            boolean okn = n.matches("[a-zA-Z]{1,25}");
            if (okn == false) {
                JOptionPane.showMessageDialog(null, "Preencha o Nome somente letras no formato XXXXXXXX:");
                return;
            } else {
                if (txtEndereco.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Preencha o endereço:");
                } else {
                    String e = txtEndereco.getText();
                    boolean oke = e.matches("[a-zA-Z]{1,25}[,][0-9]{1,5}");
                    if (oke == false) {
                        JOptionPane.showMessageDialog(null, "Preencha o endereço no formato\nRua Xxxx,Numero:");
                        return;
                    } else {
                        if (txtTelefone.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Preencha o telefone:");
                        } else {
                            String t = txtTelefone.getText();
                            boolean okt = t.matches("[0-9]{4,7}[-][0-9]{4}");
                            if (okt == false) {
                                JOptionPane.showMessageDialog(null, "No campo telefone você deve inserir somente números no formato xxxx-xxxx:");
                                return;
                            } else {
                                if (txtCpf.getText().isEmpty()) {
                                    JOptionPane.showMessageDialog(null, "Preencha o CPF");
                                } else {
                                    String c = txtCpf.getText();
                                    boolean okc = c.matches("[0-9]{3}[.][0-9]{3}[.][0-9]{3}[-][0-9]{2}");
                                    if (okc == false) {
                                        JOptionPane.showMessageDialog(null, "No campo CPF você deve inserir somente números no formato xxx.xxx.xxx-xx:");
                                        return;
                                    } else {
                                        if (txtRg.getText().isEmpty()) {
                                            JOptionPane.showMessageDialog(null, "Preencha o RG:");
                                        } else {
                                            String r = txtRg.getText();
                                            boolean okr = r.matches("[0-9]{8,10}");
                                            if (okr == false) {
                                                JOptionPane.showMessageDialog(null, "No campo rg preencha somente numeros do formato xxxxxxxxxx:");
                                                return;
                                            } else {
                                                clientes = new Clientes(n, e, t, c, r);
                                                clientes.AddCliente(clientes);
                                                dao.cadastrarCliente(clientes);
                                                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
                                                PreencherTbl();
                                                Limpar();

                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }


    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if (tabelaClientes.getSelectedRow() != -1) {
            String nome = txtNome.getText();
            ClientesDAO clientesdao = new ClientesDAO();
            clientesdao.excluir(nome);
            Limpar();
            this.PreencherTbl();
            JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Selecionar o cliente para ser excluído:");
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        if (tabelaClientes.getSelectedRow() != -1) {
            clientes = new Clientes(null, null, null, null, null);
            ClientesDAO dao = new ClientesDAO();

            if (txtNome.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o nome:");
            } else {
                String n = txtNome.getText();
                boolean okn = n.matches("[a-zA-Z]{1,25}");
                if (okn == false) {
                    JOptionPane.showMessageDialog(null, "Preencha o Nome somente letras no formato XXXXXXXX:");
                    return;
                } else {
                    if (txtEndereco.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Preencha o endereço:");
                    } else {
                        String e = txtEndereco.getText();
                        boolean oke = e.matches("[a-zA-Z]{1,25}[,][0-9]{1,5}");
                        if (oke == false) {
                            JOptionPane.showMessageDialog(null, "Preencha o endereço no formato\nRua Xxxx,Numero:");
                            return;
                        } else {
                            if (txtTelefone.getText().isEmpty()) {
                                JOptionPane.showMessageDialog(null, "Preencha o telefone:");
                            } else {
                                String t = txtTelefone.getText();
                                boolean okt = t.matches("[0-9]{4,7}[-][0-9]{4}");
                                if (okt == false) {
                                    JOptionPane.showMessageDialog(null, "No campo telefone você deve inserir somente números no formato xxxx-xxxx:");
                                    return;
                                } else {
                                    if (txtCpf.getText().isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Preencha o CPF");
                                    } else {
                                        String c = txtCpf.getText();
                                        boolean okc = c.matches("[0-9]{3}[.][0-9]{3}[.][0-9]{3}[-][0-9]{2}");
                                        if (okc == false) {
                                            JOptionPane.showMessageDialog(null, "No campo CPF você deve inserir somente números no formato xxx.xxx.xxx-xx:");
                                            return;
                                        } else {
                                            if (txtRg.getText().isEmpty()) {
                                                JOptionPane.showMessageDialog(null, "Preencha o RG:");
                                            } else {
                                                String r = txtRg.getText();
                                                boolean okr = r.matches("[0-9]{8,10}");
                                                if (okr == false) {
                                                    JOptionPane.showMessageDialog(null, "No campo rg preencha somente numeros do formato xxxxxxxxxx:");
                                                    return;
                                                } else {
                                                    clientes = new Clientes(n, e, t, c, r);
                                                    clientes.AddCliente(clientes);
                                                    dao.editar(clientes);
                                                    this.PreencherTbl();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
         }    }//GEN-LAST:event_btAtualizarActionPerformed
    else {
            JOptionPane.showMessageDialog(null, "Selecionar o cliente para ser atualizar:");
        }
    }
    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void tabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClientesMouseClicked
        int linha = tabelaClientes.getSelectedRow();
        int idPesquisa = (int) tabelaClientes.getValueAt(linha, 0);
        ClientesDAO dao = new ClientesDAO();
        Clientes c = dao.buscarCliente(idPesquisa);
        txtNome.setText(c.getNome());
        txtEndereco.setText(c.getEndereco());
        txtTelefone.setText(c.getTelefone());
        txtCpf.setText(c.getCpf());
        txtRg.setText(c.getRg());
        /**
        this.consultar((String) tabelaClientes.getValueAt(linha, 0));    }//GEN-LAST:event_tabelaClientesMouseClicked
*/
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTable tabelaClientes;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRg;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
