/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.zaidi.ics3u.u5;

/**
 *
 * @author smaza
 */
public class ReduceFraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    }
    public long getGCD(long num1, long num2) {
    num2 = 1;
    num1 = 2;
        while(num1 % num2 != 0) {
        long temp = num2;
        num2 = num1 % num2;
        num1 = temp;
    }
        System.out.println(num1);
    return num2;
}
}
