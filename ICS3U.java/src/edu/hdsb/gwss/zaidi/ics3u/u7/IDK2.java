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
public class IDK2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] yolo = new int [10][10];
        
        for (int i = 0;i < yolo.length;i++) {
            for (int j = 0; j < yolo[i].length;j++) {
                yolo[i][j] = (int) (Math.random() * 10) + 1;
            System.out.print(yolo[i][j] + " ");
            }
           System.out.println(" ");
        }
        
        int max = yolo[0][0];
        for (int i= 0; i < yolo.length; i++) {
            for (int j = 0; j < yolo[i].length; j++) {
                if (yolo[i][j] > max) {
                    max = yolo[i][j];
                }
                
            }
            
        }
        System.out.println("Max is: " + max);
         int min = yolo[0][0];
        for (int i= 0; i < yolo.length; i++) {
            for (int j = 0; j < yolo[i].length; j++) {
                if (yolo[i][j] < min) {
                    min = yolo[i][j];
                }
                
            }
            
        }
        System.out.println("Min is: " + min);
        
//        int a = 0, b = 5;
//        
//        while ( a< 4 == b > 3) {
//            System.out.println(a + " " + b + " ");
//            a++; b--;
//        }
        System.out.println(6.0/10);
        int outside = 0;
        while (outside < 8) {
            for (int x = 0; x < 2; x++) {
                outside = outside + x;
            }
            
        }
            System.out.println(outside);
        }
        
    }
    

