/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.zaidi.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author smaza
 */
public class CountingVowels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONSTANTS
        //VARIABLES
        String sentence;
        int vowels = 0;
        //OBJECT
        Scanner input = new Scanner(System.in);
        //SPLASH MESSAGE
        System.out.println("Count Vowels\n"
                + "\n"
                + "The Program counts the number of vowels in a sentence.");
        //INPUT
        System.out.print("Enter a sentence: ");
        sentence = input.nextLine();

        //PROCESSING
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u') {
                vowels++;
            }
        }
        System.out.println("Number of vowels: " + vowels);
        //OUTPUT
    }

}
