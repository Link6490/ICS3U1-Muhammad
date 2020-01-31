/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.zaidi.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1zaidisye
 */
public class Y2KDetector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONSTANTS
        //VARIABLES
        int birthYear;
        int currentYear;
        int age;
        int fourBirth = 1900;
        int fourCurrent = 2000;
        //OBJECTS
        Scanner input = new Scanner( System.in);
        //SPLASH MESSAGE
        System.out.println("Calculate your age!");
        //INPUT
        System.out.println("Enter Your: ");
        System.out.print("Year of birth(2 digit): ");
        birthYear = input.nextInt();
        System.out.print("Current Year(2 digit): ");
        currentYear = input.nextInt();
        //PROCESSING
        if (currentYear < birthYear) {
        age = (currentYear + 2000) - (birthYear + 1900);
        } else {
            age = currentYear - birthYear;
                
                }
            
         
                
        
              
          
        //OUTPUT
        System.out.println("Your age is: " + age);
    }
    
    
}
