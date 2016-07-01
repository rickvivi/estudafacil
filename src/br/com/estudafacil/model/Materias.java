/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estudafacil.model;

/**
 *
 * @author Rick-Note
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
