/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author Rick-Note
 */
public class MateriasDAO {

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

//    public ArrayList<String> verificaMaterias() {
//        ConexaoHsqldbDAO con = new ConexaoHsqldbDAO();
//        con.conectaBD();
//        String retorno;
//        ArrayList<String> lista = new ArrayList<>();
//
//        String sql = "select materia from materia";
//
//        try (PreparedStatement stmt = con.getConnection().prepareStatement(sql)) {
//            ResultSet rs = stmt.executeQuery();
//
//            while (rs.next()) {
//                retorno = rs.getString("materia");
//                lista.add(retorno);
//            }
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro na busca de dados!" + ex);
//            Logger
//                    .getLogger(PerguntasDAO.class
//                            .getName()).log(Level.SEVERE, null, ex);
//        }
//        return lista;
//    }

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
