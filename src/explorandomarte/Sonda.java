/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explorandomarte;

/**
 *
 * @author andre
 */
public class Sonda {
    Coordenadas coordenadas;
    char direcao;

    public Sonda(Coordenadas coordenadas, char direcao) {
        this.coordenadas = coordenadas;  
        this.direcao = direcao;
    }

    void comando(char comando) {
        if("LRlr".indexOf(comando)>=0){
            // separar as direçoes 
            
            this.direcao = Character.toUpperCase(comando);
        }
        
        if("Mm".indexOf(comando)>=0){
            this.mover();
        
        }

    }

    private void mover() {
        
        if(this.direcao == ''){
        
        }
    }
}
