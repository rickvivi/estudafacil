package br.com.estudafacil.controller;

import br.com.estudafacil.model.Materias;
import br.com.estudafacil.model.Perguntas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MateriasDAO {

    /**
     * METODO PARA SALVAR NOVAS MATÉRIAS NO BANCO DE DADOS
     * @param txt - String com o nome da matéria a ser gravada.
     */
    public void salvaMateria(String txt) {
        ConexaoHsqldbDAO con = new ConexaoHsqldbDAO();
        con.conectaBD();

        String sql = "Insert into materia (materia) values('" + txt + "')";
        try (Statement stmt = con.getConnection().createStatement()) {

            stmt.executeUpdate(sql);
            stmt.execute("shutdown");

            JOptionPane.showMessageDialog(null, "Matéria Cadastrada com Sucesso.");

        } catch (SQLException ex) {
            System.out.println("Erro na Inserção de Dados: " + ex);
            Logger.getLogger(PerguntasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * METODO PARA LISTAR TODAS AS MATÉRIAS DO BANCO DE DADOS
     * @return retorna um array de Materias
     */
    public ArrayList<Materias> carregaMaterias() {

        ArrayList<Materias> lista = new ArrayList<>();
        ConexaoHsqldbDAO con = new ConexaoHsqldbDAO();
        con.conectaBD();
        String sql = "select * from materia order by materia asc";

        try (PreparedStatement stmt = con.getConnection().prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Materias objMaterias = new Materias(rs.getString("materia"), rs.getInt("id"));
                lista.add(objMaterias);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar a Lista de Matérias no Banco de Dados! " + ex);
            Logger
                    .getLogger(PerguntasDAO.class
                            .getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    /**
     * MÉTODO PARA CAPTURAR O ID DA MATÉRIA
     * @param materia - recebe uma string como parametro com nome da matéria.
     * @return - retorna um inteiro com o numero da materia desejada.
     */
    public Integer capturaID(String materia) {
        ConexaoHsqldbDAO con = new ConexaoHsqldbDAO();
        con.conectaBD();
        Integer retorno = null;

        String sql = "select id from materia where materia  = '" + materia + "'";

        try (PreparedStatement stmt = con.getConnection().prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                retorno = rs.getInt("id");
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
     * METODO PARA DELETAR A MATÉRIA DO BANCO DE DADOS
     * @param materia - recebe uma string com nome da matéria como parâmetro
     * em seguida deleta a matéria.
     */
    public void deletaMateria(String materia) {

        ConexaoHsqldbDAO con = new ConexaoHsqldbDAO();
        con.conectaBD();
        
        /**
         * PARA DELETAR A MATÉRIA É PRECISO PRIMEIRO DELETAR AS PERGUNTAS
         * RELACIONADAS À ELA NA TABELA ASK. PRIMEIRO CAPTURAMOS A ID DA
         * MATÉRIA, E DEPOIS DELETAMOS TODAS AS PERGUNTAS DA MATERIA
         * SELECIONADA. E AÍ ENTÃO, DELETAMOS A MATÉRIA.
         */
        MateriasDAO matDAO = new MateriasDAO();
        Integer id = matDAO.capturaID(materia); // CAPTURA O ID DA MATERIA SELECIONADA

        
        String sqlRemovePerguntas = "delete from ask where id_materia = "+id; // DELETA TODAS PERGUNTAS DA MATERIA
        String sql = "delete from materia where materia = '" + materia + "'"; // DELETA A MATERIA
        

        try (Statement stmt = con.getConnection().createStatement()) {
            stmt.executeUpdate(sqlRemovePerguntas);
            stmt.executeUpdate(sql);
            stmt.execute("shutdown");
            JOptionPane.showMessageDialog(null, "Matéria Deletada com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Exclusão de dados." + ex);
            Logger.getLogger(PerguntasDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
