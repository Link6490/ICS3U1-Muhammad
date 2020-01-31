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
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = new int [10];
        System.out.println("Unsorted Order: ");
        for (int i = 0; i < a.length; i++) {
             a[i] = (int)(Math.random()*1000)+1;
            System.out.print(a[i] + " ");
        }
        System.out.println("\n\n");
        int n = a.length;
        bubbleSort(a);
        System.out.println("Sorted order is: ");
        printBubbleSort(a);
        int yolo = binarySearch(a);
        System.out.println("Return value is: " + yolo);
    
    }

    public static void bubbleSort(int[] a) {
        int n = a.length; 
        int comp = 0;
        int swap = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                comp++;
                if (a[j] > a[j+1]) {
                    swap++;
                    int x = a[j]; 
                    a[j] = a[j+1]; 
                    a[j+1] = x; 
                } 
            }
        }
        System.out.println("Number of Comparisons: " + comp);
        System.out.println("Number of Swaps: " + swap);
    }
    public static void printBubbleSort(int[] a) {
        int n = a.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(a[i] + " "); 
        System.out.println(); 
    }
    public static int binarySearch(int [] a) {
         Scanner input = new Scanner(System.in);
        System.out.print("What number from the order do you want to find?: ");
        int num = input.nextInt();
        int L = 0;
        int R = a.length - 1;
        int M;
        while (L <= R) {
            M = (L + R)/2;
            if (a[M] == num){
                return M;
            }
            if (num < a[M]) {
                R = M - 1;
            } else {
                L = M + 1;
            }      
        }
        return -1;
    }
}

