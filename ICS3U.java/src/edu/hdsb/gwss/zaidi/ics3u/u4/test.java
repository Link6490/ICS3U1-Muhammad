/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.zaidi.ics3u.u4;

/**
 *
 * @author 1zaidisye
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        int[][] yo = new int[10][10];

        for (int i = 0; i < yo.length; i++) {
            yo[i][i] = (int)(Math.random() * 1000) + 1;
            
        }

        for (int row = 0; row < yo.length; row++) {
            for (int col = 0; col < yo[row].length; col++) {
                sum = sum + yo[row][col];
               
            }

        }
 System.out.println(sum);
    }

}
