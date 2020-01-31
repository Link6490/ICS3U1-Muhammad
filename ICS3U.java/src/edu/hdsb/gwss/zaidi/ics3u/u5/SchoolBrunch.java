/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.zaidi.ics3u.u5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 1zaidisye
 */
public class SchoolBrunch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        final int Y1_PRICE = 12;
        final int Y2_PRICE = 10;
        final int Y3_PRICE = 7;
        final int Y4_PRICE = 5;
        int cost = 0;
        String str;
        double y1Percent = 0;
        double y2Percent = 0;
        double y3Percent = 0;
        double y4Percent = 0;
        int y1;
        int y2;
        int y3;
        int y4;
        boolean one;
        boolean two;
        int studentNumber = 0;
        int total;
        File file = new File("BRUNCH.11.txt");
        Scanner input = new Scanner(file);
        StringTokenizer st;
        while (input.hasNext()) {
            one = true;
            two = true;
            for (int i = 0; i < 3; i++) {
                str = input.nextLine();
                st = new StringTokenizer(str);
                if (one) {
                    cost = Integer.parseInt(st.nextToken());
                    one = false;
                } else if (two) {
                    y1Percent = Double.parseDouble(st.nextToken());
                    y2Percent = Double.parseDouble(st.nextToken());
                    y3Percent = Double.parseDouble(st.nextToken());
                    y4Percent = Double.parseDouble(st.nextToken());
                    two = false;
                } else {
                    studentNumber = Integer.parseInt(st.nextToken());
                }
            }
            y1 = (int) (y1Percent * studentNumber);
            y2 = (int) (y2Percent * studentNumber);
            y3 = (int) (y3Percent * studentNumber);
            y4 = (int) (y4Percent * studentNumber);
            y1 = y1 * Y1_PRICE;
            y2 = y2 * Y2_PRICE;
            y3 = y3 * Y3_PRICE;
            y4 = y4 * Y4_PRICE;
            total = y1 + y2 + y3 + y4;
            System.out.println("Cost is: " + cost);
            System.out.println("Total Price is: " + total);
            if (total >= cost) {
                System.out.println("NO, Does not need funding");
            } else {
                System.out.println("YES, Needs more funding");
            }
        }
    }
}
