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
public class WordSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONSTANTS
        //VARIABLES
        String word;
        String start;
        String end;
        //OBJECTS
        Scanner input = new Scanner(System.in);
        //SPLASH MESSAGE
        System.out.println("This program prints a square out of the letters of a word entered by the user.");
        //INPUT
        System.out.print("Enter a word: ");
        word = input.nextLine();
        //PROCESSING
        for (int i = 0; i < word.length(); i++) {
            end = word.substring(0, i);
            start = word.substring(i);
            System.out.println(start + end);
        }

        //OUTPUT
    }
}