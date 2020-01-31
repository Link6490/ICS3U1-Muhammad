/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.zaidi.ics3u.u7;

/**
 *
 * @author 1zaidisye
 */
public class SelectionSort {

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

        selectionSort(a);
        printSort(a);

    }

    public static void selectionSort(int a[]) {
        int n = a.length;
        int x = 0;
        int swaps = 0;
        int comp = 0;
        for (int i = 0; i < n - 1; i++) {
            int max = i;
            
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[max]) {
                    max = j;
                    swaps++;
                }
                comp++;
            }
            x = a[max];
            a[max] = a[i];
            a[i] = x;
        }
        System.out.println("Number of Comparisons: " + comp);
        System.out.println("Number of Swaps: " + swaps);
    }
    public static void printSort(int a[]) {
        System.out.println("Sorted: ");
        int n = a.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
