/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explorandomarte;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author andre
 */ 
public class LeitorDeSuperficie {
    
    List <Sonda> sondas = new ArrayList<>();

    public List<Sonda> getSondas() {
        return sondas;
    }
    Planalto planalto;
    

    public LeitorDeSuperficie(int x, int y) {
        Coordenadas limite = new Coordenadas(x, y);
        this.planalto = new Planalto(limite);
    }

    public void setPlanalto(Planalto planalto) {
        this.planalto = planalto;
    }
    
    public void addSonda(Sonda sonda){
        this.sondas.add(sonda);
    }
    
    public Sonda getSonda(){
        // pega a ultima sonda da lista de sondas
        return this.sondas.get(this.sondas.size() -1);
    }
    
    public void scan(String comando){
        
        //("([0-9])(\\s)*?([0-9])(\\s)*?([neswNESW])") - REGEX capitura padroes em uma String
        //([0-9]) - capitura numeros de 0 a 9
        //(\\s)*? - capitura espaços que possa ter ou nao
        //([neswNESW]) - capitura uma das letras listadas no []
        Pattern sondaPattern = Pattern.compile("([0-9])(\\s)*?([0-9])(\\s)*?([neswNESW])");
        Matcher sondaMatcher = sondaPattern.matcher(comando);
                
        int dX;
        int dY;
        char direcao;
        
        while(sondaMatcher.find()){
            dX = Integer.parseInt(sondaMatcher.group(1));
            dY = Integer.parseInt(sondaMatcher.group(3));
            direcao =  sondaMatcher.group(5).charAt(0);
            
            Coordenadas coordenadas = new Coordenadas(dX, dY);
            Sonda sonda = new Sonda(coordenadas, this.planalto.getLimite(), direcao);
            this.addSonda(sonda);

        }
        
        Pattern movimentoPattern = Pattern.compile("([lrmLRM])");
        Matcher movimentoMatcher = movimentoPattern.matcher(comando);
        
       
        
        if(movimentoMatcher.find()){
            Sonda sonda = this.getSonda();
            
            System.out.println("comando: "+ comando);
            
             
            for(int pos = 0; pos < comando.length(); ++pos){
                char c = comando.charAt(pos);
                sonda.comando(c);
                
                
            }
        }
        
        
        
    }
}
