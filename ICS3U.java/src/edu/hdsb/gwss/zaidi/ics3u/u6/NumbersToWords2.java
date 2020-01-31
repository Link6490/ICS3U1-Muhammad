////
// * Name: Muhammad Zaidi
// * Date: November 27, 2018
// * Version: v0.01
// * Description: Enter a number, and this program will turn it into a word!
////
package edu.hdsb.gwss.zaidi.ics3u.u6;

import java.util.Scanner;

/**
 *
 * @author 1zaidisye
 */
public class NumbersToWords2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONSTANTS
        //VARIABLES
        int num;
        int hundred;
        int tens;
        int ones;
        boolean valid = true;

        //OBJECT
        Scanner input = new Scanner(System.in);
        //SPLASH MESSAGE
        //INPUT
        System.out.print("Enter a number between 1-999: ");
        num = input.nextInt();
        //PROCESSING
        //OUTPUT
        hundred = num / 100; // Logic; If number is more than 100, it will use (num / 10) % 10 to find the tens place number.

        if (num <= 0 || num >= 1000) { //Checking for invalid data
            System.out.println("Invalid Range");
            valid = false;
        }
        if (valid) {
            if (num < 100) {
                tens = (num / 10) % 10;
            } else {
                tens = (num / 10) % 10;
            }
            ones = num % 10;

            if (num > 100) {  //If number is more than 100, then it will print the hundreds number, then if the tens is above 2 it will print normally, but if it is ones, it will call the teens method.
                hundreds(num);
                if (tens > 2 || tens == 0) {
                    tens(num);
                    ones(num);
                } else {
                    teens(num);
                }
            }

            if (num < 100) { //Same as before, but without the hundreds. If tens is 1, then it will call the teens method.
                if (tens == 1) {
                    teens(num);
                } else {
                    tens(num);
                    ones(num);
                }
            }
        }

    }

    public static void hundreds(int num) { //Swtich case for hundreds 
        String word;
        switch ((num / 100) % 10) {
            case 1:
                word = "One Hundred";
                break;
            case 2:
                word = "Two Hundred";
                break;
            case 3:
                word = "Three Hundred";
                break;
            case 4:
                word = "Four Hundred";
                break;
            case 5:
                word = "Five Hundred";
                break;
            case 6:
                word = "Six Hundred";
                break;
            case 7:
                word = "Seven Hundred";
                break;
            case 8:
                word = "Eight Hundred";
                break;
            case 9:
                word = "Nine Hundred";
                break;
            default:
                word = " ";

        }
        System.out.print(word);
    }

    public static void tens(int num) { //Swtich case for tens
        String word1 = "";
        switch ((num / 10) % 10) {
            case 2:
                word1 = "Twenty";
                break;
            case 3:
                word1 = "Thirty";
                break;
            case 4:
                word1 = "Forty";
                break;
            case 5:
                word1 = "Fifty";
                break;
            case 6:
                word1 = "Sixty";
                break;
            case 7:
                word1 = "Seventy";
                break;
            case 8:
                word1 = "Eighty";
                break;
            case 9:
                word1 = "Ninety";
                break;

        }
        System.out.print(" " + word1);
    }

    public static void ones(int num) { //Swtich case for ones
        String word2 = "";
        switch (num % 10) {
            case 1:
                word2 = "One";
                break;
            case 2:
                word2 = "Two";
                break;
            case 3:
                word2 = "Three";
                break;
            case 4:
                word2 = "Four";
                break;
            case 5:
                word2 = "Five";
                break;
            case 6:
                word2 = "Six";
                break;
            case 7:
                word2 = "Seven";
                break;
            case 8:
                word2 = "Eight";
                break;
            case 9:
                word2 = "Nine";
                break;

        }
        System.out.print(" " + word2 + " ");
    }

    public static void teens(int num) { //Swtich case for teens
        String wordTeen = "";
        switch (num % 10) {
            case 0:
                wordTeen = "Ten";
                break;
            case 1:
                wordTeen = "Eleven";
                break;
            case 2:
                wordTeen = "Twelve";
                break;
            case 3:
                wordTeen = "Thirteen";
                break;
            case 4:
                wordTeen = "Fourteen";
                break;
            case 5:
                wordTeen = "Fifteen";
                break;
            case 6:
                wordTeen = "Sixteen";
                break;
            case 7:
                wordTeen = "Seventeen";
                break;
            case 8:
                wordTeen = "Eighteen";
                break;
            case 9:
                wordTeen = "Nineteen";
                break;

        }
        System.out.print(" " + wordTeen + " ");
    }

}
