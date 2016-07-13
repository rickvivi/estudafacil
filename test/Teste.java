
import br.com.estudafacil.controller.RankingDAO;
import br.com.estudafacil.model.Ranking;

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
    
    public static void main(String[] args){
        
        Teste teste  = new Teste();
        teste.cadastra();
        
    }
    
    public void cadastra(){
        rk.setIdMateria(0);
        rk.setIdPeriodo(1);
        rk.setPorcentagem(75);
        
        rkDAO.gravaRanking(rk.getIdMateria(), rk.getIdPeriodo(), rk.getPorcentagem());       
        
    }
    
}
