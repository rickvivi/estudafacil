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

public class PerguntasDAO {

    /**
     * METODO PARA GRAVAR NOVAS PERGUNTAS NO BANCO DE DADOS.
     *
     * @param id_mat - recebe o id da materia que deseja gravar à pergunta.
     * @param periodo - recebe o id do periodo que deseja gravar à pergunta.
     * @param pergunta - recebe a pergunta para gravar no banco de dados.
     * @param resposta - recebe a resposta referente à pergunta para gravar no
     * banco de dados.
     */
    public void insert(Integer id_mat, Integer periodo, String pergunta, String resposta) {

        ConexaoHsqldbDAO con = new ConexaoHsqldbDAO();
        con.conectaBD();
        String sql = "insert into ask (id_materia, id_periodo, pergunta, resposta) values(" + id_mat + ", " + periodo + ", '" + pergunta + "', '" + resposta + "');";

        try (Statement stmt = con.getConnection().createStatement()) {

            stmt.executeUpdate(sql);
            stmt.execute("shutdown");

        } catch (SQLException ex) {
            System.out.println("Erro na Inserção de Dados: " + ex);
            Logger.getLogger(PerguntasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * MÉTODO PARA ALTERAR DADOS DE QUESTÕES JÁ EXISTENTES NO BANCO DE DADOS
     *
     * @param obj - recebe um objeto do tipo 'Perguntas' com todos os dados
     * necessários para alterar no banco de dados.
     */
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

    /**
     * MÉTODO PARA DELETAR A QUESTÃO DESEJADA
     *
     * @param pergunta - recebe um String como parâmetro com o nome da materia
     * que deseja excluir
     */
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

    /**
     * MÉTODO QUE RETORNA UMA PERGUNTA DESEJADA EM EXCLUSIVO
     *
     * @param pergunta - parametro String com a pergunta que deseja selecionar.
     * @return - retorna uma String. ESTE MÉTODO É UTILIZADO PARA VERIFICAR SE A
     * PERGUNTA EXISTE NO BD ANTES DE DELETAR.
     */
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
     * MÉTODO PARA PESQUISA. SELECIONA TODOS OS CAMPOS DE DADOS E SALVA EM UM
     * OBJETO 'PERGUNTA'.
     *
     * @return - retorna uma lista array de Perguntas
     */
    public ArrayList<Perguntas> carregaListaOrder() {

        ArrayList<Perguntas> lista = new ArrayList<>();
        ConexaoHsqldbDAO con = new ConexaoHsqldbDAO();
        con.conectaBD();
        String sql = "select * from ask order by id_materia asc";

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

    /**
     * MÉTODO QUE RETORNA TODAS AS QUESTÕES DE UMA MATÉRIA E UM PERÍDO DESEJADO
     *
     * @param materia - recebe a materia desejada.
     * @param periodo - recebe o período desejado.
     * @return - retorna uma lista array de Perguntas do conteúdo informado.
     */
    public ArrayList<Perguntas> carregaListaEstudoBimestre(Integer materia, Integer periodo) {

        ArrayList<Perguntas> lista = new ArrayList<>();
        ConexaoHsqldbDAO con = new ConexaoHsqldbDAO();
        con.conectaBD();
        String sql = "select * from ask where id_materia = " + materia + " and id_periodo = " + periodo + " ;";

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

    /**
     * MÉTODO QUE RETORNA TODAS QUESTÕES INCLUINDO AS QUESTÕES
     * DO PRIMEIRO E SEGUNDO BIMESTRE
     * @param materia - recebe como parametro a matéria desejada.
     * @return - retorna um array de Perguntas.
     */
    public ArrayList<Perguntas> carregaListaEstudoSemestre(Integer materia) {

        ArrayList<Perguntas> lista = new ArrayList<>();
        ConexaoHsqldbDAO con = new ConexaoHsqldbDAO();
        con.conectaBD();
        String sql = "select * from ask where id_materia = " + materia + " ;";

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
