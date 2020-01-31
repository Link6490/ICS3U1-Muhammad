/*
 * Name: Muhammad Zaidi
 * Date: October 20, 2018
 * Version: v0.01
 * Description: 
 * Indicates the food supply, and animal population
 */
package edu.hdsb.gwss.zaidi.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author smaza
 */
public class LabAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONSTANTS

        //VARIABLES
        int startAnimal;
        int startFood;
        int foodAdded;
        int endAnimal;
        int endFood;
        boolean valid = true;
        int hour = 1;
        //OBJECT
        Scanner input = new Scanner(System.in);
        //SPLASH MESSAGE
        System.out.println("Lab Animals\n"
                + " \n"
                + "At present there are X animals in the lab and enough food for Y animals.  At the end of every hour \n"
                + "the population doubles, and enough food is added to support Z more animals. During any hour the \n"
                + "animals will eat enough food for only themselves. The program will determine when the population \n"
                + "will outgrow the food supply.");
        //INPUT
        do { //Checking for invalid input
            System.out.print("Enter the Initial Population(X) : ");
            startAnimal = input.nextInt();
            if (startAnimal >= 1) {
                valid = true;
            }
            if (startAnimal < 1) {
                valid = false;
            }
        } while (!valid);
        do {
            System.out.print("Enter the Initial Food Supply(Y): ");
            startFood = input.nextInt();
            if (startFood >= 1) {
                valid = true;
            }
            if (startFood < 1) {
                valid = false;
            }
        } while (!valid);

        do {
            System.out.print("Enter the Amount of Food Added  : ");
            foodAdded = input.nextInt();
            if (foodAdded >= 1) {
                valid = true;
            }
            if (foodAdded < 1) {
                valid = false;
            }
        } while (!valid);

        //PROCESSING
        System.out.format("%-5s %10s %10s %10s %10s\n", "Hour | ", "Animals at Start | ", "Food at Start | ", "Food at End | ", "Animals at End |");
        if (valid) { //Will only do it, if it makes sense and valid
            do {
                hour++; //Perform this code when starting food is more than animasl at the end
                endAnimal = startAnimal * 2;
                endFood = startFood + foodAdded - startAnimal;
                System.out.format("%-12s %-16s %-18s %-16s %-15s\n", hour, startAnimal, startFood, endFood, endAnimal);
                startAnimal = endAnimal;
                startFood = endFood;
            } while (startFood > endAnimal);

        } else {
            System.out.println("INVALID DATA");
        }
        //OUTPUT

    }

}
