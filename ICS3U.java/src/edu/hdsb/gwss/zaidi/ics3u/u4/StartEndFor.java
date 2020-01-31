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
public class StartEndFor {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int startValue;
        int endValue;
        System.out.print("Enter a starting value: ");
        startValue = input.nextInt();
        System.out.print("Enter an ending value: ");
        endValue = input.nextInt();
        
        if (startValue > endValue) {
            for ( ; startValue != endValue ; startValue-- ); {
               System.out.println(startValue);
        }
    }
        else if (startValue < endValue) {
            for ( ; startValue != endValue + 1; startValue++) {
                System.out.println(startValue);
            } 
        }
        else {
            System.out.println(startValue);
        }
    }
    
}
