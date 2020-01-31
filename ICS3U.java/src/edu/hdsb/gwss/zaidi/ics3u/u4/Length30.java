/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.zaidi.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1zaidisye
 */
public class Length30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String firstWord;
        String secondWord;
        int max = 30;
        int one;
        int two;
        String dots;
        int totalWord;
        int numOfWord;
        
        System.out.print("Enter the first word: ");
        firstWord = input.nextLine();
        System.out.print("Enter the second word: ");
        secondWord = input.nextLine();
        
        one = firstWord.length();
        two = secondWord.length();
        
   
           totalWord = one + two;
            numOfWord = 30 - totalWord;
            
        while (totalWord > 30) {
            
            totalWord++;
        }
        
    }
    
}
