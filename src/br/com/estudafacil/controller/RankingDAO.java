package br.com.estudafacil.controller;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RankingDAO {
    
        
    public void gravaRanking(int mat, int per, int pctg){
        ConexaoHsqldbDAO con = new ConexaoHsqldbDAO();
        con.conectaBD();
        
        String sql = "insert into ranking(id_mat, id_per, porcentagem) values(" + mat + ", " + per + ", " + pctg + ")";
        
        try (Statement stmt = con.getConnection().createStatement()){
            
            stmt.executeUpdate(sql);
            stmt.execute("shutdown");
            
            System.out.println("Cadastrado com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar desempenho na lista de Ranking.");
            Logger.getLogger(RankingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
