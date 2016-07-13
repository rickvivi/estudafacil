package br.com.estudafacil.controller;

import br.com.estudafacil.model.Perguntas;
import br.com.estudafacil.model.Ranking;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RankingDAO {
    
    /**
     * MÉTODO PARA GRAVAR UMA NOVA PERFORMANCE NO RANKING
     * @param mat - recebe a materia estudada como parâmetro.
     * @param per - recebe o periodo estudado como parâmetro.
     * @param pctg - recebe a porcentagem de acertos como parâmetro.
     */    
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
    
    /**
     * MÉTODO PARA GERAR OS 8 MELHORES RESULTADOS DO RANKING
     * GRAVADOS NO BANCO DE DADOS.
     * @return - retorna os oito melhores resultados obtidos.
     */
    public ArrayList<Ranking> geraRanking(){
        ConexaoHsqldbDAO con = new ConexaoHsqldbDAO();
        con.conectaBD();
                
        ArrayList<Ranking> lista = new ArrayList<>();        
        String sql = "select TOP 8 * from ranking order by porcentagem desc";

        try (PreparedStatement stmt = con.getConnection().prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Ranking rk = new Ranking(rs.getInt("id"), rs.getInt("id_mat"), rs.getInt("id_per"), rs.getInt("porcentagem"));
                lista.add(rk);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao puxar os dados do Ranking no Banco de Dados.");
            Logger.getLogger(PerguntasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
        
    }
    
    /**
     * MÉTODO PARA CAPTURAR A STRING DA MATÉRIA ATRAVÉS DO SEU ID
     * @param id_materia - recebe o numero id da matéria como parâmetro.
     * @return - retorna um String com o nome da Matéria.
     */
    public String capturaID(int id_materia) {
        ConexaoHsqldbDAO con = new ConexaoHsqldbDAO();
        con.conectaBD();
        String retorno = null;

        String sql = "select materia from materia where id  = " + id_materia; 

        try (PreparedStatement stmt = con.getConnection().prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                retorno = rs.getString("materia");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na busca de dados!" + ex);
            Logger
                    .getLogger(PerguntasDAO.class
                            .getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
    
    /**
     * DELETA TODOS OS REGISTROS DE RANKING DO BANCO DE DADOS.
     */
    public void deletaRanking(){
        ConexaoHsqldbDAO con = new ConexaoHsqldbDAO();
        con.conectaBD();
        
        String sql = "delete from ranking";
        
        try (Statement stmt = con.getConnection().createStatement()){
            
            stmt.executeUpdate(sql);
            stmt.execute("shutdown");
            
            System.out.println("Deletado com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar a lista de Ranking.");
            Logger.getLogger(RankingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
