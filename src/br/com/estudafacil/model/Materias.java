package br.com.estudafacil.model;

/**
 * CLASSE PARA MANIPULAÇÃO DO OBJETO MATÉRIA
 * @author Ricardo Vanni
 */
public class Materias {
    
    private String materia;
    private Integer id;
    
    public Materias (){
        
    }
    
    public Materias (String materia, Integer id){
        this.materia = materia;
        this.id = id;
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

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    
    
}
