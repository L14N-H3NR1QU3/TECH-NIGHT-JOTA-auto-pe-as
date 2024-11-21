/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Cadastro_funcionario;

import static Cadastro_cliente.Cadastro_cliente.validador_entrada_num;
import static Cadastro_cliente.Cadastro_cliente.validador_entrada_str;
import static Cadastro_cliente.Cadastro_cliente.validador_tamanho_texto;
import Tela_Inicial.Tela_Inicial;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author m.pereira
 */
public class Frame_Cadastro_Funcionario extends javax.swing.JFrame {

    private Object telInicial;

    /**
     * Creates new form Frame_Cadastro_Funcionario
     */
    public Frame_Cadastro_Funcionario() {
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
        Nome_funcionario_CadastroF = new javax.swing.JTextField();
        jLabel_tituloFuncio = new javax.swing.JLabel();
        jLabel_nomeFuncio = new javax.swing.JLabel();
        jLabel_bairroFuncio = new javax.swing.JLabel();
        jLabel_emailFuncio = new javax.swing.JLabel();
        jLabel_cpfFuncio = new javax.swing.JLabel();
        jLabel_cidadeFuncio = new javax.swing.JLabel();
        jLabel_senhaF = new javax.swing.JLabel();
        Bairro_funcionario = new javax.swing.JTextField();
        Email_funcionario = new javax.swing.JTextField();
        CPF_funcionario = new javax.swing.JTextField();
        Cidade_funcionario = new javax.swing.JTextField();
        Cadastrar_Funionario = new javax.swing.JButton();
        jLabel_iconeFuncio = new javax.swing.JLabel();
        Voltar_cadastro_funcionario = new javax.swing.JButton();
        Senha_funcionario = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(46, 46, 46));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 600));
        jPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        Nome_funcionario_CadastroF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_tituloFuncio.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_tituloFuncio.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel_tituloFuncio.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_tituloFuncio.setText("Cadastro de Funcionário");

        jLabel_nomeFuncio.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nomeFuncio.setText("Nome");

        jLabel_bairroFuncio.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_bairroFuncio.setText("Bairro");

        jLabel_emailFuncio.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_emailFuncio.setText("E-mail");

        jLabel_cpfFuncio.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_cpfFuncio.setText("CPF ");

        jLabel_cidadeFuncio.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_cidadeFuncio.setText("Cidade");

        jLabel_senhaF.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_senhaF.setText("Senha");

        Bairro_funcionario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Email_funcionario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        CPF_funcionario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CPF_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPF_funcionarioActionPerformed(evt);
            }
        });

        Cidade_funcionario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Cidade_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cidade_funcionarioActionPerformed(evt);
            }
        });

        Cadastrar_Funionario.setText("Cadastrar");
        Cadastrar_Funionario.setBorderPainted(false);
        Cadastrar_Funionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastrar_FunionarioActionPerformed(evt);
            }
        });

        jLabel_iconeFuncio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo.png"))); // NOI18N
        jLabel_iconeFuncio.setText("jLabel3");

        Voltar_cadastro_funcionario.setText("Voltar");
        Voltar_cadastro_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Voltar_cadastro_funcionarioActionPerformed(evt);
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
                        .addComponent(jLabel_tituloFuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 468, Short.MAX_VALUE)
                        .addComponent(jLabel_iconeFuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Voltar_cadastro_funcionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cadastrar_Funionario)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CPF_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_nomeFuncio)
                        .addGap(18, 18, 18)
                        .addComponent(Nome_funcionario_CadastroF, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel_cpfFuncio)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_cidadeFuncio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Cidade_funcionario))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_bairroFuncio)
                                    .addComponent(jLabel_emailFuncio)
                                    .addComponent(jLabel_senhaF))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Email_funcionario, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                    .addComponent(Bairro_funcionario, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                    .addComponent(Senha_funcionario))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_tituloFuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_iconeFuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome_funcionario_CadastroF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_nomeFuncio))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_cpfFuncio)
                    .addComponent(CPF_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cidade_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_cidadeFuncio))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_bairroFuncio)
                    .addComponent(Bairro_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_emailFuncio))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_senhaF)
                    .addComponent(Senha_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Cadastrar_Funionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Voltar_cadastro_funcionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CPF_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPF_funcionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPF_funcionarioActionPerformed

    private void Cidade_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cidade_funcionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cidade_funcionarioActionPerformed

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
    
    private void Cadastrar_FunionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastrar_FunionarioActionPerformed
  
        String nome = Nome_funcionario_CadastroF.getText();
        String email = Email_funcionario.getText();
        String cpf = CPF_funcionario.getText();
        String cidade = Cidade_funcionario.getText();
        String bairro = Bairro_funcionario.getText();
        
        boolean nome_valido = validador_entrada_str(nome, 50);
        boolean email_valido = validador_tamanho_texto(email, 50);
        boolean cpf_valido = validador_entrada_num(cpf, 11);
        boolean cidade_valido = validador_tamanho_texto(cidade, 50);
        boolean bairro_valido = validador_tamanho_texto(bairro, 50);
        
        if (nome_valido && email_valido && cpf_valido && cidade_valido && bairro_valido) {
            try {
                Connection conexao = null;
                PreparedStatement statement = null;

                String url = "jdbc:mysql://localhost:3306/JOTAautopeca";
                String usuario = "root";
                String senha = "";

                conexao = DriverManager.getConnection (url, usuario, senha) ;
                String sql = "INSERT INTO Funcionario(nome_funcionario, CPF_funcionario, cidade_funcionario, Bairro_funcionario, email_funcionario, senha_funcionario) VALUES (?, ?, ?, ?, ?, ?)";

                statement = conexao.prepareStatement(sql);
                statement.setString(1, Nome_funcionario_CadastroF.getText());
                statement.setString(2, CPF_funcionario.getText());
                statement.setString(3, Cidade_funcionario.getText());
                statement.setString(4, Bairro_funcionario.getText());
                statement.setString(5, Email_funcionario.getText());
                statement.setString(6, String.valueOf(Senha_funcionario.getPassword()));
                statement.executeUpdate();
                System.out.println("PASS");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "CADASTRO INVALIDO");
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
            else if (bairro_valido == false) {
                JOptionPane.showMessageDialog(null, "BAIRRO INVÁLIDO");
            }
            else if (cidade_valido == false) {
                JOptionPane.showMessageDialog(null, "CIDADE INVÁLIDO");
            }
        }
    }//GEN-LAST:event_Cadastrar_FunionarioActionPerformed

    private void Voltar_cadastro_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Voltar_cadastro_funcionarioActionPerformed
         Tela_Inicial telInicial = new Tela_Inicial();
        telInicial.setVisible(true);
        this.dispose();


        // TODO add your handling code here:
    }//GEN-LAST:event_Voltar_cadastro_funcionarioActionPerformed

    private void jPanel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1AncestorAdded

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
            java.util.logging.Logger.getLogger(Frame_Cadastro_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Cadastro_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Cadastro_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Cadastro_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Cadastro_Funcionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bairro_funcionario;
    private javax.swing.JTextField CPF_funcionario;
    private javax.swing.JButton Cadastrar_Funionario;
    private javax.swing.JTextField Cidade_funcionario;
    private javax.swing.JTextField Email_funcionario;
    private javax.swing.JTextField Nome_funcionario_CadastroF;
    private javax.swing.JPasswordField Senha_funcionario;
    private javax.swing.JButton Voltar_cadastro_funcionario;
    private javax.swing.JLabel jLabel_bairroFuncio;
    private javax.swing.JLabel jLabel_cidadeFuncio;
    private javax.swing.JLabel jLabel_cpfFuncio;
    private javax.swing.JLabel jLabel_emailFuncio;
    private javax.swing.JLabel jLabel_iconeFuncio;
    private javax.swing.JLabel jLabel_nomeFuncio;
    private javax.swing.JLabel jLabel_senhaF;
    private javax.swing.JLabel jLabel_tituloFuncio;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
