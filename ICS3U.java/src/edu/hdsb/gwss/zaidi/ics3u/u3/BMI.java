/*
 * Name: Muhammad Zaidi
 * Date: October 5, 2018
 * Version: v0.01
 * Description: 
 * Calculates what your Body Mass Index is
 */
package edu.hdsb.gwss.zaidi.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1zaidisye
 */
public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONSTANTS
        final double MIN_STARVATION = 0;
        final double MAX_STARVATION = 15.9;
        final double MIN_UNDERWEIGHT = 16;
        final double MAX_UNDERWEIGHT = 18.4;
        final double MIN_IDEAL = 18.5;
        final double MAX_IDEAL = 25;
        final double MIN_OW = 25.1;
        final double MAX_OW = 30;
        final double MIN_OB = 30.1;
        final double MAX_OB = 40;
        final double MIN_MOB = 40.1;
        //VARIABLES
        double weightKg;
        double weightLbs;
        double heightM;
        double heightIn;
        double yourBmiMetric;
        double yourBmiImperial;
        int measurement;
        //OBJECT
        Scanner input = new Scanner(System.in);
        //SPLASH MESSAGE
        System.out.println("Body mass index (BMI) is a measure of the weight of a person scaled according to their height. This program will calculate your BMI");
        //INPUT
        System.out.print("Type 1 for metric and 2 for imperial: "); //Asking User to choose either metric or imperial
        measurement = input.nextInt();
        if (measurement == 1) { //if measurement is 1, it will ask for metric
            System.out.print("Enter your weight in Kilograms: ");
            weightKg = input.nextDouble();
            System.out.print("Enter your height in Meters: ");
            heightM = input.nextDouble();
            yourBmiMetric = weightKg / (heightM * heightM); //Formula for BMI in metric
            System.out.printf("Your BMI is %.1f\n", yourBmiMetric);
            if (yourBmiMetric <= MAX_STARVATION && yourBmiMetric >= MIN_STARVATION) {
                System.out.println("You Have a BMI of under 16 so you are starving!");
            } else if (yourBmiMetric >= MIN_UNDERWEIGHT && yourBmiMetric <= MAX_UNDERWEIGHT) {
                System.out.println("You have a BMI between 16 and 18.5 which means you are underweight!");
            } else if (yourBmiMetric >= MIN_IDEAL && yourBmiMetric <= MAX_IDEAL) {
                System.out.println("You have a BMI between 18.5 and 25. So you are in the ideal range. ");
            } else if (yourBmiMetric >= MIN_OW && yourBmiMetric <= MAX_OW) {
                System.out.println("You have a BMI between 25 ane 30. You are overweight!");
            } else if (yourBmiMetric >= MIN_OB && yourBmiMetric <= MAX_OB) {
                System.out.println("You have a BMI between 30 and 40. You are Obese!");
            } else if (yourBmiMetric >= MIN_MOB) {
                System.out.println("You have a BMI greater than 40. You are Morbidly Obese");
            }
        } else if (measurement == 2) { //if measurement is 2, it will ask for imperial
            System.out.print("Enter your weight in Pounds: ");
            weightLbs = input.nextDouble();
            System.out.print("Enter your height in Inches: ");
            heightIn = input.nextDouble();
            yourBmiImperial = (weightLbs * 703) / (heightIn * heightIn); //Formula for BMI in imperial
            System.out.printf("Your BMI is %.1f\n", yourBmiImperial);
            if (yourBmiImperial <= MAX_STARVATION && yourBmiImperial >= MIN_STARVATION) {
                System.out.println("You Have a BMI of under 16 so you are starving!");
            } else if (yourBmiImperial >= MIN_UNDERWEIGHT && yourBmiImperial <= MAX_UNDERWEIGHT) {
                System.out.println("You have a BMI between 16 and 18.5 which means you are underweight!");
            } else if (yourBmiImperial >= MIN_IDEAL && yourBmiImperial <= MAX_IDEAL) {
                System.out.println("You have a BMI between 18.5 and 25. So you are in the ideal range. ");
            } else if (yourBmiImperial >= MIN_OW && yourBmiImperial <= MAX_OW) {
                System.out.println("You have a BMI between 25 ane 30. You are overweight!");
            } else if (yourBmiImperial >= MIN_OB && yourBmiImperial <= MAX_OB) {
                System.out.println("You have a BMI between 30 and 40. You are Obese!");
            } else if (yourBmiImperial >= MIN_MOB) {
                System.out.println("You have a BMI greater than 40. You are Morbidly Obese");
            }
        }
        if (measurement < 1 || measurement > 2) { //If you don't enter 1 or 2, it will ask you to choose a correct number
            System.out.println("Please choose from the correct numbers");

        }

    }

}
