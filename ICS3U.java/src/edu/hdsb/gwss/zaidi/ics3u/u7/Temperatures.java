/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.zaidi.ics3u.u7;

import java.util.Scanner;

/**
 *
 * @author 1zaidisye
 */
public class Temperatures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] temp = new int[8];
       String[ ] DAYS =

    { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
       
       
        
        
        for (int i = 0; i < DAYS.length;i++) { 
            System.out.print(DAYS[i] + ": ");
            temp[i] = input.nextInt();
            
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        
        for (int i = 0; i < DAYS.length;i++) {
            System.out.print(DAYS[i] + ": " + temp[i] + " \n");
        }
        double sum = 0;
    for (int i=0; i < DAYS.length; i++) {
	sum += temp[i];
    }
    double average = sum/7;
        System.out.println("Average is: " + average);
    }  
}
