/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.zaidi.ics3u.u5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 1zaidisye
 */
public class TimeTravel {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        //CONSTANTS
        //VARIABLE
        String str;
        String out;
        int hr;
        int min;
        int sec;
        int fT;
        int tZ;
        boolean first = true;
        boolean second = true;
        boolean third = true;
        boolean fourth = true;
        boolean fifth = true;
        //OBJECT

        File file = new File("TRAVEL11.txt");
        File Outfile = new File("out1.txt");
        PrintWriter output = new PrintWriter(file);
        PrintWriter output2 = new PrintWriter(Outfile);
        Scanner input = new Scanner(file);
        StringTokenizer st;
        //INPUT
        output.print("03:01:01 10 0\n"
                + "03:02:02 10 5\n"
                + "03:03:03 10 -23\n"
                + "23:04:04 5 5\n"
                + "00:00:00 0 0");
        output.close();
        //PROCESSING
        while (input.hasNext()) {
            str = input.nextLine();
            st = new StringTokenizer(str, ": ");

            hr = Integer.parseInt(st.nextToken());
            min = Integer.parseInt(st.nextToken());
            sec = Integer.parseInt(st.nextToken());
            fT = Integer.parseInt(st.nextToken());
            tZ = Integer.parseInt(st.nextToken());
            
            hr = hr + fT + tZ;
            if (hr < 0)
                hr = 24 + hr;
            if (hr > 24)
                hr = hr - 24;
            if (hr > 10) {
            out = Integer.toString(hr) + ":0" + Integer.toString(min) + ":0" + Integer.toString(sec);
            System.out.println(out);
            output2.println(out);
        } else {
                out = "0" + Integer.toString(hr) + ":0" + Integer.toString(min) + ":0" + Integer.toString(sec);
            System.out.println(out);
            output2.println(out);
            }
        } 
        output2.close();
        //OUTPUT
    }
}
