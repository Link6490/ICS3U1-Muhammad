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

/**
 *
 * @author 1zaidisye
 */
public class RandomStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //CONSTANT
        //VARIABLE
        int value;
        String str;
        //OBJECT
        File file = new File( "String.txt" );
        PrintWriter output = new PrintWriter( file );
         Scanner input = new Scanner( file );
        //SPLASH MESSAGE
        //INPUT
        //PROCESSING
        for (int i = 0; i < 100; i++) {
            str = "";
            for (int j = 0; j < 6; j++) {
                value = (int) ((Math.random() * 26) + 65);
                str = str + ((char) value);
            }
            output.println(str);
        }
        output.close();
        while (input.hasNext())
            System.out.println(input.nextLine());
 
         
         
    }  
    
}
