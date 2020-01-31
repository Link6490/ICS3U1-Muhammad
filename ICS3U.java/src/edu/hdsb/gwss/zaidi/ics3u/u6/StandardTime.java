/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.zaidi.ics3u.u6;

import java.util.Scanner;

/**
 *
 * @author 1zaidisye
 */
public class StandardTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONSTANT
        
        //VARIABLE
        String standard;
        String traditional;
        //OBJECT
        Scanner input = new Scanner( System.in);
        //INPUT
        System.out.print("Please enter a Standard Time (hhmm) : ");
        standard = input.nextLine();
       
        
       System.out.println("Please enter a Traditional Time (hh:mm:xx) :");
       traditional = input.next();
//        
        //PROCESSING
        
        //OUTPUT
        convertToTraditional(standard);
        //convertToStandard(traditional);
    }
    
    public static void convertToTraditional(String standard) {
        int hour = Integer.parseInt(standard.substring(0,2));
        int min = Integer.parseInt(standard.substring(3,5));
        int tradHour;
        int tradMin;
        String am = "AM";
        String pm = "PM";
        boolean isAM = true;
        
        if (hour > 12) {
            tradHour = hour - 12;
            isAM = false;
            
        }
        else {
            tradHour = hour;
            isAM = true;
        }
        if (tradHour == 0) {
            tradHour = 12;
        }
        
        tradMin = min;
        
        if (tradMin == 0) {
            tradMin = 00;
            
        if (tradHour == 12 && tradMin >= 0) {
            isAM = false;
        }
    }
        
        if (isAM) {
            System.out.println("Traditional Time: " + tradHour + ":" + tradMin + " AM");
        }
        else {
            System.out.println("Traditional Time: " + tradHour + ":" + tradMin + " PM");
        }
        
    }
    public static void convertToStandard(String traditional) {
        int hour2 = Integer.parseInt(traditional.substring(0,2));
        int min2 = Integer.parseInt(traditional.substring(3,5));
        int stanHour;
        int stanMin;
        String amPM = traditional.substring(traditional.length() - 2);
        System.out.println(hour2 + ":" + min2 + " " + amPM);
        if (amPM.equals("pm")) {
            stanHour = hour2 + 12;
        } else {
            stanHour = hour2;
        }
        stanMin = min2;
        
        System.out.println("Standard Time: " + hour2 + ":" + min2 + "PM");
    }
}
