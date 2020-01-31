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
public class StartEnd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int startValue;
        int endValue;

        System.out.print("Enter the first number: ");
        startValue = input.nextInt();
        System.out.print("Enter the second number: ");
        endValue = input.nextInt();

        do {
            if (startValue < endValue) {
                System.out.println(startValue);
                startValue++;

            } else {
                System.out.println(startValue);
                startValue--;
            } 
            if (startValue == endValue) {
                System.out.println(startValue);
            }

        } while (startValue != endValue);

    }

}