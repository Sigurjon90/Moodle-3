/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moodle03;

/**
 *
 * @author sigurjon
 */
public class OpgaveB_1 {
    
    public static void main(String[] args) {
        
         for(int i = 1; i < 6; i++){
            double area = Math.PI * Math.pow(i, 2);
            System.out.println("The area of circle is: " + area + 
                    " with a radius of " + i);
          }
        
    }
        
}
