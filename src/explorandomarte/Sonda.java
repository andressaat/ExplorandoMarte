/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explorandomarte;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author andre
 */
public class Sonda {
    Coordenadas coordenadas;
    Coordenadas limite;
    char direcao;
    Map<Integer, Character> mapDirecoes = new HashMap<Integer, Character>();

    public Sonda(Coordenadas coordenadas, Coordenadas limite, char direcao) {
        this.coordenadas = coordenadas;  
        this.limite = limite;  
        this.direcao = Character.toUpperCase(direcao);
        
        this.mapDirecoes.put(1, 'N');
        this.mapDirecoes.put(2, 'E');
        this.mapDirecoes.put(3, 'S');
        this.mapDirecoes.put(4, 'W');
        
    }

    void comando(char comando) {
        if("LRlr".indexOf(comando)>=0){
            
            // separar as direçoes 
            // se o comando for R e a direção for igual a N, direção vai pra E
            // se o comando for R e a direção for igual a E, direção vai pra S
            // se o comando for R e a direção for igual a S, direção vai pra W
            // se o comando for R e a direção for igual a W, direção vai pra N
            
            // se o comando for L e a direção for igual a N, direção vai pra W
            // se o comando for L e a direção for igual a W, direção vai pra S
            // se o comando for L e a direção for igual a S, direção vai pra E
            // se o comando for L e a direção for igual a E, direção vai pra N
            
            //System.out.println("G:comando "+ comando);
            
            if("Ll".indexOf(comando) >= 0){
            
                for (Entry<Integer, Character> entry : mapDirecoes.entrySet()) {
                    
                    
                    if (entry.getValue().equals(this.direcao)) {
                        
                        Integer key = entry.getKey();
                        key -= 1;
  
                        if(key < 1){
                           key = 4;
                        }
                        
                        this.direcao = this.mapDirecoes.get(key);
                        break;
                    }
                }
            }
            
            if("Rr".indexOf(comando) >= 0){
            
                for (Entry<Integer, Character> entry : mapDirecoes.entrySet()) {
                    if (entry.getValue().equals(this.direcao)) {
                        
                        Integer key = entry.getKey();
                        key += 1;
  
                        if(key > 4){
                           key = 1;
                        }
                        
                        this.direcao = this.mapDirecoes.get(key);
                        break;
                        
                    }
                }
            }
            
           
        }
        
        if("Mm".indexOf(comando)>=0){
            this.mover();
        
        }

    }

    private void mover() {
        
            // direção N (x, y +1)
            // direção S (x, y -1)
            // direção E (x +1, y)
            // direção W (x -1, y)
            
        if(this.direcao == 'N'){
            
            int y = this.coordenadas.getY()+1;
            
            if(!(y > this.limite.getY())){
                 this.coordenadas.setY(y);
            }
        }
        if(this.direcao == 'S'){
            this.coordenadas.setY(this.coordenadas.getY()-1);          
        }
        if(this.direcao == 'E'){
            
            int x = this.coordenadas.getX()+1;
            
            if(!(x > this.limite.getX())){
                 this.coordenadas.setX(x);
            }
        }
        if(this.direcao == 'W'){
            this.coordenadas.setX(this.coordenadas.getX()-1);
        }
    }
}
