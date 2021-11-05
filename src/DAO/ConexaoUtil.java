/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author pedro
 */
public class ConexaoUtil {
    private String servidor_bd = "localhost";
    private String porta_bd = "3306";
    private String nome_bd ="tecno_pizza";
    private String usuario_bd ="root";
    private String senha_bd = "";
    
    private String URL = "jdbc:mysql://"+servidor_bd+":"+porta_bd+"/"+nome_bd+"?useTimezone=true&serverTimezone=GMT";

    public static ConexaoUtil getConnection(){
        
        ConexaoUtil conexao = null;
        
        if(conexao == null){
            conexao = new ConexaoUtil();
            return conexao;
        } else {
            return null;
        }
    }
    
    public void Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
           DriverManager.getConnection(URL, usuario_bd, senha_bd);
        } catch(Exception ex){
            System.err.println("ERRO AO CONECTAR COM O BD: \n" + ex);
        }
    }
    
}
