/*
 * Name: Muhammad Zaidi
 * Date: October 18, 2018
 * Version: v0.01
 * Description: 
 * Compound Investing
 */
package edu.hdsb.gwss.zaidi.ics3u.u4;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author 1zaidisye
 */
public class CompoundInvesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumberFormat money = NumberFormat.getCurrencyInstance();
        Scanner input = new Scanner(System.in);
        System.out.println("Compound Investing\n"
                + "This program will print out a title table that will display the amount \n"
                + "of a yearly investment over a period of up to 15 years.");

        double yearlyInvestment;
        double numOfYears;
        double interest;
        boolean makesSense = true;
        double balance = 0;
        double interestRate;
        //double interest;

        do { //Checking for invalid input
            System.out.print("Enter the Money in account: "); //Asking for input of Balance

            yearlyInvestment = input.nextDouble();
            if (yearlyInvestment >= 1.00) {
                makesSense = true;
            }
            if (yearlyInvestment < 1.00) {
                makesSense = false;
            }
        } while (!makesSense);
        do {
            System.out.print("Enter the interest rate(%): "); //Asking for interest rate
            interestRate = input.nextDouble();
            if (interestRate > 0.01 && interestRate < 20) {
                makesSense = true;
            }
            if (interestRate < 0.01 || interestRate > 20) {
                makesSense = false;
            }
        } while (!makesSense);
        do {
            System.out.print("Enter the number of years: "); //Asking for years
            numOfYears = input.nextDouble();
            if (numOfYears > 1.00 && numOfYears < 15) {
                makesSense = true;
            }
            if (numOfYears < 1.00 || numOfYears > 15) {
                makesSense = false;
            }
        } while (!makesSense);
        if (makesSense) {
            System.out.format("%-8s %-12s %-10s %-12s\n", "Year", "Balance", "Interest", "Total");
            for (double years = 1, total = 0; years < numOfYears + 1; years++) { //will only do this for however much numofyears is
                balance = yearlyInvestment + balance;
                interest = balance * (interestRate / 100);
                total = balance + interest;
                System.out.format("%-5.0f %10s %10s %10s\n", years, money.format(balance), money.format(interest), money.format(total));
                balance = balance + interest;
            }
        } else {
            System.out.println("INVALID DATA"); //Invalid data
        }

    }

}
