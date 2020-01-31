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
public class AlienDetector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONSTANT
        //VARIABLES
        int antenna;
        int eyes;

        //OBJECTS
        Scanner input = new Scanner(System.in);
        //SPLASH MESSAGE
        System.out.println("Find out which alien has entered!");
        //INPUT
        System.out.println("Enter Number of: ");
        System.out.print("Antenna: ");
        antenna = input.nextInt();

        System.out.print("Eyes: ");
        eyes = input.nextInt();

        //PROCESSING
        if (antenna <= 6 && eyes >= 2 )
        {
            System.out.println("VladSaturnian");
        }
        if (eyes <= 3 && antenna <= 2)
        {
            System.out.println("GraemeMercurian");
        }
        if (eyes <= 4 && antenna >= 3)
        {
            System.out.println("TroyMartian");
        }

        //OUTPUT
    }

}
