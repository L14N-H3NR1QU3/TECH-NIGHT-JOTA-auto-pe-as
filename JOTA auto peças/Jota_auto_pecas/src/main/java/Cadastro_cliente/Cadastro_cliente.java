/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Cadastro_cliente;

import Tela_Inicial.Tela_Inicial;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class Cadastro_cliente extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro_cliente
     */
    public Cadastro_cliente() {
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

        jTextField7 = new javax.swing.JTextField();
        jpanel_background = new javax.swing.JPanel();
        titulo_cadastrocliente = new javax.swing.JLabel();
        jlbl_nome = new javax.swing.JLabel();
        jlbl_telefone = new javax.swing.JLabel();
        jlbl_email = new javax.swing.JLabel();
        botaosair_cadastrocliente = new javax.swing.JButton();
        botaocadastro_cadastrocliente = new javax.swing.JButton();
        jlbl_cpf = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        telefone_cadastrocliente = new javax.swing.JTextField();
        cpf_cadastrocliente = new javax.swing.JTextField();
        Email_cadastrocliente = new javax.swing.JTextField();
        jlbl_cidade = new javax.swing.JLabel();
        nome_cadastrocliente = new javax.swing.JTextField();
        Bairro_cadastrocliente = new javax.swing.JTextField();
        cidade_cadastrocliente1 = new javax.swing.JTextField();
        jlbl_bairro = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanel_background.setBackground(new java.awt.Color(46, 46, 46));
        jpanel_background.setPreferredSize(new java.awt.Dimension(1036, 612));
        jpanel_background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo_cadastrocliente.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        titulo_cadastrocliente.setForeground(new java.awt.Color(255, 255, 255));
        titulo_cadastrocliente.setText("Cadastro de cliente");
        jpanel_background.add(titulo_cadastrocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jlbl_nome.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_nome.setText("Nome");
        jpanel_background.add(jlbl_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jlbl_telefone.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_telefone.setText("Telefone");
        jpanel_background.add(jlbl_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jlbl_email.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_email.setText("E-mail");
        jpanel_background.add(jlbl_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        botaosair_cadastrocliente.setText("Sair");
        botaosair_cadastrocliente.setPreferredSize(new java.awt.Dimension(70, 25));
        botaosair_cadastrocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaosair_cadastroclienteActionPerformed(evt);
            }
        });
        jpanel_background.add(botaosair_cadastrocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 90, -1));

        botaocadastro_cadastrocliente.setText("Cadastrar");
        botaocadastro_cadastrocliente.setPreferredSize(new java.awt.Dimension(70, 25));
        botaocadastro_cadastrocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaocadastro_cadastroclienteActionPerformed(evt);
            }
        });
        jpanel_background.add(botaocadastro_cadastrocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 580, 90, -1));

        jlbl_cpf.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_cpf.setText("CPF");
        jpanel_background.add(jlbl_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jpanel_background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 130, 80));
        jpanel_background.add(telefone_cadastrocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 280, -1));

        cpf_cadastrocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpf_cadastroclienteActionPerformed(evt);
            }
        });
        jpanel_background.add(cpf_cadastrocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 280, -1));
        jpanel_background.add(Email_cadastrocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 280, -1));

        jlbl_cidade.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_cidade.setText("Cidade");
        jpanel_background.add(jlbl_cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));
        jpanel_background.add(nome_cadastrocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 280, -1));
        jpanel_background.add(Bairro_cadastrocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 280, -1));
        jpanel_background.add(cidade_cadastrocliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 280, -1));

        jlbl_bairro.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_bairro.setText("Bairro");
        jpanel_background.add(jlbl_bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\farne\\OneDrive\\Área de Trabalho\\JOTA_techn\\TECH_NIGHT-JOTA_auto_pecas\\Imagens\\Usuario_imagem.png")); // NOI18N
        jLabel2.setText("jLabel2");
        jpanel_background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 42, 510, 520));

        getContentPane().add(jpanel_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaosair_cadastroclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaosair_cadastroclienteActionPerformed
        Tela_Inicial telInicial = new Tela_Inicial();
        telInicial.setVisible(true);
        this.dispose();


        // TODO add your handling code here:
        
    }//GEN-LAST:event_botaosair_cadastroclienteActionPerformed

    private void botaocadastro_cadastroclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaocadastro_cadastroclienteActionPerformed
        // TODO add your handling code here:
        String nome = nome_cadastrocliente.getText();
        String email = Email_cadastrocliente.getText();
        String cpf = cpf_cadastrocliente.getText();
        String telefone = telefone_cadastrocliente.getText();
        
        boolean nome_valido = validador_entrada_str(nome, 50);
        boolean email_valido = validador_tamanho_texto(email, 50);
        boolean cpf_valido = validador_entrada_num(cpf, 11);
        boolean telefone_valido = validador_entrada_num(telefone, 11);
        
        if (nome_valido && email_valido && cpf_valido && telefone_valido) {
            try {
                Connection conexao = null;
                PreparedStatement statement = null;

                String url = "jdbc:mysql://localhost:3306/JOTAautopeca";
                String usuario = "root";
                String senha = "";

                conexao = DriverManager.getConnection(url, usuario, senha);

                String sql = "INSERT INTO cliente(nome_cliente, CPF_cliente, email_cliente, telefone_cliente, bairro_clienet, rua_clienet) VALUES(?, ?, ?, ?, ?, ?);";
                statement = conexao.prepareStatement(sql);
                statement.setString(1, nome_cadastrocliente.getText());
                statement.setString(2, cpf_cadastrocliente.getText());
                statement.setString(3, Email_cadastrocliente.getText());
                statement.setString(4, telefone_cadastrocliente.getText());
                statement.setString(5, cidade_cadastrocliente1.getText());
                statement.setString(6, Bairro_cadastrocliente.getText());
                statement.executeUpdate();
                System.out.println("PASS");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "CADASTRO INVALIDO");
                System.out.println(e);
            }
        }
        else {
            if (nome_valido == false) {
                JOptionPane.showMessageDialog(null, "NOME INVÁLIDO");
            }
            else if (email_valido == false) {
                JOptionPane.showMessageDialog(null, "EMAIL INVÁLIDO");
            }
            else if (cpf_valido == false) {
                JOptionPane.showMessageDialog(null, "CPF INVÁLIDO");
            }
            else if (telefone_valido == false) {
                JOptionPane.showMessageDialog(null, "TELEFONE INVÁLIDO");
            }
        }
        
    }//GEN-LAST:event_botaocadastro_cadastroclienteActionPerformed

    private void cpf_cadastroclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpf_cadastroclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpf_cadastroclienteActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_cliente().setVisible(true);
            }
        });
    }
    
    // Valida a entrada de acordo com o tamanho do input.
    // num_str = String a ser validada.
    // limite = limite de digitos a ser inserido.
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
    
    // Valida a entrada de acordo com o tipo de input.
    // num_str = String a ser validada.
    // limite = limite de digitos a ser inserido.
    public static boolean validador_entrada_num(String num_str, int limite) {
        boolean e_num = true;
        
        
        // Se o length da String for maior do que o limite, retorna false e o usuário devera digitar novamente.
        if (num_str.length() != limite) {
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
    
    // Valida a entrada de acordo com o tipo de input.
    // num_str = String a ser validada.
    // limite = limite de digitos a ser inserido.
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bairro_cadastrocliente;
    private javax.swing.JTextField Email_cadastrocliente;
    private javax.swing.JButton botaocadastro_cadastrocliente;
    private javax.swing.JButton botaosair_cadastrocliente;
    private javax.swing.JTextField cidade_cadastrocliente1;
    private javax.swing.JTextField cpf_cadastrocliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel jlbl_bairro;
    private javax.swing.JLabel jlbl_cidade;
    private javax.swing.JLabel jlbl_cpf;
    private javax.swing.JLabel jlbl_email;
    private javax.swing.JLabel jlbl_nome;
    private javax.swing.JLabel jlbl_telefone;
    private javax.swing.JPanel jpanel_background;
    private javax.swing.JTextField nome_cadastrocliente;
    private javax.swing.JTextField telefone_cadastrocliente;
    private javax.swing.JLabel titulo_cadastrocliente;
    // End of variables declaration//GEN-END:variables
}
