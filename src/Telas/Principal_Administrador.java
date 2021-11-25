/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 *
 * @author pedro
 */

public class Principal_Administrador extends javax.swing.JFrame {
  
    Gerenciar_Funcionarios Tela_GerenciarFuncionarios = new Gerenciar_Funcionarios();
    Cadastrar_Produtos Tela_CadastrarProdutos = new Cadastrar_Produtos();
    Consultar_Produtos Tela_ConsultarProdutos = new Consultar_Produtos();
    Cadastrar_Pizza Tela_Add_Pizzas = new Cadastrar_Pizza();
    Efetuar_Venda Tela_Vendas = new Efetuar_Venda();
    
    public Principal_Administrador() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_CadastrarUsuario = new javax.swing.JButton();
        btn_CadastrarProduto = new javax.swing.JButton();
        btn_AdicionarPizza = new javax.swing.JButton();
        btn_EfetuarVenda = new javax.swing.JButton();
        btn_ConsultarProduto2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setText("TECNO-PIZZA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(610, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btn_CadastrarUsuario.setBackground(new java.awt.Color(0, 153, 0));
        btn_CadastrarUsuario.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btn_CadastrarUsuario.setText("GERENCIAR USUÁRIOS");
        btn_CadastrarUsuario.setBorderPainted(false);
        btn_CadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastrarUsuarioActionPerformed(evt);
            }
        });

        btn_CadastrarProduto.setBackground(new java.awt.Color(0, 153, 0));
        btn_CadastrarProduto.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btn_CadastrarProduto.setText("CADASTRAR PRODUTOS");
        btn_CadastrarProduto.setBorderPainted(false);
        btn_CadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastrarProdutoActionPerformed(evt);
            }
        });

        btn_AdicionarPizza.setBackground(new java.awt.Color(0, 153, 0));
        btn_AdicionarPizza.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btn_AdicionarPizza.setText("ADICIONAR PIZZA");
        btn_AdicionarPizza.setBorderPainted(false);
        btn_AdicionarPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdicionarPizzaActionPerformed(evt);
            }
        });

        btn_EfetuarVenda.setBackground(new java.awt.Color(0, 153, 0));
        btn_EfetuarVenda.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btn_EfetuarVenda.setText("EFETUAR VENDA");
        btn_EfetuarVenda.setBorderPainted(false);
        btn_EfetuarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EfetuarVendaActionPerformed(evt);
            }
        });

        btn_ConsultarProduto2.setBackground(new java.awt.Color(0, 153, 0));
        btn_ConsultarProduto2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btn_ConsultarProduto2.setText("CONSULTAR PRODUTOS");
        btn_ConsultarProduto2.setBorderPainted(false);
        btn_ConsultarProduto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarProduto2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_ConsultarProduto2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_EfetuarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_AdicionarPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_CadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_CadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(244, 244, 244))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(btn_CadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_CadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_ConsultarProduto2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_AdicionarPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_EfetuarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(816, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastrarUsuarioActionPerformed
        Tela_GerenciarFuncionarios.setVisible(true); //Torna a tela Principal visÃƒÂ­vel
        this.dispose();// faz com que a tela de login desapareÃƒÂ§a apÃƒÂ³s abrir tela principal 
           
    }//GEN-LAST:event_btn_CadastrarUsuarioActionPerformed

    private void btn_CadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastrarProdutoActionPerformed
        Tela_CadastrarProdutos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_CadastrarProdutoActionPerformed

    private void btn_AdicionarPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdicionarPizzaActionPerformed
        Tela_Add_Pizzas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_AdicionarPizzaActionPerformed

    private void btn_EfetuarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EfetuarVendaActionPerformed
        Tela_Vendas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_EfetuarVendaActionPerformed

    private void btn_ConsultarProduto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultarProduto2ActionPerformed
        Tela_ConsultarProdutos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ConsultarProduto2ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AdicionarPizza;
    private javax.swing.JButton btn_CadastrarProduto;
    private javax.swing.JButton btn_CadastrarUsuario;
    private javax.swing.JButton btn_ConsultarProduto2;
    private javax.swing.JButton btn_EfetuarVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
