/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.zaidi.ics3u.u2;

/**
 *
 * @author 1zaidisye
 */
public class MLBStandings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //First Attempt
        System.out.println("American League     W |   L |  Pct");
        System.out.println("----------------------------------");
        System.out.println("Boston Red Sox     103|  47 | .687"); 
        System.out.println("New York Yankees    91|  58 | .611");
        System.out.println("Tampa Bay Rays      83|  66 | .557\n");
        
        //Second Attempt
        System.out.println("MLB Standings\n");
        System.out.format("%-20s %3s %3s %5s\n", "Team Name", "W", "L", "PCT");
        System.out.format("%-20s %3s %3s %5.3f\n", "Boston Red Sox", "103", "47", 103.0/(103+47));
        System.out.format("%-20s %3s %3s %5.3f\n", "New York Rangers", "91", "58", 91.0/(91+58));
        System.out.format("%-20s %3s %3s %5.3f\n", "Tampa Bay Rays", "83", "66", 83.0/(83+66));

        
        
        
                
       
    }
    
}
