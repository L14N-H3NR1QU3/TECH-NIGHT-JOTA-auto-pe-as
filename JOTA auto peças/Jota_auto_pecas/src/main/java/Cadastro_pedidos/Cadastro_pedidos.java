/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Cadastro_pedidos;

import Cadastro_funcionario.Frame_Cadastro_Funcionario;
import static Cadastro_funcionario.Frame_Cadastro_Funcionario.validador_entrada_num;
import static Cadastro_funcionario.Frame_Cadastro_Funcionario.validador_entrada_str;
import static Cadastro_funcionario.Frame_Cadastro_Funcionario.validador_tamanho_texto;
import Tela_Inicial.Tela_Inicial;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author l.silva
 */
public class Cadastro_pedidos extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro_pedidos
     */
    public Cadastro_pedidos() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel_nomeC = new javax.swing.JLabel();
        jLabel_telefone = new javax.swing.JLabel();
        jLabel_estabelecimento = new javax.swing.JLabel();
        jLabel_Emailp = new javax.swing.JLabel();
        jLabel_Dataentrega = new javax.swing.JLabel();
        jLabelPrecot = new javax.swing.JLabel();
        NomeCliente = new javax.swing.JTextField();
        TelefoneCliente = new javax.swing.JTextField();
        EmailCliente = new javax.swing.JTextField();
        EstabelecimentoCliente = new javax.swing.JTextField();
        PrecoTotal = new javax.swing.JTextField();
        DataEntrega = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Voltar_Cadastro_pedidos = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel_tituloP = new javax.swing.JLabel();
        jLabel_iconeP = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        IdCliente = new javax.swing.JTable();
        IdClienteText = new javax.swing.JTextField();
        jLabel_IdC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(46, 46, 46));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 600));

        jLabel_nomeC.setForeground(new java.awt.Color(242, 242, 242));
        jLabel_nomeC.setText("Nome cliente");

        jLabel_telefone.setForeground(new java.awt.Color(242, 242, 242));
        jLabel_telefone.setText("Telefone");

        jLabel_estabelecimento.setForeground(new java.awt.Color(242, 242, 242));
        jLabel_estabelecimento.setText("Estabelecimento");

        jLabel_Emailp.setForeground(new java.awt.Color(242, 242, 242));
        jLabel_Emailp.setText("E-mail");

        jLabel_Dataentrega.setForeground(new java.awt.Color(242, 242, 242));
        jLabel_Dataentrega.setText("Data de entrega");

        jLabelPrecot.setForeground(new java.awt.Color(242, 242, 242));
        jLabelPrecot.setText("Preço/total");

        NomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeClienteActionPerformed(evt);
            }
        });

        DataEntrega.setText("AAAA-MM-DD");
        DataEntrega.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataEntregaMouseClicked(evt);
            }
        });

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Voltar_Cadastro_pedidos.setText("Voltar");
        Voltar_Cadastro_pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Voltar_Cadastro_pedidosActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(242, 242, 242));
        jLabel9.setText("hh : mm - dd/mm/aaaa");

        jLabel_tituloP.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel_tituloP.setForeground(new java.awt.Color(242, 242, 242));
        jLabel_tituloP.setText("Cadastro de pedidos");

        jLabel_iconeP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo.png"))); // NOI18N
        jLabel_iconeP.setText("jLabel11");

        IdCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nome"
            }
        ));
        IdCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IdClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(IdCliente);

        IdClienteText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdClienteTextActionPerformed(evt);
            }
        });

        jLabel_IdC.setForeground(new java.awt.Color(242, 242, 242));
        jLabel_IdC.setText("ID cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Voltar_Cadastro_pedidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_IdC)
                                    .addComponent(jLabel_nomeC)
                                    .addComponent(jLabel_telefone)
                                    .addComponent(jLabel_Emailp)
                                    .addComponent(jLabel_estabelecimento)
                                    .addComponent(jLabel_Dataentrega)
                                    .addComponent(jLabelPrecot))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(EstabelecimentoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PrecoTotal, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EmailCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TelefoneCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NomeCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DataEntrega, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                    .addComponent(IdClienteText))
                                .addGap(18, 37, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_tituloP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_iconeP, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_tituloP)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_iconeP)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 43, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_nomeC)
                            .addComponent(NomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_IdC)
                            .addComponent(IdClienteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_telefone)
                            .addComponent(TelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Emailp)
                            .addComponent(EmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_estabelecimento)
                            .addComponent(EstabelecimentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPrecot)
                            .addComponent(PrecoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Dataentrega)
                            .addComponent(DataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(217, 217, 217)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Voltar_Cadastro_pedidos))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1036, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Voltar_Cadastro_pedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Voltar_Cadastro_pedidosActionPerformed
        Tela_Inicial telInicial = new Tela_Inicial();
        telInicial.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_Voltar_Cadastro_pedidosActionPerformed

    public static boolean validador_tamanho_texto(String num_str, int limite) {
        boolean tamanho;
        
        // Se o length da String for maior do que o limite, retorna false e o usuário devera digitar novamente.
        if (num_str.length() > limite) {
            tamanho = false;
        }
        else {
            tamanho = true;
        }
        
        return tamanho;
    }
    
    public static boolean validador_entrada_num(String num_str, int limite) {
        boolean e_num = true;
        
        
        // Se o length da String for maior do que o limite, retorna false e o usuário devera digitar novamente.
        if (num_str.length() > limite && num_str.length() < 0) {
            e_num = false;
        }

        // Verifica cada posição da String para saber se é letra ou número.
        // Retorna false se uma posição for letra e acaba com o código, fazendo o usuário escrever denovo.
        // Retorna true se for número e prossegue com o código.
        
        if (e_num == true) {
            for (int i = 0; i < num_str.length(); i++) {
                char c = num_str.charAt(i);
                if ('0' <= c && c <= '9') {
                    e_num = true;
                }
                else {
                    e_num = false;
                    break;
                }
            }
        }

        return e_num;
    }
    
    public static boolean validador_entrada_str(String num_str, int limite) {
        boolean e_letra;
        
        // Se e_letra for false o código não executa por completo.
        e_letra = validador_tamanho_texto(num_str, limite);
        
        // Verifica cada posição da String para saber se é letra ou número.
        // Retorna true se for letra e prossegue com o código. 
        // Retorna false se for número e para o código, fazendo o usuário digitar novamente.
        
        for (int i = 0; i < num_str.length(); i++) {
            char c = num_str.charAt(i);
            if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')) {
                e_letra = true;
            }
            else {
                e_letra = false;
                break;
            }
        }
        
        return e_letra;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String nome = NomeCliente.getText();
        String telefone = TelefoneCliente.getText();
        String email = EmailCliente.getText();
        String estabelecimento = NomeCliente.getText();
        String precoTotal = TelefoneCliente.getText();
        String dataEntrega = EmailCliente.getText();
        
        boolean nome_valido = validador_entrada_str(nome, 50);
        boolean telefone_valido = validador_tamanho_texto(telefone, 11);
        boolean email_valido = validador_tamanho_texto(email, 50);
        boolean estabelecimento_valido = validador_tamanho_texto(estabelecimento, 50);
        boolean precoTotal_valido = validador_entrada_num(precoTotal, 11);
        boolean dataEntrega_valido = validador_tamanho_texto(dataEntrega, 10);
        
        int linhaSelecionada = IdCliente.getSelectedRow();
        
        if (nome_valido && telefone_valido && email_valido && estabelecimento_valido && precoTotal_valido && dataEntrega_valido) {
            try {
                Connection conexao = null;
                PreparedStatement statement = null;

                String url = "jdbc:mysql://localhost:3306/JOTAautopeca";
                String usuario = "root";
                String senha = "";

                conexao = DriverManager.getConnection (url, usuario, senha) ;
                String sql = "INSERT INTO pedidos(nome_cliente, email_cliente, telefone_cliente, local_estab, precoT, data_entrega, ID_cliente_pedidos) VALUES (?, ?, ?, ?, ?, ?, ?)";

                statement = conexao.prepareStatement(sql);
                statement.setString(1, NomeCliente.getText());
                statement.setString(2, TelefoneCliente.getText());
                statement.setString(3, EmailCliente.getText());
                statement.setString(4, EstabelecimentoCliente.getText());
                statement.setString(5, PrecoTotal.getText());
                statement.setString(6, DataEntrega.getText());
                statement.setString(7, String.valueOf(IdCliente.getValueAt(linhaSelecionada, 0)));
                statement.executeUpdate();

                System.out.println("PASS");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "CADASTRO INVALIDO");
                System.out.println(ex);
            }
        }
        else {
            if (nome_valido == false) {
                JOptionPane.showMessageDialog(null, "NOME INVÁLIDO");
            }
            else if (email_valido == false) {
                JOptionPane.showMessageDialog(null, "EMAIL INVÁLIDO");
            }
            else if (telefone_valido == false) {
                JOptionPane.showMessageDialog(null, "TELEFONE INVÁLIDO");
            }
            else if (estabelecimento_valido == false) {
                JOptionPane.showMessageDialog(null, "ESTABELECIMENTO INVÁLIDO");
            }
            else if (precoTotal_valido == false) {
                JOptionPane.showMessageDialog(null, "PREÇO TOTAL INVÁLIDO");
            }
            else if (dataEntrega_valido == false) {
                JOptionPane.showMessageDialog(null, "DATA DE ENTREGA INVÁLIDO");
            }
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeClienteActionPerformed

    private void IdClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IdClienteMouseClicked
        // TODO add your handling code here:
        int linhaSelecionada = IdCliente.getSelectedRow();
        Object id = IdCliente.getValueAt(linhaSelecionada, 0);
        Object nome = IdCliente.getValueAt(linhaSelecionada, 1);

        NomeCliente.setText(""+nome);
        IdClienteText.setText(""+id);
    }//GEN-LAST:event_IdClienteMouseClicked

    public class DatabaseConnection {
        public static Connection getConnection() {
            Connection connection = null;
            try {
                String url = "jdbc:mysql://localhost:3306/JOTAautopeca";
                String user = "root";
                String password = "";

                connection = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                System.out.println("Erro ao conectar: " + e.getMessage());
            }
            return connection;
        }
    }
    
    private void carregarDados() {
        DefaultTableModel modelo = (DefaultTableModel) IdCliente.getModel();
        modelo.setRowCount(0); // Limpa a tabela antes de adicionar novos dados

        String sql = "SELECT * FROM cliente"; // Substitua pelo nome da sua tabela

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            // Adicionar colunas ao modelo, se necessário
            modelo.setColumnIdentifiers(new String[]{"ID", "Nome"}); // Colunas da tabela

            // Adiciona as linhas à tabela
            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getInt("id_cliente"),       // Substitua pelos nomes das colunas do banco
                    rs.getString("nome_cliente")
                });
            }

        } catch (SQLException e) {
            System.out.println("Erro ao carregar dados: " + e.getMessage());
        }
    }
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        carregarDados();
    }//GEN-LAST:event_formWindowActivated

    private void IdClienteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdClienteTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdClienteTextActionPerformed

    private void DataEntregaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataEntregaMouseClicked
        // TODO add your handling code here:
        DataEntrega.setText("");
    }//GEN-LAST:event_DataEntregaMouseClicked
    
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
            java.util.logging.Logger.getLogger(Cadastro_pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_pedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DataEntrega;
    private javax.swing.JTextField EmailCliente;
    private javax.swing.JTextField EstabelecimentoCliente;
    private javax.swing.JTable IdCliente;
    private javax.swing.JTextField IdClienteText;
    private javax.swing.JTextField NomeCliente;
    private javax.swing.JTextField PrecoTotal;
    private javax.swing.JTextField TelefoneCliente;
    private javax.swing.JButton Voltar_Cadastro_pedidos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelPrecot;
    private javax.swing.JLabel jLabel_Dataentrega;
    private javax.swing.JLabel jLabel_Emailp;
    private javax.swing.JLabel jLabel_IdC;
    private javax.swing.JLabel jLabel_estabelecimento;
    private javax.swing.JLabel jLabel_iconeP;
    private javax.swing.JLabel jLabel_nomeC;
    private javax.swing.JLabel jLabel_telefone;
    private javax.swing.JLabel jLabel_tituloP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
