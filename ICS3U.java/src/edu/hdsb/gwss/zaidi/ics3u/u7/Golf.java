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
public class Golf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] golfHoles = new int[18]; 
        
        
        for (int i = 0; i < golfHoles.length;i++) {
            int holes = i+1;
            System.out.print("Hole"+ holes + ": ");
            golfHoles[i] = input.nextInt();
            
            System.out.println(golfHoles[i]);
        }
        
        int sum = 0;
        for (int i = 0; i < golfHoles.length;i++) {
            sum = sum + golfHoles[i];
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Sum is: " + sum);
         
        int max = golfHoles[0];
    for ( int i=1; i < golfHoles.length; i++ ) {
	if ( golfHoles[i] > max) {
 	    max = golfHoles[i];
 	}
     }
        System.out.println("Max Number is: " + max);
        
    }
    
}
