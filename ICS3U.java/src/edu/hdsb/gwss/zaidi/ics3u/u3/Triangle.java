/*
 * Name: Muhammad Zaidi
 * Date: October 5, 2018
 * Version: v0.01
 * Description: 
 * Calculates weather the shape is a triangle
 */
package edu.hdsb.gwss.zaidi.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1zaidisye
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONSTANT

        //VARIABLE
        double sideA;
        double sideB;
        double sideC;
        boolean isTriangle;
        boolean isRight;
        //OBJECT
        Scanner input = new Scanner(System.in);
        //SPLASH MESSAGE
        System.out.println("This program has the user enter three lengths of sides and determines whether the figure is a triangle or not.  If a triangle can be formed, it will determine if it is a right-triangle.");
        //INPUT
        System.out.println("Please Enter Measurements for: ");
        System.out.print("Side A: ");
        sideA = input.nextDouble();
        System.out.print("Side B: ");
        sideB = input.nextDouble();
        System.out.print("Side C: ");
        sideC = input.nextDouble();
        //PROCESSING
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            isTriangle = true;
        } else {
            isTriangle = false;
        }
        if (Math.pow(sideA, 2) == (Math.pow(sideB, 2) + Math.pow(sideC, 2)) || Math.pow(sideB, 2) == (Math.pow(sideA, 2) + Math.pow(sideC, 2)) || Math.pow(sideC, 2) == (Math.pow(sideB, 2) + Math.pow(sideA, 2))) {
            isRight = true;
        } else {
            isRight = false;
        }
        //OUTPUT
        if (isTriangle) { //if triangle, then it will determine if its a right triangle
            System.out.println("These Sides make a Triangle!");
            if (isRight) {
                System.out.println("It is also a Right Triangle");
            }
        } else {
            System.out.println("These Sides do not make a Triangle");
        }

    }
}
