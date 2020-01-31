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
public class RandomNumbers {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        //CONSTANTS
        //VARIABLES
        int var;
        //OBJECT
        
        //SPLASH MESSAGE
        //OBJECT
        File file = new File( "input.txt" );
        PrintWriter output = new PrintWriter( file );
         Scanner input = new Scanner( file );
        //INPUT
        //PROCESSING
        for (int counter = 0;counter < 100; counter++) {
            var = (int) ( Math.random() * 100 ) + 1;
            output.println(var);
        }
        //OUTPUT
        output.close();
        while (input.hasNext())
            System.out.println(input.nextLine());
    }   
    
}
