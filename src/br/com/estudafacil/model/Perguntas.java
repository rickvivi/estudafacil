package br.com.estudafacil.model;

/**
 * CLASSE PARA MANIPULAÇÃO DO OBJETO PERGUNTAS
 * @author Ricardo Vanni
 */
public class Perguntas {
    
    private String materia, pergunta, resposta;
    private Integer id, periodo, id_materia;
    
    public Perguntas(){
        
    }
    
    public Perguntas(String pergunta, String resposta){
        this.pergunta = pergunta;
        this.resposta = resposta;
        
    }
    
    public Perguntas(Integer id, Integer id_materia, Integer periodo, String pergunta, String resposta){
        this.pergunta = pergunta;
        this.resposta = resposta;
        this.id = id;      
        this.periodo = periodo;
        this.id_materia = id_materia;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }    

    public String getMateria() {
        return materia;
    }

    public Integer getPeriodo() {
        return periodo;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public Integer getId_materia() {
        return id_materia;
    }

    public void setId_materia(Integer id_materia) {
        this.id_materia = id_materia;
    }

    

    
    
}
