/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.zaidi.ics3u.u7;

import java.util.Scanner;

/**
 *
 * @author 1zaidisye
 */
public class SequentialSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = new int[10];
        System.out.println("Unsorted Order: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 1000) + 1;
            System.out.print(a[i] + " ");
        }
        System.out.println("\n\n\n\n\n");
        search(a);

    }

    public static int search(int[] a) {
        Scanner input = new Scanner(System.in);
        System.out.print("What number from the order do you want to find?: ");
        int num = input.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == num) {
                System.out.println(i);
            } 
            
        }
        
        return -1;
    }
}
