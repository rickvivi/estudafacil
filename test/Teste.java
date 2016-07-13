
import br.com.estudafacil.controller.RankingDAO;
import br.com.estudafacil.model.Ranking;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rick-Note
 */
public class Teste {
    
    Ranking rk = new Ranking();
    RankingDAO rkDAO = new RankingDAO();
    ArrayList<Ranking> lista = new ArrayList<>();
    
    public static void main(String[] args){
        
        Teste teste  = new Teste();
        teste.deleteRk();
        
    }
    
    public void cadastra(){
        rk.setIdMateria(0);
        rk.setIdPeriodo(1);
        rk.setPorcentagem(75);
        
        rkDAO.gravaRanking(rk.getIdMateria(), rk.getIdPeriodo(), rk.getPorcentagem());              
    }
    
    public void geraRk(){
        lista = rkDAO.geraRanking();
        for (Ranking i : lista){
            System.out.println(i.getPorcentagem()+"%");
        }
    }
    
    public void buscaIDMateria(){
        System.out.println("Materia selecionada: " + rkDAO.capturaID(2));
    }
    
    public void carregaRanking(){
        lista = rkDAO.geraRanking();
        for(Ranking i : lista){
            System.out.println("Materia: " + i.getIdMateria() + " Periodo: " + i.getIdPeriodo() + "Nota: " + i.getPorcentagem());
        }
    }
    
    public void deleteRk(){
        rkDAO.deletaRanking();
    }
    
}
