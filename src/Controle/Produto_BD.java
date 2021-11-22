package Controle;

import Modelo.Produto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Produto_BD {
    Connection connection = null;
    int quantidade_nova, quantidade_certa;
    
    public boolean inserirProduto(Produto produto) {
        System.out.println("inserirProduto");
        // inicia a conexao com o Banco de dados chamando a classe Conexao
        connection = Conexao.getInstance().getConnection();
        System.out.println("conectado e preparando para inserir");
        Statement stmt = null;
        try {
            stmt = connection.createStatement();     
            String sql = "INSERT into produtos (nome, marca, fornecedor, validade, codbarras, quantidade) VALUES ('"+produto.getNome_produto()+"','"+produto.getMarca()+"','"+produto.getFornecedor()+"','"+produto.getValidade()+"','"+produto.getCodbarras()+"','"+produto.getQuantidade()+"');";
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
    
    public ArrayList<Produto> getListaProduto() {
        ArrayList<Produto> listaProduto = new ArrayList<Produto>();
      
        connection = Conexao.getInstance().getConnection();
        System.out.println("conectado e preparando listagem");
        Statement stmt = null;
        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM produtos ORDER BY nome");
            // Incluindo produtos na listadeprodutos que vai ser retornada
            while (rs.next()) {
                Produto prod = new Produto(rs.getString("nome"), rs.getString("marca"), rs.getString("fornecedor"), rs.getString("validade"), rs.getString("codbarras"), rs.getInt("quantidade"));
                listaProduto.add(prod);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
          
            try {
                stmt.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
        return listaProduto;
    } // final do metodo
    
    public ArrayList<Produto> ListaProdutoNome(String busca) {
        ArrayList<Produto> listaProduto = new ArrayList<Produto>();
      
        connection = Conexao.getInstance().getConnection();
        System.out.println("conectado e preparando listagem");
        Statement stmt = null;
        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM produtos WHERE nome LIKE '%"+busca+"%'");
            // Incluindo produtos na listadeprodutos que vai ser retornada
                        
            while (rs.next()) {
                Produto prod = new Produto(rs.getString("nome"), rs.getString("marca"), rs.getString("fornecedor"), rs.getString("validade"), rs.getString("codbarras"), rs.getInt("quantidade"));
                listaProduto.add(prod);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
          
            try {
                stmt.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
        return listaProduto;
    } // final do metodo
    
}
