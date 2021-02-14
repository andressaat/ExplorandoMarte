/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explorandomarte;

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
        // TODO code application logic here
        //System.out.print("ola");
        Pattern pattern = Pattern.compile("([0-9])(\\s)*?([0-9])(\\s)*?([neswNESW])");
        Matcher matcher = pattern.matcher("23s");
        
        while(matcher.find()){
            //System.out.println("grupo: " + matcher.find());
            
            System.out.println("grupo 0: " + matcher.group(0));
            System.out.println("grupo 1: " + matcher.group(1));
            System.out.println("grupo 2: " + matcher.group(2));
            System.out.println("grupo 3: " + matcher.group(3));
            System.out.println("grupo 4: " + matcher.group(4));
            System.out.println("grupo 5: " + matcher.group(5));

        }
    }
    
}
