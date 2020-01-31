/*
 * Name: Muhammad Zaidi
 * Date: Noevember 5, 2018
 * Version: v0.01
 * Description: 
 * Calculate calculate if age is below or above 13
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
public class AgeGate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //CONSTANT  
        //VARIABLES
        String str; //Listing variables
        int day;
        int year;
        int month;
        //OBJECT
        File file = new File("DATA21.txt"); //Scanners/Objects needed
        Scanner input = new Scanner(file);
        StringTokenizer st;
        File Outfile = new File("OUT21.txt");
        PrintWriter output = new PrintWriter(Outfile);
        //SPLASH MESSAGE
        //INPUT
        //PROCESSING
        while (input.hasNext()) { //There are words on the input file, it will keep going
            str = input.nextLine();
            st = new StringTokenizer(str);
            day = Integer.parseInt(st.nextToken()); //Setting Day, Month, Year as each consecutive word on the input file
            month = Integer.parseInt(st.nextToken());
            year = Integer.parseInt(st.nextToken());

            if (year > 2005) { //if year is more than 2005, automatically too young as younger than 13
                output.println("too young");
                System.out.println("too young");
            } else if (year == 2005 && month >= 11 && day > 5) { //if Year is 2005, but month is smaller or equal to november and day is less than 5, also too young
                System.out.println("too young");
                output.println("too young");
            } else { //Else old enough
                System.out.println("old enough");
                output.println("old enough");
            }

        }
        output.close();

    }

}
