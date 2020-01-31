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
public class MaxMinArrayValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] data = {
            {2, 3, 9, 5},
            {7, -3, 5},
            {-1, 5, 12, 13, 14},
            {1, 0, 0, 15}
        };
        int max;
        int min;
        
        max = max(data);
        min = min(data);
        
        System.out.println("MIN: " + min);
        System.out.println("MAX: " + max);
        
    }
    public static int max(int[][] data) {
        int max = data[0][0];
        for (int row = 0; row< data.length;row++) {
           for (int col = 0; col < data[row].length;col++) {
            if (data[row][col] > max) {
                max = data[row][col];
            }
            
        }
        }
        return max;
    }
 public static int min(int[][] data) {
        int min = data[0][0];
        for (int row = 0; row< data.length;row++) {
           for (int col = 0; col < data[row].length;col++) {
            if (data[row][col] < min) {
                min = data[row][col];
            }
            
        }
        }
        return min;
    }

}
