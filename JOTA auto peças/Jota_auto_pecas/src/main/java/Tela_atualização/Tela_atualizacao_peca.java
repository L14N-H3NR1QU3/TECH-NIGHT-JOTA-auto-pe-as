package Tela_atualização;


import Tela_Inicial.Tela_Inicial;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author k.andrade
 */
public class Tela_atualizacao_peca extends javax.swing.JFrame {

    /**
     * Creates new form Tela_atualizacao_peca
     */
    public Tela_atualizacao_peca() {
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
        jlbl_atualizao_dados = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlbl_qtd_pecas = new javax.swing.JLabel();
        jlbl_nome_peca = new javax.swing.JLabel();
        Sai_Att_pecas = new javax.swing.JButton();
        jbutton_salvar = new javax.swing.JButton();
        Novo_preço = new javax.swing.JTextField();
        jfield_ID_pecas = new javax.swing.JTextField();
        jfield_QTD_peca = new javax.swing.JTextField();
        jlbl_nome_peca1 = new javax.swing.JLabel();
        jfield_nome_peca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(46, 46, 46));
        jPanel1.setPreferredSize(new java.awt.Dimension(1036, 612));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbl_atualizao_dados.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlbl_atualizao_dados.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_atualizao_dados.setText("Atualização de dados de peça");
        jPanel1.add(jlbl_atualizao_dados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID peça");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jlbl_qtd_pecas.setBackground(new java.awt.Color(255, 255, 255));
        jlbl_qtd_pecas.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_qtd_pecas.setText("Nova quantidade");
        jPanel1.add(jlbl_qtd_pecas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jlbl_nome_peca.setBackground(new java.awt.Color(255, 255, 255));
        jlbl_nome_peca.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_nome_peca.setText("Novo preço");
        jPanel1.add(jlbl_nome_peca, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        Sai_Att_pecas.setText("Sair");
        Sai_Att_pecas.setBorder(null);
        Sai_Att_pecas.setPreferredSize(new java.awt.Dimension(80, 30));
        Sai_Att_pecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sai_Att_pecasActionPerformed(evt);
            }
        });
        jPanel1.add(Sai_Att_pecas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 80, 30));

        jbutton_salvar.setText("Salvar");
        jbutton_salvar.setBorder(null);
        jbutton_salvar.setPreferredSize(new java.awt.Dimension(80, 30));
        jbutton_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_salvarActionPerformed(evt);
            }
        });
        jPanel1.add(jbutton_salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 570, 80, 30));
        jPanel1.add(Novo_preço, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 295, -1));
        jPanel1.add(jfield_ID_pecas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 295, -1));
        jPanel1.add(jfield_QTD_peca, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 295, -1));

        jlbl_nome_peca1.setBackground(new java.awt.Color(255, 255, 255));
        jlbl_nome_peca1.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_nome_peca1.setText("Nome");
        jPanel1.add(jlbl_nome_peca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));
        jPanel1.add(jfield_nome_peca, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 295, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 612));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbutton_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_salvarActionPerformed
        // TODO add your handling code here:
        try {
            Connection conexao = null;
            PreparedStatement statement = null;
            
            String url = "jdbc:mysql://localhost:3306/JOTAautopeca";
            String usuario = "root";
            String senha = "";
            
            conexao = DriverManager.getConnection(url, usuario, senha);
            
            String sql = "UPDATE pecas SET qtd_pecas = ?, nome_pecas = ?, preco_peca = ? WHERE id_pecas = ?";
            
            statement = conexao.prepareStatement(sql);
            statement.setString(1, jfield_QTD_peca.getText());
            statement.setString(2, jfield_nome_peca.getText());
            statement.setString(3, jfield_ID_pecas.getText());
            statement.setString(4, Novo_preço.getText());

            
            statement.executeUpdate();
            
            System.out.println("Quantidade de pecas e nome atualizados com sucesso.");
        } catch (SQLException e) {
            System.out.println("Deu esse erro aqui ô: " + e.getMessage());
        }
        
        jfield_ID_pecas.setText(null);
        jfield_QTD_peca.setText(null);
        Novo_preço.setText(null);
    }//GEN-LAST:event_jbutton_salvarActionPerformed

    private void Sai_Att_pecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sai_Att_pecasActionPerformed
        Tela_Inicial telInicial = new Tela_Inicial();
        telInicial.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_Sai_Att_pecasActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_atualizacao_peca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_atualizacao_peca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_atualizacao_peca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_atualizacao_peca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_atualizacao_peca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Novo_preço;
    private javax.swing.JButton Sai_Att_pecas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbutton_salvar;
    private javax.swing.JTextField jfield_ID_pecas;
    private javax.swing.JTextField jfield_QTD_peca;
    private javax.swing.JTextField jfield_nome_peca;
    private javax.swing.JLabel jlbl_atualizao_dados;
    private javax.swing.JLabel jlbl_nome_peca;
    private javax.swing.JLabel jlbl_nome_peca1;
    private javax.swing.JLabel jlbl_qtd_pecas;
    // End of variables declaration//GEN-END:variables
}
