/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.zaidi.ics3u.u6;

import java.util.Scanner;

/**
 *
 * @author 1zaidisye
 */
public class GrossWages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONSTANT
        //VARIABLE
        double hours;
        double wages;
        
        //OBJECT
         Scanner input = new Scanner(System.in);
        //SPLASH MESSAGE
        //INPUT
        System.out.print("How many hours did you work this week?: ");
        hours = input.nextInt();
        System.out.print("What is your hourly pay?: ");
        wages = input.nextInt();
        //PROCESSING
        
        //OUTPUT
        System.out.print("Gross Wage: $" );
        wages(hours, wages);       
         
     

    }
     public static void wages(double hours, double wages) {
         double yourPay;
         if (hours < 40) {
             yourPay = hours * wages;
         } 
         else {
             yourPay = (wages * 40) + ((hours - 40) * wages * 1.5);
             
         }
         System.out.println( yourPay );
         
     }
}
