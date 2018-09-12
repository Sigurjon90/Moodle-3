/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moodle03;
import java.util.Scanner;
import java.lang.Math;


/**
 *
 * @author sigurjon
 */
public class Moodle03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Moodle03 run = new Moodle03();
        
    //      run.Opgave2_7();
  
    //      run.iToC();
    //      run.Financial();
    //      run.Opgaveb_1();
    //      run.OpgaveB_4();
    //      run.isPrime();
       
       
        Scanner input = new Scanner(System.in);
//        
//        System.out.println("Enter three numbers: ");
//        double a = input.nextDouble();
//        double b = input.nextDouble();
//        double c = input.nextDouble();
//        double d = Math.pow(Math.pow(b, 2)-4 * a * c, 0.5);
//       
//        double batman = ((-b) + (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / 2 * a;
//        double batman2 = ((-b )- (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / 2 * a; 
//        
//        
//        
//
//        if(d > 0){
//            double batman = ((-b) + Math.pow(Math.pow(b, 2)-4 * a * c, 0.5))/(2 * a);
//            double batman2 = ((-b) - Math.pow(Math.pow(b, 2)-4 * a * c, 0.5))/(2 * a);
//            
//            System.out.println("The equation has two roots: " + batman + " and " + batman2);
//            
//        }else if(d == 0){
//            double batman = ((-b) + Math.pow(Math.pow(b, 2)-4 * a * c, 0.5))/(2 * a);
//            
//            System.out.println("The equation has one root: " + batman);
//            
//        }else{
//            System.out.println("No root");
//        }

     
//        int ages = 17;
//        int ticketPrice = 0;
////        System.out.println((ages >= 16) ? ticketPrice = 20 : ticketPrice = 10);
//
//        ticketPrice = (ages >= 16) ? 20 : 10;
//        
//        System.out.println(ticketPrice);
//        
//        int score = 20;
//        int finalScore;
//        int scale = 12;
//        if(score > 10){
//            finalScore = 3 * scale;
//            System.out.println(finalScore);
//        } else {
//            finalScore = 4 * scale;
//        }
//        
//        int x = 1 , z = 3;
//        
//        switch (z){
//            case 1: x += 5; break;
//            case 2: x += 10; break;
//            case 3: x += 16; break;
//            case 4: x += 34; break;
//        }
//        
//        System.out.println(x);
//        
//        
//        int day = 3;
//        
//        switch (day){
//            case 0: System.out.println("Sunday"); break;
//            case 1: System.out.println("Monday"); break;
//            case 2: System.out.println("Tuesday"); break;
//            case 3: System.out.println("Wednesday"); break;
//            case 4: System.out.println("Thursday"); break;
//            case 5: System.out.println("Friday"); break;
//            case 6: System.out.println("Saturday"); 
//        }
//        
//         
//        System.out.println("Enter a year: ");    
//        int year = input.nextInt();
        
        
        // betra væri að gera int remainder = year % 12 en að skrifa það í 
        // hvert skipti 
//        if(year % 12 == 0){
//            System.out.println("Monkey");
//        } else if (year % 12 == 1){
//            System.out.println("Rooster");
//        } else if (year % 12 == 2){
//            System.out.println("Dog");
//        } else if (year % 12 == 3){
//            System.out.println("Pig");
//        } else if (year % 12 == 4){
//            System.out.println("Rat");
//        } else if (year % 12 == 5) {
//            System.out.println("Ox");
//        } else if (year % 12 == 6){
//            System.out.println("Tiger");
//        } else if (year % 12 == 7){
//            System.out.println("Rabbit");
//        } else if (year % 12 == 8){
//            System.out.println("Dragon");
//        } else if (year % 12 == 9){
//            System.out.println("Snake");
//        } else if (year % 12 == 10) {
//            System.out.println("Horse");
//        }else {
//            System.out.println("Sheep");
//        }
            
    }  
   
    public void isPrime(){
        
        //Skriv et program, der udregner alle primtal under 1.000.000, 
        //og udskriver det største
        final int NUMBER_OF_PRIME = 50; 
        final int NUMBER_OF_PRIME_PER_LINE = 10;
        int count = 0;
        int number = 2;
        
        System.out.println("The first 50 prime number are \n");
        
        while(count < NUMBER_OF_PRIME){
            boolean isPrime = true; 
            for (int divisor = 2; divisor <= number / 2; divisor++){
                if (number % divisor == 0){
                    isPrime = false;
                    break;
                }
            }
            
            if(isPrime){
                count++;
                
                if(count % NUMBER_OF_PRIME_PER_LINE == 0){
                    System.out.println(number);
                }else {
                    System.out.print(number + " ");
                }
            }
            
            number++;
        }       
    }
}

   
