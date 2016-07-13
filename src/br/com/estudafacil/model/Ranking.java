package br.com.estudafacil.model;

/**
 * CLASSE PARA MANIPULAÇÃO DO OBJETO RANKING
 * @author Ricardo Vanni
 */
public class Ranking {

    private int id;
    private int idMateria;
    private int idPeriodo;
    private int porcentagem;
    
    public Ranking(){        
    }
    
    public Ranking(int id_cod, int id_mat, int id_per, int porc){
        this.id = id_cod;
        this.idMateria = id_mat;
        this.idPeriodo = id_per;
        this.porcentagem = porc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public int getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(int porcentagem) {
        this.porcentagem = porcentagem;
    }   
    
}
