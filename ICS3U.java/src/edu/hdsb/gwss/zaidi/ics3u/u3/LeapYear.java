/*
 * Name: Muhammad Zaidi
 * Date: October 4, 2018
 * Version: v0.01
 * Description: 
 * This is a calculator which displays if it is a leap year or not
 */
package edu.hdsb.gwss.zaidi.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1zaidisye
 */
public class LeapYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONSTANT
        final int FOUR_HUNDRED = 400;
        final int ONE_HUNDRED = 100;
        final int FIRST_LEAP_YEAR = 1752;
        int FOUR = 4;
        //VARIABLE
        int year;
        boolean isLeapYear;

        //OBJECT
        Scanner input = new Scanner(System.in);
        //SPLASH MESSAGE
        System.out.println("This calculator will tell if whether it is a leap year or not!");
        //INPUT
        System.out.print("Enter the year: ");
        year = input.nextInt();

        if (year < FIRST_LEAP_YEAR) {
            System.out.println("INVALID");
        } else {
            //PROCESSING
            if ((year % FOUR == 0) && (year % ONE_HUNDRED != 0)) { //If divisible by 4 and 400 then its a leap year unless its also divisible by 100
                isLeapYear = true;
            } else if (year % FOUR_HUNDRED == 0) {
                isLeapYear = true;
            } else if (year % ONE_HUNDRED == 0) {
                isLeapYear = false;
            } else {
                isLeapYear = false;
            }

            if (isLeapYear) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }

        }

    }
}
