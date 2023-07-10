package telas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Motos;
import modelos.MotosDao;

public class CadatroMotos extends javax.swing.JFrame {

    private Motos motos;
    private CadatroMotos cadatroMotos;
    private TelaVenda telavenda;

    public CadatroMotos() {
        initComponents();
        preencherTabela();
    }

    public void MostrarTela(TelaVenda obj) {
        this.telavenda = obj;
        setVisible(true);
    }

    public void ExcluirVenda() {
        int linha = tabelaMotos.getSelectedRow();
        int idPesquisa = (int) tabelaMotos.getValueAt(linha, 0);
        MotosDao dao = new MotosDao();
        dao.excluir(idPesquisa);
    }

    public void Limpar() {
        txtAno.setText("");
        txtCor.setText("");
        txtModelo.setText("");
        txtPlaca.setText("");
        txtValorCompra.setText("");
        txtValorVenda.setText("");
        txtAno.requestFocus();
    }

    public void preencherTabela() {
        MotosDao dao = new MotosDao();

        List<Motos> listaMotos = dao.getMoto();

        DefaultTableModel tblMotos = (DefaultTableModel) tabelaMotos.getModel();

        //tblMotos.setRowSorter(new TableRowSorter(tblMotos));
        for (Motos m : listaMotos) { //em cada volta do laço for, o mesmo adiciona uma dado(empresa) dentro do objeto c
            Object[] obj = new Object[]{
                m.getId(), //id
                m.getPlaca(),
                m.getCor(),
                m.getAno(),
                m.getValor_custo(),
                m.getValor_venda(),
                m.getModelo(),};
            tblMotos.addRow(obj);
        }
    }

    public int getPosicaoMoto() {
        int posMoto = tabelaMotos.getSelectedRow();
        return posMoto;
    }

    private void motoId(int posMoto) {
        if (getPosicaoMoto() >= 0) {
            telavenda.MostrarTela();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtValorVenda = new javax.swing.JTextField();
        txtValorCompra = new javax.swing.JTextField();
        txtCor = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        btCadastrarMoto = new javax.swing.JButton();
        btExcluirMoto = new javax.swing.JButton();
        btVender = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMotos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("telaMotos");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Cadastro Motos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Marca / Modelo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Ano Fab / Ano Mod:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Cor:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Valor Compra:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Valor Venda:");

        txtValorVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtValorVenda.setToolTipText("Preencha com valor de venda");

        txtValorCompra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtValorCompra.setToolTipText("Preencha com o valor de compra");

        txtCor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCor.setToolTipText("Preencha com a cor");

        txtAno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAno.setToolTipText("Preencha com ano de fabricação e ano modelo");

        txtModelo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtModelo.setToolTipText("Preencha com marca e modelo da moto");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Placa:");

        txtPlaca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPlaca.setToolTipText("Preencha com a placa");

        btCadastrarMoto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btCadastrarMoto.setText("Cadastrar");
        btCadastrarMoto.setToolTipText("Cadastrar motos");
        btCadastrarMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarMotoActionPerformed(evt);
            }
        });

        btExcluirMoto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btExcluirMoto.setText("Excluir");
        btExcluirMoto.setToolTipText("Excluir moto selecionada");
        btExcluirMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirMotoActionPerformed(evt);
            }
        });

        btVender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btVender.setText("Vender");
        btVender.setToolTipText("Vender moto selecionada");
        btVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btCadastrarMoto)
                            .addGap(104, 104, 104)
                            .addComponent(btExcluirMoto)
                            .addGap(124, 124, 124)
                            .addComponent(btVender))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtValorVenda))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCor))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtModelo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(txtValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluirMoto)
                    .addComponent(btVender)
                    .addComponent(btCadastrarMoto))
                .addContainerGap())
        );

        tabelaMotos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Placa", "Cor", "Ano fab/Ano mod", "Valor custo", "Valor venda", "Modelo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaMotos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMotosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaMotos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarMotoActionPerformed
        Motos m = new Motos();

        if (txtPlaca.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha a placa:");
        } else {
            m.setPlaca(txtPlaca.getText());
            boolean okn = m.getPlaca().matches("[a-zA-Z]{3}[0-9]{4}");
            if (okn == false) {
                JOptionPane.showMessageDialog(null, "Preencha placa no formato xxx0000");
                return;
            } else {
                if (txtModelo.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Preencha marca e modelo:");
                } else {
                    m.setModelo(txtModelo.getText());
                    boolean oke = m.getModelo().matches("[a-zA-Z]{1,7}[/][a-zA-Z0-9]{1,20}");
                    if (oke == false) {
                        JOptionPane.showMessageDialog(null, "Preencha marca e modelo no formato marca/modelo:");
                        return;
                    } else {
                        if (txtCor.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Preencha a cor:");
                        } else {
                            m.setCor(txtCor.getText());
                            boolean okt = m.getCor().matches("[a-zA-Z]{1,10}");
                            if (okt == false) {
                                JOptionPane.showMessageDialog(null, "Preencha cor somente letras:");
                                return;
                            } else {
                                if (txtAno.getText().isEmpty()) {
                                    JOptionPane.showMessageDialog(null, "Preencha o ano fabricaçao e modelo:");
                                } else {
                                    m.setAno(txtAno.getText());
                                    boolean okc = m.getAno().matches("[0-9]{4}[/][0-9]{4}");
                                    if (okc == false) {
                                        JOptionPane.showMessageDialog(null, "Preencha campo ano fabricação e modelo:\n Ex: 0000/0000");
                                        return;
                                    } else {
                                        if (txtValorCompra.getText().isEmpty()) {
                                            JOptionPane.showMessageDialog(null, "Preencha o valor compra:");
                                        } else {
                                            m.setValor_custo(txtValorCompra.getText());
                                            boolean okr = m.getValor_custo().matches("[0-9]{1,10}");
                                            if (okr == false) {
                                                JOptionPane.showMessageDialog(null, "No campo valor de compra preencha somente numeros:");
                                                return;
                                            } else {
                                                if (txtValorVenda.getText().isEmpty()) {
                                                    JOptionPane.showMessageDialog(null, "Preencha o valor venda:");
                                                } else {
                                                    m.setValor_venda(txtValorVenda.getText());
                                                    boolean okv = m.getValor_venda().matches("[0-9]{1,10}");
                                                    if (okr == false) {
                                                        JOptionPane.showMessageDialog(null, "No campo valor de venda preencha somente numeros:");
                                                        return;
                                                    } else {
                                                        MotosDao dao = new MotosDao();
                                                        dao.inserir(m);
                                                        preencherTabela();
                                                        Limpar();
                                                        JOptionPane.showMessageDialog(null, "Moto cadastrada com sucesso:");
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
            }
        }

    }//GEN-LAST:event_btCadastrarMotoActionPerformed

    private void btExcluirMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirMotoActionPerformed
        if (tabelaMotos.getSelectedRow() != -1) {
            int linha = tabelaMotos.getSelectedRow();
            int idPesquisa = (int) tabelaMotos.getValueAt(linha, 0);
            MotosDao dao = new MotosDao();
            dao.excluir(idPesquisa);
            JOptionPane.showMessageDialog(null, "Moto excluída com sucesso:");
            dispose();
            CadatroMotos telaCadatroMotos = new CadatroMotos();
            telaCadatroMotos.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Selecionar a moto para ser excluída:");
        }
    }//GEN-LAST:event_btExcluirMotoActionPerformed

    private void btVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVenderActionPerformed
        if (tabelaMotos.getSelectedRow() != -1) {
            Motos m = new Motos();
            TelaVenda telaTelaVenda = new TelaVenda();
            m.setAno(txtAno.getText());
            m.setCor(txtCor.getText());
            m.setModelo(txtModelo.getText());
            m.setPlaca(txtPlaca.getText());
            m.setValor_custo(txtValorCompra.getText());
            m.setValor_venda(txtValorVenda.getText());
            telaTelaVenda.motoVenda(m);
            MotosDao d = new MotosDao();
            ExcluirVenda();
            telaTelaVenda.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Selecionar a moto para ser vendida:");
        }

        //telavenda.MostraMoto();
    }//GEN-LAST:event_btVenderActionPerformed

    private void tabelaMotosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMotosMouseClicked
        int linha = tabelaMotos.getSelectedRow();
        int idPesquisa = (int) tabelaMotos.getValueAt(linha, 0);
        MotosDao dao = new MotosDao();
        Motos m = dao.buscaMoto(idPesquisa);
        txtPlaca.setText(m.getPlaca());
        txtCor.setText(m.getCor());
        txtAno.setText(m.getAno());
        txtValorCompra.setText(m.getValor_custo());
        txtValorVenda.setText(m.getValor_venda());
        txtModelo.setText(m.getModelo());
    }//GEN-LAST:event_tabelaMotosMouseClicked

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
            java.util.logging.Logger.getLogger(CadatroMotos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadatroMotos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadatroMotos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadatroMotos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadatroMotos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrarMoto;
    private javax.swing.JButton btExcluirMoto;
    private javax.swing.JButton btVender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaMotos;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtValorCompra;
    private javax.swing.JTextField txtValorVenda;
    // End of variables declaration//GEN-END:variables
}
