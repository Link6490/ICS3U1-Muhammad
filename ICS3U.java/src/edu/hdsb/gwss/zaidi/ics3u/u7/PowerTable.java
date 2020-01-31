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
public class PowerTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int table[][];
        table = new int[15][5];
        
        for (int i = 0;i<15;i++) {
            table[i][0] = i+1;
            for (int j = 1;j<5;j++) {
                table [i][j] = table [i] [j-1] * (i+1);
            }
            
        }
        for (int i = 0; i < 15; i++) {
        for (int j = 0; j<5;j++) {
            System.out.print(table[i][j] + ", ");
        }
            System.out.println("");
        }
    }
    
}
