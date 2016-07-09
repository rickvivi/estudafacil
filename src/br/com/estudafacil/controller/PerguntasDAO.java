/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estudafacil.controller;

import br.com.estudafacil.model.Perguntas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Classe DAO
 *
 * @author Rick-Note
 */
public class PerguntasDAO {

    public void insert(Integer id, Integer periodo, String pergunta, String resposta) {

        ConexaoHsqldbDAO con = new ConexaoHsqldbDAO();
        con.conectaBD();
        String sql = "insert into ask (id_materia, id_periodo, pergunta, resposta) values(" + id + ", " + periodo + ", '" + pergunta + "', '" + resposta + "');";

        try (Statement stmt = con.getConnection().createStatement()) {

            stmt.executeUpdate(sql);
            stmt.execute("shutdown");

        } catch (SQLException ex) {
            System.out.println("Erro na Inserção de Dados: " + ex);
            Logger.getLogger(PerguntasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Perguntas obj) {
        ConexaoHsqldbDAO con = new ConexaoHsqldbDAO();
        con.conectaBD();
        String sql = "update ask set pergunta = '" + obj.getPergunta() + "' , resposta = '" + obj.getResposta() + "', "
                + "id_materia = " + obj.getId_materia() + ", id_periodo = " + obj.getPeriodo() + " where id = " + obj.getId() + ";";

        try (Statement stmt = con.getConnection().createStatement()) {
            stmt.executeUpdate(sql);
            stmt.execute("shutdown");
            JOptionPane.showMessageDialog(null, "Questão Alterada com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Alteração de dados" + ex);
            Logger.getLogger(PerguntasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(String pergunta) {

        ConexaoHsqldbDAO con = new ConexaoHsqldbDAO();
        con.conectaBD();

        String sql = "delete from ask where pergunta = '" + pergunta + "'";

        try (Statement stmt = con.getConnection().createStatement()) {

            stmt.executeUpdate(sql);
            stmt.execute("shutdown");
            JOptionPane.showMessageDialog(null, "Pergunta Deletada com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Exclusão de dados. Esta Questão pode não estar cadastrada no Banco de Dados." + ex);
            Logger.getLogger(PerguntasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String select(String pergunta) {

        ConexaoHsqldbDAO con = new ConexaoHsqldbDAO();
        con.conectaBD();
        String retorno = "";

        String sql = "select pergunta from ask where pergunta  = '" + pergunta + "'";

        try (PreparedStatement stmt = con.getConnection().prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                retorno = rs.getString("pergunta");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na busca de dados!" + ex);
            Logger.getLogger(PerguntasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }

    /**
     * Carrega todas as palavras e respostas no Banco de Dados
     *
     * @return Retorna os dados obtidos em uma lista.
     */
//    public ArrayList<Perguntas> carregaLista() {
//
//        ArrayList<Perguntas> lista = new ArrayList<>();
//        ConexaoHsqldbDAO con = new ConexaoHsqldbDAO();
//        con.conectaBD();
//        String sql = "select * from ask";
//
//        try (PreparedStatement stmt = con.getConnection().prepareStatement(sql)) {
//            ResultSet rs = stmt.executeQuery();
//
//            while (rs.next()) {
//                Perguntas obj = new Perguntas(rs.getString("pergunta"), rs.getString("resposta"));
//                lista.add(obj);
//            }
//            Collections.shuffle(lista);
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro ao Carregar Lista de Perguntas. " + ex);
//            Logger.getLogger(PerguntasDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return lista;
//    }

    public ArrayList<Perguntas> carregaListaOrder() {

        ArrayList<Perguntas> lista = new ArrayList<>();
        ConexaoHsqldbDAO con = new ConexaoHsqldbDAO();
        con.conectaBD();
        String sql = "select * from ask order by id";

        try (PreparedStatement stmt = con.getConnection().prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Perguntas obj = new Perguntas(rs.getInt("id"), rs.getInt("id_materia"), rs.getInt("id_periodo"), rs.getString("pergunta"), rs.getString("resposta"));
                lista.add(obj);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PerguntasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public ArrayList<Perguntas> carregaListaEstudoBimestre(Integer materia, Integer periodo) {

        ArrayList<Perguntas> lista = new ArrayList<>();
        ConexaoHsqldbDAO con = new ConexaoHsqldbDAO();
        con.conectaBD();
        String sql = "select * from ask where id_materia = "+ materia +" and id_periodo = " + periodo + " ;";

        try (PreparedStatement stmt = con.getConnection().prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Perguntas obj = new Perguntas(rs.getInt("id"), rs.getInt("id_materia"), rs.getInt("id_periodo"), rs.getString("pergunta"), rs.getString("resposta"));
                lista.add(obj);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PerguntasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    
    public ArrayList<Perguntas> carregaListaEstudoSemestre(Integer materia) {

        ArrayList<Perguntas> lista = new ArrayList<>();
        ConexaoHsqldbDAO con = new ConexaoHsqldbDAO();
        con.conectaBD();
        String sql = "select * from ask where id_materia = "+ materia +" ;";

        try (PreparedStatement stmt = con.getConnection().prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Perguntas obj = new Perguntas(rs.getInt("id"), rs.getInt("id_materia"), rs.getInt("id_periodo"), rs.getString("pergunta"), rs.getString("resposta"));
                lista.add(obj);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PerguntasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    

}
