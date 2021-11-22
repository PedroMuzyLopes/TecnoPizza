package Controle;

import Modelo.Venda;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Venda_BD {
    Connection connection = null;
    
    public boolean inserirVenda(Venda venda) {
        System.out.println("inserirVenda");
        // inicia a conexao com o Banco de dados chamando
        // a classe Conexao
        connection = Conexao.getInstance().getConnection();
        System.out.println("conectado e preparando para inserir");
        Statement stmt = null;
        try {
            stmt = connection.createStatement();     
            String sql = "INSERT into vendas (nome,valor,quantidade,data) VALUES ('"+venda.getNome_produto()+"','"+venda.getValor()+"','"+venda.getQuantidade()+"','"+venda.getData()+"');";
            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);
            // Incluindo produtos no banco de dados
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            // este bloco finally sempre executa na instrução try para
            // fechar a conexão a cada conexão aberta
            try {
                stmt.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    }
    
    
}
