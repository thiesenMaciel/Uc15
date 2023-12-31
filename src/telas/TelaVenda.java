package telas;

import java.util.List;
import javax.swing.JOptionPane;
import modelos.Clientes;
import modelos.ClientesDAO;
import modelos.Motos;
import modelos.MotosDao;

public class TelaVenda extends javax.swing.JFrame {

    private Clientes clientes;
    private CadatroMotos cadatromotos;
    private Motos motos;
    private int posMoto;

    public TelaVenda() {
        initComponents();
        preencherCombo();
        System.out.println();
    }

    private void preencherCombo() {
        ClientesDAO dao = new ClientesDAO();
        List<Clientes> lista = dao.getCliente();
        //Percorrer essa lista e cada empresa que ele achar, colocar dentro da caixa de combinação
        for (Clientes c : lista) {
            cbCliente.addItem(c);//devido ao ajuste que fizemos na caixa de combinação, podemos adicionar a ela objetos, e não mais somente String
        }
    }

    public void motoVenda(Motos motos) {
       lbMotoSelecionada.setText(motos.getModelo() + " placa: " + motos.getPlaca() + " valor R$ " + motos.getValor_venda());
       // setVisible(true);   
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbMotoSelecionada = new javax.swing.JLabel();
        cbCliente = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtValorVenda = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPagamento = new javax.swing.JTextField();
        btConfirmar = new javax.swing.JButton();
        btAddCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Venda");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Moto:");

        lbMotoSelecionada.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbMotoSelecionada.setToolTipText("Moto selecionada para venda");

        cbCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbCliente.setToolTipText("Selecione o cliente");
        cbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClienteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Cliente:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Valor Venda:");

        txtValorVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtValorVenda.setToolTipText("Preencha com valor da venda");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Data:");

        txtData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtData.setToolTipText("Preencha com data da venda");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Forma Pagamento:");

        txtPagamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPagamento.setToolTipText("Preencha com forma de pagamento");

        btConfirmar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btConfirmar.setText("Confirmar");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });

        btAddCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btAddCliente.setText("+");
        btAddCliente.setToolTipText("Cadastrar novo cliente");
        btAddCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbMotoSelecionada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cbCliente, 0, 421, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btAddCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPagamento))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(btConfirmar)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbMotoSelecionada))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btAddCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbCliente))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(btConfirmar)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbClienteActionPerformed

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        if (txtValorVenda.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o valor de venda:");
        } else {
            String vv = txtValorVenda.getText();
            boolean okvv = vv.matches("[0-9]{1,10}");
            if (okvv == false) {
                JOptionPane.showMessageDialog(null, "Preencha o valor de venda com somente números:");
                return;
            } else {
                if (txtData.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Preencha data:");
                } else {
                    String d = txtData.getText();
                    boolean okd = d.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}");
                    if (okd == false) {
                        JOptionPane.showMessageDialog(null, "Preencha data e acordo com exemplo\nExemplo: DD/MM/AAAA");
                    } else {
                        if (txtPagamento.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Preencha forma pagamento:");
                        } else {
                            String p = txtPagamento.getText();
                            boolean okp = p.matches("[a-z]{1,9}");
                            if (okp == false) {
                                JOptionPane.showMessageDialog(null, "Preencha forma de pagamento com somente letras:");
                            } else {
                                JOptionPane.showMessageDialog(null, "Moto vendida com sucesso!");
                                dispose();
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void btAddClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddClienteActionPerformed
        CadastroClientes telaCadastroClientes = new CadastroClientes();
        telaCadastroClientes.setVisible(true);
    }//GEN-LAST:event_btAddClienteActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddCliente;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JComboBox cbCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbMotoSelecionada;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtPagamento;
    private javax.swing.JTextField txtValorVenda;
    // End of variables declaration//GEN-END:variables

    void MostrarTela() {
    }
}
