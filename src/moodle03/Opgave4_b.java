/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moodle03;

import java.util.Scanner;

/**
 *
 * @author sigurjon
 */
public class Opgave4_b {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
       
       switch(number){
           case 1: System.out.println("Januar has 31 days"); break;
           case 2: System.out.println("February has 28 days"); break;
           case 3: System.out.println("Mars has 31 days"); break;
           case 4: System.out.println("April has 30 days"); break;
           case 5: System.out.println("May has 31 days"); break;
           case 6: System.out.println("June has 30 days"); break;
           case 7: System.out.println("July has 31 days"); break;
           case 8: System.out.println("August has 31 days"); break;
           case 9: System.out.println("September has 30 days"); break;
           case 10: System.out.println("October has 31 days"); break;
           case 11: System.out.println("November has 30 days"); break;
           case 12: System.out.println("Desember has 31 days "); break;
           default: System.out.println("Choose a number between 1 and 12");
           
       }
        
    }
    
}
