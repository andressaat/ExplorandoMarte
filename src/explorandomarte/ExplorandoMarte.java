/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explorandomarte;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author andre
 */
public class ExplorandoMarte {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LeitorDeSuperficie leitorDeSuperficie = new LeitorDeSuperficie(0, 0);
        Scanner ss = new Scanner(System.in);
        System.out.print("Enter the your Name : ");
             
        //String comando = ss.nextLine(); 
        
        
                
        int dX;
        int dY;
        
        while(ss.hasNext()) {
            
            String comando = ss.nextLine();
           
            if(comando.equals("exit")) {
                
                break;
            }
            
            Pattern posicaoPattern = Pattern.compile("(^[0-9]{2})$");
            Matcher posicaoMatcher = posicaoPattern.matcher(comando);
            
            while(posicaoMatcher.find()){
                String coordenadas = posicaoMatcher.group(1);
                dX = Character.getNumericValue(coordenadas.charAt(0));
                dY = Character.getNumericValue(coordenadas.charAt(1));
            
            
                System.out.println("dx: "+ dX);
                System.out.println("dy: "+ dY);
                
            
                Coordenadas limite = new Coordenadas(dX, dY);
       
            
                leitorDeSuperficie.setPlanalto(new Planalto(limite));
               // ss.next();
               // return;

            }
        
                leitorDeSuperficie.scan(comando);
        
                //ss.next();
        }
        
                List <Sonda> sondas = leitorDeSuperficie.getSondas();
                
                for (int i = 0; i < sondas.size(); i++) {
                    Sonda sonda = sondas.get(i);
                    System.out.println(""+sonda.coordenadas.getX()+""+sonda.coordenadas.getY()+""+sonda.direcao+"");
                }
    //operate
    }
   
}
