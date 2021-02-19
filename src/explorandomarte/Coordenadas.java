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
public class Coordenadas {
    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        
        if(x<0){
            x = 0;
        }
        
        this.x = x;
        
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        
        if(y<0){
            y = 0;
        }
        
        this.y = y;
    }
    
    public Coordenadas(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
