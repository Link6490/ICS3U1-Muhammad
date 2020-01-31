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
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONSTANTS
        //VARIABLES
        String word;
        boolean valid;
        String wordBack = "";
        //OBJECT
        Scanner input = new Scanner(System.in);
        //SPLASH MESSAGE
        System.out.println("Palindrome\n"
                + " \n"
                + "Words that are the same forwards and backwards are called palindromes.  This program determine if a word is a palindrome.");
        //INPUT
        System.out.print("Enter your word: ");
        word = input.nextLine();
        int length = word.length();
        word = word.toLowerCase();
       
        //PROCESSING
        for (int i = length - 1; i >= 0; i--) {
            wordBack = wordBack + word.charAt(i);
            
        }
        System.out.println("Your origanal word is: " + word);
        System.out.println("Your word spelt backwards is: " + wordBack);
        if (word.equals(wordBack)) {
            valid = true;
        } else valid = false;
        if (valid) {
            System.out.println(wordBack + " is a palindrome of " + word);
        } else System.out.println(wordBack + " is not a palindrome of " + word);
    }

}
