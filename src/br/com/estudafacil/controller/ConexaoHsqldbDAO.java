package br.com.estudafacil.controller;

import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConexaoHsqldbDAO {
    
    Connection con = null;
    String driver = "org.hsqldb.jdbc.JDBCDriver";
   
    String url = "jdbc:hsqldb:file:";
    String caminho = "src/banco/estudo/"; // src/banco/estudo     bd/estudo
    String user = "SA";
    String senha = "";
    
    /**
     * METODO PARA CONEXÃO COM O BANCO DE DADOS HSQLDB
     * @return retorna a conexão do BD
     */
    public Connection conectaBD(){
        
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url+caminho,user,senha);
            
            System.out.println("Conectado ao banco HSQLDB!");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexaoHsqldbDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoHsqldbDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     
        return con;
    }
    
    /**
     * CAPTURA SE A CONEXÃO
     * @return retorna a conexão
     */
    public Connection getConnection(){
        return con;
    }
    
}
