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
public class Opgave2_7 {
    
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
        
        System.out.print("Enter minutes to find out how many years and day that is: ");
        double minutes = input.nextDouble();
        double years = Math.floor(minutes / 60 / 24 / 365);
        double days = minutes % (60 * 24 * 365) / 60 / 24;
        System.out.printf("%1.0f minutes is %1.0f years and %1.0f days\n", minutes, years, days);
        
    }
    
}
