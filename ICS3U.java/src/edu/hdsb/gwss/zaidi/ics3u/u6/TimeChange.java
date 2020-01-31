////
// * Name: Muhammad Zaidi
// * Date: November 29, 2018
// * Version: v0.01
// * Description: Change standard time into traditional and vice versa.
////
package edu.hdsb.gwss.zaidi.ics3u.u6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 1zaidisye
 */
public class TimeChange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("TimeInput.txt"); //Scanners/Objects needed
        Scanner input = new Scanner(file);
        StringTokenizer st;
        File Outfile = new File("TimeOutput.txt");
        PrintWriter output = new PrintWriter(Outfile);
        boolean valid = true;
        int hour;
        int min;
        String totalTime;
        String am = "AM";
        String pm = "PM";

        while (input.hasNext()) { //While more times in the file, it will print
            totalTime = input.nextLine();
            st = new StringTokenizer(totalTime, ":, "); //Seperating time into hour and minutes
            hour = Integer.parseInt(st.nextToken());
            min = Integer.parseInt(st.nextToken());

            if (totalTime.contains("AM") || totalTime.contains("PM")) { //If it contains AM or PM, we know it is traditional time so it will convert to standard time
                convertToStandard(totalTime, hour, min);
            } else if (hour > 12 && hour < 24) { //If hours are more than 12 but less than 24 we know it is standard
                convertToTraditional(hour, min);
            } else if (valid) {
                if (hour > 0 && hour <= 23) {
                    System.out.println(hour + ":" + min + " AM");
                } else if (hour < 0) {
                    System.out.println("Invalid");
                }
                

            }
            if (hour == 0) {
                zeroHour(hour,min);
            }
        }

    }

    public static void convertToTraditional(int hour, int min) { //Method for converting to traditional time
        if (hour > 12 && hour < 24) {
            hour = hour - 12;
            System.out.println(hour + ":" + min + " PM");
        } else if (hour < 12 && hour > 0 || hour > 12 && hour < 24) {
            System.out.println(hour + ":" + min + " AM");
        }
    }

    public static void convertToStandard(String totalTime, int hour, int min) { //Method for converting to standard time
        if (totalTime.contains("AM")) {
            if (hour != 12) {
                System.out.println(hour + ":" + min);
            } else if (hour == 12) {
                hour = hour - 12;
                System.out.println("0" + hour + ":" + min);
            }
        } else if (totalTime.contains("PM")) {
            hour = hour + 12;
            if (hour != 24) {
                System.out.println(hour + ":" + min);
            } else if (hour == 24) {
                hour = hour - 12;
                System.out.println(hour + ":" + min);

            }

        }
    }
    public static void zeroHour(int hour,int min) {
        hour = hour + 12;
        System.out.println(hour + ":" + min + " AM");
    }
}
