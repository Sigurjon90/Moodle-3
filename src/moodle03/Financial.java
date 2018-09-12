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
public class Financial {
    
    public static void main(String[] args) {
        
        double tuition = 10000; // year 0 
        int year = 0;
        // finding how much the tuition will be after 10 years
        while (year < 10){
            tuition = tuition * 1.06;
            year++;
        }
        // printing the results out
        System.out.printf("Tuition will be $%.2f in %1d years\n", tuition, year);
        
        // finding the next four years and adding them together
        int count = 0;
        double finalTuition = 0;
        for(int i = 0; i < 4; i++){
            tuition = tuition * 1.06; 
            finalTuition += tuition; // Adding tuition in finalTuition to get the sum. 
            count ++;
            
            if(count == 4){
                System.out.printf("The Tuition will be total $%.2f from year 11 to 14\n", finalTuition);
                //System.out.println("");
                     
            }
            
            //18982.9888
            //20121.968128
            //212329.2862157
            //22609.0433886
        }
    }
    
}
