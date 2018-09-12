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
public class cTofFandIToC {
    
    
    public static void main(String[] args) {
        
        for (int i = 0; i <=100; i += 2){
           
        double celsius = i;
        double farenheit;
        farenheit = celsius * 9/5 + 32;
            
        System.out.println(celsius + "\t" + farenheit);
        
        }
    }
    
    public void iToC(){
        
        for(int i = 1; i < 11; i++){
            
            double intches = i;
            double centimeters = intches * 2.54;
            
            System.out.println("Intches: " + intches + " is " + centimeters + " centimeters");
            
        }
        
    }
    
}
