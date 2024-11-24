/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tela_Inicial;

import Cadastro_carro.Cadastro_carro_tela;
import Cadastro_cliente.Cadastro_cliente;
import Cadastro_fornecedor.Cadastro_Fornecedor;
import Cadastro_funcionario.Frame_Cadastro_Funcionario;
import Cadastro_pecas_lotes.Cadastro_pecas_lotes;
import Cadastro_pedidos.Cadastro_pedidos;
import Ordem_Servico.Ordem_Servico;
import Tela_estoque.Tela_estoque;
import Tela_mapa.Tela_Mapa_Kevin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author f.silva
 */
public class Tela_Inicial extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Inicial
     */
    public Tela_Inicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filtro = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        filtroFuncionario = new javax.swing.JRadioButton();
        filtroCliente = new javax.swing.JRadioButton();
        filtroFornecedor = new javax.swing.JRadioButton();
        filtroCarro = new javax.swing.JRadioButton();
        filtroPeca = new javax.swing.JRadioButton();
        filtroPedido = new javax.swing.JRadioButton();
        Filtragem = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(46, 46, 46));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 600));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu Principal");

        jButton1.setText("Cadastro de carros");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cadastro de funcionário");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cadastro de pedidos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Ordem de serviço");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Cadastro de cliente");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jPanel2.setBackground(new java.awt.Color(75, 75, 75));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pesquisa");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 6, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("dd/mm/aaaa");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(728, 8, 83, 26));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("hh:mm");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 40, 47, -1));

        jButton6.setText("Pesquisar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 469, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nome");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        filtroFuncionario.setBackground(new java.awt.Color(65, 65, 65));
        filtro.add(filtroFuncionario);
        filtroFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        filtroFuncionario.setText("Funcionario");
        filtroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroFuncionarioActionPerformed(evt);
            }
        });
        jPanel2.add(filtroFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

<<<<<<< HEAD
        filtroCliente.setBackground(new java.awt.Color(65, 65, 65));
        filtro.add(filtroCliente);
        filtroCliente.setForeground(new java.awt.Color(255, 255, 255));
        filtroCliente.setText("Cliente");
        filtroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroClienteActionPerformed(evt);
=======
        Buscar_peça_tela_inicial.setText("Buscar");
        Buscar_peça_tela_inicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar_peça_tela_inicialActionPerformed(evt);
            }
        });
        jPanel2.add(Buscar_peça_tela_inicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, -1, -1));

        jLabel6.setText("Funcionario");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel7.setText("Peça");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, -1));

        Estoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Quantidade"
>>>>>>> 5745ebc1425ef47dcdfba487e9ec1f08cf14c906
            }
        });
        jPanel2.add(filtroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        filtroFornecedor.setBackground(new java.awt.Color(65, 65, 65));
        filtro.add(filtroFornecedor);
        filtroFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        filtroFornecedor.setText("Fornecedor");
        filtroFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroFornecedorActionPerformed(evt);
            }
        });
        jPanel2.add(filtroFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        filtroCarro.setBackground(new java.awt.Color(65, 65, 65));
        filtro.add(filtroCarro);
        filtroCarro.setForeground(new java.awt.Color(255, 255, 255));
        filtroCarro.setText("Carro");
        filtroCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroCarroActionPerformed(evt);
            }
        });
        jPanel2.add(filtroCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        filtroPeca.setBackground(new java.awt.Color(65, 65, 65));
        filtro.add(filtroPeca);
        filtroPeca.setForeground(new java.awt.Color(255, 255, 255));
        filtroPeca.setText("Peça");
        filtroPeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroPecaActionPerformed(evt);
            }
        });
        jPanel2.add(filtroPeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        filtroPedido.setBackground(new java.awt.Color(65, 65, 65));
        filtro.add(filtroPedido);
        filtroPedido.setForeground(new java.awt.Color(255, 255, 255));
        filtroPedido.setText("Pedido");
        filtroPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroPedidoActionPerformed(evt);
            }
        });
        jPanel2.add(filtroPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, -1));

        Filtragem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(Filtragem, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 759, -1));

        jButton7.setText("Sair");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Mapa do esoque");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Cadastro de peças");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Estoque");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Cadastro de fornecedor");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(181, 181, 181)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(20, 20, 20)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1094, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Frame_Cadastro_Funcionario cadFunc = new Frame_Cadastro_Funcionario();
        cadFunc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Cadastro_pedidos cadPed = new Cadastro_pedidos();
        cadPed.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Cadastro_carro_tela cadCar = new Cadastro_carro_tela();
        cadCar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Ordem_Servico ordServ = new Ordem_Servico();
        ordServ.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Cadastro_cliente cadCli = new Cadastro_cliente();
        cadCli.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Tela_Mapa_Kevin TMap = new Tela_Mapa_Kevin();
        TMap.setVisible(true);
        this.dispose();


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        Cadastro_pecas_lotes cadPeca = new Cadastro_pecas_lotes();
        cadPeca.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        Tela_estoque estoque = new Tela_estoque();
        estoque.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        Cadastro_Fornecedor cadFor = new Cadastro_Fornecedor();
        cadFor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    public int filter;
    
    private void filtroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroClienteActionPerformed
        // TODO add your handling code here:
        filter = 2;
    }//GEN-LAST:event_filtroClienteActionPerformed

    private void filtroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroFuncionarioActionPerformed
        // TODO add your handling code here:
        filter = 1;
    }//GEN-LAST:event_filtroFuncionarioActionPerformed

    private void filtroPecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroPecaActionPerformed
        // TODO add your handling code here:
        filter = 3;
    }//GEN-LAST:event_filtroPecaActionPerformed

    private void filtroCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroCarroActionPerformed
        // TODO add your handling code here:
        filter = 4;
    }//GEN-LAST:event_filtroCarroActionPerformed

    private void filtroFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroFornecedorActionPerformed
        // TODO add your handling code here:
        filter = 5;
    }//GEN-LAST:event_filtroFornecedorActionPerformed

    private void filtroPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroPedidoActionPerformed
        // TODO add your handling code here:
        filter = 6;
    }//GEN-LAST:event_filtroPedidoActionPerformed

    public static String pesquisa;
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        pesquisa = Filtragem.getText();
        switch(filter){
            case 1:
                tabelaFuncionario tabFun = new tabelaFuncionario();
                tabFun.setValores(pesquisa);
                tabFun.setVisible(true);
                this.dispose();
                break;
            case 2:
                tabelaCliente tabCli = new tabelaCliente();
                tabCli.setValores(pesquisa);
                tabCli.setVisible(true);
                this.dispose();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void Buscar_peça_tela_inicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar_peça_tela_inicialActionPerformed
        try {
            Connection conexao = null;
            PreparedStatement statement = null;
            
            String url = "jdbc:mysql://localhost:3306/jotaautopeca";
            String user = "root";
            String password = "";
            
            conexao = DriverManager.getConnection(url, user, password);
            String sql = "SELECT peca WHERE ID_peca = ?, nome_peca = ?" + "%";
            
            
            statement = conexao.prepareStatement(sql);
            statement.setString(1, Texto_id_nome_peça.getText());
            // statement.setInt(1, Integer.parseInt(jTextField1.getText()));
            
            
            ResultSet resultSet =  statement.executeQuery();
            
            if(resultSet.next()){
                JOptionPane.showMessageDialog(null, "Peça ou funcinario não encontrado. tente novamente.");
            }
            
            
            
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(Tela_Inicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Buscar_peça_tela_inicialActionPerformed

   /* public List<Funcionario> getTodosFuncionariosDAD(){
        List<Funcionario>  listaFuncionario = null;
        
        Session session = null;
        
        return listaFuncionario;
    }
    
    private void Poplar_tabela_Funcionario(){
       DefaultTableModel modeloTabela = new DefaultTableModel () ;
       
       this.Lista_nome_fun.setModel(modeloTabela);
       modeloTabela.addColumn("nome_funcionario");
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
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Filtragem;
    private javax.swing.ButtonGroup filtro;
    private javax.swing.JRadioButton filtroCarro;
    private javax.swing.JRadioButton filtroCliente;
    private javax.swing.JRadioButton filtroFornecedor;
    private javax.swing.JRadioButton filtroFuncionario;
    private javax.swing.JRadioButton filtroPeca;
    private javax.swing.JRadioButton filtroPedido;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
