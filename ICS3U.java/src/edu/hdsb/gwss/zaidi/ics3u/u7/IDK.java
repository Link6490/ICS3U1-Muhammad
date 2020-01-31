/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.zaidi.ics3u.u7;

/**
 *
 * @author smaza
 */
public class IDK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] yolo = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;

        for (int i = 0; i < yolo.length; i++) {
            sum = sum + yolo[i];
        }
        int max = yolo[0];
        System.out.println("Sum is : " + sum);
        for (int j = 0; j < yolo.length; j++) {

            if (yolo[j] > max) {
                max = yolo[j];
            }

        }
        System.out.println("Max is: " + max);
        int min = yolo[0];
        for (int q = 0; q < yolo.length; q++) {
            if (yolo[q] < min) {
                min = yolo[q];
            }

        }
        System.out.println("Min is: " + min);
        int avg;
        avg = sum / yolo.length;
        System.out.println("Average is: " + avg);

        int total = doubleSum(yolo);
        System.out.println("New Sum is: " + total);
    }

    public static int doubleSum(int[] yolo) {
        int total = 0;
        for (int i = 0; i < yolo.length; i++) {
            yolo[i] = yolo[i] * 2;
            total = total + yolo[i];
        }

        return total;
    }

}
