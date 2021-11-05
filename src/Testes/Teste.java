/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import DAO.ConexaoUtil;
import Controle.Conexao;


/**
 *
 * @author pedro
 */
public class Teste {
    
    
    
    public static void main(String args[]) {
        
        Connection connection = null;
        
        connection = Conexao.getInstance().getConnection();
        
        System.out.println("conectado e preparando listagem");
        Statement stmt = null;
    }
}
