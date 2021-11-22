package Controle;

import Modelo.Produto;
import Modelo.Pizza;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Pizza_BD {
    Connection connection = null;
    int quantidade_nova, quantidade_certa;
    
    public boolean inserirPizza(Pizza pizza) {
        System.out.println("inserirPizza");
        // inicia a conexao com o Banco de dados chamando a classe Conexao
        connection = Conexao.getInstance().getConnection();
        System.out.println("conectado e preparando para inserir");
        Statement stmt = null;
        try {
            stmt = connection.createStatement();     
            String sql = "INSERT into pizzas (nome, ingredientes, valor) VALUES ('"+pizza.getNome()+"','"+pizza.getIngredientes()+"','"+pizza.getValor()+"');";
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
    
    public ArrayList<Pizza> getListaPizza() {
        ArrayList<Pizza> listaPizza = new ArrayList<Pizza>();
      
        connection = Conexao.getInstance().getConnection();
        System.out.println("conectado e preparando listagem");
        Statement stmt = null;
        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM pizzas ORDER BY nome");
            // Incluindo produtos na listadeprodutos que vai ser retornada
            while (rs.next()) {
                Pizza p = new Pizza(rs.getString("nome"), rs.getString("ingredientes"), rs.getFloat("valor"));
                listaPizza.add(p);
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
        return listaPizza;
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
