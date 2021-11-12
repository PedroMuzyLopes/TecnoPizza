package Controle;

import Modelo.Usuario;
import Telas.Gerenciar_Funcionarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Usuario_BD {
    Connection connection = null;
    String email_BD, email_digitado;
    
    //CADASTRAR USUARIO
    public boolean cadastrarFuncionario(Usuario Funcionario){
        System.out.println("cadastrarFuncionario");
        // inicia a conexao com o Banco de dados chamando a classe CONEXAO
        connection = Conexao.getInstance().getConnection();
        System.out.println("conectado e preparando para cadastrar funcionário");
        Statement stmt = null;
        try {
            stmt = connection.createStatement();     
            String sql = "INSERT into usuarios (nome,email,senha,telefone,cargo) VALUES ('"+Funcionario.getNome()+"','"+Funcionario.getEmail()+"','"+Funcionario.getSenha()+"','"+Funcionario.getTelefone()+"','"+Funcionario.getCargo()+"');";
            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);
            // Incluindo funcionarios na tabela funcionarios que vai ser retornada
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
    
    //LISTAR FUNCIONARIOS
    public ArrayList<Usuario> getListaFuncionarios() {
        ArrayList<Usuario> listaFuncionarios = new ArrayList<Usuario>();
      
        connection = Conexao.getInstance().getConnection();
        System.out.println("conectado e preparando listagem");
        Statement stmt = null;
        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios ORDER BY nome");
            
            while (rs.next()) {
                Usuario funci = new Usuario(rs.getString("nome"), rs.getString("email"),rs.getString("telefone"),rs.getString("cargo"));
                listaFuncionarios.add(funci);
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
        return listaFuncionarios;
    }
    
    // ALTERAR FUNCIONARIOS
    public boolean atualizarFuncionario(Usuario func) {
        System.out.println("atualizarFuncionario");
        // inicia a conexao com o Banco de dados chamando a classe Conexao
        connection = Conexao.getInstance().getConnection();
        System.out.println("conectado e preparando para atualizar");
        Statement stmt = null;
        try {
            stmt = connection.createStatement();
            
            String sql = "UPDATE usuarios SET nome = '" + func.getNome() + "', email = '" + func.getEmail() + "', senha = '" + func.getSenha() + "', telefone = '" + func.getTelefone()  + "' WHERE email = '" + func.getEmail() + "';";
            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);
            // atualizar funcionario na lista que vai ser retornada
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
    
    // REMOVER FUNCIONARIOS
    public boolean excluirFuncionario(Usuario func) {
        System.out.println("excluirFuncionario");
        // inicia a conexao com o Banco de dados chamando a classe Conexao
        connection = Conexao.getInstance().getConnection();
        System.out.println("conectado. Preparando para excluir");
        Statement stmt = null;
        try {
            stmt = connection.createStatement();
            
            //System.out.( func.getCpf() );  
            String sql = "DELETE FROM usuarios WHERE email = '" + func.getEmail() + "';";
            System.out.println("SQL: " + sql); 
            stmt.executeUpdate(sql);
            // Excluindo funcionario no banco de dados atraves do campo CPF
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
